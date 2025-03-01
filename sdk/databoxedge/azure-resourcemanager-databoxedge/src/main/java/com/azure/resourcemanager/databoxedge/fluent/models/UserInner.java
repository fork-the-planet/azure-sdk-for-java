// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.databoxedge.models.ArmBaseModel;
import com.azure.resourcemanager.databoxedge.models.AsymmetricEncryptedSecret;
import com.azure.resourcemanager.databoxedge.models.ShareAccessRight;
import com.azure.resourcemanager.databoxedge.models.UserType;
import java.io.IOException;
import java.util.List;

/**
 * Represents a user who has access to one or more shares on the Data Box Edge/Gateway device.
 */
@Fluent
public final class UserInner extends ArmBaseModel {
    /*
     * The storage account credential properties.
     */
    private UserProperties innerProperties = new UserProperties();

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
     * Creates an instance of UserInner class.
     */
    public UserInner() {
    }

    /**
     * Get the innerProperties property: The storage account credential properties.
     * 
     * @return the innerProperties value.
     */
    private UserProperties innerProperties() {
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
     * Get the encryptedPassword property: The password details.
     * 
     * @return the encryptedPassword value.
     */
    public AsymmetricEncryptedSecret encryptedPassword() {
        return this.innerProperties() == null ? null : this.innerProperties().encryptedPassword();
    }

    /**
     * Set the encryptedPassword property: The password details.
     * 
     * @param encryptedPassword the encryptedPassword value to set.
     * @return the UserInner object itself.
     */
    public UserInner withEncryptedPassword(AsymmetricEncryptedSecret encryptedPassword) {
        if (this.innerProperties() == null) {
            this.innerProperties = new UserProperties();
        }
        this.innerProperties().withEncryptedPassword(encryptedPassword);
        return this;
    }

    /**
     * Get the shareAccessRights property: List of shares that the user has rights on. This field should not be
     * specified during user creation.
     * 
     * @return the shareAccessRights value.
     */
    public List<ShareAccessRight> shareAccessRights() {
        return this.innerProperties() == null ? null : this.innerProperties().shareAccessRights();
    }

    /**
     * Set the shareAccessRights property: List of shares that the user has rights on. This field should not be
     * specified during user creation.
     * 
     * @param shareAccessRights the shareAccessRights value to set.
     * @return the UserInner object itself.
     */
    public UserInner withShareAccessRights(List<ShareAccessRight> shareAccessRights) {
        if (this.innerProperties() == null) {
            this.innerProperties = new UserProperties();
        }
        this.innerProperties().withShareAccessRights(shareAccessRights);
        return this;
    }

    /**
     * Get the userType property: Type of the user.
     * 
     * @return the userType value.
     */
    public UserType userType() {
        return this.innerProperties() == null ? null : this.innerProperties().userType();
    }

    /**
     * Set the userType property: Type of the user.
     * 
     * @param userType the userType value to set.
     * @return the UserInner object itself.
     */
    public UserInner withUserType(UserType userType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new UserProperties();
        }
        this.innerProperties().withUserType(userType);
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
                .log(new IllegalArgumentException("Missing required property innerProperties in model UserInner"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(UserInner.class);

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
     * Reads an instance of UserInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of UserInner if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the UserInner.
     */
    public static UserInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            UserInner deserializedUserInner = new UserInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedUserInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedUserInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedUserInner.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedUserInner.innerProperties = UserProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedUserInner;
        });
    }
}
