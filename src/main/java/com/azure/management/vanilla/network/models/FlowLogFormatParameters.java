// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The FlowLogFormatParameters model. */
@Fluent
public final class FlowLogFormatParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(FlowLogFormatParameters.class);

    /*
     * The file type of flow log.
     */
    @JsonProperty(value = "type")
    private FlowLogFormatType type;

    /*
     * The version (revision) of the flow log.
     */
    @JsonProperty(value = "version")
    private Integer version;

    /**
     * Get the type property: The file type of flow log.
     *
     * @return the type value.
     */
    public FlowLogFormatType getType() {
        return this.type;
    }

    /**
     * Set the type property: The file type of flow log.
     *
     * @param type the type value to set.
     * @return the FlowLogFormatParameters object itself.
     */
    public FlowLogFormatParameters setType(FlowLogFormatType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the version property: The version (revision) of the flow log.
     *
     * @return the version value.
     */
    public Integer getVersion() {
        return this.version;
    }

    /**
     * Set the version property: The version (revision) of the flow log.
     *
     * @param version the version value to set.
     * @return the FlowLogFormatParameters object itself.
     */
    public FlowLogFormatParameters setVersion(Integer version) {
        this.version = version;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
