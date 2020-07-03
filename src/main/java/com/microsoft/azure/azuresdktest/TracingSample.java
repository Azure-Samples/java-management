package com.microsoft.azure.azuresdktest;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.core.util.polling.SyncPoller;
import com.azure.identity.DefaultAzureCredentialBuilder;
import com.azure.resourcemanager.Azure;
import com.azure.resourcemanager.keyvault.models.Vault;
import com.azure.resourcemanager.resources.fluentcore.arm.Region;
import com.azure.security.keyvault.keys.KeyClient;
import com.azure.security.keyvault.keys.KeyClientBuilder;
import com.azure.security.keyvault.keys.models.CreateRsaKeyOptions;
import com.azure.security.keyvault.keys.models.DeletedKey;
import com.azure.security.keyvault.keys.models.KeyOperation;
import com.azure.security.keyvault.keys.models.KeyProperties;
import com.azure.security.keyvault.keys.models.KeyVaultKey;
import io.grpc.ManagedChannelBuilder;
import io.opentelemetry.OpenTelemetry;
import io.opentelemetry.exporters.jaeger.JaegerGrpcSpanExporter;
import io.opentelemetry.exporters.logging.LoggingSpanExporter;
import io.opentelemetry.sdk.OpenTelemetrySdk;
import io.opentelemetry.sdk.trace.TracerSdkProvider;
import io.opentelemetry.sdk.trace.export.SimpleSpansProcessor;
import io.opentelemetry.trace.Span;
import io.opentelemetry.trace.Tracer;

import java.time.Duration;
import java.util.Map;

public class TracingSample {

    private static final ClientLogger logger = new ClientLogger(Main.class);

    public static void tracing() {
        String rgName = "rg-weidxu";
        String vaultName = "kvweidxu";

        // configure OpenTelemetry
        TracerSdkProvider tracerProvider = OpenTelemetrySdk.getTracerProvider();

        LoggingSpanExporter loggingExporter = new LoggingSpanExporter();
        tracerProvider.addSpanProcessor(SimpleSpansProcessor.newBuilder(loggingExporter).build());

        // refer to https://www.jaegertracing.io/docs/1.17/getting-started/
        JaegerGrpcSpanExporter jaegerGrpcSpanExporter = new JaegerGrpcSpanExporter.Builder()
                .setServiceName("tracing-sample")
                .setChannel(ManagedChannelBuilder.forTarget("localhost:14250").usePlaintext().build())
                .build();
        tracerProvider.addSpanProcessor(SimpleSpansProcessor.newBuilder(jaegerGrpcSpanExporter).build());

        Tracer Tracer = OpenTelemetry.getTracerProvider().get("Azure-TracingSample");
        Span span = Tracer.spanBuilder("user-parent-span").setSpanKind(Span.Kind.CLIENT).startSpan();
        logger.info("span id: {}", span.getContext().getSpanId());

        Context context = Context.of(Map.of(com.azure.core.util.tracing.Tracer.PARENT_SPAN_KEY, span));

        Azure azure = Auth.servicePrincipalWithTelemetry();
        try {
            // create vault
            Vault vault = (Vault) azure.vaults()
                    .define(vaultName)
                    .withRegion(Region.US_WEST)
                    .withNewResourceGroup(rgName)
                    .defineAccessPolicy()
                    .forServicePrincipal(Env.SERVICE_PRINCIPAL_ID)
                    .allowKeyAllPermissions()
                    .attach()
                    .createAsync()
                    .subscriberContext(FluxUtil.toReactorContext(context)).blockLast();

            Iterable<Vault> vaults = azure.vaults().listByResourceGroupAsync(rgName)
                    .subscriberContext(FluxUtil.toReactorContext(context)).toIterable();
            vaults.forEach(v -> logger.info("vault uri {}", v.vaultUri()));

            // create rsa key
            KeyClient keyClient = new KeyClientBuilder()
                    //.pipeline(azure.genericResources().manager().inner().getHttpPipeline())
                    .httpClient(azure.genericResources().manager().inner().getHttpPipeline().getHttpClient())
                    .credential(new DefaultAzureCredentialBuilder().build())
                    .vaultUrl(vault.vaultUri())
                    .buildClient();

            KeyVaultKey key = keyClient.createRsaKeyWithResponse(new CreateRsaKeyOptions("key1")
                            .setKeySize(2048)
                            .setKeyOperations(KeyOperation.UNWRAP_KEY, KeyOperation.WRAP_KEY, KeyOperation.DECRYPT, KeyOperation.ENCRYPT),
                    context).getValue();

            PagedIterable<KeyProperties> keys = keyClient.listPropertiesOfKeys(context);
            keys.forEach(k -> logger.info("key id {}", k.getId()));

            SyncPoller<DeletedKey, Void> deleteKeyPoller = keyClient.beginDeleteKey(key.getName());
            deleteKeyPoller.waitForCompletion();

            SyncPoller<Void, Void> syncPoller = azure.resourceGroups().beginDeleteByName(rgName).getSyncPoller();
            Thread.sleep(Duration.ofSeconds(3).toMillis());
            syncPoller.poll();
        } catch (Throwable e) {
            logger.logThrowableAsError(e);
        } finally {
            azure.resourceGroups().beginDeleteByName(rgName);
        }
    }
}
