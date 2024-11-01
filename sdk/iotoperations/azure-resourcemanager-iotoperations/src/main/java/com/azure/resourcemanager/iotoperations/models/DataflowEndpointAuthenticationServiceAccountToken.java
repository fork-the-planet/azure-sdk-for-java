// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.iotoperations.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Service Account Token for BrokerAuthentication.
 */
@Fluent
public final class DataflowEndpointAuthenticationServiceAccountToken
    implements JsonSerializable<DataflowEndpointAuthenticationServiceAccountToken> {
    /*
     * Audience of the service account. Optional, defaults to the broker internal service account audience.
     */
    private String audience;

    /**
     * Creates an instance of DataflowEndpointAuthenticationServiceAccountToken class.
     */
    public DataflowEndpointAuthenticationServiceAccountToken() {
    }

    /**
     * Get the audience property: Audience of the service account. Optional, defaults to the broker internal service
     * account audience.
     * 
     * @return the audience value.
     */
    public String audience() {
        return this.audience;
    }

    /**
     * Set the audience property: Audience of the service account. Optional, defaults to the broker internal service
     * account audience.
     * 
     * @param audience the audience value to set.
     * @return the DataflowEndpointAuthenticationServiceAccountToken object itself.
     */
    public DataflowEndpointAuthenticationServiceAccountToken withAudience(String audience) {
        this.audience = audience;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (audience() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property audience in model DataflowEndpointAuthenticationServiceAccountToken"));
        }
    }

    private static final ClientLogger LOGGER
        = new ClientLogger(DataflowEndpointAuthenticationServiceAccountToken.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("audience", this.audience);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DataflowEndpointAuthenticationServiceAccountToken from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DataflowEndpointAuthenticationServiceAccountToken if the JsonReader was pointing to an
     * instance of it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the DataflowEndpointAuthenticationServiceAccountToken.
     */
    public static DataflowEndpointAuthenticationServiceAccountToken fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DataflowEndpointAuthenticationServiceAccountToken deserializedDataflowEndpointAuthenticationServiceAccountToken
                = new DataflowEndpointAuthenticationServiceAccountToken();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("audience".equals(fieldName)) {
                    deserializedDataflowEndpointAuthenticationServiceAccountToken.audience = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDataflowEndpointAuthenticationServiceAccountToken;
        });
    }
}
