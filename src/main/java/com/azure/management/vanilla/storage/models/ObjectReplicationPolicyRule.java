// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.storage.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ObjectReplicationPolicyRule model. */
@Fluent
public final class ObjectReplicationPolicyRule {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ObjectReplicationPolicyRule.class);

    /*
     * Rule Id is auto-generated for each new rule on destination account. It
     * is required for put policy on source account.
     */
    @JsonProperty(value = "ruleId")
    private String ruleId;

    /*
     * Required. Source container name.
     */
    @JsonProperty(value = "sourceContainer", required = true)
    private String sourceContainer;

    /*
     * Required. Destination container name.
     */
    @JsonProperty(value = "destinationContainer", required = true)
    private String destinationContainer;

    /*
     * Optional. An object that defines the filter set.
     */
    @JsonProperty(value = "filters")
    private ObjectReplicationPolicyFilter filters;

    /**
     * Get the ruleId property: Rule Id is auto-generated for each new rule on destination account. It is required for
     * put policy on source account.
     *
     * @return the ruleId value.
     */
    public String getRuleId() {
        return this.ruleId;
    }

    /**
     * Set the ruleId property: Rule Id is auto-generated for each new rule on destination account. It is required for
     * put policy on source account.
     *
     * @param ruleId the ruleId value to set.
     * @return the ObjectReplicationPolicyRule object itself.
     */
    public ObjectReplicationPolicyRule setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }

    /**
     * Get the sourceContainer property: Required. Source container name.
     *
     * @return the sourceContainer value.
     */
    public String getSourceContainer() {
        return this.sourceContainer;
    }

    /**
     * Set the sourceContainer property: Required. Source container name.
     *
     * @param sourceContainer the sourceContainer value to set.
     * @return the ObjectReplicationPolicyRule object itself.
     */
    public ObjectReplicationPolicyRule setSourceContainer(String sourceContainer) {
        this.sourceContainer = sourceContainer;
        return this;
    }

    /**
     * Get the destinationContainer property: Required. Destination container name.
     *
     * @return the destinationContainer value.
     */
    public String getDestinationContainer() {
        return this.destinationContainer;
    }

    /**
     * Set the destinationContainer property: Required. Destination container name.
     *
     * @param destinationContainer the destinationContainer value to set.
     * @return the ObjectReplicationPolicyRule object itself.
     */
    public ObjectReplicationPolicyRule setDestinationContainer(String destinationContainer) {
        this.destinationContainer = destinationContainer;
        return this;
    }

    /**
     * Get the filters property: Optional. An object that defines the filter set.
     *
     * @return the filters value.
     */
    public ObjectReplicationPolicyFilter getFilters() {
        return this.filters;
    }

    /**
     * Set the filters property: Optional. An object that defines the filter set.
     *
     * @param filters the filters value to set.
     * @return the ObjectReplicationPolicyRule object itself.
     */
    public ObjectReplicationPolicyRule setFilters(ObjectReplicationPolicyFilter filters) {
        this.filters = filters;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getSourceContainer() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property sourceContainer in model ObjectReplicationPolicyRule"));
        }
        if (getDestinationContainer() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property destinationContainer in model ObjectReplicationPolicyRule"));
        }
        if (getFilters() != null) {
            getFilters().validate();
        }
    }
}
