// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.apimanagement.fluent.models.GatewayHostnameConfigurationContractInner;
import java.io.IOException;
import java.util.List;

/**
 * Paged Gateway hostname configuration list representation.
 */
@Immutable
public final class GatewayHostnameConfigurationCollection
    implements JsonSerializable<GatewayHostnameConfigurationCollection> {
    /*
     * Page values.
     */
    private List<GatewayHostnameConfigurationContractInner> value;

    /*
     * Next page link if any.
     */
    private String nextLink;

    /**
     * Creates an instance of GatewayHostnameConfigurationCollection class.
     */
    public GatewayHostnameConfigurationCollection() {
    }

    /**
     * Get the value property: Page values.
     * 
     * @return the value value.
     */
    public List<GatewayHostnameConfigurationContractInner> value() {
        return this.value;
    }

    /**
     * Get the nextLink property: Next page link if any.
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
     * Reads an instance of GatewayHostnameConfigurationCollection from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of GatewayHostnameConfigurationCollection if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the GatewayHostnameConfigurationCollection.
     */
    public static GatewayHostnameConfigurationCollection fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            GatewayHostnameConfigurationCollection deserializedGatewayHostnameConfigurationCollection
                = new GatewayHostnameConfigurationCollection();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<GatewayHostnameConfigurationContractInner> value
                        = reader.readArray(reader1 -> GatewayHostnameConfigurationContractInner.fromJson(reader1));
                    deserializedGatewayHostnameConfigurationCollection.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedGatewayHostnameConfigurationCollection.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedGatewayHostnameConfigurationCollection;
        });
    }
}
