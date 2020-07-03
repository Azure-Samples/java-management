package com.microsoft.azure.azuresdktest;

import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.tracing.opentelemetry.OpenTelemetryHttpPolicy;
import com.azure.core.util.logging.ClientLogger;
import com.azure.identity.DefaultAzureCredentialBuilder;
import com.azure.identity.DeviceCodeCredentialBuilder;
import com.azure.identity.EnvironmentCredentialBuilder;
import com.azure.identity.InteractiveBrowserCredentialBuilder;
import com.azure.resourcemanager.Azure;
import com.azure.resourcemanager.resources.fluentcore.profile.AzureProfile;

import java.io.IOException;
import java.util.Locale;

public class Auth {

    private static final ClientLogger logger = new ClientLogger(Auth.class);

    // config env
    public static Azure defaultAzure() {
        Azure azure = Azure.configure().withLogLevel(HttpLogDetailLevel.NONE)
                .authenticate(new DefaultAzureCredentialBuilder().build(), new AzureProfile(AzureEnvironment.AZURE))
                .withDefaultSubscription();
        return azure;
    }

    // config env
    public static Azure servicePrincipal() {
        Azure azure = Azure.configure().withLogLevel(HttpLogDetailLevel.NONE)
                .authenticate(new EnvironmentCredentialBuilder().build(), new AzureProfile(AzureEnvironment.AZURE))
                .withDefaultSubscription();
        return azure;
    }

    // refer to https://github.com/Azure/azure-sdk-for-java/tree/master/sdk/identity/azure-identity
    public static Azure interactiveBrowser() {
        Azure azure = Azure.configure().withLogLevel(HttpLogDetailLevel.BODY_AND_HEADERS)
                .authenticate(new InteractiveBrowserCredentialBuilder()
                        .tenantId(System.getenv("AZURE_TENANT_ID"))
                        .clientId(System.getenv("AZURE_CLIENT_ID"))
                        .port(8765)
                        .build(),
                        new AzureProfile(AzureEnvironment.AZURE))
                .withDefaultSubscription();
        return azure;
    }

    public static Azure deviceToken() {
        Azure azure = Azure.configure().withLogLevel(HttpLogDetailLevel.BODY_AND_HEADERS)
                .authenticate(new DeviceCodeCredentialBuilder()
                                .tenantId(System.getenv("AZURE_TENANT_ID"))
                                .clientId(System.getenv("AZURE_CLIENT_ID"))
                                .challengeConsumer(deviceCodeInfo -> {
                                    try {
                                        openUrl(deviceCodeInfo.getVerificationUrl());

                                        System.out.println("User code: " + deviceCodeInfo.getUserCode());
                                        System.out.println("Press any key to continue.");

                                        System.in.read();

                                        System.out.println("Continue device code auth.");
                                    } catch (IOException ioe) {
                                        logger.logThrowableAsError(ioe);
                                    }
                                })
                                .build(),
                        new AzureProfile(AzureEnvironment.AZURE))
                .withDefaultSubscription();
        return azure;
    }

    public static Azure servicePrincipalWithTelemetry() {
        Azure azure = Azure.configure().withLogLevel(HttpLogDetailLevel.NONE)
                .withPolicy(new OpenTelemetryHttpPolicy())
                .authenticate(new EnvironmentCredentialBuilder().build(), new AzureProfile(AzureEnvironment.AZURE))
                .withDefaultSubscription();
        return azure;
    }

    private static void openUrl(String url) throws IOException {
        Runtime rt = Runtime.getRuntime();

        String os = System.getProperty("os.name").toLowerCase(Locale.ROOT);
        if (os.contains("win")) {
            rt.exec("rundll32 url.dll,FileProtocolHandler " + url);
        } else if (os.contains("mac")) {
            rt.exec("open " + url);
        } else if (os.contains("nix") || os.contains("nux")) {
            rt.exec("xdg-open " + url);
        } else {
            logger.error("Browser could not be opened - please open {} in a browser on this device.", url);
        }
    }
}
