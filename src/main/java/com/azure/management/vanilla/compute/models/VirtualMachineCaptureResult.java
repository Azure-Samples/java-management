// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.compute.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The VirtualMachineCaptureResult model. */
@Immutable
public final class VirtualMachineCaptureResult extends SubResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VirtualMachineCaptureResult.class);

    /*
     * the schema of the captured virtual machine
     */
    @JsonProperty(value = "$schema", access = JsonProperty.Access.WRITE_ONLY)
    private String schema;

    /*
     * the version of the content
     */
    @JsonProperty(value = "contentVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String contentVersion;

    /*
     * parameters of the captured virtual machine
     */
    @JsonProperty(value = "parameters", access = JsonProperty.Access.WRITE_ONLY)
    private Object parameters;

    /*
     * a list of resource items of the captured virtual machine
     */
    @JsonProperty(value = "resources", access = JsonProperty.Access.WRITE_ONLY)
    private List<Object> resources;

    /**
     * Get the schema property: the schema of the captured virtual machine.
     *
     * @return the schema value.
     */
    public String getSchema() {
        return this.schema;
    }

    /**
     * Get the contentVersion property: the version of the content.
     *
     * @return the contentVersion value.
     */
    public String getContentVersion() {
        return this.contentVersion;
    }

    /**
     * Get the parameters property: parameters of the captured virtual machine.
     *
     * @return the parameters value.
     */
    public Object getParameters() {
        return this.parameters;
    }

    /**
     * Get the resources property: a list of resource items of the captured virtual machine.
     *
     * @return the resources value.
     */
    public List<Object> getResources() {
        return this.resources;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
