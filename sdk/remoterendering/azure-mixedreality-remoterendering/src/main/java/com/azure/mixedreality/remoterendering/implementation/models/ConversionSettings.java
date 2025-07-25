// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.mixedreality.remoterendering.implementation.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Conversion settings describe the origin of input files and destination of output files.
 */
@Immutable
public final class ConversionSettings implements JsonSerializable<ConversionSettings> {
    /*
     * Conversion input settings describe the origin of conversion input.
     */
    @Generated
    private final ConversionInputSettings inputLocation;

    /*
     * Conversion output settings describe the destination of conversion output.
     */
    @Generated
    private final ConversionOutputSettings outputLocation;

    /**
     * Creates an instance of ConversionSettings class.
     * 
     * @param inputLocation the inputLocation value to set.
     * @param outputLocation the outputLocation value to set.
     */
    @Generated
    public ConversionSettings(ConversionInputSettings inputLocation, ConversionOutputSettings outputLocation) {
        this.inputLocation = inputLocation;
        this.outputLocation = outputLocation;
    }

    /**
     * Get the inputLocation property: Conversion input settings describe the origin of conversion input.
     * 
     * @return the inputLocation value.
     */
    @Generated
    public ConversionInputSettings getInputLocation() {
        return this.inputLocation;
    }

    /**
     * Get the outputLocation property: Conversion output settings describe the destination of conversion output.
     * 
     * @return the outputLocation value.
     */
    @Generated
    public ConversionOutputSettings getOutputLocation() {
        return this.outputLocation;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("inputLocation", this.inputLocation);
        jsonWriter.writeJsonField("outputLocation", this.outputLocation);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ConversionSettings from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ConversionSettings if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ConversionSettings.
     */
    @Generated
    public static ConversionSettings fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            boolean inputLocationFound = false;
            ConversionInputSettings inputLocation = null;
            boolean outputLocationFound = false;
            ConversionOutputSettings outputLocation = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("inputLocation".equals(fieldName)) {
                    inputLocation = ConversionInputSettings.fromJson(reader);
                    inputLocationFound = true;
                } else if ("outputLocation".equals(fieldName)) {
                    outputLocation = ConversionOutputSettings.fromJson(reader);
                    outputLocationFound = true;
                } else {
                    reader.skipChildren();
                }
            }
            if (inputLocationFound && outputLocationFound) {
                return new ConversionSettings(inputLocation, outputLocation);
            }
            List<String> missingProperties = new ArrayList<>();
            if (!inputLocationFound) {
                missingProperties.add("inputLocation");
            }
            if (!outputLocationFound) {
                missingProperties.add("outputLocation");
            }

            throw new IllegalStateException(
                "Missing required property/properties: " + String.join(", ", missingProperties));
        });
    }
}
