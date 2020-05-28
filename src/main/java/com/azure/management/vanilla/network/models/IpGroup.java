// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The IpGroup model. */
@JsonFlatten
@Fluent
public class IpGroup extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(IpGroup.class);

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * The provisioning state of the IpGroups resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * IpAddresses/IpAddressPrefixes in the IpGroups resource.
     */
    @JsonProperty(value = "properties.ipAddresses")
    private List<String> ipAddresses;

    /*
     * List of references to Azure resources that this IpGroups is associated
     * with.
     */
    @JsonProperty(value = "properties.firewalls", access = JsonProperty.Access.WRITE_ONLY)
    private List<SubResource> firewalls;

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
     * Get the provisioningState property: The provisioning state of the IpGroups resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the ipAddresses property: IpAddresses/IpAddressPrefixes in the IpGroups resource.
     *
     * @return the ipAddresses value.
     */
    public List<String> getIpAddresses() {
        return this.ipAddresses;
    }

    /**
     * Set the ipAddresses property: IpAddresses/IpAddressPrefixes in the IpGroups resource.
     *
     * @param ipAddresses the ipAddresses value to set.
     * @return the IpGroup object itself.
     */
    public IpGroup setIpAddresses(List<String> ipAddresses) {
        this.ipAddresses = ipAddresses;
        return this;
    }

    /**
     * Get the firewalls property: List of references to Azure resources that this IpGroups is associated with.
     *
     * @return the firewalls value.
     */
    public List<SubResource> getFirewalls() {
        return this.firewalls;
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
     * @return the IpGroup object itself.
     */
    public IpGroup setId(String id) {
        this.id = id;
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
