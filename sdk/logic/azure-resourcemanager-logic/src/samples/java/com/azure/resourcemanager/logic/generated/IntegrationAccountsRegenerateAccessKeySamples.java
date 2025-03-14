// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.generated;

import com.azure.resourcemanager.logic.models.KeyType;
import com.azure.resourcemanager.logic.models.RegenerateActionParameter;

/**
 * Samples for IntegrationAccounts RegenerateAccessKey.
 */
public final class IntegrationAccountsRegenerateAccessKeySamples {
    /*
     * x-ms-original-file: specification/logic/resource-manager/Microsoft.Logic/stable/2019-05-01/examples/
     * IntegrationAccounts_RegenerateAccessKey.json
     */
    /**
     * Sample code: Regenerate access key.
     * 
     * @param manager Entry point to LogicManager.
     */
    public static void regenerateAccessKey(com.azure.resourcemanager.logic.LogicManager manager) {
        manager.integrationAccounts()
            .regenerateAccessKeyWithResponse("testResourceGroup", "testIntegrationAccount",
                new RegenerateActionParameter().withKeyType(KeyType.PRIMARY), com.azure.core.util.Context.NONE);
    }
}
