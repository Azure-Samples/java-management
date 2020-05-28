// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.storage.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ImmutabilityPolicyProperties model. */
@JsonFlatten
@Fluent
public class ImmutabilityPolicyProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ImmutabilityPolicyProperties.class);

    /*
     * ImmutabilityPolicy Etag.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * The ImmutabilityPolicy update history of the blob container.
     */
    @JsonProperty(value = "updateHistory", access = JsonProperty.Access.WRITE_ONLY)
    private List<UpdateHistoryProperty> updateHistory;

    /*
     * The immutability period for the blobs in the container since the policy
     * creation, in days.
     */
    @JsonProperty(value = "properties.immutabilityPeriodSinceCreationInDays")
    private Integer immutabilityPeriodSinceCreationInDays;

    /*
     * The ImmutabilityPolicy state of a blob container, possible values
     * include: Locked and Unlocked.
     */
    @JsonProperty(value = "properties.state", access = JsonProperty.Access.WRITE_ONLY)
    private ImmutabilityPolicyState state;

    /*
     * This property can only be changed for unlocked time-based retention
     * policies. When enabled, new blocks can be written to an append blob
     * while maintaining immutability protection and compliance. Only new
     * blocks can be added and any existing blocks cannot be modified or
     * deleted. This property cannot be changed with ExtendImmutabilityPolicy
     * API
     */
    @JsonProperty(value = "properties.allowProtectedAppendWrites")
    private Boolean allowProtectedAppendWrites;

    /**
     * Get the etag property: ImmutabilityPolicy Etag.
     *
     * @return the etag value.
     */
    public String getEtag() {
        return this.etag;
    }

    /**
     * Get the updateHistory property: The ImmutabilityPolicy update history of the blob container.
     *
     * @return the updateHistory value.
     */
    public List<UpdateHistoryProperty> getUpdateHistory() {
        return this.updateHistory;
    }

    /**
     * Get the immutabilityPeriodSinceCreationInDays property: The immutability period for the blobs in the container
     * since the policy creation, in days.
     *
     * @return the immutabilityPeriodSinceCreationInDays value.
     */
    public Integer getImmutabilityPeriodSinceCreationInDays() {
        return this.immutabilityPeriodSinceCreationInDays;
    }

    /**
     * Set the immutabilityPeriodSinceCreationInDays property: The immutability period for the blobs in the container
     * since the policy creation, in days.
     *
     * @param immutabilityPeriodSinceCreationInDays the immutabilityPeriodSinceCreationInDays value to set.
     * @return the ImmutabilityPolicyProperties object itself.
     */
    public ImmutabilityPolicyProperties setImmutabilityPeriodSinceCreationInDays(
        Integer immutabilityPeriodSinceCreationInDays) {
        this.immutabilityPeriodSinceCreationInDays = immutabilityPeriodSinceCreationInDays;
        return this;
    }

    /**
     * Get the state property: The ImmutabilityPolicy state of a blob container, possible values include: Locked and
     * Unlocked.
     *
     * @return the state value.
     */
    public ImmutabilityPolicyState getState() {
        return this.state;
    }

    /**
     * Get the allowProtectedAppendWrites property: This property can only be changed for unlocked time-based retention
     * policies. When enabled, new blocks can be written to an append blob while maintaining immutability protection and
     * compliance. Only new blocks can be added and any existing blocks cannot be modified or deleted. This property
     * cannot be changed with ExtendImmutabilityPolicy API.
     *
     * @return the allowProtectedAppendWrites value.
     */
    public Boolean isAllowProtectedAppendWrites() {
        return this.allowProtectedAppendWrites;
    }

    /**
     * Set the allowProtectedAppendWrites property: This property can only be changed for unlocked time-based retention
     * policies. When enabled, new blocks can be written to an append blob while maintaining immutability protection and
     * compliance. Only new blocks can be added and any existing blocks cannot be modified or deleted. This property
     * cannot be changed with ExtendImmutabilityPolicy API.
     *
     * @param allowProtectedAppendWrites the allowProtectedAppendWrites value to set.
     * @return the ImmutabilityPolicyProperties object itself.
     */
    public ImmutabilityPolicyProperties setAllowProtectedAppendWrites(Boolean allowProtectedAppendWrites) {
        this.allowProtectedAppendWrites = allowProtectedAppendWrites;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getUpdateHistory() != null) {
            getUpdateHistory().forEach(e -> e.validate());
        }
    }
}
