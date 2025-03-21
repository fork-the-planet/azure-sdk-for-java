// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.mediaservices.fluent.models.EdgePoliciesInner;
import com.azure.resourcemanager.mediaservices.fluent.models.MediaServiceInner;
import com.azure.resourcemanager.mediaservices.models.ListEdgePoliciesInput;
import com.azure.resourcemanager.mediaservices.models.MediaServiceUpdate;
import com.azure.resourcemanager.mediaservices.models.SyncStorageKeysInput;

/**
 * An instance of this class provides access to all the operations defined in MediaservicesClient.
 */
public interface MediaservicesClient {
    /**
     * List Media Services accounts
     * 
     * List Media Services accounts in the resource group.
     * 
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a collection of MediaService items as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<MediaServiceInner> listByResourceGroup(String resourceGroupName);

    /**
     * List Media Services accounts
     * 
     * List Media Services accounts in the resource group.
     * 
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a collection of MediaService items as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<MediaServiceInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Get a Media Services account
     * 
     * Get the details of a Media Services account.
     * 
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of a Media Services account along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<MediaServiceInner> getByResourceGroupWithResponse(String resourceGroupName, String accountName,
        Context context);

    /**
     * Get a Media Services account
     * 
     * Get the details of a Media Services account.
     * 
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of a Media Services account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    MediaServiceInner getByResourceGroup(String resourceGroupName, String accountName);

    /**
     * Create or update a Media Services account
     * 
     * Creates or updates a Media Services account.
     * 
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param parameters The request parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of a Media Services account.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<MediaServiceInner>, MediaServiceInner> beginCreateOrUpdate(String resourceGroupName,
        String accountName, MediaServiceInner parameters);

    /**
     * Create or update a Media Services account
     * 
     * Creates or updates a Media Services account.
     * 
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param parameters The request parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of a Media Services account.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<MediaServiceInner>, MediaServiceInner> beginCreateOrUpdate(String resourceGroupName,
        String accountName, MediaServiceInner parameters, Context context);

    /**
     * Create or update a Media Services account
     * 
     * Creates or updates a Media Services account.
     * 
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param parameters The request parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Media Services account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    MediaServiceInner createOrUpdate(String resourceGroupName, String accountName, MediaServiceInner parameters);

    /**
     * Create or update a Media Services account
     * 
     * Creates or updates a Media Services account.
     * 
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param parameters The request parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Media Services account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    MediaServiceInner createOrUpdate(String resourceGroupName, String accountName, MediaServiceInner parameters,
        Context context);

    /**
     * Delete a Media Services account.
     * 
     * Deletes a Media Services account.
     * 
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String resourceGroupName, String accountName, Context context);

    /**
     * Delete a Media Services account.
     * 
     * Deletes a Media Services account.
     * 
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String accountName);

    /**
     * Update a Media Services account
     * 
     * Updates an existing Media Services account.
     * 
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param parameters The request parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of a Media Services account.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<MediaServiceInner>, MediaServiceInner> beginUpdate(String resourceGroupName,
        String accountName, MediaServiceUpdate parameters);

    /**
     * Update a Media Services account
     * 
     * Updates an existing Media Services account.
     * 
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param parameters The request parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of a Media Services account.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<MediaServiceInner>, MediaServiceInner> beginUpdate(String resourceGroupName,
        String accountName, MediaServiceUpdate parameters, Context context);

    /**
     * Update a Media Services account
     * 
     * Updates an existing Media Services account.
     * 
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param parameters The request parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Media Services account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    MediaServiceInner update(String resourceGroupName, String accountName, MediaServiceUpdate parameters);

    /**
     * Update a Media Services account
     * 
     * Updates an existing Media Services account.
     * 
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param parameters The request parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Media Services account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    MediaServiceInner update(String resourceGroupName, String accountName, MediaServiceUpdate parameters,
        Context context);

    /**
     * Synchronizes Storage Account Keys
     * 
     * Synchronizes storage account keys for a storage account associated with the Media Service account.
     * 
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param parameters The request parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> syncStorageKeysWithResponse(String resourceGroupName, String accountName,
        SyncStorageKeysInput parameters, Context context);

    /**
     * Synchronizes Storage Account Keys
     * 
     * Synchronizes storage account keys for a storage account associated with the Media Service account.
     * 
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param parameters The request parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void syncStorageKeys(String resourceGroupName, String accountName, SyncStorageKeysInput parameters);

    /**
     * List the media edge policies associated with the Media Services account.
     * 
     * List all the media edge policies associated with the Media Services account.
     * 
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param parameters The request parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<EdgePoliciesInner> listEdgePoliciesWithResponse(String resourceGroupName, String accountName,
        ListEdgePoliciesInput parameters, Context context);

    /**
     * List the media edge policies associated with the Media Services account.
     * 
     * List all the media edge policies associated with the Media Services account.
     * 
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param parameters The request parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    EdgePoliciesInner listEdgePolicies(String resourceGroupName, String accountName, ListEdgePoliciesInput parameters);

    /**
     * List Media Services accounts
     * 
     * List Media Services accounts in the subscription.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a collection of MediaService items as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<MediaServiceInner> list();

    /**
     * List Media Services accounts
     * 
     * List Media Services accounts in the subscription.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a collection of MediaService items as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<MediaServiceInner> list(Context context);
}
