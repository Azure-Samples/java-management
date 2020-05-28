// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The VpnDeviceScriptParameters model. */
@Fluent
public final class VpnDeviceScriptParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VpnDeviceScriptParameters.class);

    /*
     * The vendor for the vpn device.
     */
    @JsonProperty(value = "vendor")
    private String vendor;

    /*
     * The device family for the vpn device.
     */
    @JsonProperty(value = "deviceFamily")
    private String deviceFamily;

    /*
     * The firmware version for the vpn device.
     */
    @JsonProperty(value = "firmwareVersion")
    private String firmwareVersion;

    /**
     * Get the vendor property: The vendor for the vpn device.
     *
     * @return the vendor value.
     */
    public String getVendor() {
        return this.vendor;
    }

    /**
     * Set the vendor property: The vendor for the vpn device.
     *
     * @param vendor the vendor value to set.
     * @return the VpnDeviceScriptParameters object itself.
     */
    public VpnDeviceScriptParameters setVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }

    /**
     * Get the deviceFamily property: The device family for the vpn device.
     *
     * @return the deviceFamily value.
     */
    public String getDeviceFamily() {
        return this.deviceFamily;
    }

    /**
     * Set the deviceFamily property: The device family for the vpn device.
     *
     * @param deviceFamily the deviceFamily value to set.
     * @return the VpnDeviceScriptParameters object itself.
     */
    public VpnDeviceScriptParameters setDeviceFamily(String deviceFamily) {
        this.deviceFamily = deviceFamily;
        return this;
    }

    /**
     * Get the firmwareVersion property: The firmware version for the vpn device.
     *
     * @return the firmwareVersion value.
     */
    public String getFirmwareVersion() {
        return this.firmwareVersion;
    }

    /**
     * Set the firmwareVersion property: The firmware version for the vpn device.
     *
     * @param firmwareVersion the firmwareVersion value to set.
     * @return the VpnDeviceScriptParameters object itself.
     */
    public VpnDeviceScriptParameters setFirmwareVersion(String firmwareVersion) {
        this.firmwareVersion = firmwareVersion;
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
