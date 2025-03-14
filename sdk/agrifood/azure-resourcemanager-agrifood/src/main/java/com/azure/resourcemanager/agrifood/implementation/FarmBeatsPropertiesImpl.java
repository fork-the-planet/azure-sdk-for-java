// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.agrifood.implementation;

import com.azure.resourcemanager.agrifood.fluent.models.FarmBeatsPropertiesInner;
import com.azure.resourcemanager.agrifood.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.agrifood.models.FarmBeatsProperties;
import com.azure.resourcemanager.agrifood.models.PrivateEndpointConnection;
import com.azure.resourcemanager.agrifood.models.ProvisioningState;
import com.azure.resourcemanager.agrifood.models.PublicNetworkAccess;
import com.azure.resourcemanager.agrifood.models.SensorIntegration;

public final class FarmBeatsPropertiesImpl implements FarmBeatsProperties {
    private FarmBeatsPropertiesInner innerObject;

    private final com.azure.resourcemanager.agrifood.AgriFoodManager serviceManager;

    FarmBeatsPropertiesImpl(FarmBeatsPropertiesInner innerObject,
        com.azure.resourcemanager.agrifood.AgriFoodManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String instanceUri() {
        return this.innerModel().instanceUri();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public SensorIntegration sensorIntegration() {
        return this.innerModel().sensorIntegration();
    }

    public PublicNetworkAccess publicNetworkAccess() {
        return this.innerModel().publicNetworkAccess();
    }

    public PrivateEndpointConnection privateEndpointConnections() {
        PrivateEndpointConnectionInner inner = this.innerModel().privateEndpointConnections();
        if (inner != null) {
            return new PrivateEndpointConnectionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public FarmBeatsPropertiesInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.agrifood.AgriFoodManager manager() {
        return this.serviceManager;
    }
}
