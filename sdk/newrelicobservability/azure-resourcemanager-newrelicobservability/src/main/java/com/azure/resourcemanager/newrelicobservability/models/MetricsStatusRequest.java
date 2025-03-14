// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.newrelicobservability.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Request of get metrics status Operation.
 */
@Fluent
public final class MetricsStatusRequest implements JsonSerializable<MetricsStatusRequest> {
    /*
     * Azure resource IDs
     */
    private List<String> azureResourceIds;

    /*
     * User Email
     */
    private String userEmail;

    /**
     * Creates an instance of MetricsStatusRequest class.
     */
    public MetricsStatusRequest() {
    }

    /**
     * Get the azureResourceIds property: Azure resource IDs.
     * 
     * @return the azureResourceIds value.
     */
    public List<String> azureResourceIds() {
        return this.azureResourceIds;
    }

    /**
     * Set the azureResourceIds property: Azure resource IDs.
     * 
     * @param azureResourceIds the azureResourceIds value to set.
     * @return the MetricsStatusRequest object itself.
     */
    public MetricsStatusRequest withAzureResourceIds(List<String> azureResourceIds) {
        this.azureResourceIds = azureResourceIds;
        return this;
    }

    /**
     * Get the userEmail property: User Email.
     * 
     * @return the userEmail value.
     */
    public String userEmail() {
        return this.userEmail;
    }

    /**
     * Set the userEmail property: User Email.
     * 
     * @param userEmail the userEmail value to set.
     * @return the MetricsStatusRequest object itself.
     */
    public MetricsStatusRequest withUserEmail(String userEmail) {
        this.userEmail = userEmail;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (userEmail() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property userEmail in model MetricsStatusRequest"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(MetricsStatusRequest.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("userEmail", this.userEmail);
        jsonWriter.writeArrayField("azureResourceIds", this.azureResourceIds,
            (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MetricsStatusRequest from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MetricsStatusRequest if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the MetricsStatusRequest.
     */
    public static MetricsStatusRequest fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MetricsStatusRequest deserializedMetricsStatusRequest = new MetricsStatusRequest();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("userEmail".equals(fieldName)) {
                    deserializedMetricsStatusRequest.userEmail = reader.getString();
                } else if ("azureResourceIds".equals(fieldName)) {
                    List<String> azureResourceIds = reader.readArray(reader1 -> reader1.getString());
                    deserializedMetricsStatusRequest.azureResourceIds = azureResourceIds;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedMetricsStatusRequest;
        });
    }
}
