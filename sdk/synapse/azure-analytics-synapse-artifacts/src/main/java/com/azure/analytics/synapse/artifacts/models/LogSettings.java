// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Log settings.
 */
@Fluent
public final class LogSettings implements JsonSerializable<LogSettings> {
    /*
     * Specifies whether to enable copy activity log. Type: boolean (or Expression with resultType boolean).
     */
    @Generated
    private Object enableCopyActivityLog;

    /*
     * Specifies settings for copy activity log.
     */
    @Generated
    private CopyActivityLogSettings copyActivityLogSettings;

    /*
     * Log location settings customer needs to provide when enabling log.
     */
    @Generated
    private LogLocationSettings logLocationSettings;

    /**
     * Creates an instance of LogSettings class.
     */
    @Generated
    public LogSettings() {
    }

    /**
     * Get the enableCopyActivityLog property: Specifies whether to enable copy activity log. Type: boolean (or
     * Expression with resultType boolean).
     * 
     * @return the enableCopyActivityLog value.
     */
    @Generated
    public Object getEnableCopyActivityLog() {
        return this.enableCopyActivityLog;
    }

    /**
     * Set the enableCopyActivityLog property: Specifies whether to enable copy activity log. Type: boolean (or
     * Expression with resultType boolean).
     * 
     * @param enableCopyActivityLog the enableCopyActivityLog value to set.
     * @return the LogSettings object itself.
     */
    @Generated
    public LogSettings setEnableCopyActivityLog(Object enableCopyActivityLog) {
        this.enableCopyActivityLog = enableCopyActivityLog;
        return this;
    }

    /**
     * Get the copyActivityLogSettings property: Specifies settings for copy activity log.
     * 
     * @return the copyActivityLogSettings value.
     */
    @Generated
    public CopyActivityLogSettings getCopyActivityLogSettings() {
        return this.copyActivityLogSettings;
    }

    /**
     * Set the copyActivityLogSettings property: Specifies settings for copy activity log.
     * 
     * @param copyActivityLogSettings the copyActivityLogSettings value to set.
     * @return the LogSettings object itself.
     */
    @Generated
    public LogSettings setCopyActivityLogSettings(CopyActivityLogSettings copyActivityLogSettings) {
        this.copyActivityLogSettings = copyActivityLogSettings;
        return this;
    }

    /**
     * Get the logLocationSettings property: Log location settings customer needs to provide when enabling log.
     * 
     * @return the logLocationSettings value.
     */
    @Generated
    public LogLocationSettings getLogLocationSettings() {
        return this.logLocationSettings;
    }

    /**
     * Set the logLocationSettings property: Log location settings customer needs to provide when enabling log.
     * 
     * @param logLocationSettings the logLocationSettings value to set.
     * @return the LogSettings object itself.
     */
    @Generated
    public LogSettings setLogLocationSettings(LogLocationSettings logLocationSettings) {
        this.logLocationSettings = logLocationSettings;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("logLocationSettings", this.logLocationSettings);
        if (this.enableCopyActivityLog != null) {
            jsonWriter.writeUntypedField("enableCopyActivityLog", this.enableCopyActivityLog);
        }
        jsonWriter.writeJsonField("copyActivityLogSettings", this.copyActivityLogSettings);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of LogSettings from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of LogSettings if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the LogSettings.
     */
    @Generated
    public static LogSettings fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            LogSettings deserializedLogSettings = new LogSettings();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("logLocationSettings".equals(fieldName)) {
                    deserializedLogSettings.logLocationSettings = LogLocationSettings.fromJson(reader);
                } else if ("enableCopyActivityLog".equals(fieldName)) {
                    deserializedLogSettings.enableCopyActivityLog = reader.readUntyped();
                } else if ("copyActivityLogSettings".equals(fieldName)) {
                    deserializedLogSettings.copyActivityLogSettings = CopyActivityLogSettings.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedLogSettings;
        });
    }
}
