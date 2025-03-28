// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.analytics.defender.easm.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The history of how this asset was pulled into the workspace through the discovery process.
 */
@Immutable
public final class AuditTrailItem implements JsonSerializable<AuditTrailItem> {

    /*
     * This is typically the same as the name but might be different for different models.
     */
    @Generated
    private String id;

    /*
     * The caller provided unique name for the resource.
     */
    @Generated
    private String name;

    /*
     * The name that can be used for display purposes.
     */
    @Generated
    private String displayName;

    /*
     * The kind of asset.
     */
    @Generated
    private AuditTrailItemKind kind;

    /*
     * An explanation of why this audit trail node was discovered from the previous node.
     */
    @Generated
    private String reason;

    /**
     * Creates an instance of AuditTrailItem class.
     */
    @Generated
    private AuditTrailItem() {
    }

    /**
     * Get the id property: This is typically the same as the name but might be different for different models.
     *
     * @return the id value.
     */
    @Generated
    public String getId() {
        return this.id;
    }

    /**
     * Get the name property: The caller provided unique name for the resource.
     *
     * @return the name value.
     */
    @Generated
    public String getName() {
        return this.name;
    }

    /**
     * Get the displayName property: The name that can be used for display purposes.
     *
     * @return the displayName value.
     */
    @Generated
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * Get the kind property: The kind of asset.
     *
     * @return the kind value.
     */
    @Generated
    public AuditTrailItemKind getKind() {
        return this.kind;
    }

    /**
     * Get the reason property: An explanation of why this audit trail node was discovered from the previous node.
     *
     * @return the reason value.
     */
    @Generated
    public String getReason() {
        return this.reason;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("id", this.id);
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("displayName", this.displayName);
        jsonWriter.writeStringField("kind", this.kind == null ? null : this.kind.toString());
        jsonWriter.writeStringField("reason", this.reason);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AuditTrailItem from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of AuditTrailItem if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the AuditTrailItem.
     */
    @Generated
    public static AuditTrailItem fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AuditTrailItem deserializedAuditTrailItem = new AuditTrailItem();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("id".equals(fieldName)) {
                    deserializedAuditTrailItem.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedAuditTrailItem.name = reader.getString();
                } else if ("displayName".equals(fieldName)) {
                    deserializedAuditTrailItem.displayName = reader.getString();
                } else if ("kind".equals(fieldName)) {
                    deserializedAuditTrailItem.kind = AuditTrailItemKind.fromString(reader.getString());
                } else if ("reason".equals(fieldName)) {
                    deserializedAuditTrailItem.reason = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedAuditTrailItem;
        });
    }
}
