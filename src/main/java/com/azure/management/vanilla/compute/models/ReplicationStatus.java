// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.compute.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ReplicationStatus model. */
@Immutable
public final class ReplicationStatus {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ReplicationStatus.class);

    /*
     * This is the aggregated replication status based on all the regional
     * replication status flags.
     */
    @JsonProperty(value = "aggregatedState", access = JsonProperty.Access.WRITE_ONLY)
    private AggregatedReplicationState aggregatedState;

    /*
     * This is a summary of replication status for each region.
     */
    @JsonProperty(value = "summary", access = JsonProperty.Access.WRITE_ONLY)
    private List<RegionalReplicationStatus> summary;

    /**
     * Get the aggregatedState property: This is the aggregated replication status based on all the regional replication
     * status flags.
     *
     * @return the aggregatedState value.
     */
    public AggregatedReplicationState getAggregatedState() {
        return this.aggregatedState;
    }

    /**
     * Get the summary property: This is a summary of replication status for each region.
     *
     * @return the summary value.
     */
    public List<RegionalReplicationStatus> getSummary() {
        return this.summary;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getSummary() != null) {
            getSummary().forEach(e -> e.validate());
        }
    }
}
