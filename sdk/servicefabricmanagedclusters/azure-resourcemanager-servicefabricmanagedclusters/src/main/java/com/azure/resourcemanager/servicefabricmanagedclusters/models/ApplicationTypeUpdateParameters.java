// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.servicefabricmanagedclusters.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.Map;

/**
 * Application type update request.
 */
@Fluent
public final class ApplicationTypeUpdateParameters implements JsonSerializable<ApplicationTypeUpdateParameters> {
    /*
     * Application type update parameters
     */
    private Map<String, String> tags;

    /**
     * Creates an instance of ApplicationTypeUpdateParameters class.
     */
    public ApplicationTypeUpdateParameters() {
    }

    /**
     * Get the tags property: Application type update parameters.
     * 
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Application type update parameters.
     * 
     * @param tags the tags value to set.
     * @return the ApplicationTypeUpdateParameters object itself.
     */
    public ApplicationTypeUpdateParameters withTags(Map<String, String> tags) {
        this.tags = tags;
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
        jsonWriter.writeMapField("tags", this.tags, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ApplicationTypeUpdateParameters from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ApplicationTypeUpdateParameters if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ApplicationTypeUpdateParameters.
     */
    public static ApplicationTypeUpdateParameters fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ApplicationTypeUpdateParameters deserializedApplicationTypeUpdateParameters
                = new ApplicationTypeUpdateParameters();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedApplicationTypeUpdateParameters.tags = tags;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedApplicationTypeUpdateParameters;
        });
    }
}
