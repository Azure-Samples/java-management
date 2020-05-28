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

/** The VirtualNetworkGateway model. */
@JsonFlatten
@Fluent
public class VirtualNetworkGateway extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VirtualNetworkGateway.class);

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * IP configurations for virtual network gateway.
     */
    @JsonProperty(value = "properties.ipConfigurations")
    private List<VirtualNetworkGatewayIpConfiguration> ipConfigurations;

    /*
     * The type of this virtual network gateway.
     */
    @JsonProperty(value = "properties.gatewayType")
    private VirtualNetworkGatewayType gatewayType;

    /*
     * The type of this virtual network gateway.
     */
    @JsonProperty(value = "properties.vpnType")
    private VpnType vpnType;

    /*
     * The generation for this VirtualNetworkGateway. Must be None if
     * gatewayType is not VPN.
     */
    @JsonProperty(value = "properties.vpnGatewayGeneration")
    private VpnGatewayGeneration vpnGatewayGeneration;

    /*
     * Whether BGP is enabled for this virtual network gateway or not.
     */
    @JsonProperty(value = "properties.enableBgp")
    private Boolean enableBgp;

    /*
     * Whether private IP needs to be enabled on this gateway for connections
     * or not.
     */
    @JsonProperty(value = "properties.enablePrivateIpAddress")
    private Boolean enablePrivateIpAddress;

    /*
     * ActiveActive flag.
     */
    @JsonProperty(value = "properties.activeActive")
    private Boolean active;

    /*
     * The reference to the LocalNetworkGateway resource which represents local
     * network site having default routes. Assign Null value in case of
     * removing existing default site setting.
     */
    @JsonProperty(value = "properties.gatewayDefaultSite")
    private SubResource gatewayDefaultSite;

    /*
     * The reference to the VirtualNetworkGatewaySku resource which represents
     * the SKU selected for Virtual network gateway.
     */
    @JsonProperty(value = "properties.sku")
    private VirtualNetworkGatewaySku sku;

    /*
     * The reference to the VpnClientConfiguration resource which represents
     * the P2S VpnClient configurations.
     */
    @JsonProperty(value = "properties.vpnClientConfiguration")
    private VpnClientConfiguration vpnClientConfiguration;

    /*
     * Virtual network gateway's BGP speaker settings.
     */
    @JsonProperty(value = "properties.bgpSettings")
    private BgpSettings bgpSettings;

    /*
     * The reference to the address space resource which represents the custom
     * routes address space specified by the customer for virtual network
     * gateway and VpnClient.
     */
    @JsonProperty(value = "properties.customRoutes")
    private AddressSpace customRoutes;

    /*
     * The resource GUID property of the virtual network gateway resource.
     */
    @JsonProperty(value = "properties.resourceGuid", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceGuid;

    /*
     * The provisioning state of the virtual network gateway resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * Whether dns forwarding is enabled or not.
     */
    @JsonProperty(value = "properties.enableDnsForwarding")
    private Boolean enableDnsForwarding;

    /*
     * The IP address allocated by the gateway to which dns requests can be
     * sent.
     */
    @JsonProperty(value = "properties.inboundDnsForwardingEndpoint", access = JsonProperty.Access.WRITE_ONLY)
    private String inboundDnsForwardingEndpoint;

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
     * Get the ipConfigurations property: IP configurations for virtual network gateway.
     *
     * @return the ipConfigurations value.
     */
    public List<VirtualNetworkGatewayIpConfiguration> getIpConfigurations() {
        return this.ipConfigurations;
    }

    /**
     * Set the ipConfigurations property: IP configurations for virtual network gateway.
     *
     * @param ipConfigurations the ipConfigurations value to set.
     * @return the VirtualNetworkGateway object itself.
     */
    public VirtualNetworkGateway setIpConfigurations(List<VirtualNetworkGatewayIpConfiguration> ipConfigurations) {
        this.ipConfigurations = ipConfigurations;
        return this;
    }

    /**
     * Get the gatewayType property: The type of this virtual network gateway.
     *
     * @return the gatewayType value.
     */
    public VirtualNetworkGatewayType getGatewayType() {
        return this.gatewayType;
    }

    /**
     * Set the gatewayType property: The type of this virtual network gateway.
     *
     * @param gatewayType the gatewayType value to set.
     * @return the VirtualNetworkGateway object itself.
     */
    public VirtualNetworkGateway setGatewayType(VirtualNetworkGatewayType gatewayType) {
        this.gatewayType = gatewayType;
        return this;
    }

    /**
     * Get the vpnType property: The type of this virtual network gateway.
     *
     * @return the vpnType value.
     */
    public VpnType getVpnType() {
        return this.vpnType;
    }

    /**
     * Set the vpnType property: The type of this virtual network gateway.
     *
     * @param vpnType the vpnType value to set.
     * @return the VirtualNetworkGateway object itself.
     */
    public VirtualNetworkGateway setVpnType(VpnType vpnType) {
        this.vpnType = vpnType;
        return this;
    }

    /**
     * Get the vpnGatewayGeneration property: The generation for this VirtualNetworkGateway. Must be None if gatewayType
     * is not VPN.
     *
     * @return the vpnGatewayGeneration value.
     */
    public VpnGatewayGeneration getVpnGatewayGeneration() {
        return this.vpnGatewayGeneration;
    }

    /**
     * Set the vpnGatewayGeneration property: The generation for this VirtualNetworkGateway. Must be None if gatewayType
     * is not VPN.
     *
     * @param vpnGatewayGeneration the vpnGatewayGeneration value to set.
     * @return the VirtualNetworkGateway object itself.
     */
    public VirtualNetworkGateway setVpnGatewayGeneration(VpnGatewayGeneration vpnGatewayGeneration) {
        this.vpnGatewayGeneration = vpnGatewayGeneration;
        return this;
    }

    /**
     * Get the enableBgp property: Whether BGP is enabled for this virtual network gateway or not.
     *
     * @return the enableBgp value.
     */
    public Boolean isEnableBgp() {
        return this.enableBgp;
    }

    /**
     * Set the enableBgp property: Whether BGP is enabled for this virtual network gateway or not.
     *
     * @param enableBgp the enableBgp value to set.
     * @return the VirtualNetworkGateway object itself.
     */
    public VirtualNetworkGateway setEnableBgp(Boolean enableBgp) {
        this.enableBgp = enableBgp;
        return this;
    }

    /**
     * Get the enablePrivateIpAddress property: Whether private IP needs to be enabled on this gateway for connections
     * or not.
     *
     * @return the enablePrivateIpAddress value.
     */
    public Boolean isEnablePrivateIpAddress() {
        return this.enablePrivateIpAddress;
    }

    /**
     * Set the enablePrivateIpAddress property: Whether private IP needs to be enabled on this gateway for connections
     * or not.
     *
     * @param enablePrivateIpAddress the enablePrivateIpAddress value to set.
     * @return the VirtualNetworkGateway object itself.
     */
    public VirtualNetworkGateway setEnablePrivateIpAddress(Boolean enablePrivateIpAddress) {
        this.enablePrivateIpAddress = enablePrivateIpAddress;
        return this;
    }

    /**
     * Get the active property: ActiveActive flag.
     *
     * @return the active value.
     */
    public Boolean isActive() {
        return this.active;
    }

    /**
     * Set the active property: ActiveActive flag.
     *
     * @param active the active value to set.
     * @return the VirtualNetworkGateway object itself.
     */
    public VirtualNetworkGateway setActive(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * Get the gatewayDefaultSite property: The reference to the LocalNetworkGateway resource which represents local
     * network site having default routes. Assign Null value in case of removing existing default site setting.
     *
     * @return the gatewayDefaultSite value.
     */
    public SubResource getGatewayDefaultSite() {
        return this.gatewayDefaultSite;
    }

    /**
     * Set the gatewayDefaultSite property: The reference to the LocalNetworkGateway resource which represents local
     * network site having default routes. Assign Null value in case of removing existing default site setting.
     *
     * @param gatewayDefaultSite the gatewayDefaultSite value to set.
     * @return the VirtualNetworkGateway object itself.
     */
    public VirtualNetworkGateway setGatewayDefaultSite(SubResource gatewayDefaultSite) {
        this.gatewayDefaultSite = gatewayDefaultSite;
        return this;
    }

    /**
     * Get the sku property: The reference to the VirtualNetworkGatewaySku resource which represents the SKU selected
     * for Virtual network gateway.
     *
     * @return the sku value.
     */
    public VirtualNetworkGatewaySku getSku() {
        return this.sku;
    }

    /**
     * Set the sku property: The reference to the VirtualNetworkGatewaySku resource which represents the SKU selected
     * for Virtual network gateway.
     *
     * @param sku the sku value to set.
     * @return the VirtualNetworkGateway object itself.
     */
    public VirtualNetworkGateway setSku(VirtualNetworkGatewaySku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the vpnClientConfiguration property: The reference to the VpnClientConfiguration resource which represents
     * the P2S VpnClient configurations.
     *
     * @return the vpnClientConfiguration value.
     */
    public VpnClientConfiguration getVpnClientConfiguration() {
        return this.vpnClientConfiguration;
    }

    /**
     * Set the vpnClientConfiguration property: The reference to the VpnClientConfiguration resource which represents
     * the P2S VpnClient configurations.
     *
     * @param vpnClientConfiguration the vpnClientConfiguration value to set.
     * @return the VirtualNetworkGateway object itself.
     */
    public VirtualNetworkGateway setVpnClientConfiguration(VpnClientConfiguration vpnClientConfiguration) {
        this.vpnClientConfiguration = vpnClientConfiguration;
        return this;
    }

    /**
     * Get the bgpSettings property: Virtual network gateway's BGP speaker settings.
     *
     * @return the bgpSettings value.
     */
    public BgpSettings getBgpSettings() {
        return this.bgpSettings;
    }

    /**
     * Set the bgpSettings property: Virtual network gateway's BGP speaker settings.
     *
     * @param bgpSettings the bgpSettings value to set.
     * @return the VirtualNetworkGateway object itself.
     */
    public VirtualNetworkGateway setBgpSettings(BgpSettings bgpSettings) {
        this.bgpSettings = bgpSettings;
        return this;
    }

    /**
     * Get the customRoutes property: The reference to the address space resource which represents the custom routes
     * address space specified by the customer for virtual network gateway and VpnClient.
     *
     * @return the customRoutes value.
     */
    public AddressSpace getCustomRoutes() {
        return this.customRoutes;
    }

    /**
     * Set the customRoutes property: The reference to the address space resource which represents the custom routes
     * address space specified by the customer for virtual network gateway and VpnClient.
     *
     * @param customRoutes the customRoutes value to set.
     * @return the VirtualNetworkGateway object itself.
     */
    public VirtualNetworkGateway setCustomRoutes(AddressSpace customRoutes) {
        this.customRoutes = customRoutes;
        return this;
    }

    /**
     * Get the resourceGuid property: The resource GUID property of the virtual network gateway resource.
     *
     * @return the resourceGuid value.
     */
    public String getResourceGuid() {
        return this.resourceGuid;
    }

    /**
     * Get the provisioningState property: The provisioning state of the virtual network gateway resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the enableDnsForwarding property: Whether dns forwarding is enabled or not.
     *
     * @return the enableDnsForwarding value.
     */
    public Boolean isEnableDnsForwarding() {
        return this.enableDnsForwarding;
    }

    /**
     * Set the enableDnsForwarding property: Whether dns forwarding is enabled or not.
     *
     * @param enableDnsForwarding the enableDnsForwarding value to set.
     * @return the VirtualNetworkGateway object itself.
     */
    public VirtualNetworkGateway setEnableDnsForwarding(Boolean enableDnsForwarding) {
        this.enableDnsForwarding = enableDnsForwarding;
        return this;
    }

    /**
     * Get the inboundDnsForwardingEndpoint property: The IP address allocated by the gateway to which dns requests can
     * be sent.
     *
     * @return the inboundDnsForwardingEndpoint value.
     */
    public String getInboundDnsForwardingEndpoint() {
        return this.inboundDnsForwardingEndpoint;
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
     * @return the VirtualNetworkGateway object itself.
     */
    public VirtualNetworkGateway setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getIpConfigurations() != null) {
            getIpConfigurations().forEach(e -> e.validate());
        }
        if (getSku() != null) {
            getSku().validate();
        }
        if (getVpnClientConfiguration() != null) {
            getVpnClientConfiguration().validate();
        }
        if (getBgpSettings() != null) {
            getBgpSettings().validate();
        }
        if (getCustomRoutes() != null) {
            getCustomRoutes().validate();
        }
    }
}
