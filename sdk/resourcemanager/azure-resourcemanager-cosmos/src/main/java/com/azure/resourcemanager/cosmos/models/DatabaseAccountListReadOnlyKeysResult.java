// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.resourcemanager.cosmos.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.cosmos.fluent.models.DatabaseAccountListReadOnlyKeysResultInner;
import com.azure.resourcemanager.resources.fluentcore.model.HasInnerModel;

/** An immutable client-side representation of an Azure Cosmos DB DatabaseAccountListReadOnlyKeysResult. */
@Fluent
public interface DatabaseAccountListReadOnlyKeysResult
    extends HasInnerModel<DatabaseAccountListReadOnlyKeysResultInner> {
    /**
     * Gets Base 64 encoded value of the primary read-only key.
     *
     * @return Base 64 encoded value of the primary read-only key.
     */
    String primaryReadonlyMasterKey();

    /**
     * Gets Base 64 encoded value of the secondary read-only key.
     *
     * @return Base 64 encoded value of the secondary read-only key.
     */
    String secondaryReadonlyMasterKey();
}
