// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.management.compute.samples;

import com.microsoft.azure.arm.resources.Region;
import com.microsoft.azure.credentials.ApplicationTokenCredentials;
import com.microsoft.azure.credentials.AzureTokenCredentials;
import com.microsoft.azure.management.compute.v2019_11_01.HardwareProfile;
import com.microsoft.azure.management.compute.v2019_11_01.ImageReference;
import com.microsoft.azure.management.compute.v2019_11_01.NetworkInterfaceReference;
import com.microsoft.azure.management.compute.v2019_11_01.NetworkProfile;
import com.microsoft.azure.management.compute.v2019_11_01.OSProfile;
import com.microsoft.azure.management.compute.v2019_11_01.StorageProfile;
import com.microsoft.azure.management.compute.v2019_11_01.VirtualMachineSizeTypes;
import com.microsoft.azure.management.compute.v2019_11_01.implementation.ComputeManager;
import com.microsoft.azure.management.network.v2020_04_01.AddressSpace;
import com.microsoft.azure.management.network.v2020_04_01.NetworkInterface;
import com.microsoft.azure.management.network.v2020_04_01.VirtualNetwork;
import com.microsoft.azure.management.network.v2020_04_01.implementation.NetworkInterfaceIPConfigurationInner;
import com.microsoft.azure.management.network.v2020_04_01.implementation.NetworkManager;
import com.microsoft.azure.management.network.v2020_04_01.implementation.SubnetInner;
import com.microsoft.azure.management.resources.v2019_07_01.implementation.ResourcesManager;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.UUID;

public class ManageVirtualMachineLite {
    public static String randomString(String prefix, int len) {
        return prefix + UUID.randomUUID().toString().replace("-", "").substring(0, len - prefix.length());
    }

    public static AzureTokenCredentials getCredentials() throws IOException {
        File credFile = new File(System.getenv("AZURE_AUTH_LOCATION"));
        return ApplicationTokenCredentials.fromFile(credFile);
    }

    public static void synchronousOperateVM(AzureTokenCredentials credentials, String rootPassword) {
        final String resourceGroupName = randomString("rg", 8);
        final String virtualMachineName = randomString("vm", 8);
        final String networkName = randomString("net", 8);
        final String networkInterfaceName = randomString("net", 8);
        final String region = Region.US_WEST.name();
        final String primaryNetworkSpace = "10.0.0.0/24";
        final String rootUsername = "testUser";

        ResourcesManager.authenticate(credentials, credentials.defaultSubscriptionId())
                .resourceGroups().define(resourceGroupName)
                    .withExistingSubscription()
                    .withLocation(region)
                    .create();

        NetworkManager networkManager = NetworkManager.authenticate(credentials, credentials.defaultSubscriptionId());

        VirtualNetwork network = networkManager.virtualNetworks().define(networkName)
                .withRegion(region)
                .withExistingResourceGroup(resourceGroupName)
                .withAddressSpace(new AddressSpace().withAddressPrefixes(Collections.singletonList(primaryNetworkSpace)))
                .withSubnets(Collections.singletonList(
                        new SubnetInner()
                                .withName("subnet1")
                                .withAddressPrefix(primaryNetworkSpace)
                ))
                .create();


        NetworkInterface networkInterface = networkManager.networkInterfaces().defineNetworkInterface(networkInterfaceName)
                    .withRegion(region)
                    .withExistingResourceGroup(resourceGroupName)
                    .withIpConfigurations(Collections.singletonList(
                            new NetworkInterfaceIPConfigurationInner()
                                    .withName("primary")
                                    .withPrimary(true)
                                    .withSubnet(network.subnets().get(0).inner())
                    ))
                    .create();

        ComputeManager manager = ComputeManager.authenticate(credentials, credentials.defaultSubscriptionId());

        manager.virtualMachines()
                .defineVirtualMachine(virtualMachineName)
                .withExistingResourceGroup(resourceGroupName)
                .withLocation(region)
                .withHardwareProfile(new HardwareProfile()
                    .withVmSize(VirtualMachineSizeTypes.BASIC_A0))
                .withStorageProfile(new StorageProfile()
                    .withImageReference(new ImageReference()
                        .withPublisher("Canonical")
                        .withOffer("UbuntuServer")
                        .withSku("16.04.0-LTS")
                        .withVersion("latest")))
                .withOsProfile(new OSProfile()
                    .withComputerName(virtualMachineName)
                    .withAdminUsername(rootUsername)
                    .withAdminPassword(rootPassword))
                .withNetworkProfile(new NetworkProfile()
                    .withNetworkInterfaces(Collections.singletonList(
                            (NetworkInterfaceReference) new NetworkInterfaceReference()
                                    .withPrimary(true)
                                    .withId(networkInterface.id())
                    )))
                .create();

        // All above required parameters need pre-knowledge to set since there is no work flow about them.

        // It could only be known after you put a request to service.
        // Then, service will tell you some fields are required but you didn't set.
    }

    public static void main(String[] args) throws Exception {
        AzureTokenCredentials credentials = getCredentials();
        synchronousOperateVM(credentials, System.getenv("PASSWORD"));
    }
}
