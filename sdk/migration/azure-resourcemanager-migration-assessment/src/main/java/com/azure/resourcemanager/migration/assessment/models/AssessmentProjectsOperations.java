// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.migration.assessment.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of AssessmentProjectsOperations.
 */
public interface AssessmentProjectsOperations {
    /**
     * List AssessmentProject resources by subscription ID.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a AssessmentProject list operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<AssessmentProject> list();

    /**
     * List AssessmentProject resources by subscription ID.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a AssessmentProject list operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<AssessmentProject> list(Context context);

    /**
     * List AssessmentProject resources by resource group.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a AssessmentProject list operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<AssessmentProject> listByResourceGroup(String resourceGroupName);

    /**
     * List AssessmentProject resources by resource group.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a AssessmentProject list operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<AssessmentProject> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Get a AssessmentProject.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param projectName Assessment Project Name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a AssessmentProject along with {@link Response}.
     */
    Response<AssessmentProject> getByResourceGroupWithResponse(String resourceGroupName, String projectName,
        Context context);

    /**
     * Get a AssessmentProject.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param projectName Assessment Project Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a AssessmentProject.
     */
    AssessmentProject getByResourceGroup(String resourceGroupName, String projectName);

    /**
     * Delete a AssessmentProject.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param projectName Assessment Project Name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteByResourceGroupWithResponse(String resourceGroupName, String projectName, Context context);

    /**
     * Delete a AssessmentProject.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param projectName Assessment Project Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String projectName);

    /**
     * Get a AssessmentProject.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a AssessmentProject along with {@link Response}.
     */
    AssessmentProject getById(String id);

    /**
     * Get a AssessmentProject.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a AssessmentProject along with {@link Response}.
     */
    Response<AssessmentProject> getByIdWithResponse(String id, Context context);

    /**
     * Delete a AssessmentProject.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Delete a AssessmentProject.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new AssessmentProject resource.
     * 
     * @param name resource name.
     * @return the first stage of the new AssessmentProject definition.
     */
    AssessmentProject.DefinitionStages.Blank define(String name);
}
