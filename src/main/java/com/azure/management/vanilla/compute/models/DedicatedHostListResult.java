// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The DedicatedHostListResult model. */
@Fluent
public final class DedicatedHostListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DedicatedHostListResult.class);

    /*
     * The list of dedicated hosts
     */
    @JsonProperty(value = "value", required = true)
    private List<DedicatedHost> value;

    /*
     * The URI to fetch the next page of dedicated hosts. Call ListNext() with
     * this URI to fetch the next page of dedicated hosts.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: The list of dedicated hosts.
     *
     * @return the value value.
     */
    public List<DedicatedHost> getValue() {
        return this.value;
    }

    /**
     * Set the value property: The list of dedicated hosts.
     *
     * @param value the value value to set.
     * @return the DedicatedHostListResult object itself.
     */
    public DedicatedHostListResult setValue(List<DedicatedHost> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URI to fetch the next page of dedicated hosts. Call ListNext() with this URI to
     * fetch the next page of dedicated hosts.
     *
     * @return the nextLink value.
     */
    public String getNextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URI to fetch the next page of dedicated hosts. Call ListNext() with this URI to
     * fetch the next page of dedicated hosts.
     *
     * @param nextLink the nextLink value to set.
     * @return the DedicatedHostListResult object itself.
     */
    public DedicatedHostListResult setNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getValue() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property value in model DedicatedHostListResult"));
        } else {
            getValue().forEach(e -> e.validate());
        }
    }
}
