// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of BareMetalMachineKeySets.
 */
public interface BareMetalMachineKeySets {
    /**
     * List bare metal machine key sets of the cluster.
     * 
     * Get a list of bare metal machine key sets for the provided cluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of bare metal machine key sets for the provided cluster as paginated response with
     * {@link PagedIterable}.
     */
    PagedIterable<BareMetalMachineKeySet> listByCluster(String resourceGroupName, String clusterName);

    /**
     * List bare metal machine key sets of the cluster.
     * 
     * Get a list of bare metal machine key sets for the provided cluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of bare metal machine key sets for the provided cluster as paginated response with
     * {@link PagedIterable}.
     */
    PagedIterable<BareMetalMachineKeySet> listByCluster(String resourceGroupName, String clusterName, Context context);

    /**
     * Retrieve the bare metal machine key set of the cluster.
     * 
     * Get bare metal machine key set of the provided cluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the cluster.
     * @param bareMetalMachineKeySetName The name of the bare metal machine key set.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return bare metal machine key set of the provided cluster along with {@link Response}.
     */
    Response<BareMetalMachineKeySet> getWithResponse(String resourceGroupName, String clusterName,
        String bareMetalMachineKeySetName, Context context);

    /**
     * Retrieve the bare metal machine key set of the cluster.
     * 
     * Get bare metal machine key set of the provided cluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the cluster.
     * @param bareMetalMachineKeySetName The name of the bare metal machine key set.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return bare metal machine key set of the provided cluster.
     */
    BareMetalMachineKeySet get(String resourceGroupName, String clusterName, String bareMetalMachineKeySetName);

    /**
     * Delete the bare metal machine key set of the cluster.
     * 
     * Delete the bare metal machine key set of the provided cluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the cluster.
     * @param bareMetalMachineKeySetName The name of the bare metal machine key set.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the current status of an async operation.
     */
    OperationStatusResult delete(String resourceGroupName, String clusterName, String bareMetalMachineKeySetName);

    /**
     * Delete the bare metal machine key set of the cluster.
     * 
     * Delete the bare metal machine key set of the provided cluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the cluster.
     * @param bareMetalMachineKeySetName The name of the bare metal machine key set.
     * @param ifMatch The ETag of the transformation. Omit this value to always overwrite the current resource. Specify
     * the last-seen ETag value to prevent accidentally overwriting concurrent changes.
     * @param ifNoneMatch Set to '*' to allow a new record set to be created, but to prevent updating an existing
     * resource. Other values will result in error from server as they are not supported.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the current status of an async operation.
     */
    OperationStatusResult delete(String resourceGroupName, String clusterName, String bareMetalMachineKeySetName,
        String ifMatch, String ifNoneMatch, Context context);

    /**
     * Retrieve the bare metal machine key set of the cluster.
     * 
     * Get bare metal machine key set of the provided cluster.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return bare metal machine key set of the provided cluster along with {@link Response}.
     */
    BareMetalMachineKeySet getById(String id);

    /**
     * Retrieve the bare metal machine key set of the cluster.
     * 
     * Get bare metal machine key set of the provided cluster.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return bare metal machine key set of the provided cluster along with {@link Response}.
     */
    Response<BareMetalMachineKeySet> getByIdWithResponse(String id, Context context);

    /**
     * Delete the bare metal machine key set of the cluster.
     * 
     * Delete the bare metal machine key set of the provided cluster.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the current status of an async operation.
     */
    OperationStatusResult deleteById(String id);

    /**
     * Delete the bare metal machine key set of the cluster.
     * 
     * Delete the bare metal machine key set of the provided cluster.
     * 
     * @param id the resource ID.
     * @param ifMatch The ETag of the transformation. Omit this value to always overwrite the current resource. Specify
     * the last-seen ETag value to prevent accidentally overwriting concurrent changes.
     * @param ifNoneMatch Set to '*' to allow a new record set to be created, but to prevent updating an existing
     * resource. Other values will result in error from server as they are not supported.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the current status of an async operation.
     */
    OperationStatusResult deleteByIdWithResponse(String id, String ifMatch, String ifNoneMatch, Context context);

    /**
     * Begins definition for a new BareMetalMachineKeySet resource.
     * 
     * @param name resource name.
     * @return the first stage of the new BareMetalMachineKeySet definition.
     */
    BareMetalMachineKeySet.DefinitionStages.Blank define(String name);
}
