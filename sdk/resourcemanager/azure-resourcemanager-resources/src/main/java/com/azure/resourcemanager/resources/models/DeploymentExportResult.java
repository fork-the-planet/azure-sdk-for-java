// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.resourcemanager.resources.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.resources.fluentcore.model.HasInnerModel;
import com.azure.resourcemanager.resources.fluent.models.DeploymentExportResultInner;

/**
 * An immutable client-side representation of an Azure deployment template export result.
 */
@Fluent
public interface DeploymentExportResult extends HasInnerModel<DeploymentExportResultInner> {

    /**
     * Gets the template content.
     *
     * @return the template content
     */
    Object template();

    /**
     * Gets the template content as a JSON string.
     * @return the template content as a JSON string
     */
    String templateAsJson();
}
