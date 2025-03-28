// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.vmwarecloudsimple.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of VirtualMachineTemplates.
 */
public interface VirtualMachineTemplates {
    /**
     * Implements list of available VM templates
     * 
     * Returns list of virtual machine templates in region for private cloud.
     * 
     * @param pcName The private cloud name.
     * @param regionId The region Id (westus, eastus).
     * @param resourcePoolName Resource pool used to derive vSphere cluster which contains VM templates.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of virtual machine templates as paginated response with {@link PagedIterable}.
     */
    PagedIterable<VirtualMachineTemplate> list(String pcName, String regionId, String resourcePoolName);

    /**
     * Implements list of available VM templates
     * 
     * Returns list of virtual machine templates in region for private cloud.
     * 
     * @param pcName The private cloud name.
     * @param regionId The region Id (westus, eastus).
     * @param resourcePoolName Resource pool used to derive vSphere cluster which contains VM templates.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of virtual machine templates as paginated response with {@link PagedIterable}.
     */
    PagedIterable<VirtualMachineTemplate> list(String pcName, String regionId, String resourcePoolName,
        Context context);

    /**
     * Implements virtual machine template GET method
     * 
     * Returns virtual machine templates by its name.
     * 
     * @param regionId The region Id (westus, eastus).
     * @param pcName The private cloud name.
     * @param virtualMachineTemplateName virtual machine template id (vsphereId).
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtual machine template model along with {@link Response}.
     */
    Response<VirtualMachineTemplate> getWithResponse(String regionId, String pcName, String virtualMachineTemplateName,
        Context context);

    /**
     * Implements virtual machine template GET method
     * 
     * Returns virtual machine templates by its name.
     * 
     * @param regionId The region Id (westus, eastus).
     * @param pcName The private cloud name.
     * @param virtualMachineTemplateName virtual machine template id (vsphereId).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtual machine template model.
     */
    VirtualMachineTemplate get(String regionId, String pcName, String virtualMachineTemplateName);
}
