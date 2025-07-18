// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * The data stored in Optimized Row Columnar (ORC) format.
 */
@Fluent
public final class OrcFormat extends DatasetStorageFormat {
    /*
     * Type of dataset storage format.
     */
    @Generated
    private String type = "OrcFormat";

    /**
     * Creates an instance of OrcFormat class.
     */
    @Generated
    public OrcFormat() {
    }

    /**
     * Get the type property: Type of dataset storage format.
     * 
     * @return the type value.
     */
    @Generated
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public OrcFormat setSerializer(Object serializer) {
        super.setSerializer(serializer);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public OrcFormat setDeserializer(Object deserializer) {
        super.setDeserializer(deserializer);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        if (getSerializer() != null) {
            jsonWriter.writeUntypedField("serializer", getSerializer());
        }
        if (getDeserializer() != null) {
            jsonWriter.writeUntypedField("deserializer", getDeserializer());
        }
        jsonWriter.writeStringField("type", this.type);
        if (getAdditionalProperties() != null) {
            for (Map.Entry<String, Object> additionalProperty : getAdditionalProperties().entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of OrcFormat from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of OrcFormat if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IOException If an error occurs while reading the OrcFormat.
     */
    @Generated
    public static OrcFormat fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            OrcFormat deserializedOrcFormat = new OrcFormat();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("serializer".equals(fieldName)) {
                    deserializedOrcFormat.setSerializer(reader.readUntyped());
                } else if ("deserializer".equals(fieldName)) {
                    deserializedOrcFormat.setDeserializer(reader.readUntyped());
                } else if ("type".equals(fieldName)) {
                    deserializedOrcFormat.type = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedOrcFormat.setAdditionalProperties(additionalProperties);

            return deserializedOrcFormat;
        });
    }
}
