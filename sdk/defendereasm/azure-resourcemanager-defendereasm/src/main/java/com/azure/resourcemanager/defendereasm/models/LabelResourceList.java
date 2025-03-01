// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.defendereasm.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.defendereasm.fluent.models.LabelResourceInner;
import java.io.IOException;
import java.util.List;

/**
 * The list of labels.
 */
@Fluent
public final class LabelResourceList implements JsonSerializable<LabelResourceList> {
    /*
     * The list of labels.
     */
    private List<LabelResourceInner> value;

    /*
     * The link used to get the next page of Label list.
     */
    private String nextLink;

    /**
     * Creates an instance of LabelResourceList class.
     */
    public LabelResourceList() {
    }

    /**
     * Get the value property: The list of labels.
     * 
     * @return the value value.
     */
    public List<LabelResourceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of labels.
     * 
     * @param value the value value to set.
     * @return the LabelResourceList object itself.
     */
    public LabelResourceList withValue(List<LabelResourceInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The link used to get the next page of Label list.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The link used to get the next page of Label list.
     * 
     * @param nextLink the nextLink value to set.
     * @return the LabelResourceList object itself.
     */
    public LabelResourceList withNextLink(String nextLink) {
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
     * Reads an instance of LabelResourceList from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of LabelResourceList if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the LabelResourceList.
     */
    public static LabelResourceList fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            LabelResourceList deserializedLabelResourceList = new LabelResourceList();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<LabelResourceInner> value = reader.readArray(reader1 -> LabelResourceInner.fromJson(reader1));
                    deserializedLabelResourceList.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedLabelResourceList.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedLabelResourceList;
        });
    }
}
