package com.microsoft.azure.azuresdktest;

import com.azure.core.credential.TokenCredential;
import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.HttpClient;
import com.azure.core.http.netty.NettyAsyncHttpClientBuilder;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.util.logging.ClientLogger;
import com.azure.core.util.polling.SyncPoller;
import com.azure.identity.DefaultAzureCredentialBuilder;
import com.azure.identity.EnvironmentCredentialBuilder;
import com .azure.resourcemanager.Azure;
import com.azure.resourcemanager.keyvault.models.Vault;
import com.azure.resourcemanager.resources.fluentcore.arm.Region;
import com.azure.resourcemanager.resources.fluentcore.profile.AzureProfile;
import com.azure.resourcemanager.resources.models.ResourceGroup;
import com.azure.security.keyvault.keys.KeyClient;
import com.azure.security.keyvault.keys.KeyClientBuilder;
import com.azure.security.keyvault.keys.models.CreateRsaKeyOptions;
import com.azure.security.keyvault.keys.models.DeletedKey;
import com.azure.security.keyvault.keys.models.KeyOperation;
import com.azure.security.keyvault.keys.models.KeyProperties;
import com.azure.security.keyvault.keys.models.KeyVaultKey;

import java.time.Duration;

public class Demo {

    private static final ClientLogger logger = new ClientLogger(Demo.class);

    public static void main(String args[]) {
        String resourceGroupName = "Demo0706";
        String vaultName = "Vault0706";

        // Httpclient in azure-core, will be used in both management and data SDKs
        HttpClient httpClient = new NettyAsyncHttpClientBuilder().build();

        // TokenCredential in azure-identity, will be used for auth both in management and data operation
        TokenCredential credential = new EnvironmentCredentialBuilder().build();
        AzureProfile profile = new AzureProfile(AzureEnvironment.AZURE);

        // management
        logger.info("Creating key vault..");
        Azure azure = Azure.configure()
                .withLogLevel(HttpLogDetailLevel.NONE)
                // same http client
                .withHttpClient(httpClient)
                // same credential
                .authenticate(credential, profile)
                .withSubscription(System.getenv(("AZURE_SUBSCRIPTION_ID")));

        try {
            // management - create key vault
            Vault vault = azure.vaults()
                    .define(vaultName)
                    .withRegion(Region.US_WEST)
                    .withNewResourceGroup(resourceGroupName)
                    .defineAccessPolicy()
                        .forServicePrincipal(System.getenv("AZURE_CLIENT_ID"))
                        .allowKeyAllPermissions()
                        .attach()
                    .create();

            // management - pagination on list resource groups
            PagedIterable<ResourceGroup> resourceGroups = azure.resourceGroups().list();
            resourceGroups.stream().forEach(r -> logger.info("Resource group: {}", r.id()));

            // management - pagination on list vaults
            PagedIterable<Vault> vaults = azure.vaults().listByResourceGroup(resourceGroupName);
            vaults.stream().forEach(v -> logger.info("Vault uri {}", v.vaultUri()));

            // data - create client
            KeyClient keyClient = new KeyClientBuilder()
                    // same http client
                    .httpClient(httpClient)
                    // same credential
                    .credential(credential)
                    .vaultUrl(vault.vaultUri())
                    .buildClient();

            // data - create rsa key
            KeyVaultKey key = keyClient.createRsaKey(new CreateRsaKeyOptions("key1")
                    .setKeySize(2048)
                    .setKeyOperations(KeyOperation.UNWRAP_KEY, KeyOperation.WRAP_KEY, KeyOperation.DECRYPT, KeyOperation.ENCRYPT));

            // data  - pagination on list keys
            PagedIterable<KeyProperties> keys = keyClient.listPropertiesOfKeys();
            keys.stream().forEach(k -> logger.info("Key id {}", k.getId()));

            // data - LRO on delete key
            SyncPoller<DeletedKey, Void> deleteKeyPoller = keyClient.beginDeleteKey(key.getName());
            deleteKeyPoller.waitForCompletion();

            // management - LRO on delete resource group
            SyncPoller<Void, Void> syncPoller = azure.resourceGroups().beginDeleteByName(resourceGroupName).getSyncPoller();
            Thread.sleep(Duration.ofSeconds(3).toMillis());
            syncPoller.poll();
        } catch (Throwable e) {
            logger.logThrowableAsError(e);
        } finally {
            // clean up
            azure.resourceGroups().beginDeleteByName(resourceGroupName);
        }
    }
}
