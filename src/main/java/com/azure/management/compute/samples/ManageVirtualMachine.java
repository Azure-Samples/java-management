// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.management.compute.samples;

import com.azure.core.credential.TokenCredential;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.exception.ManagementException;
import com.azure.identity.DefaultAzureCredentialBuilder;
import com.azure.management.Azure;
import com.azure.management.compute.KnownLinuxVirtualMachineImage;
import com.azure.management.compute.VirtualMachine;
import com.azure.management.network.Network;
import com.azure.management.resources.ResourceGroup;
import com.azure.management.resources.fluentcore.arm.Region;
import com.azure.management.resources.fluentcore.model.Indexable;
import com.azure.management.resources.fluentcore.profile.AzureProfile;

import java.io.IOException;
import java.time.Duration;
import java.util.UUID;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


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
        final String rootUsername = "test";

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

        // update virtual machine
        vm.update()
                .withTag("test", "sample")
                .apply();

        // restart virtual machine
        vm.restart();

        // list virtual machine
        azure.virtualMachines().listByResourceGroup(resourceGroupName)
                .forEach(vm1 -> System.out.println(vm1.name()));
        // for (VirtualMachine vm1 : azure.virtualMachines().listByResourceGroup(resourceGroupName)) {
        //     System.out.println(vm1.name());
        // }

        // delete virtual machine
        azure.virtualMachines().deleteById(vm.id());
        // azure.virtualMachines().deleteByResourceGroup(resourceGroupName, virtualMachineName);

        // delete resource group
        azure.resourceGroups().beginDeleteByName(resourceGroupName);
    }

    public static void asynchronousOperateVM(Azure azure, String rootPassword) {
        Flux<Indexable> vm1 = azure.virtualMachines().define("vm1")
                .withRegion(Region.US_WEST)
                .withNewResourceGroup("randomRG")
                .withNewPrimaryNetwork("10.1.0.0/24")
                .withPrimaryPrivateIPAddressDynamic()
                .withoutPrimaryPublicIPAddress()
                .withPopularLinuxImage(KnownLinuxVirtualMachineImage.UBUNTU_SERVER_16_04_LTS)
                .withRootUsername("username")
                .withRootPassword(rootPassword)
                .createAsync();

        Flux<Indexable> vm2 = azure.virtualMachines().define("vm2")
                .withRegion(Region.US_WEST)
                .withNewResourceGroup("randomRG")
                .withNewPrimaryNetwork("10.1.1.0/24")
                .withPrimaryPrivateIPAddressDynamic()
                .withoutPrimaryPublicIPAddress()
                .withPopularLinuxImage(KnownLinuxVirtualMachineImage.UBUNTU_SERVER_16_04_LTS)
                .withRootUsername("username")
                .withRootPassword(rootPassword)
                .createAsync();

        Flux.merge(vm1, Mono.delay(Duration.ofSeconds(1)).thenMany(vm2))
                .doOnNext(indexable -> {
                    if (indexable instanceof VirtualMachine) {
                        System.out.printf("Created virtual machine %s\n", ((VirtualMachine) indexable).name());
                    }
                })
                .blockLast();
    }

    public static void errorHandling(Azure azure) {
        final String resourceGroupName = randomString("rg", 8);
        final String networkName = randomString("net", 8);
        final Region region = Region.US_WEST;

        try {
            azure.resourceGroups().getByName(resourceGroupName);

            azure.networks().define(networkName)
                    .withRegion(region)
                    .withExistingResourceGroup(resourceGroupName)
                    .withAddressSpace("")
                    .create();
        } catch (ManagementException e) {
            System.err.printf("Catch ManagementException %d: %s\n", e.getResponse().getStatusCode(), e);
        }
    }

    public static void main() throws Exception {
        Azure azure = authentication();
        synchronousOperateVM(azure, System.getenv("PASSWORD"));
        asynchronousOperateVM(azure, System.getenv("PASSWORD"));
        errorHandling(azure);
    }
}
