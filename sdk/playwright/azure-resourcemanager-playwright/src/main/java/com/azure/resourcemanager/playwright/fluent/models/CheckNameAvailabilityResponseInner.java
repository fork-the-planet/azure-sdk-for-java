// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.playwright.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.playwright.models.CheckNameAvailabilityReason;
import java.io.IOException;

/**
 * The check availability result.
 */
@Immutable
public final class CheckNameAvailabilityResponseInner implements JsonSerializable<CheckNameAvailabilityResponseInner> {
    /*
     * Indicates if the resource name is available.
     */
    private Boolean nameAvailable;

    /*
     * The reason why the given name is not available.
     */
    private CheckNameAvailabilityReason reason;

    /*
     * Detailed reason why the given name is not available.
     */
    private String message;

    /**
     * Creates an instance of CheckNameAvailabilityResponseInner class.
     */
    private CheckNameAvailabilityResponseInner() {
    }

    /**
     * Get the nameAvailable property: Indicates if the resource name is available.
     * 
     * @return the nameAvailable value.
     */
    public Boolean nameAvailable() {
        return this.nameAvailable;
    }

    /**
     * Get the reason property: The reason why the given name is not available.
     * 
     * @return the reason value.
     */
    public CheckNameAvailabilityReason reason() {
        return this.reason;
    }

    /**
     * Get the message property: Detailed reason why the given name is not available.
     * 
     * @return the message value.
     */
    public String message() {
        return this.message;
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
        jsonWriter.writeBooleanField("nameAvailable", this.nameAvailable);
        jsonWriter.writeStringField("reason", this.reason == null ? null : this.reason.toString());
        jsonWriter.writeStringField("message", this.message);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CheckNameAvailabilityResponseInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CheckNameAvailabilityResponseInner if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the CheckNameAvailabilityResponseInner.
     */
    public static CheckNameAvailabilityResponseInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CheckNameAvailabilityResponseInner deserializedCheckNameAvailabilityResponseInner
                = new CheckNameAvailabilityResponseInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("nameAvailable".equals(fieldName)) {
                    deserializedCheckNameAvailabilityResponseInner.nameAvailable
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("reason".equals(fieldName)) {
                    deserializedCheckNameAvailabilityResponseInner.reason
                        = CheckNameAvailabilityReason.fromString(reader.getString());
                } else if ("message".equals(fieldName)) {
                    deserializedCheckNameAvailabilityResponseInner.message = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCheckNameAvailabilityResponseInner;
        });
    }
}
