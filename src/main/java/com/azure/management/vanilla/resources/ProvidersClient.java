// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.resources;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.management.vanilla.resources.implementation.ProvidersImpl;
import com.azure.management.vanilla.resources.models.Provider;

/** Initializes a new instance of the synchronous ResourceManagementClient type. */
@ServiceClient(builder = ResourceManagementClientBuilder.class)
public final class ProvidersClient {
    private ProvidersImpl serviceClient;

    /** Initializes an instance of Providers client. */
    ProvidersClient(ProvidersImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Unregisters a subscription from a resource provider.
     *
     * @param resourceProviderNamespace The namespace of the resource provider to unregister.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return resource provider information.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Provider unregister(String resourceProviderNamespace) {
        return this.serviceClient.unregister(resourceProviderNamespace);
    }

    /**
     * Unregisters a subscription from a resource provider.
     *
     * @param resourceProviderNamespace The namespace of the resource provider to unregister.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return resource provider information.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Provider unregister(String resourceProviderNamespace, Context context) {
        return this.serviceClient.unregister(resourceProviderNamespace, context);
    }

    /**
     * Registers a subscription with a resource provider.
     *
     * @param resourceProviderNamespace The namespace of the resource provider to register.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return resource provider information.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Provider register(String resourceProviderNamespace) {
        return this.serviceClient.register(resourceProviderNamespace);
    }

    /**
     * Registers a subscription with a resource provider.
     *
     * @param resourceProviderNamespace The namespace of the resource provider to register.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return resource provider information.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Provider register(String resourceProviderNamespace, Context context) {
        return this.serviceClient.register(resourceProviderNamespace, context);
    }

    /**
     * Gets all resource providers for a subscription.
     *
     * @param top The number of results to return. If null is passed returns all deployments.
     * @param expand The properties to include in the results. For example, use &amp;$expand=metadata in the query
     *     string to retrieve resource provider metadata. To include property aliases in response, use
     *     $expand=resourceTypes/aliases.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all resource providers for a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<Provider> list(Integer top, String expand) {
        return this.serviceClient.list(top, expand);
    }

    /**
     * Gets all resource providers for a subscription.
     *
     * @param top The number of results to return. If null is passed returns all deployments.
     * @param expand The properties to include in the results. For example, use &amp;$expand=metadata in the query
     *     string to retrieve resource provider metadata. To include property aliases in response, use
     *     $expand=resourceTypes/aliases.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all resource providers for a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<Provider> list(Integer top, String expand, Context context) {
        return this.serviceClient.list(top, expand, context);
    }

    /**
     * Gets all resource providers for a subscription.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all resource providers for a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<Provider> list() {
        return this.serviceClient.list();
    }

    /**
     * Gets all resource providers for the tenant.
     *
     * @param top The number of results to return. If null is passed returns all providers.
     * @param expand The properties to include in the results. For example, use &amp;$expand=metadata in the query
     *     string to retrieve resource provider metadata. To include property aliases in response, use
     *     $expand=resourceTypes/aliases.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all resource providers for the tenant.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<Provider> listAtTenantScope(Integer top, String expand) {
        return this.serviceClient.listAtTenantScope(top, expand);
    }

    /**
     * Gets all resource providers for the tenant.
     *
     * @param top The number of results to return. If null is passed returns all providers.
     * @param expand The properties to include in the results. For example, use &amp;$expand=metadata in the query
     *     string to retrieve resource provider metadata. To include property aliases in response, use
     *     $expand=resourceTypes/aliases.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all resource providers for the tenant.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<Provider> listAtTenantScope(Integer top, String expand, Context context) {
        return this.serviceClient.listAtTenantScope(top, expand, context);
    }

    /**
     * Gets all resource providers for the tenant.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all resource providers for the tenant.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<Provider> listAtTenantScope() {
        return this.serviceClient.listAtTenantScope();
    }

    /**
     * Gets the specified resource provider.
     *
     * @param resourceProviderNamespace The namespace of the resource provider.
     * @param expand The $expand query parameter. For example, to include property aliases in response, use
     *     $expand=resourceTypes/aliases.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified resource provider.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Provider get(String resourceProviderNamespace, String expand) {
        return this.serviceClient.get(resourceProviderNamespace, expand);
    }

    /**
     * Gets the specified resource provider.
     *
     * @param resourceProviderNamespace The namespace of the resource provider.
     * @param expand The $expand query parameter. For example, to include property aliases in response, use
     *     $expand=resourceTypes/aliases.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified resource provider.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Provider get(String resourceProviderNamespace, String expand, Context context) {
        return this.serviceClient.get(resourceProviderNamespace, expand, context);
    }

    /**
     * Gets the specified resource provider.
     *
     * @param resourceProviderNamespace The namespace of the resource provider.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified resource provider.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Provider get(String resourceProviderNamespace) {
        return this.serviceClient.get(resourceProviderNamespace);
    }

    /**
     * Gets the specified resource provider at the tenant level.
     *
     * @param resourceProviderNamespace The namespace of the resource provider.
     * @param expand The $expand query parameter. For example, to include property aliases in response, use
     *     $expand=resourceTypes/aliases.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified resource provider at the tenant level.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Provider getAtTenantScope(String resourceProviderNamespace, String expand) {
        return this.serviceClient.getAtTenantScope(resourceProviderNamespace, expand);
    }

    /**
     * Gets the specified resource provider at the tenant level.
     *
     * @param resourceProviderNamespace The namespace of the resource provider.
     * @param expand The $expand query parameter. For example, to include property aliases in response, use
     *     $expand=resourceTypes/aliases.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified resource provider at the tenant level.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Provider getAtTenantScope(String resourceProviderNamespace, String expand, Context context) {
        return this.serviceClient.getAtTenantScope(resourceProviderNamespace, expand, context);
    }

    /**
     * Gets the specified resource provider at the tenant level.
     *
     * @param resourceProviderNamespace The namespace of the resource provider.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified resource provider at the tenant level.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Provider getAtTenantScope(String resourceProviderNamespace) {
        return this.serviceClient.getAtTenantScope(resourceProviderNamespace);
    }
}
