// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.botservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Meta data for the Service Provider.
 */
@Fluent
public final class ServiceProviderParameterMetadata implements JsonSerializable<ServiceProviderParameterMetadata> {
    /*
     * the constraints of the bot meta data.
     */
    private ServiceProviderParameterMetadataConstraints constraints;

    /**
     * Creates an instance of ServiceProviderParameterMetadata class.
     */
    public ServiceProviderParameterMetadata() {
    }

    /**
     * Get the constraints property: the constraints of the bot meta data.
     * 
     * @return the constraints value.
     */
    public ServiceProviderParameterMetadataConstraints constraints() {
        return this.constraints;
    }

    /**
     * Set the constraints property: the constraints of the bot meta data.
     * 
     * @param constraints the constraints value to set.
     * @return the ServiceProviderParameterMetadata object itself.
     */
    public ServiceProviderParameterMetadata withConstraints(ServiceProviderParameterMetadataConstraints constraints) {
        this.constraints = constraints;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (constraints() != null) {
            constraints().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("constraints", this.constraints);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ServiceProviderParameterMetadata from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ServiceProviderParameterMetadata if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ServiceProviderParameterMetadata.
     */
    public static ServiceProviderParameterMetadata fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ServiceProviderParameterMetadata deserializedServiceProviderParameterMetadata
                = new ServiceProviderParameterMetadata();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("constraints".equals(fieldName)) {
                    deserializedServiceProviderParameterMetadata.constraints
                        = ServiceProviderParameterMetadataConstraints.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedServiceProviderParameterMetadata;
        });
    }
}
