// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.purview.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.purview.models.AccountSku;
import com.azure.resourcemanager.purview.models.Name;
import org.junit.jupiter.api.Assertions;

public final class AccountSkuTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AccountSku model
            = BinaryData.fromString("{\"capacity\":666664165,\"name\":\"Standard\"}").toObject(AccountSku.class);
        Assertions.assertEquals(666664165, model.capacity());
        Assertions.assertEquals(Name.STANDARD, model.name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AccountSku model = new AccountSku().withCapacity(666664165).withName(Name.STANDARD);
        model = BinaryData.fromObject(model).toObject(AccountSku.class);
        Assertions.assertEquals(666664165, model.capacity());
        Assertions.assertEquals(Name.STANDARD, model.name());
    }
}
