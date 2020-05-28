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

/** The NetworkSecurityGroup model. */
@JsonFlatten
@Fluent
public class NetworkSecurityGroup extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(NetworkSecurityGroup.class);

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * A collection of security rules of the network security group.
     */
    @JsonProperty(value = "properties.securityRules")
    private List<SecurityRule> securityRules;

    /*
     * The default security rules of network security group.
     */
    @JsonProperty(value = "properties.defaultSecurityRules", access = JsonProperty.Access.WRITE_ONLY)
    private List<SecurityRule> defaultSecurityRules;

    /*
     * A collection of references to network interfaces.
     */
    @JsonProperty(value = "properties.networkInterfaces", access = JsonProperty.Access.WRITE_ONLY)
    private List<NetworkInterface> networkInterfaces;

    /*
     * A collection of references to subnets.
     */
    @JsonProperty(value = "properties.subnets", access = JsonProperty.Access.WRITE_ONLY)
    private List<Subnet> subnets;

    /*
     * A collection of references to flow log resources.
     */
    @JsonProperty(value = "properties.flowLogs", access = JsonProperty.Access.WRITE_ONLY)
    private List<FlowLog> flowLogs;

    /*
     * The resource GUID property of the network security group resource.
     */
    @JsonProperty(value = "properties.resourceGuid", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceGuid;

    /*
     * The provisioning state of the network security group resource.
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
     * Get the securityRules property: A collection of security rules of the network security group.
     *
     * @return the securityRules value.
     */
    public List<SecurityRule> getSecurityRules() {
        return this.securityRules;
    }

    /**
     * Set the securityRules property: A collection of security rules of the network security group.
     *
     * @param securityRules the securityRules value to set.
     * @return the NetworkSecurityGroup object itself.
     */
    public NetworkSecurityGroup setSecurityRules(List<SecurityRule> securityRules) {
        this.securityRules = securityRules;
        return this;
    }

    /**
     * Get the defaultSecurityRules property: The default security rules of network security group.
     *
     * @return the defaultSecurityRules value.
     */
    public List<SecurityRule> getDefaultSecurityRules() {
        return this.defaultSecurityRules;
    }

    /**
     * Get the networkInterfaces property: A collection of references to network interfaces.
     *
     * @return the networkInterfaces value.
     */
    public List<NetworkInterface> getNetworkInterfaces() {
        return this.networkInterfaces;
    }

    /**
     * Get the subnets property: A collection of references to subnets.
     *
     * @return the subnets value.
     */
    public List<Subnet> getSubnets() {
        return this.subnets;
    }

    /**
     * Get the flowLogs property: A collection of references to flow log resources.
     *
     * @return the flowLogs value.
     */
    public List<FlowLog> getFlowLogs() {
        return this.flowLogs;
    }

    /**
     * Get the resourceGuid property: The resource GUID property of the network security group resource.
     *
     * @return the resourceGuid value.
     */
    public String getResourceGuid() {
        return this.resourceGuid;
    }

    /**
     * Get the provisioningState property: The provisioning state of the network security group resource.
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
     * @return the NetworkSecurityGroup object itself.
     */
    public NetworkSecurityGroup setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getSecurityRules() != null) {
            getSecurityRules().forEach(e -> e.validate());
        }
        if (getDefaultSecurityRules() != null) {
            getDefaultSecurityRules().forEach(e -> e.validate());
        }
        if (getNetworkInterfaces() != null) {
            getNetworkInterfaces().forEach(e -> e.validate());
        }
        if (getSubnets() != null) {
            getSubnets().forEach(e -> e.validate());
        }
        if (getFlowLogs() != null) {
            getFlowLogs().forEach(e -> e.validate());
        }
    }
}
