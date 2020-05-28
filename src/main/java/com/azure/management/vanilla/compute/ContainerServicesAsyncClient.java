// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.compute;

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
import com.azure.management.vanilla.compute.implementation.ContainerServicesImpl;
import com.azure.management.vanilla.compute.models.ContainerService;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the asynchronous ComputeManagementClient type. */
@ServiceClient(builder = ComputeManagementClientBuilder.class)
public final class ContainerServicesAsyncClient {
    private ContainerServicesImpl serviceClient;

    /** Initializes an instance of ContainerServices client. */
    ContainerServicesAsyncClient(ContainerServicesImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Gets a list of container services in the specified subscription. The operation returns properties of each
     * container service including state, orchestrator, number of masters and agents, and FQDNs of masters and agents.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of container services in the specified subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<ContainerService>> listSinglePage() {
        return this.serviceClient.listSinglePageAsync();
    }

    /**
     * Gets a list of container services in the specified subscription. The operation returns properties of each
     * container service including state, orchestrator, number of masters and agents, and FQDNs of masters and agents.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of container services in the specified subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<ContainerService>> listSinglePage(Context context) {
        return this.serviceClient.listSinglePageAsync(context);
    }

    /**
     * Gets a list of container services in the specified subscription. The operation returns properties of each
     * container service including state, orchestrator, number of masters and agents, and FQDNs of masters and agents.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of container services in the specified subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<ContainerService> list() {
        return this.serviceClient.listAsync();
    }

    /**
     * Gets a list of container services in the specified subscription. The operation returns properties of each
     * container service including state, orchestrator, number of masters and agents, and FQDNs of masters and agents.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of container services in the specified subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<ContainerService> list(Context context) {
        return this.serviceClient.listAsync(context);
    }

    /**
     * Creates or updates a container service with the specified configuration of orchestrator, masters, and agents.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerServiceName The name of the container service in the specified subscription and resource group.
     * @param parameters Container service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return container service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Flux<ByteBuffer>>> createOrUpdateWithResponse(
        String resourceGroupName, String containerServiceName, ContainerService parameters) {
        return this.serviceClient.createOrUpdateWithResponseAsync(resourceGroupName, containerServiceName, parameters);
    }

    /**
     * Creates or updates a container service with the specified configuration of orchestrator, masters, and agents.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerServiceName The name of the container service in the specified subscription and resource group.
     * @param parameters Container service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return container service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Flux<ByteBuffer>>> createOrUpdateWithResponse(
        String resourceGroupName, String containerServiceName, ContainerService parameters, Context context) {
        return this
            .serviceClient
            .createOrUpdateWithResponseAsync(resourceGroupName, containerServiceName, parameters, context);
    }

    /**
     * Creates or updates a container service with the specified configuration of orchestrator, masters, and agents.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerServiceName The name of the container service in the specified subscription and resource group.
     * @param parameters Container service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return container service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<ContainerService>, ContainerService> beginCreateOrUpdate(
        String resourceGroupName, String containerServiceName, ContainerService parameters) {
        return this.serviceClient.beginCreateOrUpdate(resourceGroupName, containerServiceName, parameters);
    }

    /**
     * Creates or updates a container service with the specified configuration of orchestrator, masters, and agents.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerServiceName The name of the container service in the specified subscription and resource group.
     * @param parameters Container service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return container service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<ContainerService>, ContainerService> beginCreateOrUpdate(
        String resourceGroupName, String containerServiceName, ContainerService parameters, Context context) {
        return this.serviceClient.beginCreateOrUpdate(resourceGroupName, containerServiceName, parameters, context);
    }

    /**
     * Creates or updates a container service with the specified configuration of orchestrator, masters, and agents.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerServiceName The name of the container service in the specified subscription and resource group.
     * @param parameters Container service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return container service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ContainerService> createOrUpdate(
        String resourceGroupName, String containerServiceName, ContainerService parameters) {
        return this.serviceClient.createOrUpdateAsync(resourceGroupName, containerServiceName, parameters);
    }

    /**
     * Creates or updates a container service with the specified configuration of orchestrator, masters, and agents.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerServiceName The name of the container service in the specified subscription and resource group.
     * @param parameters Container service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return container service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ContainerService> createOrUpdate(
        String resourceGroupName, String containerServiceName, ContainerService parameters, Context context) {
        return this.serviceClient.createOrUpdateAsync(resourceGroupName, containerServiceName, parameters, context);
    }

    /**
     * Gets the properties of the specified container service in the specified subscription and resource group. The
     * operation returns the properties including state, orchestrator, number of masters and agents, and FQDNs of
     * masters and agents.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerServiceName The name of the container service in the specified subscription and resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of the specified container service in the specified subscription and resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<ContainerService>> getByResourceGroupWithResponse(
        String resourceGroupName, String containerServiceName) {
        return this.serviceClient.getByResourceGroupWithResponseAsync(resourceGroupName, containerServiceName);
    }

    /**
     * Gets the properties of the specified container service in the specified subscription and resource group. The
     * operation returns the properties including state, orchestrator, number of masters and agents, and FQDNs of
     * masters and agents.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerServiceName The name of the container service in the specified subscription and resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of the specified container service in the specified subscription and resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<ContainerService>> getByResourceGroupWithResponse(
        String resourceGroupName, String containerServiceName, Context context) {
        return this.serviceClient.getByResourceGroupWithResponseAsync(resourceGroupName, containerServiceName, context);
    }

    /**
     * Gets the properties of the specified container service in the specified subscription and resource group. The
     * operation returns the properties including state, orchestrator, number of masters and agents, and FQDNs of
     * masters and agents.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerServiceName The name of the container service in the specified subscription and resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of the specified container service in the specified subscription and resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ContainerService> getByResourceGroup(String resourceGroupName, String containerServiceName) {
        return this.serviceClient.getByResourceGroupAsync(resourceGroupName, containerServiceName);
    }

    /**
     * Gets the properties of the specified container service in the specified subscription and resource group. The
     * operation returns the properties including state, orchestrator, number of masters and agents, and FQDNs of
     * masters and agents.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerServiceName The name of the container service in the specified subscription and resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of the specified container service in the specified subscription and resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ContainerService> getByResourceGroup(
        String resourceGroupName, String containerServiceName, Context context) {
        return this.serviceClient.getByResourceGroupAsync(resourceGroupName, containerServiceName, context);
    }

    /**
     * Deletes the specified container service in the specified subscription and resource group. The operation does not
     * delete other resources created as part of creating a container service, including storage accounts, VMs, and
     * availability sets. All the other resources created with the container service are part of the same resource group
     * and can be deleted individually.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerServiceName The name of the container service in the specified subscription and resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Flux<ByteBuffer>>> deleteWithResponse(String resourceGroupName, String containerServiceName) {
        return this.serviceClient.deleteWithResponseAsync(resourceGroupName, containerServiceName);
    }

    /**
     * Deletes the specified container service in the specified subscription and resource group. The operation does not
     * delete other resources created as part of creating a container service, including storage accounts, VMs, and
     * availability sets. All the other resources created with the container service are part of the same resource group
     * and can be deleted individually.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerServiceName The name of the container service in the specified subscription and resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Flux<ByteBuffer>>> deleteWithResponse(
        String resourceGroupName, String containerServiceName, Context context) {
        return this.serviceClient.deleteWithResponseAsync(resourceGroupName, containerServiceName, context);
    }

    /**
     * Deletes the specified container service in the specified subscription and resource group. The operation does not
     * delete other resources created as part of creating a container service, including storage accounts, VMs, and
     * availability sets. All the other resources created with the container service are part of the same resource group
     * and can be deleted individually.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerServiceName The name of the container service in the specified subscription and resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<Void>, Void> beginDelete(String resourceGroupName, String containerServiceName) {
        return this.serviceClient.beginDelete(resourceGroupName, containerServiceName);
    }

    /**
     * Deletes the specified container service in the specified subscription and resource group. The operation does not
     * delete other resources created as part of creating a container service, including storage accounts, VMs, and
     * availability sets. All the other resources created with the container service are part of the same resource group
     * and can be deleted individually.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerServiceName The name of the container service in the specified subscription and resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String containerServiceName, Context context) {
        return this.serviceClient.beginDelete(resourceGroupName, containerServiceName, context);
    }

    /**
     * Deletes the specified container service in the specified subscription and resource group. The operation does not
     * delete other resources created as part of creating a container service, including storage accounts, VMs, and
     * availability sets. All the other resources created with the container service are part of the same resource group
     * and can be deleted individually.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerServiceName The name of the container service in the specified subscription and resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> delete(String resourceGroupName, String containerServiceName) {
        return this.serviceClient.deleteAsync(resourceGroupName, containerServiceName);
    }

    /**
     * Deletes the specified container service in the specified subscription and resource group. The operation does not
     * delete other resources created as part of creating a container service, including storage accounts, VMs, and
     * availability sets. All the other resources created with the container service are part of the same resource group
     * and can be deleted individually.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerServiceName The name of the container service in the specified subscription and resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> delete(String resourceGroupName, String containerServiceName, Context context) {
        return this.serviceClient.deleteAsync(resourceGroupName, containerServiceName, context);
    }

    /**
     * Gets a list of container services in the specified subscription and resource group. The operation returns
     * properties of each container service including state, orchestrator, number of masters and agents, and FQDNs of
     * masters and agents.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of container services in the specified subscription and resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<ContainerService>> listByResourceGroupSinglePage(String resourceGroupName) {
        return this.serviceClient.listByResourceGroupSinglePageAsync(resourceGroupName);
    }

    /**
     * Gets a list of container services in the specified subscription and resource group. The operation returns
     * properties of each container service including state, orchestrator, number of masters and agents, and FQDNs of
     * masters and agents.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of container services in the specified subscription and resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<ContainerService>> listByResourceGroupSinglePage(
        String resourceGroupName, Context context) {
        return this.serviceClient.listByResourceGroupSinglePageAsync(resourceGroupName, context);
    }

    /**
     * Gets a list of container services in the specified subscription and resource group. The operation returns
     * properties of each container service including state, orchestrator, number of masters and agents, and FQDNs of
     * masters and agents.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of container services in the specified subscription and resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<ContainerService> listByResourceGroup(String resourceGroupName) {
        return this.serviceClient.listByResourceGroupAsync(resourceGroupName);
    }

    /**
     * Gets a list of container services in the specified subscription and resource group. The operation returns
     * properties of each container service including state, orchestrator, number of masters and agents, and FQDNs of
     * masters and agents.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of container services in the specified subscription and resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<ContainerService> listByResourceGroup(String resourceGroupName, Context context) {
        return this.serviceClient.listByResourceGroupAsync(resourceGroupName, context);
    }

    /**
     * Creates or updates a container service with the specified configuration of orchestrator, masters, and agents.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerServiceName The name of the container service in the specified subscription and resource group.
     * @param parameters Container service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return container service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<ContainerService>> beginCreateOrUpdateWithoutPollingWithResponse(
        String resourceGroupName, String containerServiceName, ContainerService parameters) {
        return this
            .serviceClient
            .beginCreateOrUpdateWithoutPollingWithResponseAsync(resourceGroupName, containerServiceName, parameters);
    }

    /**
     * Creates or updates a container service with the specified configuration of orchestrator, masters, and agents.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerServiceName The name of the container service in the specified subscription and resource group.
     * @param parameters Container service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return container service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<ContainerService>> beginCreateOrUpdateWithoutPollingWithResponse(
        String resourceGroupName, String containerServiceName, ContainerService parameters, Context context) {
        return this
            .serviceClient
            .beginCreateOrUpdateWithoutPollingWithResponseAsync(
                resourceGroupName, containerServiceName, parameters, context);
    }

    /**
     * Creates or updates a container service with the specified configuration of orchestrator, masters, and agents.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerServiceName The name of the container service in the specified subscription and resource group.
     * @param parameters Container service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return container service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ContainerService> beginCreateOrUpdateWithoutPolling(
        String resourceGroupName, String containerServiceName, ContainerService parameters) {
        return this
            .serviceClient
            .beginCreateOrUpdateWithoutPollingAsync(resourceGroupName, containerServiceName, parameters);
    }

    /**
     * Creates or updates a container service with the specified configuration of orchestrator, masters, and agents.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerServiceName The name of the container service in the specified subscription and resource group.
     * @param parameters Container service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return container service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ContainerService> beginCreateOrUpdateWithoutPolling(
        String resourceGroupName, String containerServiceName, ContainerService parameters, Context context) {
        return this
            .serviceClient
            .beginCreateOrUpdateWithoutPollingAsync(resourceGroupName, containerServiceName, parameters, context);
    }

    /**
     * Deletes the specified container service in the specified subscription and resource group. The operation does not
     * delete other resources created as part of creating a container service, including storage accounts, VMs, and
     * availability sets. All the other resources created with the container service are part of the same resource group
     * and can be deleted individually.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerServiceName The name of the container service in the specified subscription and resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> beginDeleteWithoutPollingWithResponse(
        String resourceGroupName, String containerServiceName) {
        return this.serviceClient.beginDeleteWithoutPollingWithResponseAsync(resourceGroupName, containerServiceName);
    }

    /**
     * Deletes the specified container service in the specified subscription and resource group. The operation does not
     * delete other resources created as part of creating a container service, including storage accounts, VMs, and
     * availability sets. All the other resources created with the container service are part of the same resource group
     * and can be deleted individually.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerServiceName The name of the container service in the specified subscription and resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> beginDeleteWithoutPollingWithResponse(
        String resourceGroupName, String containerServiceName, Context context) {
        return this
            .serviceClient
            .beginDeleteWithoutPollingWithResponseAsync(resourceGroupName, containerServiceName, context);
    }

    /**
     * Deletes the specified container service in the specified subscription and resource group. The operation does not
     * delete other resources created as part of creating a container service, including storage accounts, VMs, and
     * availability sets. All the other resources created with the container service are part of the same resource group
     * and can be deleted individually.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerServiceName The name of the container service in the specified subscription and resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> beginDeleteWithoutPolling(String resourceGroupName, String containerServiceName) {
        return this.serviceClient.beginDeleteWithoutPollingAsync(resourceGroupName, containerServiceName);
    }

    /**
     * Deletes the specified container service in the specified subscription and resource group. The operation does not
     * delete other resources created as part of creating a container service, including storage accounts, VMs, and
     * availability sets. All the other resources created with the container service are part of the same resource group
     * and can be deleted individually.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerServiceName The name of the container service in the specified subscription and resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> beginDeleteWithoutPolling(
        String resourceGroupName, String containerServiceName, Context context) {
        return this.serviceClient.beginDeleteWithoutPollingAsync(resourceGroupName, containerServiceName, context);
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink null
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response from the List Container Services operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<ContainerService>> listNextSinglePage(String nextLink) {
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
     * @return the response from the List Container Services operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<ContainerService>> listNextSinglePage(String nextLink, Context context) {
        return this.serviceClient.listNextSinglePageAsync(nextLink, context);
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink null
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response from the List Container Services operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<ContainerService>> listByResourceGroupNextSinglePage(String nextLink) {
        return this.serviceClient.listByResourceGroupNextSinglePageAsync(nextLink);
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink null
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response from the List Container Services operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<ContainerService>> listByResourceGroupNextSinglePage(String nextLink, Context context) {
        return this.serviceClient.listByResourceGroupNextSinglePageAsync(nextLink, context);
    }
}
