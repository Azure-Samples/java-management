// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The QueryTroubleshootingParameters model. */
@Fluent
public final class QueryTroubleshootingParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(QueryTroubleshootingParameters.class);

    /*
     * The target resource ID to query the troubleshooting result.
     */
    @JsonProperty(value = "targetResourceId", required = true)
    private String targetResourceId;

    /**
     * Get the targetResourceId property: The target resource ID to query the troubleshooting result.
     *
     * @return the targetResourceId value.
     */
    public String getTargetResourceId() {
        return this.targetResourceId;
    }

    /**
     * Set the targetResourceId property: The target resource ID to query the troubleshooting result.
     *
     * @param targetResourceId the targetResourceId value to set.
     * @return the QueryTroubleshootingParameters object itself.
     */
    public QueryTroubleshootingParameters setTargetResourceId(String targetResourceId) {
        this.targetResourceId = targetResourceId;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getTargetResourceId() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property targetResourceId in model QueryTroubleshootingParameters"));
        }
    }
}
