// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.network.NetworkManager;
import com.azure.resourcemanager.resources.fluentcore.arm.collection.SupportsDeletingByResourceGroup;
import com.azure.resourcemanager.resources.fluentcore.arm.collection.SupportsGettingById;
import com.azure.resourcemanager.resources.fluentcore.arm.collection.SupportsGettingByResourceGroup;
import com.azure.resourcemanager.resources.fluentcore.arm.collection.SupportsListingByResourceGroup;
import com.azure.resourcemanager.resources.fluentcore.arm.models.HasManager;
import com.azure.resourcemanager.resources.fluentcore.collection.SupportsCreating;
import com.azure.resourcemanager.resources.fluentcore.collection.SupportsDeletingById;
import com.azure.resourcemanager.resources.fluentcore.collection.SupportsListing;

/** Entry point to local network gateways management API in Azure. */
@Fluent
public interface LocalNetworkGateways extends SupportsCreating<LocalNetworkGateway.DefinitionStages.Blank>,
    SupportsListing<LocalNetworkGateway>, SupportsListingByResourceGroup<LocalNetworkGateway>,
    SupportsGettingByResourceGroup<LocalNetworkGateway>, SupportsGettingById<LocalNetworkGateway>, SupportsDeletingById,
    SupportsDeletingByResourceGroup, HasManager<NetworkManager> {
}
