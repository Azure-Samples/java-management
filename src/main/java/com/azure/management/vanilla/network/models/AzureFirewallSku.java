// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The AzureFirewallSku model. */
@Fluent
public final class AzureFirewallSku {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AzureFirewallSku.class);

    /*
     * Name of an Azure Firewall SKU.
     */
    @JsonProperty(value = "name")
    private AzureFirewallSkuName name;

    /*
     * Tier of an Azure Firewall.
     */
    @JsonProperty(value = "tier")
    private AzureFirewallSkuTier tier;

    /**
     * Get the name property: Name of an Azure Firewall SKU.
     *
     * @return the name value.
     */
    public AzureFirewallSkuName getName() {
        return this.name;
    }

    /**
     * Set the name property: Name of an Azure Firewall SKU.
     *
     * @param name the name value to set.
     * @return the AzureFirewallSku object itself.
     */
    public AzureFirewallSku setName(AzureFirewallSkuName name) {
        this.name = name;
        return this;
    }

    /**
     * Get the tier property: Tier of an Azure Firewall.
     *
     * @return the tier value.
     */
    public AzureFirewallSkuTier getTier() {
        return this.tier;
    }

    /**
     * Set the tier property: Tier of an Azure Firewall.
     *
     * @param tier the tier value to set.
     * @return the AzureFirewallSku object itself.
     */
    public AzureFirewallSku setTier(AzureFirewallSkuTier tier) {
        this.tier = tier;
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
