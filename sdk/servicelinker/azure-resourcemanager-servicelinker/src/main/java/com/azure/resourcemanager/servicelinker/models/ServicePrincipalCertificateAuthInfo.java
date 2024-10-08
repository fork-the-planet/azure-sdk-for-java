// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicelinker.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The authentication info when authType is servicePrincipal certificate.
 */
@Fluent
public final class ServicePrincipalCertificateAuthInfo extends AuthInfoBase {
    /*
     * The authentication type.
     */
    private AuthType authType = AuthType.SERVICE_PRINCIPAL_CERTIFICATE;

    /*
     * Application clientId for servicePrincipal auth.
     */
    private String clientId;

    /*
     * Principal Id for servicePrincipal auth.
     */
    private String principalId;

    /*
     * ServicePrincipal certificate for servicePrincipal auth.
     */
    private String certificate;

    /*
     * Indicates whether to clean up previous operation when Linker is updating or deleting
     */
    private DeleteOrUpdateBehavior deleteOrUpdateBehavior;

    /*
     * Optional, this value specifies the Azure roles to be assigned. Automatically
     */
    private List<String> roles;

    /**
     * Creates an instance of ServicePrincipalCertificateAuthInfo class.
     */
    public ServicePrincipalCertificateAuthInfo() {
    }

    /**
     * Get the authType property: The authentication type.
     * 
     * @return the authType value.
     */
    @Override
    public AuthType authType() {
        return this.authType;
    }

    /**
     * Get the clientId property: Application clientId for servicePrincipal auth.
     * 
     * @return the clientId value.
     */
    public String clientId() {
        return this.clientId;
    }

    /**
     * Set the clientId property: Application clientId for servicePrincipal auth.
     * 
     * @param clientId the clientId value to set.
     * @return the ServicePrincipalCertificateAuthInfo object itself.
     */
    public ServicePrincipalCertificateAuthInfo withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * Get the principalId property: Principal Id for servicePrincipal auth.
     * 
     * @return the principalId value.
     */
    public String principalId() {
        return this.principalId;
    }

    /**
     * Set the principalId property: Principal Id for servicePrincipal auth.
     * 
     * @param principalId the principalId value to set.
     * @return the ServicePrincipalCertificateAuthInfo object itself.
     */
    public ServicePrincipalCertificateAuthInfo withPrincipalId(String principalId) {
        this.principalId = principalId;
        return this;
    }

    /**
     * Get the certificate property: ServicePrincipal certificate for servicePrincipal auth.
     * 
     * @return the certificate value.
     */
    public String certificate() {
        return this.certificate;
    }

    /**
     * Set the certificate property: ServicePrincipal certificate for servicePrincipal auth.
     * 
     * @param certificate the certificate value to set.
     * @return the ServicePrincipalCertificateAuthInfo object itself.
     */
    public ServicePrincipalCertificateAuthInfo withCertificate(String certificate) {
        this.certificate = certificate;
        return this;
    }

    /**
     * Get the deleteOrUpdateBehavior property: Indicates whether to clean up previous operation when Linker is updating
     * or deleting.
     * 
     * @return the deleteOrUpdateBehavior value.
     */
    public DeleteOrUpdateBehavior deleteOrUpdateBehavior() {
        return this.deleteOrUpdateBehavior;
    }

    /**
     * Set the deleteOrUpdateBehavior property: Indicates whether to clean up previous operation when Linker is updating
     * or deleting.
     * 
     * @param deleteOrUpdateBehavior the deleteOrUpdateBehavior value to set.
     * @return the ServicePrincipalCertificateAuthInfo object itself.
     */
    public ServicePrincipalCertificateAuthInfo
        withDeleteOrUpdateBehavior(DeleteOrUpdateBehavior deleteOrUpdateBehavior) {
        this.deleteOrUpdateBehavior = deleteOrUpdateBehavior;
        return this;
    }

    /**
     * Get the roles property: Optional, this value specifies the Azure roles to be assigned. Automatically.
     * 
     * @return the roles value.
     */
    public List<String> roles() {
        return this.roles;
    }

    /**
     * Set the roles property: Optional, this value specifies the Azure roles to be assigned. Automatically.
     * 
     * @param roles the roles value to set.
     * @return the ServicePrincipalCertificateAuthInfo object itself.
     */
    public ServicePrincipalCertificateAuthInfo withRoles(List<String> roles) {
        this.roles = roles;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServicePrincipalCertificateAuthInfo withAuthMode(AuthMode authMode) {
        super.withAuthMode(authMode);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (clientId() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property clientId in model ServicePrincipalCertificateAuthInfo"));
        }
        if (principalId() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property principalId in model ServicePrincipalCertificateAuthInfo"));
        }
        if (certificate() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property certificate in model ServicePrincipalCertificateAuthInfo"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ServicePrincipalCertificateAuthInfo.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("authMode", authMode() == null ? null : authMode().toString());
        jsonWriter.writeStringField("clientId", this.clientId);
        jsonWriter.writeStringField("principalId", this.principalId);
        jsonWriter.writeStringField("certificate", this.certificate);
        jsonWriter.writeStringField("authType", this.authType == null ? null : this.authType.toString());
        jsonWriter.writeStringField("deleteOrUpdateBehavior",
            this.deleteOrUpdateBehavior == null ? null : this.deleteOrUpdateBehavior.toString());
        jsonWriter.writeArrayField("roles", this.roles, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ServicePrincipalCertificateAuthInfo from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ServicePrincipalCertificateAuthInfo if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ServicePrincipalCertificateAuthInfo.
     */
    public static ServicePrincipalCertificateAuthInfo fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ServicePrincipalCertificateAuthInfo deserializedServicePrincipalCertificateAuthInfo
                = new ServicePrincipalCertificateAuthInfo();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("authMode".equals(fieldName)) {
                    deserializedServicePrincipalCertificateAuthInfo
                        .withAuthMode(AuthMode.fromString(reader.getString()));
                } else if ("clientId".equals(fieldName)) {
                    deserializedServicePrincipalCertificateAuthInfo.clientId = reader.getString();
                } else if ("principalId".equals(fieldName)) {
                    deserializedServicePrincipalCertificateAuthInfo.principalId = reader.getString();
                } else if ("certificate".equals(fieldName)) {
                    deserializedServicePrincipalCertificateAuthInfo.certificate = reader.getString();
                } else if ("authType".equals(fieldName)) {
                    deserializedServicePrincipalCertificateAuthInfo.authType = AuthType.fromString(reader.getString());
                } else if ("deleteOrUpdateBehavior".equals(fieldName)) {
                    deserializedServicePrincipalCertificateAuthInfo.deleteOrUpdateBehavior
                        = DeleteOrUpdateBehavior.fromString(reader.getString());
                } else if ("roles".equals(fieldName)) {
                    List<String> roles = reader.readArray(reader1 -> reader1.getString());
                    deserializedServicePrincipalCertificateAuthInfo.roles = roles;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedServicePrincipalCertificateAuthInfo;
        });
    }
}
