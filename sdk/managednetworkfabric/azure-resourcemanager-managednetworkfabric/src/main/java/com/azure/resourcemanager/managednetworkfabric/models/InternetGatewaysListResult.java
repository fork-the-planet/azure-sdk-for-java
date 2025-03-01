// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.managednetworkfabric.fluent.models.InternetGatewayInner;
import java.io.IOException;
import java.util.List;

/**
 * List of InternetGateways.
 */
@Fluent
public final class InternetGatewaysListResult implements JsonSerializable<InternetGatewaysListResult> {
    /*
     * Displays list of Internet Gateway resources.
     */
    private List<InternetGatewayInner> value;

    /*
     * Url to follow for getting next page of resources.
     */
    private String nextLink;

    /**
     * Creates an instance of InternetGatewaysListResult class.
     */
    public InternetGatewaysListResult() {
    }

    /**
     * Get the value property: Displays list of Internet Gateway resources.
     * 
     * @return the value value.
     */
    public List<InternetGatewayInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Displays list of Internet Gateway resources.
     * 
     * @param value the value value to set.
     * @return the InternetGatewaysListResult object itself.
     */
    public InternetGatewaysListResult withValue(List<InternetGatewayInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Url to follow for getting next page of resources.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: Url to follow for getting next page of resources.
     * 
     * @param nextLink the nextLink value to set.
     * @return the InternetGatewaysListResult object itself.
     */
    public InternetGatewaysListResult withNextLink(String nextLink) {
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
     * Reads an instance of InternetGatewaysListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of InternetGatewaysListResult if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the InternetGatewaysListResult.
     */
    public static InternetGatewaysListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            InternetGatewaysListResult deserializedInternetGatewaysListResult = new InternetGatewaysListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<InternetGatewayInner> value
                        = reader.readArray(reader1 -> InternetGatewayInner.fromJson(reader1));
                    deserializedInternetGatewaysListResult.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedInternetGatewaysListResult.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedInternetGatewaysListResult;
        });
    }
}
