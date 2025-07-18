// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Schema of common properties of all thread-level chat message events.
 * 
 * @deprecated This class is deprecated and may be removed in future releases. System events are now available in the
 * azure-messaging-eventgrid-systemevents package.
 */
@Fluent
@Deprecated
public class AcsChatMessageEventInThreadBaseProperties extends AcsChatEventInThreadBaseProperties {

    /*
     * The chat message id
     */
    @Generated
    private String messageId;

    /*
     * The communication identifier of the sender
     */
    @Generated
    private CommunicationIdentifierModel senderCommunicationIdentifier;

    /*
     * The display name of the sender
     */
    @Generated
    private String senderDisplayName;

    /*
     * The original compose time of the message
     */
    @Generated
    private OffsetDateTime composeTime;

    /*
     * The type of the message
     */
    @Generated
    private String type;

    /*
     * The version of the message
     */
    @Generated
    private Long version;

    /**
     * Creates an instance of AcsChatMessageEventInThreadBaseProperties class.
     */
    @Generated
    public AcsChatMessageEventInThreadBaseProperties() {
    }

    /**
     * Get the messageId property: The chat message id.
     *
     * @return the messageId value.
     */
    @Generated
    public String getMessageId() {
        return this.messageId;
    }

    /**
     * Set the messageId property: The chat message id.
     *
     * @param messageId the messageId value to set.
     * @return the AcsChatMessageEventInThreadBaseProperties object itself.
     */
    @Generated
    public AcsChatMessageEventInThreadBaseProperties setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    /**
     * Get the senderCommunicationIdentifier property: The communication identifier of the sender.
     *
     * @return the senderCommunicationIdentifier value.
     */
    @Generated
    public CommunicationIdentifierModel getSenderCommunicationIdentifier() {
        return this.senderCommunicationIdentifier;
    }

    /**
     * Set the senderCommunicationIdentifier property: The communication identifier of the sender.
     *
     * @param senderCommunicationIdentifier the senderCommunicationIdentifier value to set.
     * @return the AcsChatMessageEventInThreadBaseProperties object itself.
     */
    @Generated
    public AcsChatMessageEventInThreadBaseProperties
        setSenderCommunicationIdentifier(CommunicationIdentifierModel senderCommunicationIdentifier) {
        this.senderCommunicationIdentifier = senderCommunicationIdentifier;
        return this;
    }

    /**
     * Get the senderDisplayName property: The display name of the sender.
     *
     * @return the senderDisplayName value.
     */
    @Generated
    public String getSenderDisplayName() {
        return this.senderDisplayName;
    }

    /**
     * Set the senderDisplayName property: The display name of the sender.
     *
     * @param senderDisplayName the senderDisplayName value to set.
     * @return the AcsChatMessageEventInThreadBaseProperties object itself.
     */
    @Generated
    public AcsChatMessageEventInThreadBaseProperties setSenderDisplayName(String senderDisplayName) {
        this.senderDisplayName = senderDisplayName;
        return this;
    }

    /**
     * Get the composeTime property: The original compose time of the message.
     *
     * @return the composeTime value.
     */
    @Generated
    public OffsetDateTime getComposeTime() {
        return this.composeTime;
    }

    /**
     * Set the composeTime property: The original compose time of the message.
     *
     * @param composeTime the composeTime value to set.
     * @return the AcsChatMessageEventInThreadBaseProperties object itself.
     */
    @Generated
    public AcsChatMessageEventInThreadBaseProperties setComposeTime(OffsetDateTime composeTime) {
        this.composeTime = composeTime;
        return this;
    }

    /**
     * Get the type property: The type of the message.
     *
     * @return the type value.
     */
    @Generated
    public String getType() {
        return this.type;
    }

    /**
     * Set the type property: The type of the message.
     *
     * @param type the type value to set.
     * @return the AcsChatMessageEventInThreadBaseProperties object itself.
     */
    @Generated
    public AcsChatMessageEventInThreadBaseProperties setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the version property: The version of the message.
     *
     * @return the version value.
     */
    @Generated
    public Long getVersion() {
        return this.version;
    }

    /**
     * Set the version property: The version of the message.
     *
     * @param version the version value to set.
     * @return the AcsChatMessageEventInThreadBaseProperties object itself.
     */
    @Generated
    public AcsChatMessageEventInThreadBaseProperties setVersion(Long version) {
        this.version = version;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public AcsChatMessageEventInThreadBaseProperties setTransactionId(String transactionId) {
        super.setTransactionId(transactionId);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public AcsChatMessageEventInThreadBaseProperties setThreadId(String threadId) {
        super.setThreadId(threadId);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("transactionId", getTransactionId());
        jsonWriter.writeStringField("threadId", getThreadId());
        jsonWriter.writeStringField("messageId", this.messageId);
        jsonWriter.writeJsonField("senderCommunicationIdentifier", this.senderCommunicationIdentifier);
        jsonWriter.writeStringField("type", this.type);
        jsonWriter.writeStringField("senderDisplayName", this.senderDisplayName);
        jsonWriter.writeStringField("composeTime",
            this.composeTime == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.composeTime));
        jsonWriter.writeNumberField("version", this.version);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AcsChatMessageEventInThreadBaseProperties from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of AcsChatMessageEventInThreadBaseProperties if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the AcsChatMessageEventInThreadBaseProperties.
     */
    @Generated
    public static AcsChatMessageEventInThreadBaseProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AcsChatMessageEventInThreadBaseProperties deserializedAcsChatMessageEventInThreadBaseProperties
                = new AcsChatMessageEventInThreadBaseProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("transactionId".equals(fieldName)) {
                    deserializedAcsChatMessageEventInThreadBaseProperties.setTransactionId(reader.getString());
                } else if ("threadId".equals(fieldName)) {
                    deserializedAcsChatMessageEventInThreadBaseProperties.setThreadId(reader.getString());
                } else if ("messageId".equals(fieldName)) {
                    deserializedAcsChatMessageEventInThreadBaseProperties.messageId = reader.getString();
                } else if ("senderCommunicationIdentifier".equals(fieldName)) {
                    deserializedAcsChatMessageEventInThreadBaseProperties.senderCommunicationIdentifier
                        = CommunicationIdentifierModel.fromJson(reader);
                } else if ("type".equals(fieldName)) {
                    deserializedAcsChatMessageEventInThreadBaseProperties.type = reader.getString();
                } else if ("senderDisplayName".equals(fieldName)) {
                    deserializedAcsChatMessageEventInThreadBaseProperties.senderDisplayName = reader.getString();
                } else if ("composeTime".equals(fieldName)) {
                    deserializedAcsChatMessageEventInThreadBaseProperties.composeTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("version".equals(fieldName)) {
                    deserializedAcsChatMessageEventInThreadBaseProperties.version
                        = reader.getNullable(JsonReader::getLong);
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedAcsChatMessageEventInThreadBaseProperties;
        });
    }
}
