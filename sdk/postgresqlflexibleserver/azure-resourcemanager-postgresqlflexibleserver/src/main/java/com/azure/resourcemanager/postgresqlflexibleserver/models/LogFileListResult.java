// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.postgresqlflexibleserver.fluent.models.LogFileInner;
import java.io.IOException;
import java.util.List;

/**
 * A List of logFiles.
 */
@Fluent
public final class LogFileListResult implements JsonSerializable<LogFileListResult> {
    /*
     * The list of logFiles in a server
     */
    private List<LogFileInner> value;

    /*
     * The link used to get the next page of operations.
     */
    private String nextLink;

    /**
     * Creates an instance of LogFileListResult class.
     */
    public LogFileListResult() {
    }

    /**
     * Get the value property: The list of logFiles in a server.
     * 
     * @return the value value.
     */
    public List<LogFileInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of logFiles in a server.
     * 
     * @param value the value value to set.
     * @return the LogFileListResult object itself.
     */
    public LogFileListResult withValue(List<LogFileInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The link used to get the next page of operations.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The link used to get the next page of operations.
     * 
     * @param nextLink the nextLink value to set.
     * @return the LogFileListResult object itself.
     */
    public LogFileListResult withNextLink(String nextLink) {
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
     * Reads an instance of LogFileListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of LogFileListResult if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the LogFileListResult.
     */
    public static LogFileListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            LogFileListResult deserializedLogFileListResult = new LogFileListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<LogFileInner> value = reader.readArray(reader1 -> LogFileInner.fromJson(reader1));
                    deserializedLogFileListResult.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedLogFileListResult.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedLogFileListResult;
        });
    }
}
