// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.apimanagement.models.AuthorizationProviderOAuth2Settings;
import java.io.IOException;

/**
 * Authorization Provider contract.
 */
@Fluent
public final class AuthorizationProviderContractInner extends ProxyResource {
    /*
     * Properties of the Authorization Provider Contract.
     */
    private AuthorizationProviderContractProperties innerProperties;

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
     * Creates an instance of AuthorizationProviderContractInner class.
     */
    public AuthorizationProviderContractInner() {
    }

    /**
     * Get the innerProperties property: Properties of the Authorization Provider Contract.
     * 
     * @return the innerProperties value.
     */
    private AuthorizationProviderContractProperties innerProperties() {
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
     * Get the displayName property: Authorization Provider name. Must be 1 to 300 characters long.
     * 
     * @return the displayName value.
     */
    public String displayName() {
        return this.innerProperties() == null ? null : this.innerProperties().displayName();
    }

    /**
     * Set the displayName property: Authorization Provider name. Must be 1 to 300 characters long.
     * 
     * @param displayName the displayName value to set.
     * @return the AuthorizationProviderContractInner object itself.
     */
    public AuthorizationProviderContractInner withDisplayName(String displayName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AuthorizationProviderContractProperties();
        }
        this.innerProperties().withDisplayName(displayName);
        return this;
    }

    /**
     * Get the identityProvider property: Identity provider name. Must be 1 to 300 characters long.
     * 
     * @return the identityProvider value.
     */
    public String identityProvider() {
        return this.innerProperties() == null ? null : this.innerProperties().identityProvider();
    }

    /**
     * Set the identityProvider property: Identity provider name. Must be 1 to 300 characters long.
     * 
     * @param identityProvider the identityProvider value to set.
     * @return the AuthorizationProviderContractInner object itself.
     */
    public AuthorizationProviderContractInner withIdentityProvider(String identityProvider) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AuthorizationProviderContractProperties();
        }
        this.innerProperties().withIdentityProvider(identityProvider);
        return this;
    }

    /**
     * Get the oauth2 property: OAuth2 settings.
     * 
     * @return the oauth2 value.
     */
    public AuthorizationProviderOAuth2Settings oauth2() {
        return this.innerProperties() == null ? null : this.innerProperties().oauth2();
    }

    /**
     * Set the oauth2 property: OAuth2 settings.
     * 
     * @param oauth2 the oauth2 value to set.
     * @return the AuthorizationProviderContractInner object itself.
     */
    public AuthorizationProviderContractInner withOauth2(AuthorizationProviderOAuth2Settings oauth2) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AuthorizationProviderContractProperties();
        }
        this.innerProperties().withOauth2(oauth2);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AuthorizationProviderContractInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AuthorizationProviderContractInner if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the AuthorizationProviderContractInner.
     */
    public static AuthorizationProviderContractInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AuthorizationProviderContractInner deserializedAuthorizationProviderContractInner
                = new AuthorizationProviderContractInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedAuthorizationProviderContractInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedAuthorizationProviderContractInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedAuthorizationProviderContractInner.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedAuthorizationProviderContractInner.innerProperties
                        = AuthorizationProviderContractProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAuthorizationProviderContractInner;
        });
    }
}
