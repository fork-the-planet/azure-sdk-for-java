// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sqlvirtualmachine.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Storage Configurations for SQL Data, Log and TempDb.
 */
@Fluent
public final class StorageConfigurationSettings implements JsonSerializable<StorageConfigurationSettings> {
    /*
     * SQL Server Data Storage Settings.
     */
    private SqlStorageSettings sqlDataSettings;

    /*
     * SQL Server Log Storage Settings.
     */
    private SqlStorageSettings sqlLogSettings;

    /*
     * SQL Server TempDb Storage Settings.
     */
    private SqlTempDbSettings sqlTempDbSettings;

    /*
     * SQL Server SystemDb Storage on DataPool if true.
     */
    private Boolean sqlSystemDbOnDataDisk;

    /*
     * Disk configuration to apply to SQL Server.
     */
    private DiskConfigurationType diskConfigurationType;

    /*
     * Storage workload type.
     */
    private StorageWorkloadType storageWorkloadType;

    /**
     * Creates an instance of StorageConfigurationSettings class.
     */
    public StorageConfigurationSettings() {
    }

    /**
     * Get the sqlDataSettings property: SQL Server Data Storage Settings.
     * 
     * @return the sqlDataSettings value.
     */
    public SqlStorageSettings sqlDataSettings() {
        return this.sqlDataSettings;
    }

    /**
     * Set the sqlDataSettings property: SQL Server Data Storage Settings.
     * 
     * @param sqlDataSettings the sqlDataSettings value to set.
     * @return the StorageConfigurationSettings object itself.
     */
    public StorageConfigurationSettings withSqlDataSettings(SqlStorageSettings sqlDataSettings) {
        this.sqlDataSettings = sqlDataSettings;
        return this;
    }

    /**
     * Get the sqlLogSettings property: SQL Server Log Storage Settings.
     * 
     * @return the sqlLogSettings value.
     */
    public SqlStorageSettings sqlLogSettings() {
        return this.sqlLogSettings;
    }

    /**
     * Set the sqlLogSettings property: SQL Server Log Storage Settings.
     * 
     * @param sqlLogSettings the sqlLogSettings value to set.
     * @return the StorageConfigurationSettings object itself.
     */
    public StorageConfigurationSettings withSqlLogSettings(SqlStorageSettings sqlLogSettings) {
        this.sqlLogSettings = sqlLogSettings;
        return this;
    }

    /**
     * Get the sqlTempDbSettings property: SQL Server TempDb Storage Settings.
     * 
     * @return the sqlTempDbSettings value.
     */
    public SqlTempDbSettings sqlTempDbSettings() {
        return this.sqlTempDbSettings;
    }

    /**
     * Set the sqlTempDbSettings property: SQL Server TempDb Storage Settings.
     * 
     * @param sqlTempDbSettings the sqlTempDbSettings value to set.
     * @return the StorageConfigurationSettings object itself.
     */
    public StorageConfigurationSettings withSqlTempDbSettings(SqlTempDbSettings sqlTempDbSettings) {
        this.sqlTempDbSettings = sqlTempDbSettings;
        return this;
    }

    /**
     * Get the sqlSystemDbOnDataDisk property: SQL Server SystemDb Storage on DataPool if true.
     * 
     * @return the sqlSystemDbOnDataDisk value.
     */
    public Boolean sqlSystemDbOnDataDisk() {
        return this.sqlSystemDbOnDataDisk;
    }

    /**
     * Set the sqlSystemDbOnDataDisk property: SQL Server SystemDb Storage on DataPool if true.
     * 
     * @param sqlSystemDbOnDataDisk the sqlSystemDbOnDataDisk value to set.
     * @return the StorageConfigurationSettings object itself.
     */
    public StorageConfigurationSettings withSqlSystemDbOnDataDisk(Boolean sqlSystemDbOnDataDisk) {
        this.sqlSystemDbOnDataDisk = sqlSystemDbOnDataDisk;
        return this;
    }

    /**
     * Get the diskConfigurationType property: Disk configuration to apply to SQL Server.
     * 
     * @return the diskConfigurationType value.
     */
    public DiskConfigurationType diskConfigurationType() {
        return this.diskConfigurationType;
    }

    /**
     * Set the diskConfigurationType property: Disk configuration to apply to SQL Server.
     * 
     * @param diskConfigurationType the diskConfigurationType value to set.
     * @return the StorageConfigurationSettings object itself.
     */
    public StorageConfigurationSettings withDiskConfigurationType(DiskConfigurationType diskConfigurationType) {
        this.diskConfigurationType = diskConfigurationType;
        return this;
    }

    /**
     * Get the storageWorkloadType property: Storage workload type.
     * 
     * @return the storageWorkloadType value.
     */
    public StorageWorkloadType storageWorkloadType() {
        return this.storageWorkloadType;
    }

    /**
     * Set the storageWorkloadType property: Storage workload type.
     * 
     * @param storageWorkloadType the storageWorkloadType value to set.
     * @return the StorageConfigurationSettings object itself.
     */
    public StorageConfigurationSettings withStorageWorkloadType(StorageWorkloadType storageWorkloadType) {
        this.storageWorkloadType = storageWorkloadType;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sqlDataSettings() != null) {
            sqlDataSettings().validate();
        }
        if (sqlLogSettings() != null) {
            sqlLogSettings().validate();
        }
        if (sqlTempDbSettings() != null) {
            sqlTempDbSettings().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("sqlDataSettings", this.sqlDataSettings);
        jsonWriter.writeJsonField("sqlLogSettings", this.sqlLogSettings);
        jsonWriter.writeJsonField("sqlTempDbSettings", this.sqlTempDbSettings);
        jsonWriter.writeBooleanField("sqlSystemDbOnDataDisk", this.sqlSystemDbOnDataDisk);
        jsonWriter.writeStringField("diskConfigurationType",
            this.diskConfigurationType == null ? null : this.diskConfigurationType.toString());
        jsonWriter.writeStringField("storageWorkloadType",
            this.storageWorkloadType == null ? null : this.storageWorkloadType.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of StorageConfigurationSettings from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of StorageConfigurationSettings if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the StorageConfigurationSettings.
     */
    public static StorageConfigurationSettings fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            StorageConfigurationSettings deserializedStorageConfigurationSettings = new StorageConfigurationSettings();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("sqlDataSettings".equals(fieldName)) {
                    deserializedStorageConfigurationSettings.sqlDataSettings = SqlStorageSettings.fromJson(reader);
                } else if ("sqlLogSettings".equals(fieldName)) {
                    deserializedStorageConfigurationSettings.sqlLogSettings = SqlStorageSettings.fromJson(reader);
                } else if ("sqlTempDbSettings".equals(fieldName)) {
                    deserializedStorageConfigurationSettings.sqlTempDbSettings = SqlTempDbSettings.fromJson(reader);
                } else if ("sqlSystemDbOnDataDisk".equals(fieldName)) {
                    deserializedStorageConfigurationSettings.sqlSystemDbOnDataDisk
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("diskConfigurationType".equals(fieldName)) {
                    deserializedStorageConfigurationSettings.diskConfigurationType
                        = DiskConfigurationType.fromString(reader.getString());
                } else if ("storageWorkloadType".equals(fieldName)) {
                    deserializedStorageConfigurationSettings.storageWorkloadType
                        = StorageWorkloadType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedStorageConfigurationSettings;
        });
    }
}
