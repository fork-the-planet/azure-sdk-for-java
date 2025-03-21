// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.cosmos.fluent.models.ThroughputSettingsUpdateProperties;
import java.io.IOException;
import java.util.Map;

/**
 * Parameters to update Cosmos DB resource throughput.
 */
@Fluent
public final class ThroughputSettingsUpdateParameters extends ArmResourceProperties {
    /*
     * Properties to update Azure Cosmos DB resource throughput.
     */
    private ThroughputSettingsUpdateProperties innerProperties = new ThroughputSettingsUpdateProperties();

    /*
     * The type of the resource.
     */
    private String type;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /**
     * Creates an instance of ThroughputSettingsUpdateParameters class.
     */
    public ThroughputSettingsUpdateParameters() {
    }

    /**
     * Get the innerProperties property: Properties to update Azure Cosmos DB resource throughput.
     * 
     * @return the innerProperties value.
     */
    private ThroughputSettingsUpdateProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThroughputSettingsUpdateParameters withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThroughputSettingsUpdateParameters withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the resource property: The standard JSON format of a resource throughput.
     * 
     * @return the resource value.
     */
    public ThroughputSettingsResource resource() {
        return this.innerProperties() == null ? null : this.innerProperties().resource();
    }

    /**
     * Set the resource property: The standard JSON format of a resource throughput.
     * 
     * @param resource the resource value to set.
     * @return the ThroughputSettingsUpdateParameters object itself.
     */
    public ThroughputSettingsUpdateParameters withResource(ThroughputSettingsResource resource) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ThroughputSettingsUpdateProperties();
        }
        this.innerProperties().withResource(resource);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (innerProperties() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property innerProperties in model ThroughputSettingsUpdateParameters"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ThroughputSettingsUpdateParameters.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("location", location());
        jsonWriter.writeMapField("tags", tags(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ThroughputSettingsUpdateParameters from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ThroughputSettingsUpdateParameters if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ThroughputSettingsUpdateParameters.
     */
    public static ThroughputSettingsUpdateParameters fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ThroughputSettingsUpdateParameters deserializedThroughputSettingsUpdateParameters
                = new ThroughputSettingsUpdateParameters();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedThroughputSettingsUpdateParameters.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedThroughputSettingsUpdateParameters.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedThroughputSettingsUpdateParameters.type = reader.getString();
                } else if ("location".equals(fieldName)) {
                    deserializedThroughputSettingsUpdateParameters.withLocation(reader.getString());
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedThroughputSettingsUpdateParameters.withTags(tags);
                } else if ("properties".equals(fieldName)) {
                    deserializedThroughputSettingsUpdateParameters.innerProperties
                        = ThroughputSettingsUpdateProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedThroughputSettingsUpdateParameters;
        });
    }
}
