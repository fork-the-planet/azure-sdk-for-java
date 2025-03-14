// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appconfiguration.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.appconfiguration.models.CompositionType;
import com.azure.resourcemanager.appconfiguration.models.KeyValueFilter;
import com.azure.resourcemanager.appconfiguration.models.ProvisioningState;
import com.azure.resourcemanager.appconfiguration.models.SnapshotStatus;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/**
 * All snapshot properties.
 */
@Fluent
public final class SnapshotProperties implements JsonSerializable<SnapshotProperties> {
    /*
     * The provisioning state of the snapshot.
     */
    private ProvisioningState provisioningState;

    /*
     * The current status of the snapshot.
     */
    private SnapshotStatus status;

    /*
     * A list of filters used to filter the key-values included in the snapshot.
     */
    private List<KeyValueFilter> filters;

    /*
     * The composition type describes how the key-values within the snapshot are composed. The 'key' composition type
     * ensures there are no two key-values containing the same key. The 'key_label' composition type ensures there are
     * no two key-values containing the same key and label.
     */
    private CompositionType compositionType;

    /*
     * The time that the snapshot was created.
     */
    private OffsetDateTime created;

    /*
     * The time that the snapshot will expire.
     */
    private OffsetDateTime expires;

    /*
     * The amount of time, in seconds, that a snapshot will remain in the archived state before expiring. This property
     * is only writable during the creation of a snapshot. If not specified, the default lifetime of key-value revisions
     * will be used.
     */
    private Long retentionPeriod;

    /*
     * The size in bytes of the snapshot.
     */
    private Long size;

    /*
     * The amount of key-values in the snapshot.
     */
    private Long itemsCount;

    /*
     * The tags of the snapshot. NOTE: These are data plane tags, not Azure Resource Manager (ARM) tags.
     */
    private Map<String, String> tags;

    /*
     * A value representing the current state of the snapshot.
     */
    private String etag;

    /**
     * Creates an instance of SnapshotProperties class.
     */
    public SnapshotProperties() {
    }

    /**
     * Get the provisioningState property: The provisioning state of the snapshot.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the status property: The current status of the snapshot.
     * 
     * @return the status value.
     */
    public SnapshotStatus status() {
        return this.status;
    }

    /**
     * Get the filters property: A list of filters used to filter the key-values included in the snapshot.
     * 
     * @return the filters value.
     */
    public List<KeyValueFilter> filters() {
        return this.filters;
    }

    /**
     * Set the filters property: A list of filters used to filter the key-values included in the snapshot.
     * 
     * @param filters the filters value to set.
     * @return the SnapshotProperties object itself.
     */
    public SnapshotProperties withFilters(List<KeyValueFilter> filters) {
        this.filters = filters;
        return this;
    }

    /**
     * Get the compositionType property: The composition type describes how the key-values within the snapshot are
     * composed. The 'key' composition type ensures there are no two key-values containing the same key. The 'key_label'
     * composition type ensures there are no two key-values containing the same key and label.
     * 
     * @return the compositionType value.
     */
    public CompositionType compositionType() {
        return this.compositionType;
    }

    /**
     * Set the compositionType property: The composition type describes how the key-values within the snapshot are
     * composed. The 'key' composition type ensures there are no two key-values containing the same key. The 'key_label'
     * composition type ensures there are no two key-values containing the same key and label.
     * 
     * @param compositionType the compositionType value to set.
     * @return the SnapshotProperties object itself.
     */
    public SnapshotProperties withCompositionType(CompositionType compositionType) {
        this.compositionType = compositionType;
        return this;
    }

    /**
     * Get the created property: The time that the snapshot was created.
     * 
     * @return the created value.
     */
    public OffsetDateTime created() {
        return this.created;
    }

    /**
     * Get the expires property: The time that the snapshot will expire.
     * 
     * @return the expires value.
     */
    public OffsetDateTime expires() {
        return this.expires;
    }

    /**
     * Get the retentionPeriod property: The amount of time, in seconds, that a snapshot will remain in the archived
     * state before expiring. This property is only writable during the creation of a snapshot. If not specified, the
     * default lifetime of key-value revisions will be used.
     * 
     * @return the retentionPeriod value.
     */
    public Long retentionPeriod() {
        return this.retentionPeriod;
    }

    /**
     * Set the retentionPeriod property: The amount of time, in seconds, that a snapshot will remain in the archived
     * state before expiring. This property is only writable during the creation of a snapshot. If not specified, the
     * default lifetime of key-value revisions will be used.
     * 
     * @param retentionPeriod the retentionPeriod value to set.
     * @return the SnapshotProperties object itself.
     */
    public SnapshotProperties withRetentionPeriod(Long retentionPeriod) {
        this.retentionPeriod = retentionPeriod;
        return this;
    }

    /**
     * Get the size property: The size in bytes of the snapshot.
     * 
     * @return the size value.
     */
    public Long size() {
        return this.size;
    }

    /**
     * Get the itemsCount property: The amount of key-values in the snapshot.
     * 
     * @return the itemsCount value.
     */
    public Long itemsCount() {
        return this.itemsCount;
    }

    /**
     * Get the tags property: The tags of the snapshot. NOTE: These are data plane tags, not Azure Resource Manager
     * (ARM) tags.
     * 
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: The tags of the snapshot. NOTE: These are data plane tags, not Azure Resource Manager
     * (ARM) tags.
     * 
     * @param tags the tags value to set.
     * @return the SnapshotProperties object itself.
     */
    public SnapshotProperties withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the etag property: A value representing the current state of the snapshot.
     * 
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (filters() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property filters in model SnapshotProperties"));
        } else {
            filters().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(SnapshotProperties.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("filters", this.filters, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("compositionType",
            this.compositionType == null ? null : this.compositionType.toString());
        jsonWriter.writeNumberField("retentionPeriod", this.retentionPeriod);
        jsonWriter.writeMapField("tags", this.tags, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SnapshotProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SnapshotProperties if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the SnapshotProperties.
     */
    public static SnapshotProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SnapshotProperties deserializedSnapshotProperties = new SnapshotProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("filters".equals(fieldName)) {
                    List<KeyValueFilter> filters = reader.readArray(reader1 -> KeyValueFilter.fromJson(reader1));
                    deserializedSnapshotProperties.filters = filters;
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedSnapshotProperties.provisioningState = ProvisioningState.fromString(reader.getString());
                } else if ("status".equals(fieldName)) {
                    deserializedSnapshotProperties.status = SnapshotStatus.fromString(reader.getString());
                } else if ("compositionType".equals(fieldName)) {
                    deserializedSnapshotProperties.compositionType = CompositionType.fromString(reader.getString());
                } else if ("created".equals(fieldName)) {
                    deserializedSnapshotProperties.created = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("expires".equals(fieldName)) {
                    deserializedSnapshotProperties.expires = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("retentionPeriod".equals(fieldName)) {
                    deserializedSnapshotProperties.retentionPeriod = reader.getNullable(JsonReader::getLong);
                } else if ("size".equals(fieldName)) {
                    deserializedSnapshotProperties.size = reader.getNullable(JsonReader::getLong);
                } else if ("itemsCount".equals(fieldName)) {
                    deserializedSnapshotProperties.itemsCount = reader.getNullable(JsonReader::getLong);
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedSnapshotProperties.tags = tags;
                } else if ("etag".equals(fieldName)) {
                    deserializedSnapshotProperties.etag = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSnapshotProperties;
        });
    }
}
