// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Settings to be used when associating a project with a catalog.
 */
@Fluent
public final class ProjectCatalogSettings implements JsonSerializable<ProjectCatalogSettings> {
    /*
     * Indicates catalog item types that can be synced.
     */
    private List<CatalogItemType> catalogItemSyncTypes;

    /**
     * Creates an instance of ProjectCatalogSettings class.
     */
    public ProjectCatalogSettings() {
    }

    /**
     * Get the catalogItemSyncTypes property: Indicates catalog item types that can be synced.
     * 
     * @return the catalogItemSyncTypes value.
     */
    public List<CatalogItemType> catalogItemSyncTypes() {
        return this.catalogItemSyncTypes;
    }

    /**
     * Set the catalogItemSyncTypes property: Indicates catalog item types that can be synced.
     * 
     * @param catalogItemSyncTypes the catalogItemSyncTypes value to set.
     * @return the ProjectCatalogSettings object itself.
     */
    public ProjectCatalogSettings withCatalogItemSyncTypes(List<CatalogItemType> catalogItemSyncTypes) {
        this.catalogItemSyncTypes = catalogItemSyncTypes;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("catalogItemSyncTypes", this.catalogItemSyncTypes,
            (writer, element) -> writer.writeString(element == null ? null : element.toString()));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ProjectCatalogSettings from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ProjectCatalogSettings if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ProjectCatalogSettings.
     */
    public static ProjectCatalogSettings fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ProjectCatalogSettings deserializedProjectCatalogSettings = new ProjectCatalogSettings();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("catalogItemSyncTypes".equals(fieldName)) {
                    List<CatalogItemType> catalogItemSyncTypes
                        = reader.readArray(reader1 -> CatalogItemType.fromString(reader1.getString()));
                    deserializedProjectCatalogSettings.catalogItemSyncTypes = catalogItemSyncTypes;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedProjectCatalogSettings;
        });
    }
}
