// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The NetworkProfileListResult model. */
@Fluent
public final class NetworkProfileListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(NetworkProfileListResult.class);

    /*
     * A list of network profiles that exist in a resource group.
     */
    @JsonProperty(value = "value")
    private List<NetworkProfile> value;

    /*
     * The URL to get the next set of results.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: A list of network profiles that exist in a resource group.
     *
     * @return the value value.
     */
    public List<NetworkProfile> getValue() {
        return this.value;
    }

    /**
     * Set the value property: A list of network profiles that exist in a resource group.
     *
     * @param value the value value to set.
     * @return the NetworkProfileListResult object itself.
     */
    public NetworkProfileListResult setValue(List<NetworkProfile> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to get the next set of results.
     *
     * @return the nextLink value.
     */
    public String getNextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URL to get the next set of results.
     *
     * @param nextLink the nextLink value to set.
     * @return the NetworkProfileListResult object itself.
     */
    public NetworkProfileListResult setNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getValue() != null) {
            getValue().forEach(e -> e.validate());
        }
    }
}
