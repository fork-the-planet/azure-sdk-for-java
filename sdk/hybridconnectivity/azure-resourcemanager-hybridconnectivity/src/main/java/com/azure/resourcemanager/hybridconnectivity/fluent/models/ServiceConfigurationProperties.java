// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.hybridconnectivity.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.hybridconnectivity.models.ProvisioningState;
import com.azure.resourcemanager.hybridconnectivity.models.ServiceName;
import java.io.IOException;

/**
 * Service configuration details.
 */
@Fluent
public final class ServiceConfigurationProperties implements JsonSerializable<ServiceConfigurationProperties> {
    /*
     * Name of the service.
     */
    private ServiceName serviceName;

    /*
     * The resource Id of the connectivity endpoint (optional).
     */
    private String resourceId;

    /*
     * The port on which service is enabled.
     */
    private Long port;

    /*
     * The resource provisioning state.
     */
    private ProvisioningState provisioningState;

    /**
     * Creates an instance of ServiceConfigurationProperties class.
     */
    public ServiceConfigurationProperties() {
    }

    /**
     * Get the serviceName property: Name of the service.
     * 
     * @return the serviceName value.
     */
    public ServiceName serviceName() {
        return this.serviceName;
    }

    /**
     * Set the serviceName property: Name of the service.
     * 
     * @param serviceName the serviceName value to set.
     * @return the ServiceConfigurationProperties object itself.
     */
    public ServiceConfigurationProperties withServiceName(ServiceName serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * Get the resourceId property: The resource Id of the connectivity endpoint (optional).
     * 
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set the resourceId property: The resource Id of the connectivity endpoint (optional).
     * 
     * @param resourceId the resourceId value to set.
     * @return the ServiceConfigurationProperties object itself.
     */
    public ServiceConfigurationProperties withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get the port property: The port on which service is enabled.
     * 
     * @return the port value.
     */
    public Long port() {
        return this.port;
    }

    /**
     * Set the port property: The port on which service is enabled.
     * 
     * @param port the port value to set.
     * @return the ServiceConfigurationProperties object itself.
     */
    public ServiceConfigurationProperties withPort(Long port) {
        this.port = port;
        return this;
    }

    /**
     * Get the provisioningState property: The resource provisioning state.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (serviceName() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property serviceName in model ServiceConfigurationProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ServiceConfigurationProperties.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("serviceName", this.serviceName == null ? null : this.serviceName.toString());
        jsonWriter.writeStringField("resourceId", this.resourceId);
        jsonWriter.writeNumberField("port", this.port);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ServiceConfigurationProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ServiceConfigurationProperties if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ServiceConfigurationProperties.
     */
    public static ServiceConfigurationProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ServiceConfigurationProperties deserializedServiceConfigurationProperties
                = new ServiceConfigurationProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("serviceName".equals(fieldName)) {
                    deserializedServiceConfigurationProperties.serviceName = ServiceName.fromString(reader.getString());
                } else if ("resourceId".equals(fieldName)) {
                    deserializedServiceConfigurationProperties.resourceId = reader.getString();
                } else if ("port".equals(fieldName)) {
                    deserializedServiceConfigurationProperties.port = reader.getNullable(JsonReader::getLong);
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedServiceConfigurationProperties.provisioningState
                        = ProvisioningState.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedServiceConfigurationProperties;
        });
    }
}
