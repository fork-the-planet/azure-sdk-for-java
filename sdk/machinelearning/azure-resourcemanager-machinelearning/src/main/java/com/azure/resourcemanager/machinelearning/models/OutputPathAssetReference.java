// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Reference to an asset via its path in a job output.
 */
@Fluent
public final class OutputPathAssetReference extends AssetReferenceBase {
    /*
     * [Required] Specifies the type of asset reference.
     */
    private ReferenceType referenceType = ReferenceType.OUTPUT_PATH;

    /*
     * The path of the file/directory in the job output.
     */
    private String path;

    /*
     * ARM resource ID of the job.
     */
    private String jobId;

    /**
     * Creates an instance of OutputPathAssetReference class.
     */
    public OutputPathAssetReference() {
    }

    /**
     * Get the referenceType property: [Required] Specifies the type of asset reference.
     * 
     * @return the referenceType value.
     */
    @Override
    public ReferenceType referenceType() {
        return this.referenceType;
    }

    /**
     * Get the path property: The path of the file/directory in the job output.
     * 
     * @return the path value.
     */
    public String path() {
        return this.path;
    }

    /**
     * Set the path property: The path of the file/directory in the job output.
     * 
     * @param path the path value to set.
     * @return the OutputPathAssetReference object itself.
     */
    public OutputPathAssetReference withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * Get the jobId property: ARM resource ID of the job.
     * 
     * @return the jobId value.
     */
    public String jobId() {
        return this.jobId;
    }

    /**
     * Set the jobId property: ARM resource ID of the job.
     * 
     * @param jobId the jobId value to set.
     * @return the OutputPathAssetReference object itself.
     */
    public OutputPathAssetReference withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("referenceType", this.referenceType == null ? null : this.referenceType.toString());
        jsonWriter.writeStringField("path", this.path);
        jsonWriter.writeStringField("jobId", this.jobId);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of OutputPathAssetReference from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of OutputPathAssetReference if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the OutputPathAssetReference.
     */
    public static OutputPathAssetReference fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            OutputPathAssetReference deserializedOutputPathAssetReference = new OutputPathAssetReference();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("referenceType".equals(fieldName)) {
                    deserializedOutputPathAssetReference.referenceType = ReferenceType.fromString(reader.getString());
                } else if ("path".equals(fieldName)) {
                    deserializedOutputPathAssetReference.path = reader.getString();
                } else if ("jobId".equals(fieldName)) {
                    deserializedOutputPathAssetReference.jobId = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedOutputPathAssetReference;
        });
    }
}
