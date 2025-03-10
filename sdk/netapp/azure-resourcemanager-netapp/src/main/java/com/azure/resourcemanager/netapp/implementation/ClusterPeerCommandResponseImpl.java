// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.implementation;

import com.azure.resourcemanager.netapp.fluent.models.ClusterPeerCommandResponseInner;
import com.azure.resourcemanager.netapp.models.ClusterPeerCommandResponse;

public final class ClusterPeerCommandResponseImpl implements ClusterPeerCommandResponse {
    private ClusterPeerCommandResponseInner innerObject;

    private final com.azure.resourcemanager.netapp.NetAppFilesManager serviceManager;

    ClusterPeerCommandResponseImpl(ClusterPeerCommandResponseInner innerObject,
        com.azure.resourcemanager.netapp.NetAppFilesManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String peerAcceptCommand() {
        return this.innerModel().peerAcceptCommand();
    }

    public ClusterPeerCommandResponseInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.netapp.NetAppFilesManager manager() {
        return this.serviceManager;
    }
}
