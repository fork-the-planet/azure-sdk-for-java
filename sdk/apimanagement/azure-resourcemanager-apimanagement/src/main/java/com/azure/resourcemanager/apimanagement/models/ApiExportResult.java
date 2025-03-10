// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.resourcemanager.apimanagement.fluent.models.ApiExportResultInner;

/**
 * An immutable client-side representation of ApiExportResult.
 */
public interface ApiExportResult {
    /**
     * Gets the id property: ResourceId of the API which was exported.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the exportResultFormat property: Format in which the API Details are exported to the Storage Blob with Sas
     * Key valid for 5 minutes.
     * 
     * @return the exportResultFormat value.
     */
    ExportResultFormat exportResultFormat();

    /**
     * Gets the value property: The object defining the schema of the exported API Detail.
     * 
     * @return the value value.
     */
    ApiExportResultValue value();

    /**
     * Gets the inner com.azure.resourcemanager.apimanagement.fluent.models.ApiExportResultInner object.
     * 
     * @return the inner object.
     */
    ApiExportResultInner innerModel();
}
