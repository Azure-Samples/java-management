// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.resources;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.Response;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.management.vanilla.resources.implementation.TagsImpl;
import com.azure.management.vanilla.resources.models.TagDetails;
import com.azure.management.vanilla.resources.models.TagValue;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the asynchronous ResourceManagementClient type. */
@ServiceClient(builder = ResourceManagementClientBuilder.class)
public final class TagsAsyncClient {
    private TagsImpl serviceClient;

    /** Initializes an instance of Tags client. */
    TagsAsyncClient(TagsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Deletes a tag value.
     *
     * @param tagName The name of the tag.
     * @param tagValue The value of the tag to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteValueWithResponse(String tagName, String tagValue) {
        return this.serviceClient.deleteValueWithResponseAsync(tagName, tagValue);
    }

    /**
     * Deletes a tag value.
     *
     * @param tagName The name of the tag.
     * @param tagValue The value of the tag to delete.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteValueWithResponse(String tagName, String tagValue, Context context) {
        return this.serviceClient.deleteValueWithResponseAsync(tagName, tagValue, context);
    }

    /**
     * Deletes a tag value.
     *
     * @param tagName The name of the tag.
     * @param tagValue The value of the tag to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteValue(String tagName, String tagValue) {
        return this.serviceClient.deleteValueAsync(tagName, tagValue);
    }

    /**
     * Deletes a tag value.
     *
     * @param tagName The name of the tag.
     * @param tagValue The value of the tag to delete.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteValue(String tagName, String tagValue, Context context) {
        return this.serviceClient.deleteValueAsync(tagName, tagValue, context);
    }

    /**
     * Creates a tag value. The name of the tag must already exist.
     *
     * @param tagName The name of the tag.
     * @param tagValue The value of the tag to create.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return tag information.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<TagValue>> createOrUpdateValueWithResponse(String tagName, String tagValue) {
        return this.serviceClient.createOrUpdateValueWithResponseAsync(tagName, tagValue);
    }

    /**
     * Creates a tag value. The name of the tag must already exist.
     *
     * @param tagName The name of the tag.
     * @param tagValue The value of the tag to create.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return tag information.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<TagValue>> createOrUpdateValueWithResponse(String tagName, String tagValue, Context context) {
        return this.serviceClient.createOrUpdateValueWithResponseAsync(tagName, tagValue, context);
    }

    /**
     * Creates a tag value. The name of the tag must already exist.
     *
     * @param tagName The name of the tag.
     * @param tagValue The value of the tag to create.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return tag information.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<TagValue> createOrUpdateValue(String tagName, String tagValue) {
        return this.serviceClient.createOrUpdateValueAsync(tagName, tagValue);
    }

    /**
     * Creates a tag value. The name of the tag must already exist.
     *
     * @param tagName The name of the tag.
     * @param tagValue The value of the tag to create.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return tag information.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<TagValue> createOrUpdateValue(String tagName, String tagValue, Context context) {
        return this.serviceClient.createOrUpdateValueAsync(tagName, tagValue, context);
    }

    /**
     * The tag name can have a maximum of 512 characters and is case insensitive. Tag names created by Azure have
     * prefixes of microsoft, azure, or windows. You cannot create tags with one of these prefixes.
     *
     * @param tagName The name of the tag to create.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return tag details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<TagDetails>> createOrUpdateWithResponse(String tagName) {
        return this.serviceClient.createOrUpdateWithResponseAsync(tagName);
    }

    /**
     * The tag name can have a maximum of 512 characters and is case insensitive. Tag names created by Azure have
     * prefixes of microsoft, azure, or windows. You cannot create tags with one of these prefixes.
     *
     * @param tagName The name of the tag to create.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return tag details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<TagDetails>> createOrUpdateWithResponse(String tagName, Context context) {
        return this.serviceClient.createOrUpdateWithResponseAsync(tagName, context);
    }

    /**
     * The tag name can have a maximum of 512 characters and is case insensitive. Tag names created by Azure have
     * prefixes of microsoft, azure, or windows. You cannot create tags with one of these prefixes.
     *
     * @param tagName The name of the tag to create.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return tag details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<TagDetails> createOrUpdate(String tagName) {
        return this.serviceClient.createOrUpdateAsync(tagName);
    }

    /**
     * The tag name can have a maximum of 512 characters and is case insensitive. Tag names created by Azure have
     * prefixes of microsoft, azure, or windows. You cannot create tags with one of these prefixes.
     *
     * @param tagName The name of the tag to create.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return tag details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<TagDetails> createOrUpdate(String tagName, Context context) {
        return this.serviceClient.createOrUpdateAsync(tagName, context);
    }

    /**
     * You must remove all values from a resource tag before you can delete it.
     *
     * @param tagName The name of the tag.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWithResponse(String tagName) {
        return this.serviceClient.deleteWithResponseAsync(tagName);
    }

    /**
     * You must remove all values from a resource tag before you can delete it.
     *
     * @param tagName The name of the tag.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWithResponse(String tagName, Context context) {
        return this.serviceClient.deleteWithResponseAsync(tagName, context);
    }

    /**
     * You must remove all values from a resource tag before you can delete it.
     *
     * @param tagName The name of the tag.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> delete(String tagName) {
        return this.serviceClient.deleteAsync(tagName);
    }

    /**
     * You must remove all values from a resource tag before you can delete it.
     *
     * @param tagName The name of the tag.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> delete(String tagName, Context context) {
        return this.serviceClient.deleteAsync(tagName, context);
    }

    /**
     * Gets the names and values of all resource tags that are defined in a subscription.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the names and values of all resource tags that are defined in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<TagDetails>> listSinglePage() {
        return this.serviceClient.listSinglePageAsync();
    }

    /**
     * Gets the names and values of all resource tags that are defined in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the names and values of all resource tags that are defined in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<TagDetails>> listSinglePage(Context context) {
        return this.serviceClient.listSinglePageAsync(context);
    }

    /**
     * Gets the names and values of all resource tags that are defined in a subscription.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the names and values of all resource tags that are defined in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<TagDetails> list() {
        return this.serviceClient.listAsync();
    }

    /**
     * Gets the names and values of all resource tags that are defined in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the names and values of all resource tags that are defined in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<TagDetails> list(Context context) {
        return this.serviceClient.listAsync(context);
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink null
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of subscription tags.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<TagDetails>> listNextSinglePage(String nextLink) {
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
     * @return list of subscription tags.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<TagDetails>> listNextSinglePage(String nextLink, Context context) {
        return this.serviceClient.listNextSinglePageAsync(nextLink, context);
    }
}
