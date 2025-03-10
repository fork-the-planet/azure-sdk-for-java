// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loadtesting.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Details about the connection between the Batch service and the endpoint.
 */
@Immutable
public final class EndpointDetail implements JsonSerializable<EndpointDetail> {
    /*
     * The port an endpoint is connected to.
     */
    private Integer port;

    /**
     * Creates an instance of EndpointDetail class.
     */
    public EndpointDetail() {
    }

    /**
     * Get the port property: The port an endpoint is connected to.
     * 
     * @return the port value.
     */
    public Integer port() {
        return this.port;
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
     * Reads an instance of EndpointDetail from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of EndpointDetail if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the EndpointDetail.
     */
    public static EndpointDetail fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            EndpointDetail deserializedEndpointDetail = new EndpointDetail();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("port".equals(fieldName)) {
                    deserializedEndpointDetail.port = reader.getNullable(JsonReader::getInt);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedEndpointDetail;
        });
    }
}
