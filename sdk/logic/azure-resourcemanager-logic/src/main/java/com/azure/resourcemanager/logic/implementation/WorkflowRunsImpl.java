// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.logic.fluent.WorkflowRunsClient;
import com.azure.resourcemanager.logic.fluent.models.WorkflowRunInner;
import com.azure.resourcemanager.logic.models.WorkflowRun;
import com.azure.resourcemanager.logic.models.WorkflowRuns;

public final class WorkflowRunsImpl implements WorkflowRuns {
    private static final ClientLogger LOGGER = new ClientLogger(WorkflowRunsImpl.class);

    private final WorkflowRunsClient innerClient;

    private final com.azure.resourcemanager.logic.LogicManager serviceManager;

    public WorkflowRunsImpl(WorkflowRunsClient innerClient,
        com.azure.resourcemanager.logic.LogicManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<WorkflowRun> list(String resourceGroupName, String workflowName) {
        PagedIterable<WorkflowRunInner> inner = this.serviceClient().list(resourceGroupName, workflowName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new WorkflowRunImpl(inner1, this.manager()));
    }

    public PagedIterable<WorkflowRun> list(String resourceGroupName, String workflowName, Integer top, String filter,
        Context context) {
        PagedIterable<WorkflowRunInner> inner
            = this.serviceClient().list(resourceGroupName, workflowName, top, filter, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new WorkflowRunImpl(inner1, this.manager()));
    }

    public Response<WorkflowRun> getWithResponse(String resourceGroupName, String workflowName, String runName,
        Context context) {
        Response<WorkflowRunInner> inner
            = this.serviceClient().getWithResponse(resourceGroupName, workflowName, runName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new WorkflowRunImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public WorkflowRun get(String resourceGroupName, String workflowName, String runName) {
        WorkflowRunInner inner = this.serviceClient().get(resourceGroupName, workflowName, runName);
        if (inner != null) {
            return new WorkflowRunImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Void> cancelWithResponse(String resourceGroupName, String workflowName, String runName,
        Context context) {
        return this.serviceClient().cancelWithResponse(resourceGroupName, workflowName, runName, context);
    }

    public void cancel(String resourceGroupName, String workflowName, String runName) {
        this.serviceClient().cancel(resourceGroupName, workflowName, runName);
    }

    private WorkflowRunsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.logic.LogicManager manager() {
        return this.serviceManager;
    }
}
