// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.management.compute.samples;

import com.azure.core.credential.TokenCredential;
import com.azure.core.management.AzureEnvironment;
import com.azure.identity.DefaultAzureCredentialBuilder;
import com.azure.management.Azure;
import com.azure.management.compute.KnownLinuxVirtualMachineImage;
import com.azure.management.compute.VirtualMachine;
import com.azure.management.resources.fluentcore.arm.Region;
import com.azure.management.resources.fluentcore.profile.AzureProfile;

import java.io.IOException;
import java.util.UUID;

public class ManageVirtualMachine {
    public static String randomString(String prefix, int len) {
        return prefix + UUID.randomUUID().toString().replace("-", "").substring(0, len - prefix.length());
    }

    public static Azure authentication() throws IOException {
        TokenCredential credential = new DefaultAzureCredentialBuilder().build();
        AzureProfile profile = new AzureProfile(AzureEnvironment.AZURE, true);

        return Azure.authenticate(credential, profile).withDefaultSubscription();
    }

    public static void synchronousOperateVM(Azure azure, String rootPassword) throws IOException {
        final String resourceGroupName = randomString("rg", 8);
        final String virtualMachineName = randomString("vm", 8);
        final Region region = Region.US_WEST;
        final String primaryNetworkSpace = "10.0.0.0/24";
        final String dnsPrefix = randomString("ds", 8);
        final String rootUsername = "testUser";

        // This is the usage of dnsPrefix
        // final String vmIp = String.format("%s.%s.cloudapp.azure.com", dnsPrefix, region);

        // create virtual machine
        VirtualMachine vm = azure.virtualMachines().define(virtualMachineName)
                .withRegion(region)
                .withNewResourceGroup(resourceGroupName)
                .withNewPrimaryNetwork(primaryNetworkSpace)
                .withPrimaryPrivateIPAddressDynamic()
                .withNewPrimaryPublicIPAddress(dnsPrefix)
                .withPopularLinuxImage(KnownLinuxVirtualMachineImage.UBUNTU_SERVER_16_04_LTS)
                .withRootUsername(rootUsername)
                .withRootPassword(rootPassword)
                .create();
        // you could add more options before create if you like
    }

    public static void main(String[] args) throws Exception {
        Azure azure = authentication();
        synchronousOperateVM(azure, System.getenv("PASSWORD"));
    }
}
