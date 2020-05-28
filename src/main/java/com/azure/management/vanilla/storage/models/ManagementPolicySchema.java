// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.storage.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ManagementPolicySchema model. */
@Fluent
public final class ManagementPolicySchema {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ManagementPolicySchema.class);

    /*
     * The Storage Account ManagementPolicies Rules. See more details in:
     * https://docs.microsoft.com/en-us/azure/storage/common/storage-lifecycle-managment-concepts.
     */
    @JsonProperty(value = "rules", required = true)
    private List<ManagementPolicyRule> rules;

    /**
     * Get the rules property: The Storage Account ManagementPolicies Rules. See more details in:
     * https://docs.microsoft.com/en-us/azure/storage/common/storage-lifecycle-managment-concepts.
     *
     * @return the rules value.
     */
    public List<ManagementPolicyRule> getRules() {
        return this.rules;
    }

    /**
     * Set the rules property: The Storage Account ManagementPolicies Rules. See more details in:
     * https://docs.microsoft.com/en-us/azure/storage/common/storage-lifecycle-managment-concepts.
     *
     * @param rules the rules value to set.
     * @return the ManagementPolicySchema object itself.
     */
    public ManagementPolicySchema setRules(List<ManagementPolicyRule> rules) {
        this.rules = rules;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getRules() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property rules in model ManagementPolicySchema"));
        } else {
            getRules().forEach(e -> e.validate());
        }
    }
}
