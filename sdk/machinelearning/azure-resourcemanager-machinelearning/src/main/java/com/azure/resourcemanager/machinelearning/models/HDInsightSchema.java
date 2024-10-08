// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The HDInsightSchema model.
 */
@Fluent
public class HDInsightSchema implements JsonSerializable<HDInsightSchema> {
    /*
     * HDInsight compute properties
     */
    private HDInsightProperties properties;

    /**
     * Creates an instance of HDInsightSchema class.
     */
    public HDInsightSchema() {
    }

    /**
     * Get the properties property: HDInsight compute properties.
     * 
     * @return the properties value.
     */
    public HDInsightProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: HDInsight compute properties.
     * 
     * @param properties the properties value to set.
     * @return the HDInsightSchema object itself.
     */
    public HDInsightSchema withProperties(HDInsightProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("properties", this.properties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of HDInsightSchema from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of HDInsightSchema if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the HDInsightSchema.
     */
    public static HDInsightSchema fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            HDInsightSchema deserializedHDInsightSchema = new HDInsightSchema();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("properties".equals(fieldName)) {
                    deserializedHDInsightSchema.properties = HDInsightProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedHDInsightSchema;
        });
    }
}
