// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.connectedvmware.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.connectedvmware.fluent.VirtualMachineInstancesClient;
import com.azure.resourcemanager.connectedvmware.fluent.models.VirtualMachineInstanceInner;
import com.azure.resourcemanager.connectedvmware.models.StopVirtualMachineOptions;
import com.azure.resourcemanager.connectedvmware.models.VirtualMachineInstance;
import com.azure.resourcemanager.connectedvmware.models.VirtualMachineInstanceUpdate;
import com.azure.resourcemanager.connectedvmware.models.VirtualMachineInstances;

public final class VirtualMachineInstancesImpl implements VirtualMachineInstances {
    private static final ClientLogger LOGGER = new ClientLogger(VirtualMachineInstancesImpl.class);

    private final VirtualMachineInstancesClient innerClient;

    private final com.azure.resourcemanager.connectedvmware.ConnectedVMwareManager serviceManager;

    public VirtualMachineInstancesImpl(VirtualMachineInstancesClient innerClient,
        com.azure.resourcemanager.connectedvmware.ConnectedVMwareManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public VirtualMachineInstance createOrUpdate(String resourceUri) {
        VirtualMachineInstanceInner inner = this.serviceClient().createOrUpdate(resourceUri);
        if (inner != null) {
            return new VirtualMachineInstanceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public VirtualMachineInstance createOrUpdate(String resourceUri, VirtualMachineInstanceInner body,
        Context context) {
        VirtualMachineInstanceInner inner = this.serviceClient().createOrUpdate(resourceUri, body, context);
        if (inner != null) {
            return new VirtualMachineInstanceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<VirtualMachineInstance> getWithResponse(String resourceUri, Context context) {
        Response<VirtualMachineInstanceInner> inner = this.serviceClient().getWithResponse(resourceUri, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new VirtualMachineInstanceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public VirtualMachineInstance get(String resourceUri) {
        VirtualMachineInstanceInner inner = this.serviceClient().get(resourceUri);
        if (inner != null) {
            return new VirtualMachineInstanceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public VirtualMachineInstance update(String resourceUri) {
        VirtualMachineInstanceInner inner = this.serviceClient().update(resourceUri);
        if (inner != null) {
            return new VirtualMachineInstanceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public VirtualMachineInstance update(String resourceUri, VirtualMachineInstanceUpdate body, Context context) {
        VirtualMachineInstanceInner inner = this.serviceClient().update(resourceUri, body, context);
        if (inner != null) {
            return new VirtualMachineInstanceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void delete(String resourceUri) {
        this.serviceClient().delete(resourceUri);
    }

    public void delete(String resourceUri, Boolean deleteFromHost, Boolean force, Context context) {
        this.serviceClient().delete(resourceUri, deleteFromHost, force, context);
    }

    public PagedIterable<VirtualMachineInstance> list(String resourceUri) {
        PagedIterable<VirtualMachineInstanceInner> inner = this.serviceClient().list(resourceUri);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new VirtualMachineInstanceImpl(inner1, this.manager()));
    }

    public PagedIterable<VirtualMachineInstance> list(String resourceUri, Context context) {
        PagedIterable<VirtualMachineInstanceInner> inner = this.serviceClient().list(resourceUri, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new VirtualMachineInstanceImpl(inner1, this.manager()));
    }

    public void stop(String resourceUri) {
        this.serviceClient().stop(resourceUri);
    }

    public void stop(String resourceUri, StopVirtualMachineOptions body, Context context) {
        this.serviceClient().stop(resourceUri, body, context);
    }

    public void start(String resourceUri) {
        this.serviceClient().start(resourceUri);
    }

    public void start(String resourceUri, Context context) {
        this.serviceClient().start(resourceUri, context);
    }

    public void restart(String resourceUri) {
        this.serviceClient().restart(resourceUri);
    }

    public void restart(String resourceUri, Context context) {
        this.serviceClient().restart(resourceUri, context);
    }

    private VirtualMachineInstancesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.connectedvmware.ConnectedVMwareManager manager() {
        return this.serviceManager;
    }
}
