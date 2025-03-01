// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Definition of the endpoint used for ingesting logs.
 */
@Immutable
public class LogsIngestionEndpointSpec implements JsonSerializable<LogsIngestionEndpointSpec> {
    /*
     * The endpoint. This property is READ-ONLY.
     */
    private String endpoint;

    /**
     * Creates an instance of LogsIngestionEndpointSpec class.
     */
    public LogsIngestionEndpointSpec() {
    }

    /**
     * Get the endpoint property: The endpoint. This property is READ-ONLY.
     * 
     * @return the endpoint value.
     */
    public String endpoint() {
        return this.endpoint;
    }

    /**
     * Set the endpoint property: The endpoint. This property is READ-ONLY.
     * 
     * @param endpoint the endpoint value to set.
     * @return the LogsIngestionEndpointSpec object itself.
     */
    LogsIngestionEndpointSpec withEndpoint(String endpoint) {
        this.endpoint = endpoint;
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
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of LogsIngestionEndpointSpec from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of LogsIngestionEndpointSpec if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the LogsIngestionEndpointSpec.
     */
    public static LogsIngestionEndpointSpec fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            LogsIngestionEndpointSpec deserializedLogsIngestionEndpointSpec = new LogsIngestionEndpointSpec();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("endpoint".equals(fieldName)) {
                    deserializedLogsIngestionEndpointSpec.endpoint = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedLogsIngestionEndpointSpec;
        });
    }
}
