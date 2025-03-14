// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.reservations.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Properties needed for calculate refund including the scope and the reservation to be returned.
 */
@Fluent
public final class CalculateRefundRequestProperties implements JsonSerializable<CalculateRefundRequestProperties> {
    /*
     * The scope of the refund, e.g. Reservation
     */
    private String scope;

    /*
     * Reservation to return
     */
    private ReservationToReturn reservationToReturn;

    /**
     * Creates an instance of CalculateRefundRequestProperties class.
     */
    public CalculateRefundRequestProperties() {
    }

    /**
     * Get the scope property: The scope of the refund, e.g. Reservation.
     * 
     * @return the scope value.
     */
    public String scope() {
        return this.scope;
    }

    /**
     * Set the scope property: The scope of the refund, e.g. Reservation.
     * 
     * @param scope the scope value to set.
     * @return the CalculateRefundRequestProperties object itself.
     */
    public CalculateRefundRequestProperties withScope(String scope) {
        this.scope = scope;
        return this;
    }

    /**
     * Get the reservationToReturn property: Reservation to return.
     * 
     * @return the reservationToReturn value.
     */
    public ReservationToReturn reservationToReturn() {
        return this.reservationToReturn;
    }

    /**
     * Set the reservationToReturn property: Reservation to return.
     * 
     * @param reservationToReturn the reservationToReturn value to set.
     * @return the CalculateRefundRequestProperties object itself.
     */
    public CalculateRefundRequestProperties withReservationToReturn(ReservationToReturn reservationToReturn) {
        this.reservationToReturn = reservationToReturn;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (reservationToReturn() != null) {
            reservationToReturn().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("scope", this.scope);
        jsonWriter.writeJsonField("reservationToReturn", this.reservationToReturn);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CalculateRefundRequestProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CalculateRefundRequestProperties if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the CalculateRefundRequestProperties.
     */
    public static CalculateRefundRequestProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CalculateRefundRequestProperties deserializedCalculateRefundRequestProperties
                = new CalculateRefundRequestProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("scope".equals(fieldName)) {
                    deserializedCalculateRefundRequestProperties.scope = reader.getString();
                } else if ("reservationToReturn".equals(fieldName)) {
                    deserializedCalculateRefundRequestProperties.reservationToReturn
                        = ReservationToReturn.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCalculateRefundRequestProperties;
        });
    }
}
