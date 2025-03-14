// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iotfirmwaredefense.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.iotfirmwaredefense.fluent.models.FirmwareInner;
import java.io.IOException;
import java.util.List;

/**
 * List of firmwares.
 */
@Fluent
public final class FirmwareList implements JsonSerializable<FirmwareList> {
    /*
     * The list of firmwares.
     */
    private List<FirmwareInner> value;

    /*
     * The uri to fetch the next page of asset.
     */
    private String nextLink;

    /**
     * Creates an instance of FirmwareList class.
     */
    public FirmwareList() {
    }

    /**
     * Get the value property: The list of firmwares.
     * 
     * @return the value value.
     */
    public List<FirmwareInner> value() {
        return this.value;
    }

    /**
     * Get the nextLink property: The uri to fetch the next page of asset.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The uri to fetch the next page of asset.
     * 
     * @param nextLink the nextLink value to set.
     * @return the FirmwareList object itself.
     */
    public FirmwareList withNextLink(String nextLink) {
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
        jsonWriter.writeStringField("nextLink", this.nextLink);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of FirmwareList from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of FirmwareList if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the FirmwareList.
     */
    public static FirmwareList fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            FirmwareList deserializedFirmwareList = new FirmwareList();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<FirmwareInner> value = reader.readArray(reader1 -> FirmwareInner.fromJson(reader1));
                    deserializedFirmwareList.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedFirmwareList.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedFirmwareList;
        });
    }
}
