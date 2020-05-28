// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The VpnLinkProviderProperties model. */
@Fluent
public final class VpnLinkProviderProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VpnLinkProviderProperties.class);

    /*
     * Name of the link provider.
     */
    @JsonProperty(value = "linkProviderName")
    private String linkProviderName;

    /*
     * Link speed.
     */
    @JsonProperty(value = "linkSpeedInMbps")
    private Integer linkSpeedInMbps;

    /**
     * Get the linkProviderName property: Name of the link provider.
     *
     * @return the linkProviderName value.
     */
    public String getLinkProviderName() {
        return this.linkProviderName;
    }

    /**
     * Set the linkProviderName property: Name of the link provider.
     *
     * @param linkProviderName the linkProviderName value to set.
     * @return the VpnLinkProviderProperties object itself.
     */
    public VpnLinkProviderProperties setLinkProviderName(String linkProviderName) {
        this.linkProviderName = linkProviderName;
        return this;
    }

    /**
     * Get the linkSpeedInMbps property: Link speed.
     *
     * @return the linkSpeedInMbps value.
     */
    public Integer getLinkSpeedInMbps() {
        return this.linkSpeedInMbps;
    }

    /**
     * Set the linkSpeedInMbps property: Link speed.
     *
     * @param linkSpeedInMbps the linkSpeedInMbps value to set.
     * @return the VpnLinkProviderProperties object itself.
     */
    public VpnLinkProviderProperties setLinkSpeedInMbps(Integer linkSpeedInMbps) {
        this.linkSpeedInMbps = linkSpeedInMbps;
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
