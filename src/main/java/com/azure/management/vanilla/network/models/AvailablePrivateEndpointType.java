// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The AvailablePrivateEndpointType model. */
@Fluent
public final class AvailablePrivateEndpointType {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AvailablePrivateEndpointType.class);

    /*
     * The name of the service and resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A unique identifier of the AvailablePrivateEndpoint Type resource.
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * Resource type.
     */
    @JsonProperty(value = "type")
    private String type;

    /*
     * The name of the service and resource.
     */
    @JsonProperty(value = "resourceName")
    private String resourceName;

    /**
     * Get the name property: The name of the service and resource.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name of the service and resource.
     *
     * @param name the name value to set.
     * @return the AvailablePrivateEndpointType object itself.
     */
    public AvailablePrivateEndpointType setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the id property: A unique identifier of the AvailablePrivateEndpoint Type resource.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: A unique identifier of the AvailablePrivateEndpoint Type resource.
     *
     * @param id the id value to set.
     * @return the AvailablePrivateEndpointType object itself.
     */
    public AvailablePrivateEndpointType setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the type property: Resource type.
     *
     * @return the type value.
     */
    public String getType() {
        return this.type;
    }

    /**
     * Set the type property: Resource type.
     *
     * @param type the type value to set.
     * @return the AvailablePrivateEndpointType object itself.
     */
    public AvailablePrivateEndpointType setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the resourceName property: The name of the service and resource.
     *
     * @return the resourceName value.
     */
    public String getResourceName() {
        return this.resourceName;
    }

    /**
     * Set the resourceName property: The name of the service and resource.
     *
     * @param resourceName the resourceName value to set.
     * @return the AvailablePrivateEndpointType object itself.
     */
    public AvailablePrivateEndpointType setResourceName(String resourceName) {
        this.resourceName = resourceName;
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
