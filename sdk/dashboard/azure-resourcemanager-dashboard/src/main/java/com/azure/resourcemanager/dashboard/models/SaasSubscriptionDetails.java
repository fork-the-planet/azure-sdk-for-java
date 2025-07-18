// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.dashboard.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * SaaS subscription details of a Grafana instance.
 */
@Immutable
public final class SaasSubscriptionDetails implements JsonSerializable<SaasSubscriptionDetails> {
    /*
     * The plan Id of the SaaS subscription.
     */
    private String planId;

    /*
     * The offer Id of the SaaS subscription.
     */
    private String offerId;

    /*
     * The publisher Id of the SaaS subscription.
     */
    private String publisherId;

    /*
     * The billing term of the SaaS Subscription.
     */
    private SubscriptionTerm term;

    /**
     * Creates an instance of SaasSubscriptionDetails class.
     */
    private SaasSubscriptionDetails() {
    }

    /**
     * Get the planId property: The plan Id of the SaaS subscription.
     * 
     * @return the planId value.
     */
    public String planId() {
        return this.planId;
    }

    /**
     * Get the offerId property: The offer Id of the SaaS subscription.
     * 
     * @return the offerId value.
     */
    public String offerId() {
        return this.offerId;
    }

    /**
     * Get the publisherId property: The publisher Id of the SaaS subscription.
     * 
     * @return the publisherId value.
     */
    public String publisherId() {
        return this.publisherId;
    }

    /**
     * Get the term property: The billing term of the SaaS Subscription.
     * 
     * @return the term value.
     */
    public SubscriptionTerm term() {
        return this.term;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (term() != null) {
            term().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("planId", this.planId);
        jsonWriter.writeStringField("offerId", this.offerId);
        jsonWriter.writeStringField("publisherId", this.publisherId);
        jsonWriter.writeJsonField("term", this.term);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SaasSubscriptionDetails from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SaasSubscriptionDetails if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the SaasSubscriptionDetails.
     */
    public static SaasSubscriptionDetails fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SaasSubscriptionDetails deserializedSaasSubscriptionDetails = new SaasSubscriptionDetails();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("planId".equals(fieldName)) {
                    deserializedSaasSubscriptionDetails.planId = reader.getString();
                } else if ("offerId".equals(fieldName)) {
                    deserializedSaasSubscriptionDetails.offerId = reader.getString();
                } else if ("publisherId".equals(fieldName)) {
                    deserializedSaasSubscriptionDetails.publisherId = reader.getString();
                } else if ("term".equals(fieldName)) {
                    deserializedSaasSubscriptionDetails.term = SubscriptionTerm.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSaasSubscriptionDetails;
        });
    }
}
