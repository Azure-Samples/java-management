// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.network;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.PollerFlux;
import com.azure.management.vanilla.network.implementation.ServiceEndpointPolicyDefinitionsImpl;
import com.azure.management.vanilla.network.models.ServiceEndpointPolicyDefinition;

/** Initializes a new instance of the synchronous NetworkManagementClient type. */
@ServiceClient(builder = NetworkManagementClientBuilder.class)
public final class ServiceEndpointPolicyDefinitionsClient {
    private ServiceEndpointPolicyDefinitionsImpl serviceClient;

    /** Initializes an instance of ServiceEndpointPolicyDefinitions client. */
    ServiceEndpointPolicyDefinitionsClient(ServiceEndpointPolicyDefinitionsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Deletes the specified ServiceEndpoint policy definitions.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceEndpointPolicyName The name of the Service Endpoint Policy.
     * @param serviceEndpointPolicyDefinitionName The name of the service endpoint policy definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String serviceEndpointPolicyName, String serviceEndpointPolicyDefinitionName) {
        return this
            .serviceClient
            .beginDelete(resourceGroupName, serviceEndpointPolicyName, serviceEndpointPolicyDefinitionName);
    }

    /**
     * Deletes the specified ServiceEndpoint policy definitions.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceEndpointPolicyName The name of the Service Endpoint Policy.
     * @param serviceEndpointPolicyDefinitionName The name of the service endpoint policy definition.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<Void>, Void> beginDelete(
        String resourceGroupName,
        String serviceEndpointPolicyName,
        String serviceEndpointPolicyDefinitionName,
        Context context) {
        return this
            .serviceClient
            .beginDelete(resourceGroupName, serviceEndpointPolicyName, serviceEndpointPolicyDefinitionName, context);
    }

    /**
     * Deletes the specified ServiceEndpoint policy definitions.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceEndpointPolicyName The name of the Service Endpoint Policy.
     * @param serviceEndpointPolicyDefinitionName The name of the service endpoint policy definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(
        String resourceGroupName, String serviceEndpointPolicyName, String serviceEndpointPolicyDefinitionName) {
        this.serviceClient.delete(resourceGroupName, serviceEndpointPolicyName, serviceEndpointPolicyDefinitionName);
    }

    /**
     * Deletes the specified ServiceEndpoint policy definitions.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceEndpointPolicyName The name of the Service Endpoint Policy.
     * @param serviceEndpointPolicyDefinitionName The name of the service endpoint policy definition.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(
        String resourceGroupName,
        String serviceEndpointPolicyName,
        String serviceEndpointPolicyDefinitionName,
        Context context) {
        this
            .serviceClient
            .delete(resourceGroupName, serviceEndpointPolicyName, serviceEndpointPolicyDefinitionName, context);
    }

    /**
     * Get the specified service endpoint policy definitions from service endpoint policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceEndpointPolicyName The name of the service endpoint policy name.
     * @param serviceEndpointPolicyDefinitionName The name of the service endpoint policy definition name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified service endpoint policy definitions from service endpoint policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ServiceEndpointPolicyDefinition get(
        String resourceGroupName, String serviceEndpointPolicyName, String serviceEndpointPolicyDefinitionName) {
        return this
            .serviceClient
            .get(resourceGroupName, serviceEndpointPolicyName, serviceEndpointPolicyDefinitionName);
    }

    /**
     * Get the specified service endpoint policy definitions from service endpoint policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceEndpointPolicyName The name of the service endpoint policy name.
     * @param serviceEndpointPolicyDefinitionName The name of the service endpoint policy definition name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified service endpoint policy definitions from service endpoint policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ServiceEndpointPolicyDefinition get(
        String resourceGroupName,
        String serviceEndpointPolicyName,
        String serviceEndpointPolicyDefinitionName,
        Context context) {
        return this
            .serviceClient
            .get(resourceGroupName, serviceEndpointPolicyName, serviceEndpointPolicyDefinitionName, context);
    }

    /**
     * Creates or updates a service endpoint policy definition in the specified service endpoint policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceEndpointPolicyName The name of the service endpoint policy.
     * @param serviceEndpointPolicyDefinitionName The name of the service endpoint policy definition name.
     * @param serviceEndpointPolicyDefinitions Service Endpoint policy definitions.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return service Endpoint policy definitions.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<ServiceEndpointPolicyDefinition>, ServiceEndpointPolicyDefinition> beginCreateOrUpdate(
        String resourceGroupName,
        String serviceEndpointPolicyName,
        String serviceEndpointPolicyDefinitionName,
        ServiceEndpointPolicyDefinition serviceEndpointPolicyDefinitions) {
        return this
            .serviceClient
            .beginCreateOrUpdate(
                resourceGroupName,
                serviceEndpointPolicyName,
                serviceEndpointPolicyDefinitionName,
                serviceEndpointPolicyDefinitions);
    }

    /**
     * Creates or updates a service endpoint policy definition in the specified service endpoint policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceEndpointPolicyName The name of the service endpoint policy.
     * @param serviceEndpointPolicyDefinitionName The name of the service endpoint policy definition name.
     * @param serviceEndpointPolicyDefinitions Service Endpoint policy definitions.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return service Endpoint policy definitions.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<ServiceEndpointPolicyDefinition>, ServiceEndpointPolicyDefinition> beginCreateOrUpdate(
        String resourceGroupName,
        String serviceEndpointPolicyName,
        String serviceEndpointPolicyDefinitionName,
        ServiceEndpointPolicyDefinition serviceEndpointPolicyDefinitions,
        Context context) {
        return this
            .serviceClient
            .beginCreateOrUpdate(
                resourceGroupName,
                serviceEndpointPolicyName,
                serviceEndpointPolicyDefinitionName,
                serviceEndpointPolicyDefinitions,
                context);
    }

    /**
     * Creates or updates a service endpoint policy definition in the specified service endpoint policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceEndpointPolicyName The name of the service endpoint policy.
     * @param serviceEndpointPolicyDefinitionName The name of the service endpoint policy definition name.
     * @param serviceEndpointPolicyDefinitions Service Endpoint policy definitions.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return service Endpoint policy definitions.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ServiceEndpointPolicyDefinition createOrUpdate(
        String resourceGroupName,
        String serviceEndpointPolicyName,
        String serviceEndpointPolicyDefinitionName,
        ServiceEndpointPolicyDefinition serviceEndpointPolicyDefinitions) {
        return this
            .serviceClient
            .createOrUpdate(
                resourceGroupName,
                serviceEndpointPolicyName,
                serviceEndpointPolicyDefinitionName,
                serviceEndpointPolicyDefinitions);
    }

    /**
     * Creates or updates a service endpoint policy definition in the specified service endpoint policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceEndpointPolicyName The name of the service endpoint policy.
     * @param serviceEndpointPolicyDefinitionName The name of the service endpoint policy definition name.
     * @param serviceEndpointPolicyDefinitions Service Endpoint policy definitions.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return service Endpoint policy definitions.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ServiceEndpointPolicyDefinition createOrUpdate(
        String resourceGroupName,
        String serviceEndpointPolicyName,
        String serviceEndpointPolicyDefinitionName,
        ServiceEndpointPolicyDefinition serviceEndpointPolicyDefinitions,
        Context context) {
        return this
            .serviceClient
            .createOrUpdate(
                resourceGroupName,
                serviceEndpointPolicyName,
                serviceEndpointPolicyDefinitionName,
                serviceEndpointPolicyDefinitions,
                context);
    }

    /**
     * Gets all service endpoint policy definitions in a service end point policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceEndpointPolicyName The name of the service endpoint policy name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all service endpoint policy definitions in a service end point policy.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ServiceEndpointPolicyDefinition> listByResourceGroup(
        String resourceGroupName, String serviceEndpointPolicyName) {
        return this.serviceClient.listByResourceGroup(resourceGroupName, serviceEndpointPolicyName);
    }

    /**
     * Gets all service endpoint policy definitions in a service end point policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceEndpointPolicyName The name of the service endpoint policy name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all service endpoint policy definitions in a service end point policy.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ServiceEndpointPolicyDefinition> listByResourceGroup(
        String resourceGroupName, String serviceEndpointPolicyName, Context context) {
        return this.serviceClient.listByResourceGroup(resourceGroupName, serviceEndpointPolicyName, context);
    }

    /**
     * Deletes the specified ServiceEndpoint policy definitions.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceEndpointPolicyName The name of the Service Endpoint Policy.
     * @param serviceEndpointPolicyDefinitionName The name of the service endpoint policy definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void beginDeleteWithoutPolling(
        String resourceGroupName, String serviceEndpointPolicyName, String serviceEndpointPolicyDefinitionName) {
        this
            .serviceClient
            .beginDeleteWithoutPolling(
                resourceGroupName, serviceEndpointPolicyName, serviceEndpointPolicyDefinitionName);
    }

    /**
     * Deletes the specified ServiceEndpoint policy definitions.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceEndpointPolicyName The name of the Service Endpoint Policy.
     * @param serviceEndpointPolicyDefinitionName The name of the service endpoint policy definition.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void beginDeleteWithoutPolling(
        String resourceGroupName,
        String serviceEndpointPolicyName,
        String serviceEndpointPolicyDefinitionName,
        Context context) {
        this
            .serviceClient
            .beginDeleteWithoutPolling(
                resourceGroupName, serviceEndpointPolicyName, serviceEndpointPolicyDefinitionName, context);
    }

    /**
     * Creates or updates a service endpoint policy definition in the specified service endpoint policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceEndpointPolicyName The name of the service endpoint policy.
     * @param serviceEndpointPolicyDefinitionName The name of the service endpoint policy definition name.
     * @param serviceEndpointPolicyDefinitions Service Endpoint policy definitions.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return service Endpoint policy definitions.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ServiceEndpointPolicyDefinition beginCreateOrUpdateWithoutPolling(
        String resourceGroupName,
        String serviceEndpointPolicyName,
        String serviceEndpointPolicyDefinitionName,
        ServiceEndpointPolicyDefinition serviceEndpointPolicyDefinitions) {
        return this
            .serviceClient
            .beginCreateOrUpdateWithoutPolling(
                resourceGroupName,
                serviceEndpointPolicyName,
                serviceEndpointPolicyDefinitionName,
                serviceEndpointPolicyDefinitions);
    }

    /**
     * Creates or updates a service endpoint policy definition in the specified service endpoint policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceEndpointPolicyName The name of the service endpoint policy.
     * @param serviceEndpointPolicyDefinitionName The name of the service endpoint policy definition name.
     * @param serviceEndpointPolicyDefinitions Service Endpoint policy definitions.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return service Endpoint policy definitions.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ServiceEndpointPolicyDefinition beginCreateOrUpdateWithoutPolling(
        String resourceGroupName,
        String serviceEndpointPolicyName,
        String serviceEndpointPolicyDefinitionName,
        ServiceEndpointPolicyDefinition serviceEndpointPolicyDefinitions,
        Context context) {
        return this
            .serviceClient
            .beginCreateOrUpdateWithoutPolling(
                resourceGroupName,
                serviceEndpointPolicyName,
                serviceEndpointPolicyDefinitionName,
                serviceEndpointPolicyDefinitions,
                context);
    }
}
