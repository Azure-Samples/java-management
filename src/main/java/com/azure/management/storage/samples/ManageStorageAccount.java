// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.management.storage.samples;

import com.azure.core.credential.TokenCredential;
import com.azure.core.http.HttpClient;
import com.azure.core.http.ProxyOptions;
import com.azure.core.http.netty.NettyAsyncHttpClientBuilder;
import com.azure.core.management.AzureEnvironment;
import com.azure.identity.DefaultAzureCredentialBuilder;
import com.azure.management.Azure;
import com.azure.management.resources.fluentcore.arm.Region;
import com.azure.management.resources.fluentcore.profile.AzureProfile;
import com.azure.management.storage.StorageAccount;
import com.azure.management.storage.StorageAccountKey;
import com.azure.storage.blob.BlobClient;
import com.azure.storage.blob.BlobContainerClient;
import com.azure.storage.blob.BlobServiceAsyncClient;
import com.azure.storage.blob.BlobServiceClient;
import com.azure.storage.blob.BlobServiceClientBuilder;
import reactor.core.publisher.Mono;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.List;
import java.util.UUID;

public class ManageStorageAccount {
    public static String randomString(String prefix, int len) {
        return prefix + UUID.randomUUID().toString().replace("-", "").substring(0, len - prefix.length());
    }

    public static Azure authentication() throws IOException {
        TokenCredential credential = new DefaultAzureCredentialBuilder().build();
        AzureProfile profile = new AzureProfile(AzureEnvironment.AZURE, true);

        HttpClient client = new NettyAsyncHttpClientBuilder()
                .proxy(new ProxyOptions(ProxyOptions.Type.HTTP, new InetSocketAddress("127.0.0.1", 8888)))
                .build();

        return Azure.configure().withHttpClient(client).authenticate(credential, profile).withDefaultSubscription();
    }

    public static void asynchronousOperateStorage(Azure azure) throws IOException {
        final String resourceGroupName = randomString("rg", 8);
        final String storageAccountName = randomString("stg", 8);
        final String containerName = randomString("ct", 8);
        final String blobName = randomString("bl", 8);
        final Region region = Region.US_WEST;
        final String uploadFile = "HelloWorld.txt";

        // mgmt-plane
        azure.storageAccounts()
                .define(storageAccountName)
                .withRegion(region)
                .withNewResourceGroup(resourceGroupName)
                .createAsync()
                .last()
                .map(indexable -> (StorageAccount)indexable)
                .flatMap(storageAccount -> storageAccount.getKeysAsync()
                        .flatMap(keys -> Mono.justOrEmpty(keys.stream().findFirst()))
                        .flatMap(storageAccountKey -> {

                            // data-plane
                            BlobServiceAsyncClient blobServiceAsyncClient = new BlobServiceClientBuilder()
                                    .connectionString(String.format(
                                            "DefaultEndpointsProtocol=https;AccountName=%s;AccountKey=%s", storageAccount.name(), storageAccountKey.value()
                                    ))
                                    .buildAsyncClient();
                            return blobServiceAsyncClient.createBlobContainer(containerName)
                                    .map(blobContainerAsyncClient -> blobContainerAsyncClient.getBlobAsyncClient(blobName))
                                    .flatMap(blobAsyncClient -> blobAsyncClient.uploadFromFile(uploadFile));
                        }))
                .block();
    }


    public static void synchronousOperateStorage(Azure azure) throws IOException {
        final String resourceGroupName = randomString("rg", 8);
        final String storageAccountName = randomString("stg", 8);
        final String containerName = randomString("ct", 8);
        final String blobName = randomString("bl", 8);
        final Region region = Region.US_WEST;
        final String uploadFile = "HelloWorld.txt";

        // mgmt-plane
        StorageAccount storageAccount = azure.storageAccounts()
                .define(storageAccountName)
                .withRegion(region)
                .withNewResourceGroup(resourceGroupName)
                .create();

        List<StorageAccountKey> keys = storageAccount.getKeys();

        // data-plane
        if (keys.size() > 0) {
            BlobServiceClient blobServiceClient = new BlobServiceClientBuilder()
                    .connectionString(String.format(
                            "DefaultEndpointsProtocol=https;AccountName=%s;AccountKey=%s", storageAccount.name(), keys.get(0).value()
                    ))
                    .buildClient();

            BlobContainerClient blobContainerClient = blobServiceClient.createBlobContainer(containerName);
            BlobClient blobClient = blobContainerClient.getBlobClient(blobName);
            blobClient.uploadFromFile(uploadFile);
        }
    }

    public static void main(String[] args) throws Exception {
        Azure azure = authentication();
        asynchronousOperateStorage(azure);
        synchronousOperateStorage(azure);
    }
}
