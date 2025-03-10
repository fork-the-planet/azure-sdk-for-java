// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Advanced Networking profile for enabling observability and security feature suite on a cluster. For more information
 * see aka.ms/aksadvancednetworking.
 */
@Fluent
public final class AdvancedNetworking implements JsonSerializable<AdvancedNetworking> {
    /*
     * Indicates the enablement of Advanced Networking functionalities of observability and security on AKS clusters.
     * When this is set to true, all observability and security features will be set to enabled unless explicitly
     * disabled. If not specified, the default is false.
     */
    private Boolean enabled;

    /*
     * Observability profile to enable advanced network metrics and flow logs with historical contexts.
     */
    private AdvancedNetworkingObservability observability;

    /*
     * Security profile to enable security features on cilium based cluster.
     */
    private AdvancedNetworkingSecurity security;

    /**
     * Creates an instance of AdvancedNetworking class.
     */
    public AdvancedNetworking() {
    }

    /**
     * Get the enabled property: Indicates the enablement of Advanced Networking functionalities of observability and
     * security on AKS clusters. When this is set to true, all observability and security features will be set to
     * enabled unless explicitly disabled. If not specified, the default is false.
     * 
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Indicates the enablement of Advanced Networking functionalities of observability and
     * security on AKS clusters. When this is set to true, all observability and security features will be set to
     * enabled unless explicitly disabled. If not specified, the default is false.
     * 
     * @param enabled the enabled value to set.
     * @return the AdvancedNetworking object itself.
     */
    public AdvancedNetworking withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the observability property: Observability profile to enable advanced network metrics and flow logs with
     * historical contexts.
     * 
     * @return the observability value.
     */
    public AdvancedNetworkingObservability observability() {
        return this.observability;
    }

    /**
     * Set the observability property: Observability profile to enable advanced network metrics and flow logs with
     * historical contexts.
     * 
     * @param observability the observability value to set.
     * @return the AdvancedNetworking object itself.
     */
    public AdvancedNetworking withObservability(AdvancedNetworkingObservability observability) {
        this.observability = observability;
        return this;
    }

    /**
     * Get the security property: Security profile to enable security features on cilium based cluster.
     * 
     * @return the security value.
     */
    public AdvancedNetworkingSecurity security() {
        return this.security;
    }

    /**
     * Set the security property: Security profile to enable security features on cilium based cluster.
     * 
     * @param security the security value to set.
     * @return the AdvancedNetworking object itself.
     */
    public AdvancedNetworking withSecurity(AdvancedNetworkingSecurity security) {
        this.security = security;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (observability() != null) {
            observability().validate();
        }
        if (security() != null) {
            security().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeBooleanField("enabled", this.enabled);
        jsonWriter.writeJsonField("observability", this.observability);
        jsonWriter.writeJsonField("security", this.security);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AdvancedNetworking from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AdvancedNetworking if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the AdvancedNetworking.
     */
    public static AdvancedNetworking fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AdvancedNetworking deserializedAdvancedNetworking = new AdvancedNetworking();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("enabled".equals(fieldName)) {
                    deserializedAdvancedNetworking.enabled = reader.getNullable(JsonReader::getBoolean);
                } else if ("observability".equals(fieldName)) {
                    deserializedAdvancedNetworking.observability = AdvancedNetworkingObservability.fromJson(reader);
                } else if ("security".equals(fieldName)) {
                    deserializedAdvancedNetworking.security = AdvancedNetworkingSecurity.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAdvancedNetworking;
        });
    }
}
