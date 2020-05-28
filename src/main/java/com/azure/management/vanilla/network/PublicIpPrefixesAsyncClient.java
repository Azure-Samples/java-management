// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.network;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.Response;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.PollerFlux;
import com.azure.management.vanilla.network.implementation.PublicIpPrefixesImpl;
import com.azure.management.vanilla.network.models.PublicIpPrefix;
import java.nio.ByteBuffer;
import java.util.Map;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the asynchronous NetworkManagementClient type. */
@ServiceClient(builder = NetworkManagementClientBuilder.class)
public final class PublicIpPrefixesAsyncClient {
    private PublicIpPrefixesImpl serviceClient;

    /** Initializes an instance of PublicIpPrefixes client. */
    PublicIpPrefixesAsyncClient(PublicIpPrefixesImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Deletes the specified public IP prefix.
     *
     * @param resourceGroupName The name of the resource group.
     * @param publicIpPrefixName The name of the PublicIpPrefix.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Flux<ByteBuffer>>> deleteWithResponse(String resourceGroupName, String publicIpPrefixName) {
        return this.serviceClient.deleteWithResponseAsync(resourceGroupName, publicIpPrefixName);
    }

    /**
     * Deletes the specified public IP prefix.
     *
     * @param resourceGroupName The name of the resource group.
     * @param publicIpPrefixName The name of the PublicIpPrefix.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Flux<ByteBuffer>>> deleteWithResponse(
        String resourceGroupName, String publicIpPrefixName, Context context) {
        return this.serviceClient.deleteWithResponseAsync(resourceGroupName, publicIpPrefixName, context);
    }

    /**
     * Deletes the specified public IP prefix.
     *
     * @param resourceGroupName The name of the resource group.
     * @param publicIpPrefixName The name of the PublicIpPrefix.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<Void>, Void> beginDelete(String resourceGroupName, String publicIpPrefixName) {
        return this.serviceClient.beginDelete(resourceGroupName, publicIpPrefixName);
    }

    /**
     * Deletes the specified public IP prefix.
     *
     * @param resourceGroupName The name of the resource group.
     * @param publicIpPrefixName The name of the PublicIpPrefix.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String publicIpPrefixName, Context context) {
        return this.serviceClient.beginDelete(resourceGroupName, publicIpPrefixName, context);
    }

    /**
     * Deletes the specified public IP prefix.
     *
     * @param resourceGroupName The name of the resource group.
     * @param publicIpPrefixName The name of the PublicIpPrefix.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> delete(String resourceGroupName, String publicIpPrefixName) {
        return this.serviceClient.deleteAsync(resourceGroupName, publicIpPrefixName);
    }

    /**
     * Deletes the specified public IP prefix.
     *
     * @param resourceGroupName The name of the resource group.
     * @param publicIpPrefixName The name of the PublicIpPrefix.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> delete(String resourceGroupName, String publicIpPrefixName, Context context) {
        return this.serviceClient.deleteAsync(resourceGroupName, publicIpPrefixName, context);
    }

    /**
     * Gets the specified public IP prefix in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param publicIpPrefixName The name of the public IP prefix.
     * @param expand Expands referenced resources.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified public IP prefix in a specified resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<PublicIpPrefix>> getByResourceGroupWithResponse(
        String resourceGroupName, String publicIpPrefixName, String expand) {
        return this.serviceClient.getByResourceGroupWithResponseAsync(resourceGroupName, publicIpPrefixName, expand);
    }

    /**
     * Gets the specified public IP prefix in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param publicIpPrefixName The name of the public IP prefix.
     * @param expand Expands referenced resources.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified public IP prefix in a specified resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<PublicIpPrefix>> getByResourceGroupWithResponse(
        String resourceGroupName, String publicIpPrefixName, String expand, Context context) {
        return this
            .serviceClient
            .getByResourceGroupWithResponseAsync(resourceGroupName, publicIpPrefixName, expand, context);
    }

    /**
     * Gets the specified public IP prefix in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param publicIpPrefixName The name of the public IP prefix.
     * @param expand Expands referenced resources.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified public IP prefix in a specified resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PublicIpPrefix> getByResourceGroup(String resourceGroupName, String publicIpPrefixName, String expand) {
        return this.serviceClient.getByResourceGroupAsync(resourceGroupName, publicIpPrefixName, expand);
    }

    /**
     * Gets the specified public IP prefix in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param publicIpPrefixName The name of the public IP prefix.
     * @param expand Expands referenced resources.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified public IP prefix in a specified resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PublicIpPrefix> getByResourceGroup(
        String resourceGroupName, String publicIpPrefixName, String expand, Context context) {
        return this.serviceClient.getByResourceGroupAsync(resourceGroupName, publicIpPrefixName, expand, context);
    }

    /**
     * Gets the specified public IP prefix in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param publicIpPrefixName The name of the public IP prefix.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified public IP prefix in a specified resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PublicIpPrefix> getByResourceGroup(String resourceGroupName, String publicIpPrefixName) {
        return this.serviceClient.getByResourceGroupAsync(resourceGroupName, publicIpPrefixName);
    }

    /**
     * Creates or updates a static or dynamic public IP prefix.
     *
     * @param resourceGroupName The name of the resource group.
     * @param publicIpPrefixName The name of the public IP prefix.
     * @param parameters Public IP prefix resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return public IP prefix resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Flux<ByteBuffer>>> createOrUpdateWithResponse(
        String resourceGroupName, String publicIpPrefixName, PublicIpPrefix parameters) {
        return this.serviceClient.createOrUpdateWithResponseAsync(resourceGroupName, publicIpPrefixName, parameters);
    }

    /**
     * Creates or updates a static or dynamic public IP prefix.
     *
     * @param resourceGroupName The name of the resource group.
     * @param publicIpPrefixName The name of the public IP prefix.
     * @param parameters Public IP prefix resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return public IP prefix resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Flux<ByteBuffer>>> createOrUpdateWithResponse(
        String resourceGroupName, String publicIpPrefixName, PublicIpPrefix parameters, Context context) {
        return this
            .serviceClient
            .createOrUpdateWithResponseAsync(resourceGroupName, publicIpPrefixName, parameters, context);
    }

    /**
     * Creates or updates a static or dynamic public IP prefix.
     *
     * @param resourceGroupName The name of the resource group.
     * @param publicIpPrefixName The name of the public IP prefix.
     * @param parameters Public IP prefix resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return public IP prefix resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<PublicIpPrefix>, PublicIpPrefix> beginCreateOrUpdate(
        String resourceGroupName, String publicIpPrefixName, PublicIpPrefix parameters) {
        return this.serviceClient.beginCreateOrUpdate(resourceGroupName, publicIpPrefixName, parameters);
    }

    /**
     * Creates or updates a static or dynamic public IP prefix.
     *
     * @param resourceGroupName The name of the resource group.
     * @param publicIpPrefixName The name of the public IP prefix.
     * @param parameters Public IP prefix resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return public IP prefix resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<PublicIpPrefix>, PublicIpPrefix> beginCreateOrUpdate(
        String resourceGroupName, String publicIpPrefixName, PublicIpPrefix parameters, Context context) {
        return this.serviceClient.beginCreateOrUpdate(resourceGroupName, publicIpPrefixName, parameters, context);
    }

    /**
     * Creates or updates a static or dynamic public IP prefix.
     *
     * @param resourceGroupName The name of the resource group.
     * @param publicIpPrefixName The name of the public IP prefix.
     * @param parameters Public IP prefix resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return public IP prefix resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PublicIpPrefix> createOrUpdate(
        String resourceGroupName, String publicIpPrefixName, PublicIpPrefix parameters) {
        return this.serviceClient.createOrUpdateAsync(resourceGroupName, publicIpPrefixName, parameters);
    }

    /**
     * Creates or updates a static or dynamic public IP prefix.
     *
     * @param resourceGroupName The name of the resource group.
     * @param publicIpPrefixName The name of the public IP prefix.
     * @param parameters Public IP prefix resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return public IP prefix resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PublicIpPrefix> createOrUpdate(
        String resourceGroupName, String publicIpPrefixName, PublicIpPrefix parameters, Context context) {
        return this.serviceClient.createOrUpdateAsync(resourceGroupName, publicIpPrefixName, parameters, context);
    }

    /**
     * Updates public IP prefix tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param publicIpPrefixName The name of the public IP prefix.
     * @param tags Resource tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return public IP prefix resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<PublicIpPrefix>> updateTagsWithResponse(
        String resourceGroupName, String publicIpPrefixName, Map<String, String> tags) {
        return this.serviceClient.updateTagsWithResponseAsync(resourceGroupName, publicIpPrefixName, tags);
    }

    /**
     * Updates public IP prefix tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param publicIpPrefixName The name of the public IP prefix.
     * @param tags Resource tags.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return public IP prefix resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<PublicIpPrefix>> updateTagsWithResponse(
        String resourceGroupName, String publicIpPrefixName, Map<String, String> tags, Context context) {
        return this.serviceClient.updateTagsWithResponseAsync(resourceGroupName, publicIpPrefixName, tags, context);
    }

    /**
     * Updates public IP prefix tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param publicIpPrefixName The name of the public IP prefix.
     * @param tags Resource tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return public IP prefix resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PublicIpPrefix> updateTags(
        String resourceGroupName, String publicIpPrefixName, Map<String, String> tags) {
        return this.serviceClient.updateTagsAsync(resourceGroupName, publicIpPrefixName, tags);
    }

    /**
     * Updates public IP prefix tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param publicIpPrefixName The name of the public IP prefix.
     * @param tags Resource tags.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return public IP prefix resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PublicIpPrefix> updateTags(
        String resourceGroupName, String publicIpPrefixName, Map<String, String> tags, Context context) {
        return this.serviceClient.updateTagsAsync(resourceGroupName, publicIpPrefixName, tags, context);
    }

    /**
     * Gets all the public IP prefixes in a subscription.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the public IP prefixes in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<PublicIpPrefix>> listSinglePage() {
        return this.serviceClient.listSinglePageAsync();
    }

    /**
     * Gets all the public IP prefixes in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the public IP prefixes in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<PublicIpPrefix>> listSinglePage(Context context) {
        return this.serviceClient.listSinglePageAsync(context);
    }

    /**
     * Gets all the public IP prefixes in a subscription.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the public IP prefixes in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<PublicIpPrefix> list() {
        return this.serviceClient.listAsync();
    }

    /**
     * Gets all the public IP prefixes in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the public IP prefixes in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<PublicIpPrefix> list(Context context) {
        return this.serviceClient.listAsync(context);
    }

    /**
     * Gets all public IP prefixes in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all public IP prefixes in a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<PublicIpPrefix>> listByResourceGroupSinglePage(String resourceGroupName) {
        return this.serviceClient.listByResourceGroupSinglePageAsync(resourceGroupName);
    }

    /**
     * Gets all public IP prefixes in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all public IP prefixes in a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<PublicIpPrefix>> listByResourceGroupSinglePage(
        String resourceGroupName, Context context) {
        return this.serviceClient.listByResourceGroupSinglePageAsync(resourceGroupName, context);
    }

    /**
     * Gets all public IP prefixes in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all public IP prefixes in a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<PublicIpPrefix> listByResourceGroup(String resourceGroupName) {
        return this.serviceClient.listByResourceGroupAsync(resourceGroupName);
    }

    /**
     * Gets all public IP prefixes in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all public IP prefixes in a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<PublicIpPrefix> listByResourceGroup(String resourceGroupName, Context context) {
        return this.serviceClient.listByResourceGroupAsync(resourceGroupName, context);
    }

    /**
     * Deletes the specified public IP prefix.
     *
     * @param resourceGroupName The name of the resource group.
     * @param publicIpPrefixName The name of the PublicIpPrefix.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> beginDeleteWithoutPollingWithResponse(
        String resourceGroupName, String publicIpPrefixName) {
        return this.serviceClient.beginDeleteWithoutPollingWithResponseAsync(resourceGroupName, publicIpPrefixName);
    }

    /**
     * Deletes the specified public IP prefix.
     *
     * @param resourceGroupName The name of the resource group.
     * @param publicIpPrefixName The name of the PublicIpPrefix.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> beginDeleteWithoutPollingWithResponse(
        String resourceGroupName, String publicIpPrefixName, Context context) {
        return this
            .serviceClient
            .beginDeleteWithoutPollingWithResponseAsync(resourceGroupName, publicIpPrefixName, context);
    }

    /**
     * Deletes the specified public IP prefix.
     *
     * @param resourceGroupName The name of the resource group.
     * @param publicIpPrefixName The name of the PublicIpPrefix.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> beginDeleteWithoutPolling(String resourceGroupName, String publicIpPrefixName) {
        return this.serviceClient.beginDeleteWithoutPollingAsync(resourceGroupName, publicIpPrefixName);
    }

    /**
     * Deletes the specified public IP prefix.
     *
     * @param resourceGroupName The name of the resource group.
     * @param publicIpPrefixName The name of the PublicIpPrefix.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> beginDeleteWithoutPolling(String resourceGroupName, String publicIpPrefixName, Context context) {
        return this.serviceClient.beginDeleteWithoutPollingAsync(resourceGroupName, publicIpPrefixName, context);
    }

    /**
     * Creates or updates a static or dynamic public IP prefix.
     *
     * @param resourceGroupName The name of the resource group.
     * @param publicIpPrefixName The name of the public IP prefix.
     * @param parameters Public IP prefix resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return public IP prefix resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<PublicIpPrefix>> beginCreateOrUpdateWithoutPollingWithResponse(
        String resourceGroupName, String publicIpPrefixName, PublicIpPrefix parameters) {
        return this
            .serviceClient
            .beginCreateOrUpdateWithoutPollingWithResponseAsync(resourceGroupName, publicIpPrefixName, parameters);
    }

    /**
     * Creates or updates a static or dynamic public IP prefix.
     *
     * @param resourceGroupName The name of the resource group.
     * @param publicIpPrefixName The name of the public IP prefix.
     * @param parameters Public IP prefix resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return public IP prefix resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<PublicIpPrefix>> beginCreateOrUpdateWithoutPollingWithResponse(
        String resourceGroupName, String publicIpPrefixName, PublicIpPrefix parameters, Context context) {
        return this
            .serviceClient
            .beginCreateOrUpdateWithoutPollingWithResponseAsync(
                resourceGroupName, publicIpPrefixName, parameters, context);
    }

    /**
     * Creates or updates a static or dynamic public IP prefix.
     *
     * @param resourceGroupName The name of the resource group.
     * @param publicIpPrefixName The name of the public IP prefix.
     * @param parameters Public IP prefix resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return public IP prefix resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PublicIpPrefix> beginCreateOrUpdateWithoutPolling(
        String resourceGroupName, String publicIpPrefixName, PublicIpPrefix parameters) {
        return this
            .serviceClient
            .beginCreateOrUpdateWithoutPollingAsync(resourceGroupName, publicIpPrefixName, parameters);
    }

    /**
     * Creates or updates a static or dynamic public IP prefix.
     *
     * @param resourceGroupName The name of the resource group.
     * @param publicIpPrefixName The name of the public IP prefix.
     * @param parameters Public IP prefix resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return public IP prefix resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PublicIpPrefix> beginCreateOrUpdateWithoutPolling(
        String resourceGroupName, String publicIpPrefixName, PublicIpPrefix parameters, Context context) {
        return this
            .serviceClient
            .beginCreateOrUpdateWithoutPollingAsync(resourceGroupName, publicIpPrefixName, parameters, context);
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink null
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListPublicIpPrefixes API service call.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<PublicIpPrefix>> listAllNextSinglePage(String nextLink) {
        return this.serviceClient.listAllNextSinglePageAsync(nextLink);
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink null
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListPublicIpPrefixes API service call.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<PublicIpPrefix>> listAllNextSinglePage(String nextLink, Context context) {
        return this.serviceClient.listAllNextSinglePageAsync(nextLink, context);
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink null
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListPublicIpPrefixes API service call.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<PublicIpPrefix>> listNextSinglePage(String nextLink) {
        return this.serviceClient.listNextSinglePageAsync(nextLink);
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink null
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListPublicIpPrefixes API service call.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<PublicIpPrefix>> listNextSinglePage(String nextLink, Context context) {
        return this.serviceClient.listNextSinglePageAsync(nextLink, context);
    }
}
