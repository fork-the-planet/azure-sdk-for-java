// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Represents capability of a storage tier.
 */
@Immutable
public final class StorageTierCapability extends CapabilityBase {
    /*
     * Name to represent Storage tier capability
     */
    private String name;

    /*
     * Supported IOPS for this storage tier
     */
    private Integer iops;

    /*
     * The reason for the capability not being available.
     */
    private String reason;

    /*
     * The status of the capability.
     */
    private CapabilityStatus status;

    /**
     * Creates an instance of StorageTierCapability class.
     */
    public StorageTierCapability() {
    }

    /**
     * Get the name property: Name to represent Storage tier capability.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the iops property: Supported IOPS for this storage tier.
     * 
     * @return the iops value.
     */
    public Integer iops() {
        return this.iops;
    }

    /**
     * Get the reason property: The reason for the capability not being available.
     * 
     * @return the reason value.
     */
    @Override
    public String reason() {
        return this.reason;
    }

    /**
     * Get the status property: The status of the capability.
     * 
     * @return the status value.
     */
    @Override
    public CapabilityStatus status() {
        return this.status;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
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
     * Reads an instance of StorageTierCapability from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of StorageTierCapability if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the StorageTierCapability.
     */
    public static StorageTierCapability fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            StorageTierCapability deserializedStorageTierCapability = new StorageTierCapability();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("status".equals(fieldName)) {
                    deserializedStorageTierCapability.status = CapabilityStatus.fromString(reader.getString());
                } else if ("reason".equals(fieldName)) {
                    deserializedStorageTierCapability.reason = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedStorageTierCapability.name = reader.getString();
                } else if ("iops".equals(fieldName)) {
                    deserializedStorageTierCapability.iops = reader.getNullable(JsonReader::getInt);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedStorageTierCapability;
        });
    }
}
