// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Input for task that validates migration input for SQL to Azure SQL Managed Instance.
 */
@Fluent
public final class ValidateMigrationInputSqlServerSqlMITaskInput
    implements JsonSerializable<ValidateMigrationInputSqlServerSqlMITaskInput> {
    /*
     * Information for connecting to source
     */
    private SqlConnectionInfo sourceConnectionInfo;

    /*
     * Information for connecting to target
     */
    private SqlConnectionInfo targetConnectionInfo;

    /*
     * Databases to migrate
     */
    private List<MigrateSqlServerSqlMIDatabaseInput> selectedDatabases;

    /*
     * Logins to migrate
     */
    private List<String> selectedLogins;

    /*
     * Backup file share information for all selected databases.
     */
    private FileShare backupFileShare;

    /*
     * SAS URI of Azure Storage Account Container to be used for storing backup files.
     */
    private BlobShare backupBlobShare;

    /*
     * Backup Mode to specify whether to use existing backup or create new backup.
     */
    private BackupMode backupMode;

    /**
     * Creates an instance of ValidateMigrationInputSqlServerSqlMITaskInput class.
     */
    public ValidateMigrationInputSqlServerSqlMITaskInput() {
    }

    /**
     * Get the sourceConnectionInfo property: Information for connecting to source.
     * 
     * @return the sourceConnectionInfo value.
     */
    public SqlConnectionInfo sourceConnectionInfo() {
        return this.sourceConnectionInfo;
    }

    /**
     * Set the sourceConnectionInfo property: Information for connecting to source.
     * 
     * @param sourceConnectionInfo the sourceConnectionInfo value to set.
     * @return the ValidateMigrationInputSqlServerSqlMITaskInput object itself.
     */
    public ValidateMigrationInputSqlServerSqlMITaskInput
        withSourceConnectionInfo(SqlConnectionInfo sourceConnectionInfo) {
        this.sourceConnectionInfo = sourceConnectionInfo;
        return this;
    }

    /**
     * Get the targetConnectionInfo property: Information for connecting to target.
     * 
     * @return the targetConnectionInfo value.
     */
    public SqlConnectionInfo targetConnectionInfo() {
        return this.targetConnectionInfo;
    }

    /**
     * Set the targetConnectionInfo property: Information for connecting to target.
     * 
     * @param targetConnectionInfo the targetConnectionInfo value to set.
     * @return the ValidateMigrationInputSqlServerSqlMITaskInput object itself.
     */
    public ValidateMigrationInputSqlServerSqlMITaskInput
        withTargetConnectionInfo(SqlConnectionInfo targetConnectionInfo) {
        this.targetConnectionInfo = targetConnectionInfo;
        return this;
    }

    /**
     * Get the selectedDatabases property: Databases to migrate.
     * 
     * @return the selectedDatabases value.
     */
    public List<MigrateSqlServerSqlMIDatabaseInput> selectedDatabases() {
        return this.selectedDatabases;
    }

    /**
     * Set the selectedDatabases property: Databases to migrate.
     * 
     * @param selectedDatabases the selectedDatabases value to set.
     * @return the ValidateMigrationInputSqlServerSqlMITaskInput object itself.
     */
    public ValidateMigrationInputSqlServerSqlMITaskInput
        withSelectedDatabases(List<MigrateSqlServerSqlMIDatabaseInput> selectedDatabases) {
        this.selectedDatabases = selectedDatabases;
        return this;
    }

    /**
     * Get the selectedLogins property: Logins to migrate.
     * 
     * @return the selectedLogins value.
     */
    public List<String> selectedLogins() {
        return this.selectedLogins;
    }

    /**
     * Set the selectedLogins property: Logins to migrate.
     * 
     * @param selectedLogins the selectedLogins value to set.
     * @return the ValidateMigrationInputSqlServerSqlMITaskInput object itself.
     */
    public ValidateMigrationInputSqlServerSqlMITaskInput withSelectedLogins(List<String> selectedLogins) {
        this.selectedLogins = selectedLogins;
        return this;
    }

    /**
     * Get the backupFileShare property: Backup file share information for all selected databases.
     * 
     * @return the backupFileShare value.
     */
    public FileShare backupFileShare() {
        return this.backupFileShare;
    }

    /**
     * Set the backupFileShare property: Backup file share information for all selected databases.
     * 
     * @param backupFileShare the backupFileShare value to set.
     * @return the ValidateMigrationInputSqlServerSqlMITaskInput object itself.
     */
    public ValidateMigrationInputSqlServerSqlMITaskInput withBackupFileShare(FileShare backupFileShare) {
        this.backupFileShare = backupFileShare;
        return this;
    }

    /**
     * Get the backupBlobShare property: SAS URI of Azure Storage Account Container to be used for storing backup files.
     * 
     * @return the backupBlobShare value.
     */
    public BlobShare backupBlobShare() {
        return this.backupBlobShare;
    }

    /**
     * Set the backupBlobShare property: SAS URI of Azure Storage Account Container to be used for storing backup files.
     * 
     * @param backupBlobShare the backupBlobShare value to set.
     * @return the ValidateMigrationInputSqlServerSqlMITaskInput object itself.
     */
    public ValidateMigrationInputSqlServerSqlMITaskInput withBackupBlobShare(BlobShare backupBlobShare) {
        this.backupBlobShare = backupBlobShare;
        return this;
    }

    /**
     * Get the backupMode property: Backup Mode to specify whether to use existing backup or create new backup.
     * 
     * @return the backupMode value.
     */
    public BackupMode backupMode() {
        return this.backupMode;
    }

    /**
     * Set the backupMode property: Backup Mode to specify whether to use existing backup or create new backup.
     * 
     * @param backupMode the backupMode value to set.
     * @return the ValidateMigrationInputSqlServerSqlMITaskInput object itself.
     */
    public ValidateMigrationInputSqlServerSqlMITaskInput withBackupMode(BackupMode backupMode) {
        this.backupMode = backupMode;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sourceConnectionInfo() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property sourceConnectionInfo in model ValidateMigrationInputSqlServerSqlMITaskInput"));
        } else {
            sourceConnectionInfo().validate();
        }
        if (targetConnectionInfo() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property targetConnectionInfo in model ValidateMigrationInputSqlServerSqlMITaskInput"));
        } else {
            targetConnectionInfo().validate();
        }
        if (selectedDatabases() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property selectedDatabases in model ValidateMigrationInputSqlServerSqlMITaskInput"));
        } else {
            selectedDatabases().forEach(e -> e.validate());
        }
        if (backupFileShare() != null) {
            backupFileShare().validate();
        }
        if (backupBlobShare() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property backupBlobShare in model ValidateMigrationInputSqlServerSqlMITaskInput"));
        } else {
            backupBlobShare().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ValidateMigrationInputSqlServerSqlMITaskInput.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("sourceConnectionInfo", this.sourceConnectionInfo);
        jsonWriter.writeJsonField("targetConnectionInfo", this.targetConnectionInfo);
        jsonWriter.writeArrayField("selectedDatabases", this.selectedDatabases,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeJsonField("backupBlobShare", this.backupBlobShare);
        jsonWriter.writeArrayField("selectedLogins", this.selectedLogins,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("backupFileShare", this.backupFileShare);
        jsonWriter.writeStringField("backupMode", this.backupMode == null ? null : this.backupMode.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ValidateMigrationInputSqlServerSqlMITaskInput from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ValidateMigrationInputSqlServerSqlMITaskInput if the JsonReader was pointing to an
     * instance of it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ValidateMigrationInputSqlServerSqlMITaskInput.
     */
    public static ValidateMigrationInputSqlServerSqlMITaskInput fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ValidateMigrationInputSqlServerSqlMITaskInput deserializedValidateMigrationInputSqlServerSqlMITaskInput
                = new ValidateMigrationInputSqlServerSqlMITaskInput();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("sourceConnectionInfo".equals(fieldName)) {
                    deserializedValidateMigrationInputSqlServerSqlMITaskInput.sourceConnectionInfo
                        = SqlConnectionInfo.fromJson(reader);
                } else if ("targetConnectionInfo".equals(fieldName)) {
                    deserializedValidateMigrationInputSqlServerSqlMITaskInput.targetConnectionInfo
                        = SqlConnectionInfo.fromJson(reader);
                } else if ("selectedDatabases".equals(fieldName)) {
                    List<MigrateSqlServerSqlMIDatabaseInput> selectedDatabases
                        = reader.readArray(reader1 -> MigrateSqlServerSqlMIDatabaseInput.fromJson(reader1));
                    deserializedValidateMigrationInputSqlServerSqlMITaskInput.selectedDatabases = selectedDatabases;
                } else if ("backupBlobShare".equals(fieldName)) {
                    deserializedValidateMigrationInputSqlServerSqlMITaskInput.backupBlobShare
                        = BlobShare.fromJson(reader);
                } else if ("selectedLogins".equals(fieldName)) {
                    List<String> selectedLogins = reader.readArray(reader1 -> reader1.getString());
                    deserializedValidateMigrationInputSqlServerSqlMITaskInput.selectedLogins = selectedLogins;
                } else if ("backupFileShare".equals(fieldName)) {
                    deserializedValidateMigrationInputSqlServerSqlMITaskInput.backupFileShare
                        = FileShare.fromJson(reader);
                } else if ("backupMode".equals(fieldName)) {
                    deserializedValidateMigrationInputSqlServerSqlMITaskInput.backupMode
                        = BackupMode.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedValidateMigrationInputSqlServerSqlMITaskInput;
        });
    }
}
