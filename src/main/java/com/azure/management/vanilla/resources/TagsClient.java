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
import com.azure.management.vanilla.resources.implementation.TagsImpl;
import com.azure.management.vanilla.resources.models.TagDetails;
import com.azure.management.vanilla.resources.models.TagValue;

/** Initializes a new instance of the synchronous ResourceManagementClient type. */
@ServiceClient(builder = ResourceManagementClientBuilder.class)
public final class TagsClient {
    private TagsImpl serviceClient;

    /** Initializes an instance of Tags client. */
    TagsClient(TagsImpl serviceClient) {
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
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void deleteValue(String tagName, String tagValue) {
        this.serviceClient.deleteValue(tagName, tagValue);
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
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void deleteValue(String tagName, String tagValue, Context context) {
        this.serviceClient.deleteValue(tagName, tagValue, context);
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
    public TagValue createOrUpdateValue(String tagName, String tagValue) {
        return this.serviceClient.createOrUpdateValue(tagName, tagValue);
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
    public TagValue createOrUpdateValue(String tagName, String tagValue, Context context) {
        return this.serviceClient.createOrUpdateValue(tagName, tagValue, context);
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
    public TagDetails createOrUpdate(String tagName) {
        return this.serviceClient.createOrUpdate(tagName);
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
    public TagDetails createOrUpdate(String tagName, Context context) {
        return this.serviceClient.createOrUpdate(tagName, context);
    }

    /**
     * You must remove all values from a resource tag before you can delete it.
     *
     * @param tagName The name of the tag.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String tagName) {
        this.serviceClient.delete(tagName);
    }

    /**
     * You must remove all values from a resource tag before you can delete it.
     *
     * @param tagName The name of the tag.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String tagName, Context context) {
        this.serviceClient.delete(tagName, context);
    }

    /**
     * Gets the names and values of all resource tags that are defined in a subscription.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the names and values of all resource tags that are defined in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<TagDetails> list() {
        return this.serviceClient.list();
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
    public PagedIterable<TagDetails> list(Context context) {
        return this.serviceClient.list(context);
    }
}
