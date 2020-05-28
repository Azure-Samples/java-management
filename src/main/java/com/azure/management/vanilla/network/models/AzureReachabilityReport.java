// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The AzureReachabilityReport model. */
@Fluent
public final class AzureReachabilityReport {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AzureReachabilityReport.class);

    /*
     * The aggregation level of Azure reachability report. Can be Country,
     * State or City.
     */
    @JsonProperty(value = "aggregationLevel", required = true)
    private String aggregationLevel;

    /*
     * Parameters that define a geographic location.
     */
    @JsonProperty(value = "providerLocation", required = true)
    private AzureReachabilityReportLocation providerLocation;

    /*
     * List of Azure reachability report items.
     */
    @JsonProperty(value = "reachabilityReport", required = true)
    private List<AzureReachabilityReportItem> reachabilityReport;

    /**
     * Get the aggregationLevel property: The aggregation level of Azure reachability report. Can be Country, State or
     * City.
     *
     * @return the aggregationLevel value.
     */
    public String getAggregationLevel() {
        return this.aggregationLevel;
    }

    /**
     * Set the aggregationLevel property: The aggregation level of Azure reachability report. Can be Country, State or
     * City.
     *
     * @param aggregationLevel the aggregationLevel value to set.
     * @return the AzureReachabilityReport object itself.
     */
    public AzureReachabilityReport setAggregationLevel(String aggregationLevel) {
        this.aggregationLevel = aggregationLevel;
        return this;
    }

    /**
     * Get the providerLocation property: Parameters that define a geographic location.
     *
     * @return the providerLocation value.
     */
    public AzureReachabilityReportLocation getProviderLocation() {
        return this.providerLocation;
    }

    /**
     * Set the providerLocation property: Parameters that define a geographic location.
     *
     * @param providerLocation the providerLocation value to set.
     * @return the AzureReachabilityReport object itself.
     */
    public AzureReachabilityReport setProviderLocation(AzureReachabilityReportLocation providerLocation) {
        this.providerLocation = providerLocation;
        return this;
    }

    /**
     * Get the reachabilityReport property: List of Azure reachability report items.
     *
     * @return the reachabilityReport value.
     */
    public List<AzureReachabilityReportItem> getReachabilityReport() {
        return this.reachabilityReport;
    }

    /**
     * Set the reachabilityReport property: List of Azure reachability report items.
     *
     * @param reachabilityReport the reachabilityReport value to set.
     * @return the AzureReachabilityReport object itself.
     */
    public AzureReachabilityReport setReachabilityReport(List<AzureReachabilityReportItem> reachabilityReport) {
        this.reachabilityReport = reachabilityReport;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getAggregationLevel() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property aggregationLevel in model AzureReachabilityReport"));
        }
        if (getProviderLocation() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property providerLocation in model AzureReachabilityReport"));
        } else {
            getProviderLocation().validate();
        }
        if (getReachabilityReport() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property reachabilityReport in model AzureReachabilityReport"));
        } else {
            getReachabilityReport().forEach(e -> e.validate());
        }
    }
}
