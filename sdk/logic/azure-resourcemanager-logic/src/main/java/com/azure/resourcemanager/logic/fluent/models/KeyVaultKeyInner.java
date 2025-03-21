// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.logic.models.KeyVaultKeyAttributes;
import java.io.IOException;

/**
 * The key vault key.
 */
@Fluent
public final class KeyVaultKeyInner implements JsonSerializable<KeyVaultKeyInner> {
    /*
     * The key id.
     */
    private String kid;

    /*
     * The key attributes.
     */
    private KeyVaultKeyAttributes attributes;

    /**
     * Creates an instance of KeyVaultKeyInner class.
     */
    public KeyVaultKeyInner() {
    }

    /**
     * Get the kid property: The key id.
     * 
     * @return the kid value.
     */
    public String kid() {
        return this.kid;
    }

    /**
     * Set the kid property: The key id.
     * 
     * @param kid the kid value to set.
     * @return the KeyVaultKeyInner object itself.
     */
    public KeyVaultKeyInner withKid(String kid) {
        this.kid = kid;
        return this;
    }

    /**
     * Get the attributes property: The key attributes.
     * 
     * @return the attributes value.
     */
    public KeyVaultKeyAttributes attributes() {
        return this.attributes;
    }

    /**
     * Set the attributes property: The key attributes.
     * 
     * @param attributes the attributes value to set.
     * @return the KeyVaultKeyInner object itself.
     */
    public KeyVaultKeyInner withAttributes(KeyVaultKeyAttributes attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (attributes() != null) {
            attributes().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("kid", this.kid);
        jsonWriter.writeJsonField("attributes", this.attributes);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of KeyVaultKeyInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of KeyVaultKeyInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the KeyVaultKeyInner.
     */
    public static KeyVaultKeyInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            KeyVaultKeyInner deserializedKeyVaultKeyInner = new KeyVaultKeyInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("kid".equals(fieldName)) {
                    deserializedKeyVaultKeyInner.kid = reader.getString();
                } else if ("attributes".equals(fieldName)) {
                    deserializedKeyVaultKeyInner.attributes = KeyVaultKeyAttributes.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedKeyVaultKeyInner;
        });
    }
}
