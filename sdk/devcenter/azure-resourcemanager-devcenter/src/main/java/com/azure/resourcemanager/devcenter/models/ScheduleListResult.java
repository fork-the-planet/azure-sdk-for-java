// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.devcenter.fluent.models.ScheduleInner;
import java.io.IOException;
import java.util.List;

/**
 * Result of the schedule list operation.
 */
@Immutable
public final class ScheduleListResult implements JsonSerializable<ScheduleListResult> {
    /*
     * Current page of results.
     */
    private List<ScheduleInner> value;

    /*
     * URL to get the next set of results if there are any.
     */
    private String nextLink;

    /**
     * Creates an instance of ScheduleListResult class.
     */
    public ScheduleListResult() {
    }

    /**
     * Get the value property: Current page of results.
     * 
     * @return the value value.
     */
    public List<ScheduleInner> value() {
        return this.value;
    }

    /**
     * Get the nextLink property: URL to get the next set of results if there are any.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
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
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ScheduleListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ScheduleListResult if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the ScheduleListResult.
     */
    public static ScheduleListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ScheduleListResult deserializedScheduleListResult = new ScheduleListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<ScheduleInner> value = reader.readArray(reader1 -> ScheduleInner.fromJson(reader1));
                    deserializedScheduleListResult.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedScheduleListResult.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedScheduleListResult;
        });
    }
}
