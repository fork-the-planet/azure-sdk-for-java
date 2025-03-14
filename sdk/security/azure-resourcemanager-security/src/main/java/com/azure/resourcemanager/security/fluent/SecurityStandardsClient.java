// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.security.fluent.models.SecurityStandardInner;

/**
 * An instance of this class provides access to all the operations defined in SecurityStandardsClient.
 */
public interface SecurityStandardsClient {
    /**
     * Get a list of all relevant security standards over a scope.
     * 
     * @param scope The scope of the security standard. Valid scopes are: management group (format:
     * 'providers/Microsoft.Management/managementGroups/{managementGroup}'), subscription (format:
     * 'subscriptions/{subscriptionId}'), or security connector (format:
     * 'subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Security/securityConnectors/{securityConnectorName})'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all relevant security standards over a scope as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SecurityStandardInner> list(String scope);

    /**
     * Get a list of all relevant security standards over a scope.
     * 
     * @param scope The scope of the security standard. Valid scopes are: management group (format:
     * 'providers/Microsoft.Management/managementGroups/{managementGroup}'), subscription (format:
     * 'subscriptions/{subscriptionId}'), or security connector (format:
     * 'subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Security/securityConnectors/{securityConnectorName})'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all relevant security standards over a scope as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SecurityStandardInner> list(String scope, Context context);

    /**
     * Get a specific security standard for the requested scope by standardId.
     * 
     * @param scope The scope of the security standard. Valid scopes are: management group (format:
     * 'providers/Microsoft.Management/managementGroups/{managementGroup}'), subscription (format:
     * 'subscriptions/{subscriptionId}'), or security connector (format:
     * 'subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Security/securityConnectors/{securityConnectorName})'.
     * @param standardId The Security Standard key - unique key for the standard type.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a specific security standard for the requested scope by standardId along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SecurityStandardInner> getWithResponse(String scope, String standardId, Context context);

    /**
     * Get a specific security standard for the requested scope by standardId.
     * 
     * @param scope The scope of the security standard. Valid scopes are: management group (format:
     * 'providers/Microsoft.Management/managementGroups/{managementGroup}'), subscription (format:
     * 'subscriptions/{subscriptionId}'), or security connector (format:
     * 'subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Security/securityConnectors/{securityConnectorName})'.
     * @param standardId The Security Standard key - unique key for the standard type.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a specific security standard for the requested scope by standardId.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SecurityStandardInner get(String scope, String standardId);

    /**
     * Creates or updates a security standard over a given scope.
     * 
     * @param scope The scope of the security standard. Valid scopes are: management group (format:
     * 'providers/Microsoft.Management/managementGroups/{managementGroup}'), subscription (format:
     * 'subscriptions/{subscriptionId}'), or security connector (format:
     * 'subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Security/securityConnectors/{securityConnectorName})'.
     * @param standardId The Security Standard key - unique key for the standard type.
     * @param standard Custom security standard over a pre-defined scope.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return security Standard on a resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SecurityStandardInner> createOrUpdateWithResponse(String scope, String standardId,
        SecurityStandardInner standard, Context context);

    /**
     * Creates or updates a security standard over a given scope.
     * 
     * @param scope The scope of the security standard. Valid scopes are: management group (format:
     * 'providers/Microsoft.Management/managementGroups/{managementGroup}'), subscription (format:
     * 'subscriptions/{subscriptionId}'), or security connector (format:
     * 'subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Security/securityConnectors/{securityConnectorName})'.
     * @param standardId The Security Standard key - unique key for the standard type.
     * @param standard Custom security standard over a pre-defined scope.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return security Standard on a resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SecurityStandardInner createOrUpdate(String scope, String standardId, SecurityStandardInner standard);

    /**
     * Delete a security standard over a given scope.
     * 
     * @param scope The scope of the security standard. Valid scopes are: management group (format:
     * 'providers/Microsoft.Management/managementGroups/{managementGroup}'), subscription (format:
     * 'subscriptions/{subscriptionId}'), or security connector (format:
     * 'subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Security/securityConnectors/{securityConnectorName})'.
     * @param standardId The Security Standard key - unique key for the standard type.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String scope, String standardId, Context context);

    /**
     * Delete a security standard over a given scope.
     * 
     * @param scope The scope of the security standard. Valid scopes are: management group (format:
     * 'providers/Microsoft.Management/managementGroups/{managementGroup}'), subscription (format:
     * 'subscriptions/{subscriptionId}'), or security connector (format:
     * 'subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Security/securityConnectors/{securityConnectorName})'.
     * @param standardId The Security Standard key - unique key for the standard type.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String scope, String standardId);
}
