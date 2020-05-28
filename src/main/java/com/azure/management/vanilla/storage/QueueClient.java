// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.storage;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.management.vanilla.storage.implementation.QueuesImpl;
import com.azure.management.vanilla.storage.models.ListQueue;
import com.azure.management.vanilla.storage.models.StorageQueue;
import java.util.Map;

/** Initializes a new instance of the synchronous StorageManagementClient type. */
@ServiceClient(builder = StorageManagementClientBuilder.class)
public final class QueueClient {
    private QueuesImpl serviceClient;

    /** Initializes an instance of Queues client. */
    QueueClient(QueuesImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Creates a new queue with the specified queue name, under the specified account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param queueName A queue name must be unique within a storage account and must be between 3 and 63 characters.The
     *     name must comprise of lowercase alphanumeric and dash(-) characters only, it should begin and end with an
     *     alphanumeric character and it cannot have two consecutive dash(-) characters.
     * @param metadata A name-value pair that represents queue metadata.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public StorageQueue create(
        String resourceGroupName, String accountName, String queueName, Map<String, String> metadata) {
        return this.serviceClient.create(resourceGroupName, accountName, queueName, metadata);
    }

    /**
     * Creates a new queue with the specified queue name, under the specified account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param queueName A queue name must be unique within a storage account and must be between 3 and 63 characters.The
     *     name must comprise of lowercase alphanumeric and dash(-) characters only, it should begin and end with an
     *     alphanumeric character and it cannot have two consecutive dash(-) characters.
     * @param metadata A name-value pair that represents queue metadata.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public StorageQueue create(
        String resourceGroupName, String accountName, String queueName, Map<String, String> metadata, Context context) {
        return this.serviceClient.create(resourceGroupName, accountName, queueName, metadata, context);
    }

    /**
     * Creates a new queue with the specified queue name, under the specified account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param queueName A queue name must be unique within a storage account and must be between 3 and 63 characters.The
     *     name must comprise of lowercase alphanumeric and dash(-) characters only, it should begin and end with an
     *     alphanumeric character and it cannot have two consecutive dash(-) characters.
     * @param metadata A name-value pair that represents queue metadata.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public StorageQueue update(
        String resourceGroupName, String accountName, String queueName, Map<String, String> metadata) {
        return this.serviceClient.update(resourceGroupName, accountName, queueName, metadata);
    }

    /**
     * Creates a new queue with the specified queue name, under the specified account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param queueName A queue name must be unique within a storage account and must be between 3 and 63 characters.The
     *     name must comprise of lowercase alphanumeric and dash(-) characters only, it should begin and end with an
     *     alphanumeric character and it cannot have two consecutive dash(-) characters.
     * @param metadata A name-value pair that represents queue metadata.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public StorageQueue update(
        String resourceGroupName, String accountName, String queueName, Map<String, String> metadata, Context context) {
        return this.serviceClient.update(resourceGroupName, accountName, queueName, metadata, context);
    }

    /**
     * Gets the queue with the specified queue name, under the specified account if it exists.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param queueName A queue name must be unique within a storage account and must be between 3 and 63 characters.The
     *     name must comprise of lowercase alphanumeric and dash(-) characters only, it should begin and end with an
     *     alphanumeric character and it cannot have two consecutive dash(-) characters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the queue with the specified queue name, under the specified account if it exists.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public StorageQueue get(String resourceGroupName, String accountName, String queueName) {
        return this.serviceClient.get(resourceGroupName, accountName, queueName);
    }

    /**
     * Gets the queue with the specified queue name, under the specified account if it exists.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param queueName A queue name must be unique within a storage account and must be between 3 and 63 characters.The
     *     name must comprise of lowercase alphanumeric and dash(-) characters only, it should begin and end with an
     *     alphanumeric character and it cannot have two consecutive dash(-) characters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the queue with the specified queue name, under the specified account if it exists.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public StorageQueue get(String resourceGroupName, String accountName, String queueName, Context context) {
        return this.serviceClient.get(resourceGroupName, accountName, queueName, context);
    }

    /**
     * Deletes the queue with the specified queue name, under the specified account if it exists.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param queueName A queue name must be unique within a storage account and must be between 3 and 63 characters.The
     *     name must comprise of lowercase alphanumeric and dash(-) characters only, it should begin and end with an
     *     alphanumeric character and it cannot have two consecutive dash(-) characters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String accountName, String queueName) {
        this.serviceClient.delete(resourceGroupName, accountName, queueName);
    }

    /**
     * Deletes the queue with the specified queue name, under the specified account if it exists.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param queueName A queue name must be unique within a storage account and must be between 3 and 63 characters.The
     *     name must comprise of lowercase alphanumeric and dash(-) characters only, it should begin and end with an
     *     alphanumeric character and it cannot have two consecutive dash(-) characters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String accountName, String queueName, Context context) {
        this.serviceClient.delete(resourceGroupName, accountName, queueName, context);
    }

    /**
     * Gets a list of all the queues under the specified storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param maxpagesize Optional, a maximum number of queues that should be included in a list queue response.
     * @param filter Optional, When specified, only the queues with a name starting with the given filter will be
     *     listed.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all the queues under the specified storage account.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ListQueue> list(
        String resourceGroupName, String accountName, String maxpagesize, String filter) {
        return this.serviceClient.list(resourceGroupName, accountName, maxpagesize, filter);
    }

    /**
     * Gets a list of all the queues under the specified storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param maxpagesize Optional, a maximum number of queues that should be included in a list queue response.
     * @param filter Optional, When specified, only the queues with a name starting with the given filter will be
     *     listed.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all the queues under the specified storage account.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ListQueue> list(
        String resourceGroupName, String accountName, String maxpagesize, String filter, Context context) {
        return this.serviceClient.list(resourceGroupName, accountName, maxpagesize, filter, context);
    }

    /**
     * Gets a list of all the queues under the specified storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all the queues under the specified storage account.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ListQueue> list(String resourceGroupName, String accountName) {
        return this.serviceClient.list(resourceGroupName, accountName);
    }
}
