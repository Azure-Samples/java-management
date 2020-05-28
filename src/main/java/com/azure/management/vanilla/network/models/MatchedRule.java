// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The MatchedRule model. */
@Fluent
public final class MatchedRule {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MatchedRule.class);

    /*
     * Name of the matched network security rule.
     */
    @JsonProperty(value = "ruleName")
    private String ruleName;

    /*
     * The network traffic is allowed or denied. Possible values are 'Allow'
     * and 'Deny'.
     */
    @JsonProperty(value = "action")
    private String action;

    /**
     * Get the ruleName property: Name of the matched network security rule.
     *
     * @return the ruleName value.
     */
    public String getRuleName() {
        return this.ruleName;
    }

    /**
     * Set the ruleName property: Name of the matched network security rule.
     *
     * @param ruleName the ruleName value to set.
     * @return the MatchedRule object itself.
     */
    public MatchedRule setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }

    /**
     * Get the action property: The network traffic is allowed or denied. Possible values are 'Allow' and 'Deny'.
     *
     * @return the action value.
     */
    public String getAction() {
        return this.action;
    }

    /**
     * Set the action property: The network traffic is allowed or denied. Possible values are 'Allow' and 'Deny'.
     *
     * @param action the action value to set.
     * @return the MatchedRule object itself.
     */
    public MatchedRule setAction(String action) {
        this.action = action;
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
