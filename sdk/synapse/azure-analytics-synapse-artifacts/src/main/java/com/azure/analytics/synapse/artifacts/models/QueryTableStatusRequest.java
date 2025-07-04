// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The QueryTableStatusRequest model.
 */
@Fluent
public final class QueryTableStatusRequest implements JsonSerializable<QueryTableStatusRequest> {
    /*
     * Max segment count to query table status
     */
    @Generated
    private Integer maxSegmentCount;

    /*
     * Continuation token to query table status
     */
    @Generated
    private Object continuationToken;

    /**
     * Creates an instance of QueryTableStatusRequest class.
     */
    @Generated
    public QueryTableStatusRequest() {
    }

    /**
     * Get the maxSegmentCount property: Max segment count to query table status.
     * 
     * @return the maxSegmentCount value.
     */
    @Generated
    public Integer getMaxSegmentCount() {
        return this.maxSegmentCount;
    }

    /**
     * Set the maxSegmentCount property: Max segment count to query table status.
     * 
     * @param maxSegmentCount the maxSegmentCount value to set.
     * @return the QueryTableStatusRequest object itself.
     */
    @Generated
    public QueryTableStatusRequest setMaxSegmentCount(Integer maxSegmentCount) {
        this.maxSegmentCount = maxSegmentCount;
        return this;
    }

    /**
     * Get the continuationToken property: Continuation token to query table status.
     * 
     * @return the continuationToken value.
     */
    @Generated
    public Object getContinuationToken() {
        return this.continuationToken;
    }

    /**
     * Set the continuationToken property: Continuation token to query table status.
     * 
     * @param continuationToken the continuationToken value to set.
     * @return the QueryTableStatusRequest object itself.
     */
    @Generated
    public QueryTableStatusRequest setContinuationToken(Object continuationToken) {
        this.continuationToken = continuationToken;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeNumberField("maxSegmentCount", this.maxSegmentCount);
        if (this.continuationToken != null) {
            jsonWriter.writeUntypedField("continuationToken", this.continuationToken);
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of QueryTableStatusRequest from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of QueryTableStatusRequest if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the QueryTableStatusRequest.
     */
    @Generated
    public static QueryTableStatusRequest fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            QueryTableStatusRequest deserializedQueryTableStatusRequest = new QueryTableStatusRequest();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("maxSegmentCount".equals(fieldName)) {
                    deserializedQueryTableStatusRequest.maxSegmentCount = reader.getNullable(JsonReader::getInt);
                } else if ("continuationToken".equals(fieldName)) {
                    deserializedQueryTableStatusRequest.continuationToken = reader.readUntyped();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedQueryTableStatusRequest;
        });
    }
}
