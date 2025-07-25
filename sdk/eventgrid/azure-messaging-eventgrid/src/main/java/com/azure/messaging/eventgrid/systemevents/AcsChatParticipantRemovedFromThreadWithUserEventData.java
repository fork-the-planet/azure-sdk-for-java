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
 * Schema of the Data property of an EventGridEvent for a
 * Microsoft.Communication.ChatParticipantRemovedFromThreadWithUser event.
 * 
 * @deprecated This class is deprecated and may be removed in future releases. System events are now available in the
 * azure-messaging-eventgrid-systemevents package.
 */
@Fluent
@Deprecated
public final class AcsChatParticipantRemovedFromThreadWithUserEventData extends AcsChatThreadEventBaseProperties {

    /*
     * The time at which the user was removed to the thread
     */
    @Generated
    private OffsetDateTime time;

    /*
     * The communication identifier of the user who removed the user
     */
    @Generated
    private CommunicationIdentifierModel removedByCommunicationIdentifier;

    /*
     * The details of the user who was removed
     */
    @Generated
    private AcsChatThreadParticipantProperties participantRemoved;

    /**
     * Creates an instance of AcsChatParticipantRemovedFromThreadWithUserEventData class.
     */
    @Generated
    public AcsChatParticipantRemovedFromThreadWithUserEventData() {
    }

    /**
     * Get the time property: The time at which the user was removed to the thread.
     *
     * @return the time value.
     */
    @Generated
    public OffsetDateTime getTime() {
        return this.time;
    }

    /**
     * Set the time property: The time at which the user was removed to the thread.
     *
     * @param time the time value to set.
     * @return the AcsChatParticipantRemovedFromThreadWithUserEventData object itself.
     */
    @Generated
    public AcsChatParticipantRemovedFromThreadWithUserEventData setTime(OffsetDateTime time) {
        this.time = time;
        return this;
    }

    /**
     * Get the removedByCommunicationIdentifier property: The communication identifier of the user who removed the user.
     *
     * @return the removedByCommunicationIdentifier value.
     */
    @Generated
    public CommunicationIdentifierModel getRemovedByCommunicationIdentifier() {
        return this.removedByCommunicationIdentifier;
    }

    /**
     * Set the removedByCommunicationIdentifier property: The communication identifier of the user who removed the user.
     *
     * @param removedByCommunicationIdentifier the removedByCommunicationIdentifier value to set.
     * @return the AcsChatParticipantRemovedFromThreadWithUserEventData object itself.
     */
    @Generated
    public AcsChatParticipantRemovedFromThreadWithUserEventData
        setRemovedByCommunicationIdentifier(CommunicationIdentifierModel removedByCommunicationIdentifier) {
        this.removedByCommunicationIdentifier = removedByCommunicationIdentifier;
        return this;
    }

    /**
     * Get the participantRemoved property: The details of the user who was removed.
     *
     * @return the participantRemoved value.
     */
    @Generated
    public AcsChatThreadParticipantProperties getParticipantRemoved() {
        return this.participantRemoved;
    }

    /**
     * Set the participantRemoved property: The details of the user who was removed.
     *
     * @param participantRemoved the participantRemoved value to set.
     * @return the AcsChatParticipantRemovedFromThreadWithUserEventData object itself.
     */
    @Generated
    public AcsChatParticipantRemovedFromThreadWithUserEventData
        setParticipantRemoved(AcsChatThreadParticipantProperties participantRemoved) {
        this.participantRemoved = participantRemoved;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public AcsChatParticipantRemovedFromThreadWithUserEventData setCreateTime(OffsetDateTime createTime) {
        super.setCreateTime(createTime);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public AcsChatParticipantRemovedFromThreadWithUserEventData setVersion(Long version) {
        super.setVersion(version);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public AcsChatParticipantRemovedFromThreadWithUserEventData
        setRecipientCommunicationIdentifier(CommunicationIdentifierModel recipientCommunicationIdentifier) {
        super.setRecipientCommunicationIdentifier(recipientCommunicationIdentifier);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public AcsChatParticipantRemovedFromThreadWithUserEventData setTransactionId(String transactionId) {
        super.setTransactionId(transactionId);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public AcsChatParticipantRemovedFromThreadWithUserEventData setThreadId(String threadId) {
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
        jsonWriter.writeJsonField("recipientCommunicationIdentifier", getRecipientCommunicationIdentifier());
        jsonWriter.writeStringField("transactionId", getTransactionId());
        jsonWriter.writeStringField("threadId", getThreadId());
        jsonWriter.writeStringField("createTime",
            getCreateTime() == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(getCreateTime()));
        jsonWriter.writeNumberField("version", getVersion());
        jsonWriter.writeJsonField("removedByCommunicationIdentifier", this.removedByCommunicationIdentifier);
        jsonWriter.writeJsonField("participantRemoved", this.participantRemoved);
        jsonWriter.writeStringField("time",
            this.time == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.time));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AcsChatParticipantRemovedFromThreadWithUserEventData from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of AcsChatParticipantRemovedFromThreadWithUserEventData if the JsonReader was pointing to an
     * instance of it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the AcsChatParticipantRemovedFromThreadWithUserEventData.
     */
    @Generated
    public static AcsChatParticipantRemovedFromThreadWithUserEventData fromJson(JsonReader jsonReader)
        throws IOException {
        return jsonReader.readObject(reader -> {
            AcsChatParticipantRemovedFromThreadWithUserEventData deserializedAcsChatParticipantRemovedFromThreadWithUserEventData
                = new AcsChatParticipantRemovedFromThreadWithUserEventData();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("recipientCommunicationIdentifier".equals(fieldName)) {
                    deserializedAcsChatParticipantRemovedFromThreadWithUserEventData
                        .setRecipientCommunicationIdentifier(CommunicationIdentifierModel.fromJson(reader));
                } else if ("transactionId".equals(fieldName)) {
                    deserializedAcsChatParticipantRemovedFromThreadWithUserEventData
                        .setTransactionId(reader.getString());
                } else if ("threadId".equals(fieldName)) {
                    deserializedAcsChatParticipantRemovedFromThreadWithUserEventData.setThreadId(reader.getString());
                } else if ("createTime".equals(fieldName)) {
                    deserializedAcsChatParticipantRemovedFromThreadWithUserEventData.setCreateTime(reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString())));
                } else if ("version".equals(fieldName)) {
                    deserializedAcsChatParticipantRemovedFromThreadWithUserEventData
                        .setVersion(reader.getNullable(JsonReader::getLong));
                } else if ("removedByCommunicationIdentifier".equals(fieldName)) {
                    deserializedAcsChatParticipantRemovedFromThreadWithUserEventData.removedByCommunicationIdentifier
                        = CommunicationIdentifierModel.fromJson(reader);
                } else if ("participantRemoved".equals(fieldName)) {
                    deserializedAcsChatParticipantRemovedFromThreadWithUserEventData.participantRemoved
                        = AcsChatThreadParticipantProperties.fromJson(reader);
                } else if ("time".equals(fieldName)) {
                    deserializedAcsChatParticipantRemovedFromThreadWithUserEventData.time = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedAcsChatParticipantRemovedFromThreadWithUserEventData;
        });
    }
}
