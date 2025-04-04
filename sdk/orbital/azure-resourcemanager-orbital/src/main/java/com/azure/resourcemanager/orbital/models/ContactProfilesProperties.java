// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.orbital.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * List of Contact Profile Resource Properties.
 */
@Fluent
public class ContactProfilesProperties implements JsonSerializable<ContactProfilesProperties> {
    /*
     * The current state of the resource's creation, deletion, or modification.
     */
    private ContactProfilesPropertiesProvisioningState provisioningState;

    /*
     * Minimum viable contact duration in ISO 8601 format. Used for listing the available contacts with a spacecraft at
     * a given ground station.
     */
    private String minimumViableContactDuration;

    /*
     * Minimum viable elevation for the contact in decimal degrees. Used for listing the available contacts with a
     * spacecraft at a given ground station.
     */
    private Float minimumElevationDegrees;

    /*
     * Auto-tracking configuration.
     */
    private AutoTrackingConfiguration autoTrackingConfiguration;

    /*
     * ARM resource identifier of the Event Hub used for telemetry. Requires granting Orbital Resource Provider the
     * rights to send telemetry into the hub.
     */
    private String eventHubUri;

    /*
     * Network configuration of customer virtual network.
     */
    private ContactProfilesPropertiesNetworkConfiguration networkConfiguration;

    /*
     * Third-party mission configuration of the Contact Profile. Describes RF links, modem processing, and IP endpoints.
     */
    private List<ContactProfileThirdPartyConfiguration> thirdPartyConfigurations;

    /*
     * Links of the Contact Profile. Describes RF links, modem processing, and IP endpoints.
     */
    private List<ContactProfileLink> links;

    /**
     * Creates an instance of ContactProfilesProperties class.
     */
    public ContactProfilesProperties() {
    }

    /**
     * Get the provisioningState property: The current state of the resource's creation, deletion, or modification.
     * 
     * @return the provisioningState value.
     */
    public ContactProfilesPropertiesProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: The current state of the resource's creation, deletion, or modification.
     * 
     * @param provisioningState the provisioningState value to set.
     * @return the ContactProfilesProperties object itself.
     */
    public ContactProfilesProperties
        withProvisioningState(ContactProfilesPropertiesProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the minimumViableContactDuration property: Minimum viable contact duration in ISO 8601 format. Used for
     * listing the available contacts with a spacecraft at a given ground station.
     * 
     * @return the minimumViableContactDuration value.
     */
    public String minimumViableContactDuration() {
        return this.minimumViableContactDuration;
    }

    /**
     * Set the minimumViableContactDuration property: Minimum viable contact duration in ISO 8601 format. Used for
     * listing the available contacts with a spacecraft at a given ground station.
     * 
     * @param minimumViableContactDuration the minimumViableContactDuration value to set.
     * @return the ContactProfilesProperties object itself.
     */
    public ContactProfilesProperties withMinimumViableContactDuration(String minimumViableContactDuration) {
        this.minimumViableContactDuration = minimumViableContactDuration;
        return this;
    }

    /**
     * Get the minimumElevationDegrees property: Minimum viable elevation for the contact in decimal degrees. Used for
     * listing the available contacts with a spacecraft at a given ground station.
     * 
     * @return the minimumElevationDegrees value.
     */
    public Float minimumElevationDegrees() {
        return this.minimumElevationDegrees;
    }

    /**
     * Set the minimumElevationDegrees property: Minimum viable elevation for the contact in decimal degrees. Used for
     * listing the available contacts with a spacecraft at a given ground station.
     * 
     * @param minimumElevationDegrees the minimumElevationDegrees value to set.
     * @return the ContactProfilesProperties object itself.
     */
    public ContactProfilesProperties withMinimumElevationDegrees(Float minimumElevationDegrees) {
        this.minimumElevationDegrees = minimumElevationDegrees;
        return this;
    }

    /**
     * Get the autoTrackingConfiguration property: Auto-tracking configuration.
     * 
     * @return the autoTrackingConfiguration value.
     */
    public AutoTrackingConfiguration autoTrackingConfiguration() {
        return this.autoTrackingConfiguration;
    }

    /**
     * Set the autoTrackingConfiguration property: Auto-tracking configuration.
     * 
     * @param autoTrackingConfiguration the autoTrackingConfiguration value to set.
     * @return the ContactProfilesProperties object itself.
     */
    public ContactProfilesProperties
        withAutoTrackingConfiguration(AutoTrackingConfiguration autoTrackingConfiguration) {
        this.autoTrackingConfiguration = autoTrackingConfiguration;
        return this;
    }

    /**
     * Get the eventHubUri property: ARM resource identifier of the Event Hub used for telemetry. Requires granting
     * Orbital Resource Provider the rights to send telemetry into the hub.
     * 
     * @return the eventHubUri value.
     */
    public String eventHubUri() {
        return this.eventHubUri;
    }

    /**
     * Set the eventHubUri property: ARM resource identifier of the Event Hub used for telemetry. Requires granting
     * Orbital Resource Provider the rights to send telemetry into the hub.
     * 
     * @param eventHubUri the eventHubUri value to set.
     * @return the ContactProfilesProperties object itself.
     */
    public ContactProfilesProperties withEventHubUri(String eventHubUri) {
        this.eventHubUri = eventHubUri;
        return this;
    }

    /**
     * Get the networkConfiguration property: Network configuration of customer virtual network.
     * 
     * @return the networkConfiguration value.
     */
    public ContactProfilesPropertiesNetworkConfiguration networkConfiguration() {
        return this.networkConfiguration;
    }

    /**
     * Set the networkConfiguration property: Network configuration of customer virtual network.
     * 
     * @param networkConfiguration the networkConfiguration value to set.
     * @return the ContactProfilesProperties object itself.
     */
    public ContactProfilesProperties
        withNetworkConfiguration(ContactProfilesPropertiesNetworkConfiguration networkConfiguration) {
        this.networkConfiguration = networkConfiguration;
        return this;
    }

    /**
     * Get the thirdPartyConfigurations property: Third-party mission configuration of the Contact Profile. Describes RF
     * links, modem processing, and IP endpoints.
     * 
     * @return the thirdPartyConfigurations value.
     */
    public List<ContactProfileThirdPartyConfiguration> thirdPartyConfigurations() {
        return this.thirdPartyConfigurations;
    }

    /**
     * Set the thirdPartyConfigurations property: Third-party mission configuration of the Contact Profile. Describes RF
     * links, modem processing, and IP endpoints.
     * 
     * @param thirdPartyConfigurations the thirdPartyConfigurations value to set.
     * @return the ContactProfilesProperties object itself.
     */
    public ContactProfilesProperties
        withThirdPartyConfigurations(List<ContactProfileThirdPartyConfiguration> thirdPartyConfigurations) {
        this.thirdPartyConfigurations = thirdPartyConfigurations;
        return this;
    }

    /**
     * Get the links property: Links of the Contact Profile. Describes RF links, modem processing, and IP endpoints.
     * 
     * @return the links value.
     */
    public List<ContactProfileLink> links() {
        return this.links;
    }

    /**
     * Set the links property: Links of the Contact Profile. Describes RF links, modem processing, and IP endpoints.
     * 
     * @param links the links value to set.
     * @return the ContactProfilesProperties object itself.
     */
    public ContactProfilesProperties withLinks(List<ContactProfileLink> links) {
        this.links = links;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (networkConfiguration() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property networkConfiguration in model ContactProfilesProperties"));
        } else {
            networkConfiguration().validate();
        }
        if (thirdPartyConfigurations() != null) {
            thirdPartyConfigurations().forEach(e -> e.validate());
        }
        if (links() == null) {
            throw LOGGER.atError()
                .log(
                    new IllegalArgumentException("Missing required property links in model ContactProfilesProperties"));
        } else {
            links().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ContactProfilesProperties.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("networkConfiguration", this.networkConfiguration);
        jsonWriter.writeArrayField("links", this.links, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("provisioningState",
            this.provisioningState == null ? null : this.provisioningState.toString());
        jsonWriter.writeStringField("minimumViableContactDuration", this.minimumViableContactDuration);
        jsonWriter.writeNumberField("minimumElevationDegrees", this.minimumElevationDegrees);
        jsonWriter.writeStringField("autoTrackingConfiguration",
            this.autoTrackingConfiguration == null ? null : this.autoTrackingConfiguration.toString());
        jsonWriter.writeStringField("eventHubUri", this.eventHubUri);
        jsonWriter.writeArrayField("thirdPartyConfigurations", this.thirdPartyConfigurations,
            (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ContactProfilesProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ContactProfilesProperties if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ContactProfilesProperties.
     */
    public static ContactProfilesProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ContactProfilesProperties deserializedContactProfilesProperties = new ContactProfilesProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("networkConfiguration".equals(fieldName)) {
                    deserializedContactProfilesProperties.networkConfiguration
                        = ContactProfilesPropertiesNetworkConfiguration.fromJson(reader);
                } else if ("links".equals(fieldName)) {
                    List<ContactProfileLink> links = reader.readArray(reader1 -> ContactProfileLink.fromJson(reader1));
                    deserializedContactProfilesProperties.links = links;
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedContactProfilesProperties.provisioningState
                        = ContactProfilesPropertiesProvisioningState.fromString(reader.getString());
                } else if ("minimumViableContactDuration".equals(fieldName)) {
                    deserializedContactProfilesProperties.minimumViableContactDuration = reader.getString();
                } else if ("minimumElevationDegrees".equals(fieldName)) {
                    deserializedContactProfilesProperties.minimumElevationDegrees
                        = reader.getNullable(JsonReader::getFloat);
                } else if ("autoTrackingConfiguration".equals(fieldName)) {
                    deserializedContactProfilesProperties.autoTrackingConfiguration
                        = AutoTrackingConfiguration.fromString(reader.getString());
                } else if ("eventHubUri".equals(fieldName)) {
                    deserializedContactProfilesProperties.eventHubUri = reader.getString();
                } else if ("thirdPartyConfigurations".equals(fieldName)) {
                    List<ContactProfileThirdPartyConfiguration> thirdPartyConfigurations
                        = reader.readArray(reader1 -> ContactProfileThirdPartyConfiguration.fromJson(reader1));
                    deserializedContactProfilesProperties.thirdPartyConfigurations = thirdPartyConfigurations;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedContactProfilesProperties;
        });
    }
}
