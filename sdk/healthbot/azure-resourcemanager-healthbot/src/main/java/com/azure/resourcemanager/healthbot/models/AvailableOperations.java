// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthbot.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.healthbot.fluent.models.OperationDetailInner;
import java.io.IOException;
import java.util.List;

/**
 * Available operations of the service.
 */
@Fluent
public final class AvailableOperations implements JsonSerializable<AvailableOperations> {
    /*
     * Collection of available operation details
     */
    private List<OperationDetailInner> value;

    /*
     * URL client should use to fetch the next page (per server side paging).
     * It's null for now, added for future use.
     */
    private String nextLink;

    /**
     * Creates an instance of AvailableOperations class.
     */
    public AvailableOperations() {
    }

    /**
     * Get the value property: Collection of available operation details.
     * 
     * @return the value value.
     */
    public List<OperationDetailInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Collection of available operation details.
     * 
     * @param value the value value to set.
     * @return the AvailableOperations object itself.
     */
    public AvailableOperations withValue(List<OperationDetailInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: URL client should use to fetch the next page (per server side paging).
     * It's null for now, added for future use.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: URL client should use to fetch the next page (per server side paging).
     * It's null for now, added for future use.
     * 
     * @param nextLink the nextLink value to set.
     * @return the AvailableOperations object itself.
     */
    public AvailableOperations withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("nextLink", this.nextLink);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AvailableOperations from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AvailableOperations if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the AvailableOperations.
     */
    public static AvailableOperations fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AvailableOperations deserializedAvailableOperations = new AvailableOperations();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<OperationDetailInner> value
                        = reader.readArray(reader1 -> OperationDetailInner.fromJson(reader1));
                    deserializedAvailableOperations.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedAvailableOperations.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAvailableOperations;
        });
    }
}
