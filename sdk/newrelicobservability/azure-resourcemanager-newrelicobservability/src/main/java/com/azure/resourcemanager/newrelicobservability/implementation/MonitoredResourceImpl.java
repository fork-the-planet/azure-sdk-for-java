// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.newrelicobservability.implementation;

import com.azure.resourcemanager.newrelicobservability.fluent.models.MonitoredResourceInner;
import com.azure.resourcemanager.newrelicobservability.models.MonitoredResource;
import com.azure.resourcemanager.newrelicobservability.models.SendingLogsStatus;
import com.azure.resourcemanager.newrelicobservability.models.SendingMetricsStatus;

public final class MonitoredResourceImpl implements MonitoredResource {
    private MonitoredResourceInner innerObject;

    private final com.azure.resourcemanager.newrelicobservability.NewRelicObservabilityManager serviceManager;

    MonitoredResourceImpl(
        MonitoredResourceInner innerObject,
        com.azure.resourcemanager.newrelicobservability.NewRelicObservabilityManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public SendingMetricsStatus sendingMetrics() {
        return this.innerModel().sendingMetrics();
    }

    public String reasonForMetricsStatus() {
        return this.innerModel().reasonForMetricsStatus();
    }

    public SendingLogsStatus sendingLogs() {
        return this.innerModel().sendingLogs();
    }

    public String reasonForLogsStatus() {
        return this.innerModel().reasonForLogsStatus();
    }

    public MonitoredResourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.newrelicobservability.NewRelicObservabilityManager manager() {
        return this.serviceManager;
    }
}