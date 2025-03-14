// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import java.util.List;

/**
 * Resource collection API of Workbooks.
 */
public interface Workbooks {
    /**
     * Get all Workbooks defined within a specified subscription and category.
     * 
     * @param category Category of workbook to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.applicationinsights.models.WorkbookErrorDefinitionException thrown if the
     * request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all Workbooks defined within a specified subscription and category as paginated response with
     * {@link PagedIterable}.
     */
    PagedIterable<Workbook> list(CategoryType category);

    /**
     * Get all Workbooks defined within a specified subscription and category.
     * 
     * @param category Category of workbook to return.
     * @param tags Tags presents on each workbook returned.
     * @param canFetchContent Flag indicating whether or not to return the full content for each applicable workbook. If
     * false, only return summary content for workbooks.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.applicationinsights.models.WorkbookErrorDefinitionException thrown if the
     * request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all Workbooks defined within a specified subscription and category as paginated response with
     * {@link PagedIterable}.
     */
    PagedIterable<Workbook> list(CategoryType category, List<String> tags, Boolean canFetchContent, Context context);

    /**
     * Get all Workbooks defined within a specified resource group and category.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param category Category of workbook to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.applicationinsights.models.WorkbookErrorDefinitionException thrown if the
     * request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all Workbooks defined within a specified resource group and category as paginated response with
     * {@link PagedIterable}.
     */
    PagedIterable<Workbook> listByResourceGroup(String resourceGroupName, CategoryType category);

    /**
     * Get all Workbooks defined within a specified resource group and category.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param category Category of workbook to return.
     * @param tags Tags presents on each workbook returned.
     * @param sourceId Azure Resource Id that will fetch all linked workbooks.
     * @param canFetchContent Flag indicating whether or not to return the full content for each applicable workbook. If
     * false, only return summary content for workbooks.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.applicationinsights.models.WorkbookErrorDefinitionException thrown if the
     * request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all Workbooks defined within a specified resource group and category as paginated response with
     * {@link PagedIterable}.
     */
    PagedIterable<Workbook> listByResourceGroup(String resourceGroupName, CategoryType category, List<String> tags,
        String sourceId, Boolean canFetchContent, Context context);

    /**
     * Get a single workbook by its resourceName.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the workbook resource. The value must be an UUID.
     * @param canFetchContent Flag indicating whether or not to return the full content for each applicable workbook. If
     * false, only return summary content for workbooks.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.applicationinsights.models.WorkbookErrorDefinitionException thrown if the
     * request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a single workbook by its resourceName along with {@link Response}.
     */
    Response<Workbook> getByResourceGroupWithResponse(String resourceGroupName, String resourceName,
        Boolean canFetchContent, Context context);

    /**
     * Get a single workbook by its resourceName.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the workbook resource. The value must be an UUID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.applicationinsights.models.WorkbookErrorDefinitionException thrown if the
     * request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a single workbook by its resourceName.
     */
    Workbook getByResourceGroup(String resourceGroupName, String resourceName);

    /**
     * Delete a workbook.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the workbook resource. The value must be an UUID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.applicationinsights.models.WorkbookErrorDefinitionException thrown if the
     * request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteByResourceGroupWithResponse(String resourceGroupName, String resourceName, Context context);

    /**
     * Delete a workbook.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the workbook resource. The value must be an UUID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.applicationinsights.models.WorkbookErrorDefinitionException thrown if the
     * request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String resourceName);

    /**
     * Get the revisions for the workbook defined by its resourceName.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the workbook resource. The value must be an UUID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.applicationinsights.models.WorkbookErrorDefinitionException thrown if the
     * request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the revisions for the workbook defined by its resourceName as paginated response with
     * {@link PagedIterable}.
     */
    PagedIterable<Workbook> revisionsList(String resourceGroupName, String resourceName);

    /**
     * Get the revisions for the workbook defined by its resourceName.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the workbook resource. The value must be an UUID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.applicationinsights.models.WorkbookErrorDefinitionException thrown if the
     * request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the revisions for the workbook defined by its resourceName as paginated response with
     * {@link PagedIterable}.
     */
    PagedIterable<Workbook> revisionsList(String resourceGroupName, String resourceName, Context context);

    /**
     * Get a single workbook revision defined by its revisionId.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the workbook resource. The value must be an UUID.
     * @param revisionId The id of the workbook's revision.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.applicationinsights.models.WorkbookErrorDefinitionException thrown if the
     * request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a single workbook revision defined by its revisionId along with {@link Response}.
     */
    Response<Workbook> revisionGetWithResponse(String resourceGroupName, String resourceName, String revisionId,
        Context context);

    /**
     * Get a single workbook revision defined by its revisionId.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the workbook resource. The value must be an UUID.
     * @param revisionId The id of the workbook's revision.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.applicationinsights.models.WorkbookErrorDefinitionException thrown if the
     * request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a single workbook revision defined by its revisionId.
     */
    Workbook revisionGet(String resourceGroupName, String resourceName, String revisionId);

    /**
     * Get a single workbook by its resourceName.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.applicationinsights.models.WorkbookErrorDefinitionException thrown if the
     * request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a single workbook by its resourceName along with {@link Response}.
     */
    Workbook getById(String id);

    /**
     * Get a single workbook by its resourceName.
     * 
     * @param id the resource ID.
     * @param canFetchContent Flag indicating whether or not to return the full content for each applicable workbook. If
     * false, only return summary content for workbooks.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.applicationinsights.models.WorkbookErrorDefinitionException thrown if the
     * request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a single workbook by its resourceName along with {@link Response}.
     */
    Response<Workbook> getByIdWithResponse(String id, Boolean canFetchContent, Context context);

    /**
     * Delete a workbook.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.applicationinsights.models.WorkbookErrorDefinitionException thrown if the
     * request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Delete a workbook.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.applicationinsights.models.WorkbookErrorDefinitionException thrown if the
     * request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new Workbook resource.
     * 
     * @param name resource name.
     * @return the first stage of the new Workbook definition.
     */
    Workbook.DefinitionStages.Blank define(String name);
}
