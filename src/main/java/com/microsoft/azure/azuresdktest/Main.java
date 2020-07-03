package com.microsoft.azure.azuresdktest;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.logging.ClientLogger;
import com.azure.core.util.polling.SyncPoller;
import com.azure.identity.DefaultAzureCredentialBuilder;
import com .azure.resourcemanager.Azure;
import com.azure.resourcemanager.keyvault.models.Vault;
import com.azure.resourcemanager.resources.fluentcore.arm.Region;
import com.azure.security.keyvault.keys.KeyClient;
import com.azure.security.keyvault.keys.KeyClientBuilder;
import com.azure.security.keyvault.keys.models.CreateRsaKeyOptions;
import com.azure.security.keyvault.keys.models.DeletedKey;
import com.azure.security.keyvault.keys.models.KeyOperation;
import com.azure.security.keyvault.keys.models.KeyProperties;
import com.azure.security.keyvault.keys.models.KeyVaultKey;

import java.time.Duration;

public class Main {

    private static final ClientLogger logger = new ClientLogger(Main.class);

    public static void main(String args[]) {
        String rgName = "rg-weidxu";
        String vaultName = "kvweidxu";

        //TracingSample.tracing();

        // mgmt - azure
        Azure azure = Auth.interactiveBrowser();
        long count = azure.resourceGroups().list().stream().count();
        logger.info("count {}", count);

        try {
            // create vault
            Vault vault = azure.vaults()
                    .define(vaultName)
                    .withRegion(Region.US_WEST)
                    .withNewResourceGroup(rgName)
                    .defineAccessPolicy()
                        .forServicePrincipal(Env.SERVICE_PRINCIPAL_ID)
                        .allowKeyAllPermissions()
                        .attach()
                    .create();

            // pagination on mgmt
            PagedIterable<Vault> vaults = azure.vaults().listByResourceGroup(rgName);
            vaults.stream().forEach(v -> logger.info("vault uri {}", v.vaultUri()));

            // data - client
            KeyClient keyClient = new KeyClientBuilder()
                    // same http client
                    .httpClient(azure.genericResources().manager().inner().getHttpPipeline().getHttpClient())
                    .credential(new DefaultAzureCredentialBuilder().build())
                    .vaultUrl(vault.vaultUri())
                    .buildClient();

            // create rsa key
            KeyVaultKey key = keyClient.createRsaKey(new CreateRsaKeyOptions("key1")
                    .setKeySize(2048)
                    .setKeyOperations(KeyOperation.UNWRAP_KEY, KeyOperation.WRAP_KEY, KeyOperation.DECRYPT, KeyOperation.ENCRYPT));

            // pagination on data
            PagedIterable<KeyProperties> keys = keyClient.listPropertiesOfKeys();
            keys.stream().forEach(k -> logger.info("key id {}", k.getId()));

            // LRO on data
            SyncPoller<DeletedKey, Void> deleteKeyPoller = keyClient.beginDeleteKey(key.getName());
            deleteKeyPoller.waitForCompletion();

            // LRO on mgmt
            SyncPoller<Void, Void> syncPoller = azure.resourceGroups().beginDeleteByName(rgName).getSyncPoller();
            Thread.sleep(Duration.ofSeconds(3).toMillis());
            syncPoller.poll();
        } catch (Throwable e) {
            logger.logThrowableAsError(e);
        } finally {
            // clean up
            azure.resourceGroups().beginDeleteByName(rgName);
        }
    }
}
