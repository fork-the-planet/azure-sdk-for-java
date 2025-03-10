// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managedapplications.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.managedapplications.fluent.models.ApplicationDefinitionInner;
import com.azure.resourcemanager.managedapplications.models.ApplicationDefinitionPatchable;

/**
 * An instance of this class provides access to all the operations defined in ApplicationDefinitionsClient.
 */
public interface ApplicationDefinitionsClient {
    /**
     * Gets the managed application definition.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationDefinitionName The name of the managed application definition.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the managed application definition along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ApplicationDefinitionInner> getByResourceGroupWithResponse(String resourceGroupName,
        String applicationDefinitionName, Context context);

    /**
     * Gets the managed application definition.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationDefinitionName The name of the managed application definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the managed application definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApplicationDefinitionInner getByResourceGroup(String resourceGroupName, String applicationDefinitionName);

    /**
     * Deletes the managed application definition.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationDefinitionName The name of the managed application definition.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String resourceGroupName, String applicationDefinitionName, Context context);

    /**
     * Deletes the managed application definition.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationDefinitionName The name of the managed application definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String applicationDefinitionName);

    /**
     * Creates or updates a managed application definition.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationDefinitionName The name of the managed application definition.
     * @param parameters Parameters supplied to the create or update an managed application definition.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about managed application definition along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ApplicationDefinitionInner> createOrUpdateWithResponse(String resourceGroupName,
        String applicationDefinitionName, ApplicationDefinitionInner parameters, Context context);

    /**
     * Creates or updates a managed application definition.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationDefinitionName The name of the managed application definition.
     * @param parameters Parameters supplied to the create or update an managed application definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about managed application definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApplicationDefinitionInner createOrUpdate(String resourceGroupName, String applicationDefinitionName,
        ApplicationDefinitionInner parameters);

    /**
     * Updates the managed application definition.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationDefinitionName The name of the managed application definition.
     * @param parameters Parameters supplied to the update a managed application definition.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about managed application definition along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ApplicationDefinitionInner> updateWithResponse(String resourceGroupName, String applicationDefinitionName,
        ApplicationDefinitionPatchable parameters, Context context);

    /**
     * Updates the managed application definition.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationDefinitionName The name of the managed application definition.
     * @param parameters Parameters supplied to the update a managed application definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about managed application definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApplicationDefinitionInner update(String resourceGroupName, String applicationDefinitionName,
        ApplicationDefinitionPatchable parameters);

    /**
     * Lists the managed application definitions in a resource group.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of managed application definitions as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ApplicationDefinitionInner> listByResourceGroup(String resourceGroupName);

    /**
     * Lists the managed application definitions in a resource group.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of managed application definitions as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ApplicationDefinitionInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Lists all the application definitions within a subscription.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of managed application definitions as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ApplicationDefinitionInner> list();

    /**
     * Lists all the application definitions within a subscription.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of managed application definitions as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ApplicationDefinitionInner> list(Context context);

    /**
     * Gets the managed application definition.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationDefinitionName The name of the managed application definition.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the managed application definition along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ApplicationDefinitionInner> getByIdWithResponse(String resourceGroupName, String applicationDefinitionName,
        Context context);

    /**
     * Gets the managed application definition.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationDefinitionName The name of the managed application definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the managed application definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApplicationDefinitionInner getById(String resourceGroupName, String applicationDefinitionName);

    /**
     * Deletes the managed application definition.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationDefinitionName The name of the managed application definition.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteByIdWithResponse(String resourceGroupName, String applicationDefinitionName, Context context);

    /**
     * Deletes the managed application definition.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationDefinitionName The name of the managed application definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void deleteById(String resourceGroupName, String applicationDefinitionName);

    /**
     * Creates or updates a managed application definition.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationDefinitionName The name of the managed application definition.
     * @param parameters Parameters supplied to the create or update a managed application definition.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about managed application definition along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ApplicationDefinitionInner> createOrUpdateByIdWithResponse(String resourceGroupName,
        String applicationDefinitionName, ApplicationDefinitionInner parameters, Context context);

    /**
     * Creates or updates a managed application definition.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationDefinitionName The name of the managed application definition.
     * @param parameters Parameters supplied to the create or update a managed application definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about managed application definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApplicationDefinitionInner createOrUpdateById(String resourceGroupName, String applicationDefinitionName,
        ApplicationDefinitionInner parameters);

    /**
     * Updates the managed application definition.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationDefinitionName The name of the managed application definition.
     * @param parameters Parameters supplied to the update a managed application definition.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about managed application definition along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ApplicationDefinitionInner> updateByIdWithResponse(String resourceGroupName,
        String applicationDefinitionName, ApplicationDefinitionPatchable parameters, Context context);

    /**
     * Updates the managed application definition.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationDefinitionName The name of the managed application definition.
     * @param parameters Parameters supplied to the update a managed application definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about managed application definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApplicationDefinitionInner updateById(String resourceGroupName, String applicationDefinitionName,
        ApplicationDefinitionPatchable parameters);
}
