// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.Map;

/**
 * Properties pertaining to the UnknownTarget.
 */
@Fluent
public final class UnknownTarget implements JsonSerializable<UnknownTarget> {
    /*
     * Dictionary of string->string pairs containing information about the Storage Target.
     */
    private Map<String, String> attributes;

    /**
     * Creates an instance of UnknownTarget class.
     */
    public UnknownTarget() {
    }

    /**
     * Get the attributes property: Dictionary of string-&gt;string pairs containing information about the Storage
     * Target.
     * 
     * @return the attributes value.
     */
    public Map<String, String> attributes() {
        return this.attributes;
    }

    /**
     * Set the attributes property: Dictionary of string-&gt;string pairs containing information about the Storage
     * Target.
     * 
     * @param attributes the attributes value to set.
     * @return the UnknownTarget object itself.
     */
    public UnknownTarget withAttributes(Map<String, String> attributes) {
        this.attributes = attributes;
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
        jsonWriter.writeMapField("attributes", this.attributes, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of UnknownTarget from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of UnknownTarget if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the UnknownTarget.
     */
    public static UnknownTarget fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            UnknownTarget deserializedUnknownTarget = new UnknownTarget();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("attributes".equals(fieldName)) {
                    Map<String, String> attributes = reader.readMap(reader1 -> reader1.getString());
                    deserializedUnknownTarget.attributes = attributes;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedUnknownTarget;
        });
    }
}
