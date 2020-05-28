// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.storage;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.management.vanilla.storage.implementation.TableServicesImpl;
import com.azure.management.vanilla.storage.models.CorsRules;
import com.azure.management.vanilla.storage.models.ListTableServices;
import com.azure.management.vanilla.storage.models.TableServiceProperties;

/** Initializes a new instance of the synchronous StorageManagementClient type. */
@ServiceClient(builder = StorageManagementClientBuilder.class)
public final class TableServicesClient {
    private TableServicesImpl serviceClient;

    /** Initializes an instance of TableServices client. */
    TableServicesClient(TableServicesImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * List all table services for the storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ListTableServices list(String resourceGroupName, String accountName) {
        return this.serviceClient.list(resourceGroupName, accountName);
    }

    /**
     * List all table services for the storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ListTableServices list(String resourceGroupName, String accountName, Context context) {
        return this.serviceClient.list(resourceGroupName, accountName, context);
    }

    /**
     * Sets the properties of a storage account’s Table service, including properties for Storage Analytics and CORS
     * (Cross-Origin Resource Sharing) rules.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param cors Sets the CORS rules. You can include up to five CorsRule elements in the request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of a storage account’s Table service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public TableServiceProperties setServiceProperties(String resourceGroupName, String accountName, CorsRules cors) {
        return this.serviceClient.setServiceProperties(resourceGroupName, accountName, cors);
    }

    /**
     * Sets the properties of a storage account’s Table service, including properties for Storage Analytics and CORS
     * (Cross-Origin Resource Sharing) rules.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param cors Sets the CORS rules. You can include up to five CorsRule elements in the request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of a storage account’s Table service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public TableServiceProperties setServiceProperties(
        String resourceGroupName, String accountName, CorsRules cors, Context context) {
        return this.serviceClient.setServiceProperties(resourceGroupName, accountName, cors, context);
    }

    /**
     * Gets the properties of a storage account’s Table service, including properties for Storage Analytics and CORS
     * (Cross-Origin Resource Sharing) rules.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of a storage account’s Table service, including properties for Storage Analytics and CORS
     *     (Cross-Origin Resource Sharing) rules.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public TableServiceProperties getServiceProperties(String resourceGroupName, String accountName) {
        return this.serviceClient.getServiceProperties(resourceGroupName, accountName);
    }

    /**
     * Gets the properties of a storage account’s Table service, including properties for Storage Analytics and CORS
     * (Cross-Origin Resource Sharing) rules.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of a storage account’s Table service, including properties for Storage Analytics and CORS
     *     (Cross-Origin Resource Sharing) rules.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public TableServiceProperties getServiceProperties(String resourceGroupName, String accountName, Context context) {
        return this.serviceClient.getServiceProperties(resourceGroupName, accountName, context);
    }
}
