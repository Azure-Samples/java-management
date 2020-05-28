// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The VirtualMachineScaleSetReimageParameters model. */
@Fluent
public final class VirtualMachineScaleSetReimageParameters extends VirtualMachineReimageParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VirtualMachineScaleSetReimageParameters.class);

    /*
     * The virtual machine scale set instance ids. Omitting the virtual machine
     * scale set instance ids will result in the operation being performed on
     * all virtual machines in the virtual machine scale set.
     */
    @JsonProperty(value = "instanceIds")
    private List<String> instanceIds;

    /**
     * Get the instanceIds property: The virtual machine scale set instance ids. Omitting the virtual machine scale set
     * instance ids will result in the operation being performed on all virtual machines in the virtual machine scale
     * set.
     *
     * @return the instanceIds value.
     */
    public List<String> getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * Set the instanceIds property: The virtual machine scale set instance ids. Omitting the virtual machine scale set
     * instance ids will result in the operation being performed on all virtual machines in the virtual machine scale
     * set.
     *
     * @param instanceIds the instanceIds value to set.
     * @return the VirtualMachineScaleSetReimageParameters object itself.
     */
    public VirtualMachineScaleSetReimageParameters setInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
