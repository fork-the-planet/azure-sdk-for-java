// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Schema of the Data property of an EventGridEvent for MQTT Client state changes.
 * 
 * @deprecated This class is deprecated and may be removed in future releases. System events are now available in the
 * azure-messaging-eventgrid-systemevents package.
 */
@Fluent
@Deprecated
public class EventGridMqttClientEventData implements JsonSerializable<EventGridMqttClientEventData> {

    /*
     * Unique identifier for the MQTT client that the client presents to the service for authentication. This
     * case-sensitive string can be up to 128 characters long, and supports UTF-8 characters.
     */
    @Generated
    private String clientAuthenticationName;

    /*
     * Name of the client resource in the Event Grid namespace.
     */
    @Generated
    private String clientName;

    /*
     * Name of the Event Grid namespace where the MQTT client was created or updated.
     */
    @Generated
    private String namespaceName;

    /**
     * Creates an instance of EventGridMqttClientEventData class.
     */
    @Generated
    public EventGridMqttClientEventData() {
    }

    /**
     * Get the clientAuthenticationName property: Unique identifier for the MQTT client that the client presents to the
     * service for authentication. This case-sensitive string can be up to 128 characters long, and supports UTF-8
     * characters.
     *
     * @return the clientAuthenticationName value.
     */
    @Generated
    public String getClientAuthenticationName() {
        return this.clientAuthenticationName;
    }

    /**
     * Set the clientAuthenticationName property: Unique identifier for the MQTT client that the client presents to the
     * service for authentication. This case-sensitive string can be up to 128 characters long, and supports UTF-8
     * characters.
     *
     * @param clientAuthenticationName the clientAuthenticationName value to set.
     * @return the EventGridMqttClientEventData object itself.
     */
    @Generated
    public EventGridMqttClientEventData setClientAuthenticationName(String clientAuthenticationName) {
        this.clientAuthenticationName = clientAuthenticationName;
        return this;
    }

    /**
     * Get the clientName property: Name of the client resource in the Event Grid namespace.
     *
     * @return the clientName value.
     */
    @Generated
    public String getClientName() {
        return this.clientName;
    }

    /**
     * Set the clientName property: Name of the client resource in the Event Grid namespace.
     *
     * @param clientName the clientName value to set.
     * @return the EventGridMqttClientEventData object itself.
     */
    @Generated
    public EventGridMqttClientEventData setClientName(String clientName) {
        this.clientName = clientName;
        return this;
    }

    /**
     * Get the namespaceName property: Name of the Event Grid namespace where the MQTT client was created or updated.
     *
     * @return the namespaceName value.
     */
    @Generated
    public String getNamespaceName() {
        return this.namespaceName;
    }

    /**
     * Set the namespaceName property: Name of the Event Grid namespace where the MQTT client was created or updated.
     *
     * @param namespaceName the namespaceName value to set.
     * @return the EventGridMqttClientEventData object itself.
     */
    @Generated
    public EventGridMqttClientEventData setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("clientAuthenticationName", this.clientAuthenticationName);
        jsonWriter.writeStringField("clientName", this.clientName);
        jsonWriter.writeStringField("namespaceName", this.namespaceName);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of EventGridMqttClientEventData from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of EventGridMqttClientEventData if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the EventGridMqttClientEventData.
     */
    @Generated
    public static EventGridMqttClientEventData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            EventGridMqttClientEventData deserializedEventGridMqttClientEventData = new EventGridMqttClientEventData();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("clientAuthenticationName".equals(fieldName)) {
                    deserializedEventGridMqttClientEventData.clientAuthenticationName = reader.getString();
                } else if ("clientName".equals(fieldName)) {
                    deserializedEventGridMqttClientEventData.clientName = reader.getString();
                } else if ("namespaceName".equals(fieldName)) {
                    deserializedEventGridMqttClientEventData.namespaceName = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedEventGridMqttClientEventData;
        });
    }
}
