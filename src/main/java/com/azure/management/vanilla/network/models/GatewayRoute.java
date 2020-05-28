// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.network.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The GatewayRoute model. */
@Immutable
public final class GatewayRoute {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(GatewayRoute.class);

    /*
     * The gateway's local address.
     */
    @JsonProperty(value = "localAddress", access = JsonProperty.Access.WRITE_ONLY)
    private String localAddress;

    /*
     * The route's network prefix.
     */
    @JsonProperty(value = "network", access = JsonProperty.Access.WRITE_ONLY)
    private String network;

    /*
     * The route's next hop.
     */
    @JsonProperty(value = "nextHop", access = JsonProperty.Access.WRITE_ONLY)
    private String nextHop;

    /*
     * The peer this route was learned from.
     */
    @JsonProperty(value = "sourcePeer", access = JsonProperty.Access.WRITE_ONLY)
    private String sourcePeer;

    /*
     * The source this route was learned from.
     */
    @JsonProperty(value = "origin", access = JsonProperty.Access.WRITE_ONLY)
    private String origin;

    /*
     * The route's AS path sequence.
     */
    @JsonProperty(value = "asPath", access = JsonProperty.Access.WRITE_ONLY)
    private String asPath;

    /*
     * The route's weight.
     */
    @JsonProperty(value = "weight", access = JsonProperty.Access.WRITE_ONLY)
    private Integer weight;

    /**
     * Get the localAddress property: The gateway's local address.
     *
     * @return the localAddress value.
     */
    public String getLocalAddress() {
        return this.localAddress;
    }

    /**
     * Get the network property: The route's network prefix.
     *
     * @return the network value.
     */
    public String getNetwork() {
        return this.network;
    }

    /**
     * Get the nextHop property: The route's next hop.
     *
     * @return the nextHop value.
     */
    public String getNextHop() {
        return this.nextHop;
    }

    /**
     * Get the sourcePeer property: The peer this route was learned from.
     *
     * @return the sourcePeer value.
     */
    public String getSourcePeer() {
        return this.sourcePeer;
    }

    /**
     * Get the origin property: The source this route was learned from.
     *
     * @return the origin value.
     */
    public String getOrigin() {
        return this.origin;
    }

    /**
     * Get the asPath property: The route's AS path sequence.
     *
     * @return the asPath value.
     */
    public String getAsPath() {
        return this.asPath;
    }

    /**
     * Get the weight property: The route's weight.
     *
     * @return the weight value.
     */
    public Integer getWeight() {
        return this.weight;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
