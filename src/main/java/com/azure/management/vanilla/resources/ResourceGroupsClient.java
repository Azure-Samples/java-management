// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.resources;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.PollerFlux;
import com.azure.management.vanilla.resources.implementation.ResourceGroupsImpl;
import com.azure.management.vanilla.resources.models.ExportTemplateRequest;
import com.azure.management.vanilla.resources.models.ResourceGroup;
import com.azure.management.vanilla.resources.models.ResourceGroupExportResult;
import com.azure.management.vanilla.resources.models.ResourceGroupPatchable;

/** Initializes a new instance of the synchronous ResourceManagementClient type. */
@ServiceClient(builder = ResourceManagementClientBuilder.class)
public final class ResourceGroupsClient {
    private ResourceGroupsImpl serviceClient;

    /** Initializes an instance of ResourceGroups client. */
    ResourceGroupsClient(ResourceGroupsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Checks whether a resource group exists.
     *
     * @param resourceGroupName The name of the resource group to check. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return whether resource exists.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public boolean checkExistence(String resourceGroupName) {
        return this.serviceClient.checkExistence(resourceGroupName);
    }

    /**
     * Checks whether a resource group exists.
     *
     * @param resourceGroupName The name of the resource group to check. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return whether resource exists.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public boolean checkExistence(String resourceGroupName, Context context) {
        return this.serviceClient.checkExistence(resourceGroupName, context);
    }

    /**
     * Creates or updates a resource group.
     *
     * @param resourceGroupName The name of the resource group to create or update. Can include alphanumeric,
     *     underscore, parentheses, hyphen, period (except at end), and Unicode characters that match the allowed
     *     characters.
     * @param parameters Resource group information.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return resource group information.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ResourceGroup createOrUpdate(String resourceGroupName, ResourceGroup parameters) {
        return this.serviceClient.createOrUpdate(resourceGroupName, parameters);
    }

    /**
     * Creates or updates a resource group.
     *
     * @param resourceGroupName The name of the resource group to create or update. Can include alphanumeric,
     *     underscore, parentheses, hyphen, period (except at end), and Unicode characters that match the allowed
     *     characters.
     * @param parameters Resource group information.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return resource group information.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ResourceGroup createOrUpdate(String resourceGroupName, ResourceGroup parameters, Context context) {
        return this.serviceClient.createOrUpdate(resourceGroupName, parameters, context);
    }

    /**
     * When you delete a resource group, all of its resources are also deleted. Deleting a resource group deletes all of
     * its template deployments and currently stored operations.
     *
     * @param resourceGroupName The name of the resource group to delete. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<Void>, Void> beginDelete(String resourceGroupName) {
        return this.serviceClient.beginDelete(resourceGroupName);
    }

    /**
     * When you delete a resource group, all of its resources are also deleted. Deleting a resource group deletes all of
     * its template deployments and currently stored operations.
     *
     * @param resourceGroupName The name of the resource group to delete. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<Void>, Void> beginDelete(String resourceGroupName, Context context) {
        return this.serviceClient.beginDelete(resourceGroupName, context);
    }

    /**
     * When you delete a resource group, all of its resources are also deleted. Deleting a resource group deletes all of
     * its template deployments and currently stored operations.
     *
     * @param resourceGroupName The name of the resource group to delete. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName) {
        this.serviceClient.delete(resourceGroupName);
    }

    /**
     * When you delete a resource group, all of its resources are also deleted. Deleting a resource group deletes all of
     * its template deployments and currently stored operations.
     *
     * @param resourceGroupName The name of the resource group to delete. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, Context context) {
        this.serviceClient.delete(resourceGroupName, context);
    }

    /**
     * Gets a resource group.
     *
     * @param resourceGroupName The name of the resource group to get. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ResourceGroup get(String resourceGroupName) {
        return this.serviceClient.get(resourceGroupName);
    }

    /**
     * Gets a resource group.
     *
     * @param resourceGroupName The name of the resource group to get. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ResourceGroup get(String resourceGroupName, Context context) {
        return this.serviceClient.get(resourceGroupName, context);
    }

    /**
     * Resource groups can be updated through a simple PATCH operation to a group address. The format of the request is
     * the same as that for creating a resource group. If a field is unspecified, the current value is retained.
     *
     * @param resourceGroupName The name of the resource group to update. The name is case insensitive.
     * @param parameters Resource group information.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return resource group information.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ResourceGroup update(String resourceGroupName, ResourceGroupPatchable parameters) {
        return this.serviceClient.update(resourceGroupName, parameters);
    }

    /**
     * Resource groups can be updated through a simple PATCH operation to a group address. The format of the request is
     * the same as that for creating a resource group. If a field is unspecified, the current value is retained.
     *
     * @param resourceGroupName The name of the resource group to update. The name is case insensitive.
     * @param parameters Resource group information.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return resource group information.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ResourceGroup update(String resourceGroupName, ResourceGroupPatchable parameters, Context context) {
        return this.serviceClient.update(resourceGroupName, parameters, context);
    }

    /**
     * Captures the specified resource group as a template.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param parameters Export resource group template request parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return resource group export result.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<ResourceGroupExportResult>, ResourceGroupExportResult> beginExportTemplate(
        String resourceGroupName, ExportTemplateRequest parameters) {
        return this.serviceClient.beginExportTemplate(resourceGroupName, parameters);
    }

    /**
     * Captures the specified resource group as a template.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param parameters Export resource group template request parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return resource group export result.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<ResourceGroupExportResult>, ResourceGroupExportResult> beginExportTemplate(
        String resourceGroupName, ExportTemplateRequest parameters, Context context) {
        return this.serviceClient.beginExportTemplate(resourceGroupName, parameters, context);
    }

    /**
     * Captures the specified resource group as a template.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param parameters Export resource group template request parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return resource group export result.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ResourceGroupExportResult exportTemplate(String resourceGroupName, ExportTemplateRequest parameters) {
        return this.serviceClient.exportTemplate(resourceGroupName, parameters);
    }

    /**
     * Captures the specified resource group as a template.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param parameters Export resource group template request parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return resource group export result.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ResourceGroupExportResult exportTemplate(
        String resourceGroupName, ExportTemplateRequest parameters, Context context) {
        return this.serviceClient.exportTemplate(resourceGroupName, parameters, context);
    }

    /**
     * Gets all the resource groups for a subscription.
     *
     * @param filter The filter to apply on the operation.&lt;br&gt;&lt;br&gt;You can filter by tag names and values.
     *     For example, to filter for a tag name and value, use $filter=tagName eq 'tag1' and tagValue eq 'Value1'.
     * @param top The number of results to return. If null is passed, returns all resource groups.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the resource groups for a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ResourceGroup> list(String filter, Integer top) {
        return this.serviceClient.list(filter, top);
    }

    /**
     * Gets all the resource groups for a subscription.
     *
     * @param filter The filter to apply on the operation.&lt;br&gt;&lt;br&gt;You can filter by tag names and values.
     *     For example, to filter for a tag name and value, use $filter=tagName eq 'tag1' and tagValue eq 'Value1'.
     * @param top The number of results to return. If null is passed, returns all resource groups.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the resource groups for a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ResourceGroup> list(String filter, Integer top, Context context) {
        return this.serviceClient.list(filter, top, context);
    }

    /**
     * Gets all the resource groups for a subscription.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the resource groups for a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ResourceGroup> list() {
        return this.serviceClient.list();
    }

    /**
     * When you delete a resource group, all of its resources are also deleted. Deleting a resource group deletes all of
     * its template deployments and currently stored operations.
     *
     * @param resourceGroupName The name of the resource group to delete. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void beginDeleteWithoutPolling(String resourceGroupName) {
        this.serviceClient.beginDeleteWithoutPolling(resourceGroupName);
    }

    /**
     * When you delete a resource group, all of its resources are also deleted. Deleting a resource group deletes all of
     * its template deployments and currently stored operations.
     *
     * @param resourceGroupName The name of the resource group to delete. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void beginDeleteWithoutPolling(String resourceGroupName, Context context) {
        this.serviceClient.beginDeleteWithoutPolling(resourceGroupName, context);
    }

    /**
     * Captures the specified resource group as a template.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param parameters Export resource group template request parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return resource group export result.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ResourceGroupExportResult beginExportTemplateWithoutPolling(
        String resourceGroupName, ExportTemplateRequest parameters) {
        return this.serviceClient.beginExportTemplateWithoutPolling(resourceGroupName, parameters);
    }

    /**
     * Captures the specified resource group as a template.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param parameters Export resource group template request parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return resource group export result.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ResourceGroupExportResult beginExportTemplateWithoutPolling(
        String resourceGroupName, ExportTemplateRequest parameters, Context context) {
        return this.serviceClient.beginExportTemplateWithoutPolling(resourceGroupName, parameters, context);
    }
}
