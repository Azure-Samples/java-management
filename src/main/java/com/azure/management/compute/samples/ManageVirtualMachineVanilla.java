// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.management.compute.samples;

import com.azure.core.http.HttpPipeline;
import com.azure.management.Azure;
import com.azure.management.vanilla.compute.ComputeManagementClientBuilder;
import com.azure.management.vanilla.compute.models.HardwareProfile;
import com.azure.management.vanilla.compute.models.ImageReference;
import com.azure.management.vanilla.compute.models.NetworkInterfaceReference;
import com.azure.management.vanilla.compute.models.NetworkProfile;
import com.azure.management.vanilla.compute.models.OSProfile;
import com.azure.management.vanilla.compute.models.StorageProfile;
import com.azure.management.vanilla.compute.models.VirtualMachine;
import com.azure.management.vanilla.compute.models.VirtualMachineSizeTypes;
import com.azure.management.vanilla.network.NetworkManagementClientBuilder;
import com.azure.management.vanilla.network.models.AddressSpace;
import com.azure.management.vanilla.network.models.NetworkInterface;
import com.azure.management.vanilla.network.models.NetworkInterfaceIpConfiguration;
import com.azure.management.vanilla.network.models.Subnet;
import com.azure.management.vanilla.network.models.VirtualNetwork;
import com.azure.management.vanilla.resources.ResourceManagementClientBuilder;
import com.azure.management.vanilla.resources.models.ResourceGroup;

import java.util.Collections;
import java.util.UUID;

public class ManageVirtualMachineVanilla {
    public static String randomString(String prefix, int len) {
        return prefix + UUID.randomUUID().toString().replace("-", "").substring(0, len - prefix.length());
    }

    public static void synchronousOperateVM(HttpPipeline pipeline, String subscriptionId, String rootPassword) {
        final String resourceGroupName = randomString("rg", 8);
        final String virtualMachineName = randomString("vm", 8);
        final String networkName = randomString("net", 8);
        final String networkInterfaceName = randomString("net", 8);
        final String region = "westus";
        final String primaryNetworkSpace = "10.0.0.0/24";
        final String rootUsername = "testUser";

        // resource group
        ResourceGroup resourceGroup = new ResourceGroup();
        resourceGroup.withLocation(region);

        new ResourceManagementClientBuilder()
            .pipeline(pipeline)
            .subscriptionId(subscriptionId)
            .buildResourceGroupsClient()
                .createOrUpdate(resourceGroupName, resourceGroup);

        // virtual network
        NetworkManagementClientBuilder networkManagementClientBuilder = new NetworkManagementClientBuilder()
            .pipeline(pipeline)
            .subscriptionId(subscriptionId);

        VirtualNetwork network = new VirtualNetwork()
                .setAddressSpace(new AddressSpace()
                    .setAddressPrefixes(Collections.singletonList(primaryNetworkSpace)))
                .setSubnets(Collections.singletonList(new Subnet()
                    .setName("subnet1")
                    .setAddressPrefix(primaryNetworkSpace)));
        network.withLocation(region);

        network = networkManagementClientBuilder.buildVirtualNetworksClient()
            .createOrUpdate(resourceGroupName, networkName, network);

        // network interface
        NetworkInterface networkInterface = new NetworkInterface()
                .setIpConfigurations(Collections.singletonList(
                        new NetworkInterfaceIpConfiguration()
                            .setName("primary")
                            .setPrimary(true)
                            .setSubnet(network.getSubnets().get(0))
                ));
        networkInterface.withLocation(region);

        networkInterface = networkManagementClientBuilder.buildNetworkInterfacesClient()
                .createOrUpdate(resourceGroupName, networkInterfaceName, networkInterface);

        // virtual machine
        VirtualMachine virtualMachine = new VirtualMachine()
                .setHardwareProfile(new HardwareProfile()
                    .setVmSize(VirtualMachineSizeTypes.BASIC_A0))
                .setStorageProfile(new StorageProfile()
                    .setImageReference(new ImageReference()
                        .setPublisher("Canonical")
                        .setOffer("UbuntuServer")
                        .setSku("16.04.0-LTS")
                        .setVersion("latest")))
                .setOsProfile(new OSProfile()
                    .setComputerName(virtualMachineName)
                    .setAdminUsername(rootUsername)
                    .setAdminPassword(rootPassword))
                .setNetworkProfile(new NetworkProfile()
                    .setNetworkInterfaces(Collections.singletonList(
                            (NetworkInterfaceReference) new NetworkInterfaceReference()
                                .setPrimary(true)
                                .withId(networkInterface.getId())
                    )));
        virtualMachine.withLocation(region);

        virtualMachine = new ComputeManagementClientBuilder()
            .pipeline(pipeline)
            .subscriptionId(subscriptionId)
            .buildVirtualMachinesClient()
                .createOrUpdate(resourceGroupName, virtualMachineName, virtualMachine);
    }

    public static void main(String[] args) throws Exception {
        Azure azure = ManageVirtualMachine.authentication();
        HttpPipeline pipeline = azure.virtualMachines().manager().httpPipeline();
        synchronousOperateVM(pipeline, azure.subscriptionId(), System.getenv("PASSWORD"));
    }
}
