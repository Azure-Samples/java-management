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
import com.azure.management.vanilla.network.implementation.NetworkProfilesImpl;
import com.azure.management.vanilla.network.models.NetworkProfile;
import java.nio.ByteBuffer;
import java.util.Map;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the asynchronous NetworkManagementClient type. */
@ServiceClient(builder = NetworkManagementClientBuilder.class)
public final class NetworkProfilesAsyncClient {
    private NetworkProfilesImpl serviceClient;

    /** Initializes an instance of NetworkProfiles client. */
    NetworkProfilesAsyncClient(NetworkProfilesImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Deletes the specified network profile.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkProfileName The name of the NetworkProfile.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Flux<ByteBuffer>>> deleteWithResponse(String resourceGroupName, String networkProfileName) {
        return this.serviceClient.deleteWithResponseAsync(resourceGroupName, networkProfileName);
    }

    /**
     * Deletes the specified network profile.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkProfileName The name of the NetworkProfile.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Flux<ByteBuffer>>> deleteWithResponse(
        String resourceGroupName, String networkProfileName, Context context) {
        return this.serviceClient.deleteWithResponseAsync(resourceGroupName, networkProfileName, context);
    }

    /**
     * Deletes the specified network profile.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkProfileName The name of the NetworkProfile.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<Void>, Void> beginDelete(String resourceGroupName, String networkProfileName) {
        return this.serviceClient.beginDelete(resourceGroupName, networkProfileName);
    }

    /**
     * Deletes the specified network profile.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkProfileName The name of the NetworkProfile.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String networkProfileName, Context context) {
        return this.serviceClient.beginDelete(resourceGroupName, networkProfileName, context);
    }

    /**
     * Deletes the specified network profile.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkProfileName The name of the NetworkProfile.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> delete(String resourceGroupName, String networkProfileName) {
        return this.serviceClient.deleteAsync(resourceGroupName, networkProfileName);
    }

    /**
     * Deletes the specified network profile.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkProfileName The name of the NetworkProfile.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> delete(String resourceGroupName, String networkProfileName, Context context) {
        return this.serviceClient.deleteAsync(resourceGroupName, networkProfileName, context);
    }

    /**
     * Gets the specified network profile in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkProfileName The name of the public IP prefix.
     * @param expand Expands referenced resources.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified network profile in a specified resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<NetworkProfile>> getByResourceGroupWithResponse(
        String resourceGroupName, String networkProfileName, String expand) {
        return this.serviceClient.getByResourceGroupWithResponseAsync(resourceGroupName, networkProfileName, expand);
    }

    /**
     * Gets the specified network profile in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkProfileName The name of the public IP prefix.
     * @param expand Expands referenced resources.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified network profile in a specified resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<NetworkProfile>> getByResourceGroupWithResponse(
        String resourceGroupName, String networkProfileName, String expand, Context context) {
        return this
            .serviceClient
            .getByResourceGroupWithResponseAsync(resourceGroupName, networkProfileName, expand, context);
    }

    /**
     * Gets the specified network profile in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkProfileName The name of the public IP prefix.
     * @param expand Expands referenced resources.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified network profile in a specified resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<NetworkProfile> getByResourceGroup(String resourceGroupName, String networkProfileName, String expand) {
        return this.serviceClient.getByResourceGroupAsync(resourceGroupName, networkProfileName, expand);
    }

    /**
     * Gets the specified network profile in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkProfileName The name of the public IP prefix.
     * @param expand Expands referenced resources.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified network profile in a specified resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<NetworkProfile> getByResourceGroup(
        String resourceGroupName, String networkProfileName, String expand, Context context) {
        return this.serviceClient.getByResourceGroupAsync(resourceGroupName, networkProfileName, expand, context);
    }

    /**
     * Gets the specified network profile in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkProfileName The name of the public IP prefix.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified network profile in a specified resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<NetworkProfile> getByResourceGroup(String resourceGroupName, String networkProfileName) {
        return this.serviceClient.getByResourceGroupAsync(resourceGroupName, networkProfileName);
    }

    /**
     * Creates or updates a network profile.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkProfileName The name of the network profile.
     * @param parameters Network profile resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return network profile resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<NetworkProfile>> createOrUpdateWithResponse(
        String resourceGroupName, String networkProfileName, NetworkProfile parameters) {
        return this.serviceClient.createOrUpdateWithResponseAsync(resourceGroupName, networkProfileName, parameters);
    }

    /**
     * Creates or updates a network profile.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkProfileName The name of the network profile.
     * @param parameters Network profile resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return network profile resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<NetworkProfile>> createOrUpdateWithResponse(
        String resourceGroupName, String networkProfileName, NetworkProfile parameters, Context context) {
        return this
            .serviceClient
            .createOrUpdateWithResponseAsync(resourceGroupName, networkProfileName, parameters, context);
    }

    /**
     * Creates or updates a network profile.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkProfileName The name of the network profile.
     * @param parameters Network profile resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return network profile resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<NetworkProfile> createOrUpdate(
        String resourceGroupName, String networkProfileName, NetworkProfile parameters) {
        return this.serviceClient.createOrUpdateAsync(resourceGroupName, networkProfileName, parameters);
    }

    /**
     * Creates or updates a network profile.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkProfileName The name of the network profile.
     * @param parameters Network profile resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return network profile resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<NetworkProfile> createOrUpdate(
        String resourceGroupName, String networkProfileName, NetworkProfile parameters, Context context) {
        return this.serviceClient.createOrUpdateAsync(resourceGroupName, networkProfileName, parameters, context);
    }

    /**
     * Updates network profile tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkProfileName The name of the network profile.
     * @param tags Resource tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return network profile resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<NetworkProfile>> updateTagsWithResponse(
        String resourceGroupName, String networkProfileName, Map<String, String> tags) {
        return this.serviceClient.updateTagsWithResponseAsync(resourceGroupName, networkProfileName, tags);
    }

    /**
     * Updates network profile tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkProfileName The name of the network profile.
     * @param tags Resource tags.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return network profile resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<NetworkProfile>> updateTagsWithResponse(
        String resourceGroupName, String networkProfileName, Map<String, String> tags, Context context) {
        return this.serviceClient.updateTagsWithResponseAsync(resourceGroupName, networkProfileName, tags, context);
    }

    /**
     * Updates network profile tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkProfileName The name of the network profile.
     * @param tags Resource tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return network profile resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<NetworkProfile> updateTags(
        String resourceGroupName, String networkProfileName, Map<String, String> tags) {
        return this.serviceClient.updateTagsAsync(resourceGroupName, networkProfileName, tags);
    }

    /**
     * Updates network profile tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkProfileName The name of the network profile.
     * @param tags Resource tags.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return network profile resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<NetworkProfile> updateTags(
        String resourceGroupName, String networkProfileName, Map<String, String> tags, Context context) {
        return this.serviceClient.updateTagsAsync(resourceGroupName, networkProfileName, tags, context);
    }

    /**
     * Gets all the network profiles in a subscription.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the network profiles in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<NetworkProfile>> listSinglePage() {
        return this.serviceClient.listSinglePageAsync();
    }

    /**
     * Gets all the network profiles in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the network profiles in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<NetworkProfile>> listSinglePage(Context context) {
        return this.serviceClient.listSinglePageAsync(context);
    }

    /**
     * Gets all the network profiles in a subscription.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the network profiles in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<NetworkProfile> list() {
        return this.serviceClient.listAsync();
    }

    /**
     * Gets all the network profiles in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the network profiles in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<NetworkProfile> list(Context context) {
        return this.serviceClient.listAsync(context);
    }

    /**
     * Gets all network profiles in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all network profiles in a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<NetworkProfile>> listByResourceGroupSinglePage(String resourceGroupName) {
        return this.serviceClient.listByResourceGroupSinglePageAsync(resourceGroupName);
    }

    /**
     * Gets all network profiles in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all network profiles in a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<NetworkProfile>> listByResourceGroupSinglePage(
        String resourceGroupName, Context context) {
        return this.serviceClient.listByResourceGroupSinglePageAsync(resourceGroupName, context);
    }

    /**
     * Gets all network profiles in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all network profiles in a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<NetworkProfile> listByResourceGroup(String resourceGroupName) {
        return this.serviceClient.listByResourceGroupAsync(resourceGroupName);
    }

    /**
     * Gets all network profiles in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all network profiles in a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<NetworkProfile> listByResourceGroup(String resourceGroupName, Context context) {
        return this.serviceClient.listByResourceGroupAsync(resourceGroupName, context);
    }

    /**
     * Deletes the specified network profile.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkProfileName The name of the NetworkProfile.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> beginDeleteWithoutPollingWithResponse(
        String resourceGroupName, String networkProfileName) {
        return this.serviceClient.beginDeleteWithoutPollingWithResponseAsync(resourceGroupName, networkProfileName);
    }

    /**
     * Deletes the specified network profile.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkProfileName The name of the NetworkProfile.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> beginDeleteWithoutPollingWithResponse(
        String resourceGroupName, String networkProfileName, Context context) {
        return this
            .serviceClient
            .beginDeleteWithoutPollingWithResponseAsync(resourceGroupName, networkProfileName, context);
    }

    /**
     * Deletes the specified network profile.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkProfileName The name of the NetworkProfile.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> beginDeleteWithoutPolling(String resourceGroupName, String networkProfileName) {
        return this.serviceClient.beginDeleteWithoutPollingAsync(resourceGroupName, networkProfileName);
    }

    /**
     * Deletes the specified network profile.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkProfileName The name of the NetworkProfile.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> beginDeleteWithoutPolling(String resourceGroupName, String networkProfileName, Context context) {
        return this.serviceClient.beginDeleteWithoutPollingAsync(resourceGroupName, networkProfileName, context);
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink null
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListNetworkProfiles API service call.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<NetworkProfile>> listAllNextSinglePage(String nextLink) {
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
     * @return response for ListNetworkProfiles API service call.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<NetworkProfile>> listAllNextSinglePage(String nextLink, Context context) {
        return this.serviceClient.listAllNextSinglePageAsync(nextLink, context);
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink null
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListNetworkProfiles API service call.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<NetworkProfile>> listNextSinglePage(String nextLink) {
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
     * @return response for ListNetworkProfiles API service call.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<NetworkProfile>> listNextSinglePage(String nextLink, Context context) {
        return this.serviceClient.listNextSinglePageAsync(nextLink, context);
    }
}
