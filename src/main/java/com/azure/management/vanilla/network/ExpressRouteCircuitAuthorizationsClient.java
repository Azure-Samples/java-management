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
import com.azure.management.vanilla.network.implementation.ExpressRouteCircuitAuthorizationsImpl;
import com.azure.management.vanilla.network.models.ExpressRouteCircuitAuthorization;

/** Initializes a new instance of the synchronous NetworkManagementClient type. */
@ServiceClient(builder = NetworkManagementClientBuilder.class)
public final class ExpressRouteCircuitAuthorizationsClient {
    private ExpressRouteCircuitAuthorizationsImpl serviceClient;

    /** Initializes an instance of ExpressRouteCircuitAuthorizations client. */
    ExpressRouteCircuitAuthorizationsClient(ExpressRouteCircuitAuthorizationsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Deletes the specified authorization from the specified express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param authorizationName The name of the authorization.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String circuitName, String authorizationName) {
        return this.serviceClient.beginDelete(resourceGroupName, circuitName, authorizationName);
    }

    /**
     * Deletes the specified authorization from the specified express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param authorizationName The name of the authorization.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String circuitName, String authorizationName, Context context) {
        return this.serviceClient.beginDelete(resourceGroupName, circuitName, authorizationName, context);
    }

    /**
     * Deletes the specified authorization from the specified express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param authorizationName The name of the authorization.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String circuitName, String authorizationName) {
        this.serviceClient.delete(resourceGroupName, circuitName, authorizationName);
    }

    /**
     * Deletes the specified authorization from the specified express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param authorizationName The name of the authorization.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String circuitName, String authorizationName, Context context) {
        this.serviceClient.delete(resourceGroupName, circuitName, authorizationName, context);
    }

    /**
     * Gets the specified authorization from the specified express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param authorizationName The name of the authorization.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified authorization from the specified express route circuit.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ExpressRouteCircuitAuthorization get(
        String resourceGroupName, String circuitName, String authorizationName) {
        return this.serviceClient.get(resourceGroupName, circuitName, authorizationName);
    }

    /**
     * Gets the specified authorization from the specified express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param authorizationName The name of the authorization.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified authorization from the specified express route circuit.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ExpressRouteCircuitAuthorization get(
        String resourceGroupName, String circuitName, String authorizationName, Context context) {
        return this.serviceClient.get(resourceGroupName, circuitName, authorizationName, context);
    }

    /**
     * Creates or updates an authorization in the specified express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param authorizationName The name of the authorization.
     * @param authorizationParameters Authorization in an ExpressRouteCircuit resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return authorization in an ExpressRouteCircuit resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<ExpressRouteCircuitAuthorization>, ExpressRouteCircuitAuthorization>
        beginCreateOrUpdate(
            String resourceGroupName,
            String circuitName,
            String authorizationName,
            ExpressRouteCircuitAuthorization authorizationParameters) {
        return this
            .serviceClient
            .beginCreateOrUpdate(resourceGroupName, circuitName, authorizationName, authorizationParameters);
    }

    /**
     * Creates or updates an authorization in the specified express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param authorizationName The name of the authorization.
     * @param authorizationParameters Authorization in an ExpressRouteCircuit resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return authorization in an ExpressRouteCircuit resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<ExpressRouteCircuitAuthorization>, ExpressRouteCircuitAuthorization>
        beginCreateOrUpdate(
            String resourceGroupName,
            String circuitName,
            String authorizationName,
            ExpressRouteCircuitAuthorization authorizationParameters,
            Context context) {
        return this
            .serviceClient
            .beginCreateOrUpdate(resourceGroupName, circuitName, authorizationName, authorizationParameters, context);
    }

    /**
     * Creates or updates an authorization in the specified express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param authorizationName The name of the authorization.
     * @param authorizationParameters Authorization in an ExpressRouteCircuit resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return authorization in an ExpressRouteCircuit resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ExpressRouteCircuitAuthorization createOrUpdate(
        String resourceGroupName,
        String circuitName,
        String authorizationName,
        ExpressRouteCircuitAuthorization authorizationParameters) {
        return this
            .serviceClient
            .createOrUpdate(resourceGroupName, circuitName, authorizationName, authorizationParameters);
    }

    /**
     * Creates or updates an authorization in the specified express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param authorizationName The name of the authorization.
     * @param authorizationParameters Authorization in an ExpressRouteCircuit resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return authorization in an ExpressRouteCircuit resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ExpressRouteCircuitAuthorization createOrUpdate(
        String resourceGroupName,
        String circuitName,
        String authorizationName,
        ExpressRouteCircuitAuthorization authorizationParameters,
        Context context) {
        return this
            .serviceClient
            .createOrUpdate(resourceGroupName, circuitName, authorizationName, authorizationParameters, context);
    }

    /**
     * Gets all authorizations in an express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the circuit.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all authorizations in an express route circuit.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ExpressRouteCircuitAuthorization> list(String resourceGroupName, String circuitName) {
        return this.serviceClient.list(resourceGroupName, circuitName);
    }

    /**
     * Gets all authorizations in an express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the circuit.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all authorizations in an express route circuit.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ExpressRouteCircuitAuthorization> list(
        String resourceGroupName, String circuitName, Context context) {
        return this.serviceClient.list(resourceGroupName, circuitName, context);
    }

    /**
     * Deletes the specified authorization from the specified express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param authorizationName The name of the authorization.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void beginDeleteWithoutPolling(String resourceGroupName, String circuitName, String authorizationName) {
        this.serviceClient.beginDeleteWithoutPolling(resourceGroupName, circuitName, authorizationName);
    }

    /**
     * Deletes the specified authorization from the specified express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param authorizationName The name of the authorization.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void beginDeleteWithoutPolling(
        String resourceGroupName, String circuitName, String authorizationName, Context context) {
        this.serviceClient.beginDeleteWithoutPolling(resourceGroupName, circuitName, authorizationName, context);
    }

    /**
     * Creates or updates an authorization in the specified express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param authorizationName The name of the authorization.
     * @param authorizationParameters Authorization in an ExpressRouteCircuit resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return authorization in an ExpressRouteCircuit resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ExpressRouteCircuitAuthorization beginCreateOrUpdateWithoutPolling(
        String resourceGroupName,
        String circuitName,
        String authorizationName,
        ExpressRouteCircuitAuthorization authorizationParameters) {
        return this
            .serviceClient
            .beginCreateOrUpdateWithoutPolling(
                resourceGroupName, circuitName, authorizationName, authorizationParameters);
    }

    /**
     * Creates or updates an authorization in the specified express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param authorizationName The name of the authorization.
     * @param authorizationParameters Authorization in an ExpressRouteCircuit resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return authorization in an ExpressRouteCircuit resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ExpressRouteCircuitAuthorization beginCreateOrUpdateWithoutPolling(
        String resourceGroupName,
        String circuitName,
        String authorizationName,
        ExpressRouteCircuitAuthorization authorizationParameters,
        Context context) {
        return this
            .serviceClient
            .beginCreateOrUpdateWithoutPolling(
                resourceGroupName, circuitName, authorizationName, authorizationParameters, context);
    }
}
