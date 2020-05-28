// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.network.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ApplicationGatewayOperationalState. */
public final class ApplicationGatewayOperationalState extends ExpandableStringEnum<ApplicationGatewayOperationalState> {
    /** Static value Stopped for ApplicationGatewayOperationalState. */
    public static final ApplicationGatewayOperationalState STOPPED = fromString("Stopped");

    /** Static value Starting for ApplicationGatewayOperationalState. */
    public static final ApplicationGatewayOperationalState STARTING = fromString("Starting");

    /** Static value Running for ApplicationGatewayOperationalState. */
    public static final ApplicationGatewayOperationalState RUNNING = fromString("Running");

    /** Static value Stopping for ApplicationGatewayOperationalState. */
    public static final ApplicationGatewayOperationalState STOPPING = fromString("Stopping");

    /**
     * Creates or finds a ApplicationGatewayOperationalState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ApplicationGatewayOperationalState.
     */
    @JsonCreator
    public static ApplicationGatewayOperationalState fromString(String name) {
        return fromString(name, ApplicationGatewayOperationalState.class);
    }

    /** @return known ApplicationGatewayOperationalState values. */
    public static Collection<ApplicationGatewayOperationalState> values() {
        return values(ApplicationGatewayOperationalState.class);
    }
}
