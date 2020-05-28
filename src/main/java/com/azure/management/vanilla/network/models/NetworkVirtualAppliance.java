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

/** The NetworkVirtualAppliance model. */
@JsonFlatten
@Fluent
public class NetworkVirtualAppliance extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(NetworkVirtualAppliance.class);

    /*
     * The service principal that has read access to cloud-init and config
     * blob.
     */
    @JsonProperty(value = "identity")
    private ManagedServiceIdentity identity;

    /*
     * Network Virtual Appliance SKU.
     */
    @JsonProperty(value = "sku")
    private VirtualApplianceSkuProperties sku;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * BootStrapConfigurationBlob storage URLs.
     */
    @JsonProperty(value = "properties.bootStrapConfigurationBlob")
    private List<String> bootStrapConfigurationBlob;

    /*
     * The Virtual Hub where Network Virtual Appliance is being deployed.
     */
    @JsonProperty(value = "properties.virtualHub")
    private SubResource virtualHub;

    /*
     * CloudInitConfigurationBlob storage URLs.
     */
    @JsonProperty(value = "properties.cloudInitConfigurationBlob")
    private List<String> cloudInitConfigurationBlob;

    /*
     * VirtualAppliance ASN.
     */
    @JsonProperty(value = "properties.virtualApplianceAsn")
    private Long virtualApplianceAsn;

    /*
     * List of Virtual Appliance Network Interfaces.
     */
    @JsonProperty(value = "properties.virtualApplianceNics", access = JsonProperty.Access.WRITE_ONLY)
    private List<VirtualApplianceNicProperties> virtualApplianceNics;

    /*
     * The provisioning state of the resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the identity property: The service principal that has read access to cloud-init and config blob.
     *
     * @return the identity value.
     */
    public ManagedServiceIdentity getIdentity() {
        return this.identity;
    }

    /**
     * Set the identity property: The service principal that has read access to cloud-init and config blob.
     *
     * @param identity the identity value to set.
     * @return the NetworkVirtualAppliance object itself.
     */
    public NetworkVirtualAppliance setIdentity(ManagedServiceIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the sku property: Network Virtual Appliance SKU.
     *
     * @return the sku value.
     */
    public VirtualApplianceSkuProperties getSku() {
        return this.sku;
    }

    /**
     * Set the sku property: Network Virtual Appliance SKU.
     *
     * @param sku the sku value to set.
     * @return the NetworkVirtualAppliance object itself.
     */
    public NetworkVirtualAppliance setSku(VirtualApplianceSkuProperties sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String getEtag() {
        return this.etag;
    }

    /**
     * Get the bootStrapConfigurationBlob property: BootStrapConfigurationBlob storage URLs.
     *
     * @return the bootStrapConfigurationBlob value.
     */
    public List<String> getBootStrapConfigurationBlob() {
        return this.bootStrapConfigurationBlob;
    }

    /**
     * Set the bootStrapConfigurationBlob property: BootStrapConfigurationBlob storage URLs.
     *
     * @param bootStrapConfigurationBlob the bootStrapConfigurationBlob value to set.
     * @return the NetworkVirtualAppliance object itself.
     */
    public NetworkVirtualAppliance setBootStrapConfigurationBlob(List<String> bootStrapConfigurationBlob) {
        this.bootStrapConfigurationBlob = bootStrapConfigurationBlob;
        return this;
    }

    /**
     * Get the virtualHub property: The Virtual Hub where Network Virtual Appliance is being deployed.
     *
     * @return the virtualHub value.
     */
    public SubResource getVirtualHub() {
        return this.virtualHub;
    }

    /**
     * Set the virtualHub property: The Virtual Hub where Network Virtual Appliance is being deployed.
     *
     * @param virtualHub the virtualHub value to set.
     * @return the NetworkVirtualAppliance object itself.
     */
    public NetworkVirtualAppliance setVirtualHub(SubResource virtualHub) {
        this.virtualHub = virtualHub;
        return this;
    }

    /**
     * Get the cloudInitConfigurationBlob property: CloudInitConfigurationBlob storage URLs.
     *
     * @return the cloudInitConfigurationBlob value.
     */
    public List<String> getCloudInitConfigurationBlob() {
        return this.cloudInitConfigurationBlob;
    }

    /**
     * Set the cloudInitConfigurationBlob property: CloudInitConfigurationBlob storage URLs.
     *
     * @param cloudInitConfigurationBlob the cloudInitConfigurationBlob value to set.
     * @return the NetworkVirtualAppliance object itself.
     */
    public NetworkVirtualAppliance setCloudInitConfigurationBlob(List<String> cloudInitConfigurationBlob) {
        this.cloudInitConfigurationBlob = cloudInitConfigurationBlob;
        return this;
    }

    /**
     * Get the virtualApplianceAsn property: VirtualAppliance ASN.
     *
     * @return the virtualApplianceAsn value.
     */
    public Long getVirtualApplianceAsn() {
        return this.virtualApplianceAsn;
    }

    /**
     * Set the virtualApplianceAsn property: VirtualAppliance ASN.
     *
     * @param virtualApplianceAsn the virtualApplianceAsn value to set.
     * @return the NetworkVirtualAppliance object itself.
     */
    public NetworkVirtualAppliance setVirtualApplianceAsn(Long virtualApplianceAsn) {
        this.virtualApplianceAsn = virtualApplianceAsn;
        return this;
    }

    /**
     * Get the virtualApplianceNics property: List of Virtual Appliance Network Interfaces.
     *
     * @return the virtualApplianceNics value.
     */
    public List<VirtualApplianceNicProperties> getVirtualApplianceNics() {
        return this.virtualApplianceNics;
    }

    /**
     * Get the provisioningState property: The provisioning state of the resource.
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
     * @return the NetworkVirtualAppliance object itself.
     */
    public NetworkVirtualAppliance setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getIdentity() != null) {
            getIdentity().validate();
        }
        if (getSku() != null) {
            getSku().validate();
        }
        if (getVirtualApplianceNics() != null) {
            getVirtualApplianceNics().forEach(e -> e.validate());
        }
    }
}
