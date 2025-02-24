// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.azurestack.fluent.models.RegistrationInner;
import java.io.IOException;
import java.util.List;

/**
 * Pageable list of registrations.
 */
@Fluent
public final class RegistrationList implements JsonSerializable<RegistrationList> {
    /*
     * URI to the next page.
     */
    private String nextLink;

    /*
     * List of Registrations
     */
    private List<RegistrationInner> value;

    /**
     * Creates an instance of RegistrationList class.
     */
    public RegistrationList() {
    }

    /**
     * Get the nextLink property: URI to the next page.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: URI to the next page.
     * 
     * @param nextLink the nextLink value to set.
     * @return the RegistrationList object itself.
     */
    public RegistrationList withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Get the value property: List of Registrations.
     * 
     * @return the value value.
     */
    public List<RegistrationInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of Registrations.
     * 
     * @param value the value value to set.
     * @return the RegistrationList object itself.
     */
    public RegistrationList withValue(List<RegistrationInner> value) {
        this.value = value;
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
        jsonWriter.writeStringField("nextLink", this.nextLink);
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RegistrationList from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RegistrationList if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the RegistrationList.
     */
    public static RegistrationList fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RegistrationList deserializedRegistrationList = new RegistrationList();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("nextLink".equals(fieldName)) {
                    deserializedRegistrationList.nextLink = reader.getString();
                } else if ("value".equals(fieldName)) {
                    List<RegistrationInner> value = reader.readArray(reader1 -> RegistrationInner.fromJson(reader1));
                    deserializedRegistrationList.value = value;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRegistrationList;
        });
    }
}
