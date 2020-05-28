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
import com.azure.management.vanilla.network.implementation.ApplicationSecurityGroupsImpl;
import com.azure.management.vanilla.network.models.ApplicationSecurityGroup;
import java.util.Map;

/** Initializes a new instance of the synchronous NetworkManagementClient type. */
@ServiceClient(builder = NetworkManagementClientBuilder.class)
public final class ApplicationSecurityGroupsClient {
    private ApplicationSecurityGroupsImpl serviceClient;

    /** Initializes an instance of ApplicationSecurityGroups client. */
    ApplicationSecurityGroupsClient(ApplicationSecurityGroupsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Deletes the specified application security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param applicationSecurityGroupName The name of the application security group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String applicationSecurityGroupName) {
        return this.serviceClient.beginDelete(resourceGroupName, applicationSecurityGroupName);
    }

    /**
     * Deletes the specified application security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param applicationSecurityGroupName The name of the application security group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String applicationSecurityGroupName, Context context) {
        return this.serviceClient.beginDelete(resourceGroupName, applicationSecurityGroupName, context);
    }

    /**
     * Deletes the specified application security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param applicationSecurityGroupName The name of the application security group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String applicationSecurityGroupName) {
        this.serviceClient.delete(resourceGroupName, applicationSecurityGroupName);
    }

    /**
     * Deletes the specified application security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param applicationSecurityGroupName The name of the application security group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String applicationSecurityGroupName, Context context) {
        this.serviceClient.delete(resourceGroupName, applicationSecurityGroupName, context);
    }

    /**
     * Gets information about the specified application security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param applicationSecurityGroupName The name of the application security group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified application security group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApplicationSecurityGroup getByResourceGroup(String resourceGroupName, String applicationSecurityGroupName) {
        return this.serviceClient.getByResourceGroup(resourceGroupName, applicationSecurityGroupName);
    }

    /**
     * Gets information about the specified application security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param applicationSecurityGroupName The name of the application security group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified application security group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApplicationSecurityGroup getByResourceGroup(
        String resourceGroupName, String applicationSecurityGroupName, Context context) {
        return this.serviceClient.getByResourceGroup(resourceGroupName, applicationSecurityGroupName, context);
    }

    /**
     * Creates or updates an application security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param applicationSecurityGroupName The name of the application security group.
     * @param parameters An application security group in a resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an application security group in a resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<ApplicationSecurityGroup>, ApplicationSecurityGroup> beginCreateOrUpdate(
        String resourceGroupName, String applicationSecurityGroupName, ApplicationSecurityGroup parameters) {
        return this.serviceClient.beginCreateOrUpdate(resourceGroupName, applicationSecurityGroupName, parameters);
    }

    /**
     * Creates or updates an application security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param applicationSecurityGroupName The name of the application security group.
     * @param parameters An application security group in a resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an application security group in a resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<ApplicationSecurityGroup>, ApplicationSecurityGroup> beginCreateOrUpdate(
        String resourceGroupName,
        String applicationSecurityGroupName,
        ApplicationSecurityGroup parameters,
        Context context) {
        return this
            .serviceClient
            .beginCreateOrUpdate(resourceGroupName, applicationSecurityGroupName, parameters, context);
    }

    /**
     * Creates or updates an application security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param applicationSecurityGroupName The name of the application security group.
     * @param parameters An application security group in a resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an application security group in a resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApplicationSecurityGroup createOrUpdate(
        String resourceGroupName, String applicationSecurityGroupName, ApplicationSecurityGroup parameters) {
        return this.serviceClient.createOrUpdate(resourceGroupName, applicationSecurityGroupName, parameters);
    }

    /**
     * Creates or updates an application security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param applicationSecurityGroupName The name of the application security group.
     * @param parameters An application security group in a resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an application security group in a resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApplicationSecurityGroup createOrUpdate(
        String resourceGroupName,
        String applicationSecurityGroupName,
        ApplicationSecurityGroup parameters,
        Context context) {
        return this.serviceClient.createOrUpdate(resourceGroupName, applicationSecurityGroupName, parameters, context);
    }

    /**
     * Updates an application security group's tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param applicationSecurityGroupName The name of the application security group.
     * @param tags Resource tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an application security group in a resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApplicationSecurityGroup updateTags(
        String resourceGroupName, String applicationSecurityGroupName, Map<String, String> tags) {
        return this.serviceClient.updateTags(resourceGroupName, applicationSecurityGroupName, tags);
    }

    /**
     * Updates an application security group's tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param applicationSecurityGroupName The name of the application security group.
     * @param tags Resource tags.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an application security group in a resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApplicationSecurityGroup updateTags(
        String resourceGroupName, String applicationSecurityGroupName, Map<String, String> tags, Context context) {
        return this.serviceClient.updateTags(resourceGroupName, applicationSecurityGroupName, tags, context);
    }

    /**
     * Gets all application security groups in a subscription.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all application security groups in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ApplicationSecurityGroup> list() {
        return this.serviceClient.list();
    }

    /**
     * Gets all application security groups in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all application security groups in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ApplicationSecurityGroup> list(Context context) {
        return this.serviceClient.list(context);
    }

    /**
     * Gets all the application security groups in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the application security groups in a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ApplicationSecurityGroup> listByResourceGroup(String resourceGroupName) {
        return this.serviceClient.listByResourceGroup(resourceGroupName);
    }

    /**
     * Gets all the application security groups in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the application security groups in a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ApplicationSecurityGroup> listByResourceGroup(String resourceGroupName, Context context) {
        return this.serviceClient.listByResourceGroup(resourceGroupName, context);
    }

    /**
     * Deletes the specified application security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param applicationSecurityGroupName The name of the application security group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void beginDeleteWithoutPolling(String resourceGroupName, String applicationSecurityGroupName) {
        this.serviceClient.beginDeleteWithoutPolling(resourceGroupName, applicationSecurityGroupName);
    }

    /**
     * Deletes the specified application security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param applicationSecurityGroupName The name of the application security group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void beginDeleteWithoutPolling(
        String resourceGroupName, String applicationSecurityGroupName, Context context) {
        this.serviceClient.beginDeleteWithoutPolling(resourceGroupName, applicationSecurityGroupName, context);
    }

    /**
     * Creates or updates an application security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param applicationSecurityGroupName The name of the application security group.
     * @param parameters An application security group in a resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an application security group in a resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApplicationSecurityGroup beginCreateOrUpdateWithoutPolling(
        String resourceGroupName, String applicationSecurityGroupName, ApplicationSecurityGroup parameters) {
        return this
            .serviceClient
            .beginCreateOrUpdateWithoutPolling(resourceGroupName, applicationSecurityGroupName, parameters);
    }

    /**
     * Creates or updates an application security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param applicationSecurityGroupName The name of the application security group.
     * @param parameters An application security group in a resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an application security group in a resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApplicationSecurityGroup beginCreateOrUpdateWithoutPolling(
        String resourceGroupName,
        String applicationSecurityGroupName,
        ApplicationSecurityGroup parameters,
        Context context) {
        return this
            .serviceClient
            .beginCreateOrUpdateWithoutPolling(resourceGroupName, applicationSecurityGroupName, parameters, context);
    }
}
