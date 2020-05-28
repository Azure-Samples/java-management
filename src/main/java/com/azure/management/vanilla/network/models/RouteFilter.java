// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The RouteFilter model. */
@JsonFlatten
@Fluent
public class RouteFilter extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RouteFilter.class);

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Collection of RouteFilterRules contained within a route filter.
     */
    @JsonProperty(value = "properties.rules")
    private List<RouteFilterRule> rules;

    /*
     * A collection of references to express route circuit peerings.
     */
    @JsonProperty(value = "properties.peerings", access = JsonProperty.Access.WRITE_ONLY)
    private List<ExpressRouteCircuitPeering> peerings;

    /*
     * A collection of references to express route circuit ipv6 peerings.
     */
    @JsonProperty(value = "properties.ipv6Peerings", access = JsonProperty.Access.WRITE_ONLY)
    private List<ExpressRouteCircuitPeering> ipv6Peerings;

    /*
     * The provisioning state of the route filter resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String getEtag() {
        return this.etag;
    }

    /**
     * Get the rules property: Collection of RouteFilterRules contained within a route filter.
     *
     * @return the rules value.
     */
    public List<RouteFilterRule> getRules() {
        return this.rules;
    }

    /**
     * Set the rules property: Collection of RouteFilterRules contained within a route filter.
     *
     * @param rules the rules value to set.
     * @return the RouteFilter object itself.
     */
    public RouteFilter setRules(List<RouteFilterRule> rules) {
        this.rules = rules;
        return this;
    }

    /**
     * Get the peerings property: A collection of references to express route circuit peerings.
     *
     * @return the peerings value.
     */
    public List<ExpressRouteCircuitPeering> getPeerings() {
        return this.peerings;
    }

    /**
     * Get the ipv6Peerings property: A collection of references to express route circuit ipv6 peerings.
     *
     * @return the ipv6Peerings value.
     */
    public List<ExpressRouteCircuitPeering> getIpv6Peerings() {
        return this.ipv6Peerings;
    }

    /**
     * Get the provisioningState property: The provisioning state of the route filter resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the id property: Resource ID.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: Resource ID.
     *
     * @param id the id value to set.
     * @return the RouteFilter object itself.
     */
    public RouteFilter setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getRules() != null) {
            getRules().forEach(e -> e.validate());
        }
        if (getPeerings() != null) {
            getPeerings().forEach(e -> e.validate());
        }
        if (getIpv6Peerings() != null) {
            getIpv6Peerings().forEach(e -> e.validate());
        }
    }
}
