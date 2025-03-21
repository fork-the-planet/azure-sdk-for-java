// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.impactreporting.implementation;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.impactreporting.fluent.models.InsightInner;
import com.azure.resourcemanager.impactreporting.models.Insight;
import com.azure.resourcemanager.impactreporting.models.InsightProperties;

public final class InsightImpl implements Insight, Insight.Definition {
    private InsightInner innerObject;

    private final com.azure.resourcemanager.impactreporting.ImpactReportingManager serviceManager;

    InsightImpl(InsightInner innerObject,
        com.azure.resourcemanager.impactreporting.ImpactReportingManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public InsightProperties properties() {
        return this.innerModel().properties();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public InsightInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.impactreporting.ImpactReportingManager manager() {
        return this.serviceManager;
    }

    private String workloadImpactName;

    private String insightName;

    public InsightImpl withExistingWorkloadImpact(String workloadImpactName) {
        this.workloadImpactName = workloadImpactName;
        return this;
    }

    public Insight create() {
        this.innerObject = serviceManager.serviceClient()
            .getInsights()
            .createWithResponse(workloadImpactName, insightName, this.innerModel(), Context.NONE)
            .getValue();
        return this;
    }

    public Insight create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getInsights()
            .createWithResponse(workloadImpactName, insightName, this.innerModel(), context)
            .getValue();
        return this;
    }

    InsightImpl(String name, com.azure.resourcemanager.impactreporting.ImpactReportingManager serviceManager) {
        this.innerObject = new InsightInner();
        this.serviceManager = serviceManager;
        this.insightName = name;
    }

    public Insight refresh() {
        this.innerObject = serviceManager.serviceClient()
            .getInsights()
            .getWithResponse(workloadImpactName, insightName, Context.NONE)
            .getValue();
        return this;
    }

    public Insight refresh(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getInsights()
            .getWithResponse(workloadImpactName, insightName, context)
            .getValue();
        return this;
    }

    public InsightImpl withProperties(InsightProperties properties) {
        this.innerModel().withProperties(properties);
        return this;
    }
}
