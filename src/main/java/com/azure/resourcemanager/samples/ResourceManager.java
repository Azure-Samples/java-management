// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.resourcemanager.samples;

import com.azure.core.credential.TokenCredential;
import com.azure.core.http.HttpClient;
import com.azure.core.http.ProxyOptions;
import com.azure.core.http.okhttp.OkHttpAsyncHttpClientBuilder;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.exception.ManagementException;
import com.azure.identity.ClientSecretCredentialBuilder;
import com.azure.resourcemanager.Azure;
import com.azure.resourcemanager.resources.fluentcore.arm.Region;
import com.azure.resourcemanager.resources.fluentcore.profile.AzureProfile;
import com.azure.resourcemanager.resources.models.ResourceGroup;

import java.net.InetSocketAddress;
import java.util.UUID;

public class ResourceManager {
    public static String randomString(String prefix, int len) {
        return prefix + UUID.randomUUID().toString().replace("-", "").substring(0, len - prefix.length());
    }
    public static void main(String[] args) throws Exception {
        // authentication
        // split azure specific parameter from credential, which makes credential a simple interface
        TokenCredential credential = new ClientSecretCredentialBuilder()
                .clientId("<ClientId>")
                .clientSecret("<ClientSecret>")
                .tenantId("<TenantId>")
                .build();
        AzureProfile profile = new AzureProfile("<TenantId>", "<SubscriptionId>", AzureEnvironment.AZURE);

        // previous
        // new ApplicationTokenCredentials("<ClientId>" ,"<TenantId>", "<ClientSecret>", AzureEnvironment.AZURE)
        //                    .withDefaultSubscriptionId("<SubscriptionId>");

        // see AUTH.md for more details




        // customize policy
        // adoption of azure-core
        Azure.configure()
            .withPolicy(new Continue504PollingPolicy())
            .authenticate(credential, profile)
            .withDefaultSubscription();

        // previous
        // Azure.configure()
        //     .withInterceptor(new Continue504PollingInterceptor())
        //     .authenticate(credential)
        //     .withDefaultSubscription();




        // custom http client
        // adoption of azure-core, could help users use different implementation of http client if they want
        HttpClient client = new OkHttpAsyncHttpClientBuilder()
                .proxy(new ProxyOptions(ProxyOptions.Type.HTTP, new InetSocketAddress("127.0.0.1", 8888)))
                .build();

        Azure azure = Azure.configure()
                .withHttpClient(client)
                .authenticate(credential, profile)
                .withDefaultSubscription();

        // previous
        // OkHttpClient.Builder builder = new OkHttpClient.Builder().proxy(new Proxy(Proxy.Type.HTTP, new InetSocketAddress("127.0.0.1", 8888)));
        // RestClient client = new RestClient.Builder(builder, new Retrofit.Builder())
        //     .withCredentials(credential)
        //     .build();
        // Azure.authenticate(client, "<TenantId>")
        //     .withDefaultSubscription();




        // error handling
        // most is just naming changed, no special change in API
        final String resourceGroupName = "resource group not valid";
        try {
            azure.resourceGroups().define(resourceGroupName)
                    .withRegion(Region.US_WEST2)
                    .create();
        } catch (ManagementException e) {
            System.err.printf("Response code: %s%n", e.getValue().getCode());
            System.err.printf("Response message: %s%n", e.getValue().getMessage());
        }

        // previous
        // final String resourceGroupName = "resource group not valid";
        // try {
        //     azure.resourceGroups().define(resourceGroupName)
        //         .withRegion(Region.US_WEST2)
        //         .create();
        // } catch (CloudException e) {
        //     System.err.printf("Response code: %s%n", e.body().code());
        //     System.err.printf("Response message: %s%n", e.body().message());
        // }




        // Listing
        // list return PagedIterable rather than PagedList in order for lazy loading.
        for (ResourceGroup resourceGroup : azure.resourceGroups().list()) {
            System.out.println(resourceGroup.id());
        }




        // rxJava -> reactor
        // previous https://github.com/Azure/azure-libraries-for-java/blob/master/azure-samples/src/main/java/com/microsoft/azure/management/compute/samples/ManageVirtualMachineScaleSetAsync.java#L99
        // current https://github.com/Azure/azure-sdk-for-java/blob/7beda69/sdk/management/samples/src/main/java/com/azure/resourcemanager/compute/samples/ManageVirtualMachineScaleSetAsync.java#L97
    }
}
