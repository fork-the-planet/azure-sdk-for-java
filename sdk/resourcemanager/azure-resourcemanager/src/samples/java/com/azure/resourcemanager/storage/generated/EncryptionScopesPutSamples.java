// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated;

import com.azure.resourcemanager.storage.fluent.models.EncryptionScopeInner;

/**
 * Samples for EncryptionScopes Put.
 */
public final class EncryptionScopesPutSamples {
    /*
     * x-ms-original-file: specification/storage/resource-manager/Microsoft.Storage/stable/2024-01-01/examples/
     * StorageAccountPutEncryptionScopeWithInfrastructureEncryption.json
     */
    /**
     * Sample code: StorageAccountPutEncryptionScopeWithInfrastructureEncryption.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void storageAccountPutEncryptionScopeWithInfrastructureEncryption(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure.storageAccounts()
            .manager()
            .serviceClient()
            .getEncryptionScopes()
            .putWithResponse("resource-group-name", "accountname", "{encryption-scope-name}",
                new EncryptionScopeInner().withRequireInfrastructureEncryption(true), com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/storage/resource-manager/Microsoft.Storage/stable/2024-01-01/examples/
     * StorageAccountPutEncryptionScope.json
     */
    /**
     * Sample code: StorageAccountPutEncryptionScope.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void storageAccountPutEncryptionScope(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.storageAccounts()
            .manager()
            .serviceClient()
            .getEncryptionScopes()
            .putWithResponse("resource-group-name", "accountname", "{encryption-scope-name}",
                new EncryptionScopeInner(), com.azure.core.util.Context.NONE);
    }
}
