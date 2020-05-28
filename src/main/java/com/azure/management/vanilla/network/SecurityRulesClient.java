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
import com.azure.management.vanilla.network.implementation.SecurityRulesImpl;
import com.azure.management.vanilla.network.models.SecurityRule;

/** Initializes a new instance of the synchronous NetworkManagementClient type. */
@ServiceClient(builder = NetworkManagementClientBuilder.class)
public final class SecurityRulesClient {
    private SecurityRulesImpl serviceClient;

    /** Initializes an instance of SecurityRules client. */
    SecurityRulesClient(SecurityRulesImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Deletes the specified network security rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param securityRuleName The name of the security rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String networkSecurityGroupName, String securityRuleName) {
        return this.serviceClient.beginDelete(resourceGroupName, networkSecurityGroupName, securityRuleName);
    }

    /**
     * Deletes the specified network security rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param securityRuleName The name of the security rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String networkSecurityGroupName, String securityRuleName, Context context) {
        return this.serviceClient.beginDelete(resourceGroupName, networkSecurityGroupName, securityRuleName, context);
    }

    /**
     * Deletes the specified network security rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param securityRuleName The name of the security rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String networkSecurityGroupName, String securityRuleName) {
        this.serviceClient.delete(resourceGroupName, networkSecurityGroupName, securityRuleName);
    }

    /**
     * Deletes the specified network security rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param securityRuleName The name of the security rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(
        String resourceGroupName, String networkSecurityGroupName, String securityRuleName, Context context) {
        this.serviceClient.delete(resourceGroupName, networkSecurityGroupName, securityRuleName, context);
    }

    /**
     * Get the specified network security rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param securityRuleName The name of the security rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified network security rule.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SecurityRule get(String resourceGroupName, String networkSecurityGroupName, String securityRuleName) {
        return this.serviceClient.get(resourceGroupName, networkSecurityGroupName, securityRuleName);
    }

    /**
     * Get the specified network security rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param securityRuleName The name of the security rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified network security rule.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SecurityRule get(
        String resourceGroupName, String networkSecurityGroupName, String securityRuleName, Context context) {
        return this.serviceClient.get(resourceGroupName, networkSecurityGroupName, securityRuleName, context);
    }

    /**
     * Creates or updates a security rule in the specified network security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param securityRuleName The name of the security rule.
     * @param securityRuleParameters Network security rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return network security rule.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<SecurityRule>, SecurityRule> beginCreateOrUpdate(
        String resourceGroupName,
        String networkSecurityGroupName,
        String securityRuleName,
        SecurityRule securityRuleParameters) {
        return this
            .serviceClient
            .beginCreateOrUpdate(resourceGroupName, networkSecurityGroupName, securityRuleName, securityRuleParameters);
    }

    /**
     * Creates or updates a security rule in the specified network security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param securityRuleName The name of the security rule.
     * @param securityRuleParameters Network security rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return network security rule.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<SecurityRule>, SecurityRule> beginCreateOrUpdate(
        String resourceGroupName,
        String networkSecurityGroupName,
        String securityRuleName,
        SecurityRule securityRuleParameters,
        Context context) {
        return this
            .serviceClient
            .beginCreateOrUpdate(
                resourceGroupName, networkSecurityGroupName, securityRuleName, securityRuleParameters, context);
    }

    /**
     * Creates or updates a security rule in the specified network security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param securityRuleName The name of the security rule.
     * @param securityRuleParameters Network security rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return network security rule.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SecurityRule createOrUpdate(
        String resourceGroupName,
        String networkSecurityGroupName,
        String securityRuleName,
        SecurityRule securityRuleParameters) {
        return this
            .serviceClient
            .createOrUpdate(resourceGroupName, networkSecurityGroupName, securityRuleName, securityRuleParameters);
    }

    /**
     * Creates or updates a security rule in the specified network security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param securityRuleName The name of the security rule.
     * @param securityRuleParameters Network security rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return network security rule.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SecurityRule createOrUpdate(
        String resourceGroupName,
        String networkSecurityGroupName,
        String securityRuleName,
        SecurityRule securityRuleParameters,
        Context context) {
        return this
            .serviceClient
            .createOrUpdate(
                resourceGroupName, networkSecurityGroupName, securityRuleName, securityRuleParameters, context);
    }

    /**
     * Gets all security rules in a network security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all security rules in a network security group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<SecurityRule> list(String resourceGroupName, String networkSecurityGroupName) {
        return this.serviceClient.list(resourceGroupName, networkSecurityGroupName);
    }

    /**
     * Gets all security rules in a network security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all security rules in a network security group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<SecurityRule> list(
        String resourceGroupName, String networkSecurityGroupName, Context context) {
        return this.serviceClient.list(resourceGroupName, networkSecurityGroupName, context);
    }

    /**
     * Deletes the specified network security rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param securityRuleName The name of the security rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void beginDeleteWithoutPolling(
        String resourceGroupName, String networkSecurityGroupName, String securityRuleName) {
        this.serviceClient.beginDeleteWithoutPolling(resourceGroupName, networkSecurityGroupName, securityRuleName);
    }

    /**
     * Deletes the specified network security rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param securityRuleName The name of the security rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void beginDeleteWithoutPolling(
        String resourceGroupName, String networkSecurityGroupName, String securityRuleName, Context context) {
        this
            .serviceClient
            .beginDeleteWithoutPolling(resourceGroupName, networkSecurityGroupName, securityRuleName, context);
    }

    /**
     * Creates or updates a security rule in the specified network security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param securityRuleName The name of the security rule.
     * @param securityRuleParameters Network security rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return network security rule.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SecurityRule beginCreateOrUpdateWithoutPolling(
        String resourceGroupName,
        String networkSecurityGroupName,
        String securityRuleName,
        SecurityRule securityRuleParameters) {
        return this
            .serviceClient
            .beginCreateOrUpdateWithoutPolling(
                resourceGroupName, networkSecurityGroupName, securityRuleName, securityRuleParameters);
    }

    /**
     * Creates or updates a security rule in the specified network security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param securityRuleName The name of the security rule.
     * @param securityRuleParameters Network security rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return network security rule.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SecurityRule beginCreateOrUpdateWithoutPolling(
        String resourceGroupName,
        String networkSecurityGroupName,
        String securityRuleName,
        SecurityRule securityRuleParameters,
        Context context) {
        return this
            .serviceClient
            .beginCreateOrUpdateWithoutPolling(
                resourceGroupName, networkSecurityGroupName, securityRuleName, securityRuleParameters, context);
    }
}
