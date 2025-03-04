// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.Map;

/**
 * Authorization Provider oauth2 grant types settings.
 */
@Fluent
public final class AuthorizationProviderOAuth2GrantTypes
    implements JsonSerializable<AuthorizationProviderOAuth2GrantTypes> {
    /*
     * OAuth2 authorization code grant parameters
     */
    private Map<String, String> authorizationCode;

    /*
     * OAuth2 client credential grant parameters
     */
    private Map<String, String> clientCredentials;

    /**
     * Creates an instance of AuthorizationProviderOAuth2GrantTypes class.
     */
    public AuthorizationProviderOAuth2GrantTypes() {
    }

    /**
     * Get the authorizationCode property: OAuth2 authorization code grant parameters.
     * 
     * @return the authorizationCode value.
     */
    public Map<String, String> authorizationCode() {
        return this.authorizationCode;
    }

    /**
     * Set the authorizationCode property: OAuth2 authorization code grant parameters.
     * 
     * @param authorizationCode the authorizationCode value to set.
     * @return the AuthorizationProviderOAuth2GrantTypes object itself.
     */
    public AuthorizationProviderOAuth2GrantTypes withAuthorizationCode(Map<String, String> authorizationCode) {
        this.authorizationCode = authorizationCode;
        return this;
    }

    /**
     * Get the clientCredentials property: OAuth2 client credential grant parameters.
     * 
     * @return the clientCredentials value.
     */
    public Map<String, String> clientCredentials() {
        return this.clientCredentials;
    }

    /**
     * Set the clientCredentials property: OAuth2 client credential grant parameters.
     * 
     * @param clientCredentials the clientCredentials value to set.
     * @return the AuthorizationProviderOAuth2GrantTypes object itself.
     */
    public AuthorizationProviderOAuth2GrantTypes withClientCredentials(Map<String, String> clientCredentials) {
        this.clientCredentials = clientCredentials;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeMapField("authorizationCode", this.authorizationCode,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeMapField("clientCredentials", this.clientCredentials,
            (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AuthorizationProviderOAuth2GrantTypes from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AuthorizationProviderOAuth2GrantTypes if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AuthorizationProviderOAuth2GrantTypes.
     */
    public static AuthorizationProviderOAuth2GrantTypes fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AuthorizationProviderOAuth2GrantTypes deserializedAuthorizationProviderOAuth2GrantTypes
                = new AuthorizationProviderOAuth2GrantTypes();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("authorizationCode".equals(fieldName)) {
                    Map<String, String> authorizationCode = reader.readMap(reader1 -> reader1.getString());
                    deserializedAuthorizationProviderOAuth2GrantTypes.authorizationCode = authorizationCode;
                } else if ("clientCredentials".equals(fieldName)) {
                    Map<String, String> clientCredentials = reader.readMap(reader1 -> reader1.getString());
                    deserializedAuthorizationProviderOAuth2GrantTypes.clientCredentials = clientCredentials;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAuthorizationProviderOAuth2GrantTypes;
        });
    }
}
