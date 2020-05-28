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
import com.azure.management.vanilla.network.implementation.FirewallPoliciesImpl;
import com.azure.management.vanilla.network.models.FirewallPolicy;

/** Initializes a new instance of the synchronous NetworkManagementClient type. */
@ServiceClient(builder = NetworkManagementClientBuilder.class)
public final class FirewallPoliciesClient {
    private FirewallPoliciesImpl serviceClient;

    /** Initializes an instance of FirewallPolicies client. */
    FirewallPoliciesClient(FirewallPoliciesImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Deletes the specified Firewall Policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param firewallPolicyName The name of the Firewall Policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<Void>, Void> beginDelete(String resourceGroupName, String firewallPolicyName) {
        return this.serviceClient.beginDelete(resourceGroupName, firewallPolicyName);
    }

    /**
     * Deletes the specified Firewall Policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param firewallPolicyName The name of the Firewall Policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String firewallPolicyName, Context context) {
        return this.serviceClient.beginDelete(resourceGroupName, firewallPolicyName, context);
    }

    /**
     * Deletes the specified Firewall Policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param firewallPolicyName The name of the Firewall Policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String firewallPolicyName) {
        this.serviceClient.delete(resourceGroupName, firewallPolicyName);
    }

    /**
     * Deletes the specified Firewall Policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param firewallPolicyName The name of the Firewall Policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String firewallPolicyName, Context context) {
        this.serviceClient.delete(resourceGroupName, firewallPolicyName, context);
    }

    /**
     * Gets the specified Firewall Policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param firewallPolicyName The name of the Firewall Policy.
     * @param expand Expands referenced resources.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified Firewall Policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public FirewallPolicy getByResourceGroup(String resourceGroupName, String firewallPolicyName, String expand) {
        return this.serviceClient.getByResourceGroup(resourceGroupName, firewallPolicyName, expand);
    }

    /**
     * Gets the specified Firewall Policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param firewallPolicyName The name of the Firewall Policy.
     * @param expand Expands referenced resources.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified Firewall Policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public FirewallPolicy getByResourceGroup(
        String resourceGroupName, String firewallPolicyName, String expand, Context context) {
        return this.serviceClient.getByResourceGroup(resourceGroupName, firewallPolicyName, expand, context);
    }

    /**
     * Gets the specified Firewall Policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param firewallPolicyName The name of the Firewall Policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified Firewall Policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public FirewallPolicy getByResourceGroup(String resourceGroupName, String firewallPolicyName) {
        return this.serviceClient.getByResourceGroup(resourceGroupName, firewallPolicyName);
    }

    /**
     * Creates or updates the specified Firewall Policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param firewallPolicyName The name of the Firewall Policy.
     * @param parameters FirewallPolicy Resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return firewallPolicy Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<FirewallPolicy>, FirewallPolicy> beginCreateOrUpdate(
        String resourceGroupName, String firewallPolicyName, FirewallPolicy parameters) {
        return this.serviceClient.beginCreateOrUpdate(resourceGroupName, firewallPolicyName, parameters);
    }

    /**
     * Creates or updates the specified Firewall Policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param firewallPolicyName The name of the Firewall Policy.
     * @param parameters FirewallPolicy Resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return firewallPolicy Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<FirewallPolicy>, FirewallPolicy> beginCreateOrUpdate(
        String resourceGroupName, String firewallPolicyName, FirewallPolicy parameters, Context context) {
        return this.serviceClient.beginCreateOrUpdate(resourceGroupName, firewallPolicyName, parameters, context);
    }

    /**
     * Creates or updates the specified Firewall Policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param firewallPolicyName The name of the Firewall Policy.
     * @param parameters FirewallPolicy Resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return firewallPolicy Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public FirewallPolicy createOrUpdate(
        String resourceGroupName, String firewallPolicyName, FirewallPolicy parameters) {
        return this.serviceClient.createOrUpdate(resourceGroupName, firewallPolicyName, parameters);
    }

    /**
     * Creates or updates the specified Firewall Policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param firewallPolicyName The name of the Firewall Policy.
     * @param parameters FirewallPolicy Resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return firewallPolicy Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public FirewallPolicy createOrUpdate(
        String resourceGroupName, String firewallPolicyName, FirewallPolicy parameters, Context context) {
        return this.serviceClient.createOrUpdate(resourceGroupName, firewallPolicyName, parameters, context);
    }

    /**
     * Lists all Firewall Policies in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListFirewallPolicies API service call.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<FirewallPolicy> listByResourceGroup(String resourceGroupName) {
        return this.serviceClient.listByResourceGroup(resourceGroupName);
    }

    /**
     * Lists all Firewall Policies in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListFirewallPolicies API service call.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<FirewallPolicy> listByResourceGroup(String resourceGroupName, Context context) {
        return this.serviceClient.listByResourceGroup(resourceGroupName, context);
    }

    /**
     * Gets all the Firewall Policies in a subscription.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the Firewall Policies in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<FirewallPolicy> list() {
        return this.serviceClient.list();
    }

    /**
     * Gets all the Firewall Policies in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the Firewall Policies in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<FirewallPolicy> list(Context context) {
        return this.serviceClient.list(context);
    }

    /**
     * Deletes the specified Firewall Policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param firewallPolicyName The name of the Firewall Policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void beginDeleteWithoutPolling(String resourceGroupName, String firewallPolicyName) {
        this.serviceClient.beginDeleteWithoutPolling(resourceGroupName, firewallPolicyName);
    }

    /**
     * Deletes the specified Firewall Policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param firewallPolicyName The name of the Firewall Policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void beginDeleteWithoutPolling(String resourceGroupName, String firewallPolicyName, Context context) {
        this.serviceClient.beginDeleteWithoutPolling(resourceGroupName, firewallPolicyName, context);
    }

    /**
     * Creates or updates the specified Firewall Policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param firewallPolicyName The name of the Firewall Policy.
     * @param parameters FirewallPolicy Resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return firewallPolicy Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public FirewallPolicy beginCreateOrUpdateWithoutPolling(
        String resourceGroupName, String firewallPolicyName, FirewallPolicy parameters) {
        return this.serviceClient.beginCreateOrUpdateWithoutPolling(resourceGroupName, firewallPolicyName, parameters);
    }

    /**
     * Creates or updates the specified Firewall Policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param firewallPolicyName The name of the Firewall Policy.
     * @param parameters FirewallPolicy Resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return firewallPolicy Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public FirewallPolicy beginCreateOrUpdateWithoutPolling(
        String resourceGroupName, String firewallPolicyName, FirewallPolicy parameters, Context context) {
        return this
            .serviceClient
            .beginCreateOrUpdateWithoutPolling(resourceGroupName, firewallPolicyName, parameters, context);
    }
}
