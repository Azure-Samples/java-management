// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The SshPublicKeysGroupListResult model. */
@Fluent
public final class SshPublicKeysGroupListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SshPublicKeysGroupListResult.class);

    /*
     * The list of SSH public keys
     */
    @JsonProperty(value = "value", required = true)
    private List<SshPublicKeyResource> value;

    /*
     * The URI to fetch the next page of SSH public keys. Call ListNext() with
     * this URI to fetch the next page of SSH public keys.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: The list of SSH public keys.
     *
     * @return the value value.
     */
    public List<SshPublicKeyResource> getValue() {
        return this.value;
    }

    /**
     * Set the value property: The list of SSH public keys.
     *
     * @param value the value value to set.
     * @return the SshPublicKeysGroupListResult object itself.
     */
    public SshPublicKeysGroupListResult setValue(List<SshPublicKeyResource> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URI to fetch the next page of SSH public keys. Call ListNext() with this URI to
     * fetch the next page of SSH public keys.
     *
     * @return the nextLink value.
     */
    public String getNextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URI to fetch the next page of SSH public keys. Call ListNext() with this URI to
     * fetch the next page of SSH public keys.
     *
     * @param nextLink the nextLink value to set.
     * @return the SshPublicKeysGroupListResult object itself.
     */
    public SshPublicKeysGroupListResult setNextLink(String nextLink) {
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
                    new IllegalArgumentException(
                        "Missing required property value in model SshPublicKeysGroupListResult"));
        } else {
            getValue().forEach(e -> e.validate());
        }
    }
}
