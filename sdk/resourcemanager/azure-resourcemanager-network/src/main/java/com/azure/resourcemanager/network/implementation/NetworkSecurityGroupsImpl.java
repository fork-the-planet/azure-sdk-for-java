// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.resourcemanager.network.implementation;

import com.azure.core.util.Context;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.network.NetworkManager;
import com.azure.resourcemanager.network.fluent.NetworkSecurityGroupsClient;
import com.azure.resourcemanager.network.fluent.models.NetworkSecurityGroupInner;
import com.azure.resourcemanager.network.models.NetworkSecurityGroup;
import com.azure.resourcemanager.network.models.NetworkSecurityGroups;
import com.azure.resourcemanager.resources.fluentcore.arm.collection.implementation.TopLevelModifiableResourcesImpl;
import com.azure.resourcemanager.resources.fluentcore.utils.ResourceManagerUtils;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** Implementation for NetworkSecurityGroups. */
public class NetworkSecurityGroupsImpl extends
    TopLevelModifiableResourcesImpl<NetworkSecurityGroup, NetworkSecurityGroupImpl, NetworkSecurityGroupInner, NetworkSecurityGroupsClient, NetworkManager>
    implements NetworkSecurityGroups {

    public NetworkSecurityGroupsImpl(final NetworkManager networkManager) {
        super(networkManager.serviceClient().getNetworkSecurityGroups(), networkManager);
    }

    @Override
    public Mono<Void> deleteByResourceGroupAsync(String resourceGroupName, String name) {
        if (CoreUtils.isNullOrEmpty(resourceGroupName)) {
            return Mono
                .error(new IllegalArgumentException("Parameter 'resourceGroupName' is required and cannot be null."));
        }
        if (CoreUtils.isNullOrEmpty(name)) {
            return Mono.error(new IllegalArgumentException("Parameter 'name' is required and cannot be null."));
        }
        // Clear NIC references if any
        return getByResourceGroupAsync(resourceGroupName, name)
            .flatMapMany(nsg -> Flux.fromIterable(nsg.networkInterfaceIds())
                .flatMap(nicRef -> this.manager().networkInterfaces().getByIdAsync(nicRef))
                .flatMap(nic -> {
                    if (nic == null) {
                        return Mono.empty();
                    } else if (!nsg.id().equalsIgnoreCase(nic.networkSecurityGroupId())) {
                        return Mono.empty();
                    } else {
                        return nic.update().withoutNetworkSecurityGroup().applyAsync();
                    }
                }))
            .then(this.deleteInnerAsync(resourceGroupName, name))
            .subscribeOn(ResourceManagerUtils.InternalRuntimeContext.getReactorScheduler());
    }

    @Override
    public NetworkSecurityGroupImpl define(String name) {
        return wrapModel(name);
    }

    // Fluent model create helpers

    @Override
    protected NetworkSecurityGroupImpl wrapModel(String name) {
        NetworkSecurityGroupInner inner = new NetworkSecurityGroupInner();
        return new NetworkSecurityGroupImpl(name, inner, this.manager());
    }

    @Override
    protected NetworkSecurityGroupImpl wrapModel(NetworkSecurityGroupInner inner) {
        if (inner == null) {
            return null;
        }
        return new NetworkSecurityGroupImpl(inner.name(), inner, this.manager());
    }

    @Override
    public NetworkSecurityGroup getByResourceGroup(String resourceGroupName, String name, Context context) {
        return getByResourceGroupAsync(resourceGroupName, name)
            .contextWrite(c -> c.putAll(FluxUtil.toReactorContext(context).readOnly()))
            .block();
    }
}
