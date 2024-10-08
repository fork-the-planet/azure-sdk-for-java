// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicelinker.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The secret info when type is keyVaultSecretUri. It's for scenario that user provides a secret stored in user's
 * keyvault and source is Web App, Spring Cloud or Container App.
 */
@Fluent
public final class KeyVaultSecretUriSecretInfo extends SecretInfoBase {
    /*
     * The secret type.
     */
    private SecretType secretType = SecretType.KEY_VAULT_SECRET_URI;

    /*
     * URI to the keyvault secret
     */
    private String value;

    /**
     * Creates an instance of KeyVaultSecretUriSecretInfo class.
     */
    public KeyVaultSecretUriSecretInfo() {
    }

    /**
     * Get the secretType property: The secret type.
     * 
     * @return the secretType value.
     */
    @Override
    public SecretType secretType() {
        return this.secretType;
    }

    /**
     * Get the value property: URI to the keyvault secret.
     * 
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: URI to the keyvault secret.
     * 
     * @param value the value value to set.
     * @return the KeyVaultSecretUriSecretInfo object itself.
     */
    public KeyVaultSecretUriSecretInfo withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("secretType", this.secretType == null ? null : this.secretType.toString());
        jsonWriter.writeStringField("value", this.value);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of KeyVaultSecretUriSecretInfo from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of KeyVaultSecretUriSecretInfo if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the KeyVaultSecretUriSecretInfo.
     */
    public static KeyVaultSecretUriSecretInfo fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            KeyVaultSecretUriSecretInfo deserializedKeyVaultSecretUriSecretInfo = new KeyVaultSecretUriSecretInfo();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("secretType".equals(fieldName)) {
                    deserializedKeyVaultSecretUriSecretInfo.secretType = SecretType.fromString(reader.getString());
                } else if ("value".equals(fieldName)) {
                    deserializedKeyVaultSecretUriSecretInfo.value = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedKeyVaultSecretUriSecretInfo;
        });
    }
}
