// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.v2.core.traits;

import com.azure.v2.core.credentials.AzureNamedKeyCredential;

/**
 * An {@link com.azure.v2.core.traits Azure SDK for Java trait} providing a consistent interface for setting
 * {@link AzureNamedKeyCredential}. Refer to the Azure SDK for Java
 * <a href="https://aka.ms/azsdk/java/docs/identity">identity and authentication</a>
 * documentation for more details on proper usage of the {@link AzureNamedKeyCredential} type.
 *
 * @param <T> The concrete type that implements the trait. This is required so that fluent operations can continue
 * to return the concrete type, rather than the trait type.
 * @see com.azure.v2.core.traits
 * @see AzureNamedKeyCredential
 */
public interface AzureNamedKeyCredentialTrait<T extends AzureNamedKeyCredentialTrait<T>> {
    /**
     * Sets the {@link AzureNamedKeyCredential} used for authentication. Refer to the Azure SDK for Java
     * <a href="https://aka.ms/azsdk/java/docs/identity">identity and authentication</a>
     * documentation for more details on proper usage of the {@link AzureNamedKeyCredential} type.
     *
     * @param credential the {@link AzureNamedKeyCredential} to be used for authentication.
     * @return Returns the same concrete type with the appropriate properties updated, to allow for fluent chaining of
     *      operations.
     */
    T credential(AzureNamedKeyCredential credential);
}
