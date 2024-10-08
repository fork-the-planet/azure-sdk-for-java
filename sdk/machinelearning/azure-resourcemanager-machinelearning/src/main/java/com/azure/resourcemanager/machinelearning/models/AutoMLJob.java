// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.Map;

/**
 * AutoMLJob class.
 * Use this class for executing AutoML tasks like Classification/Regression etc.
 * See TaskType enum for all the tasks supported.
 */
@Fluent
public final class AutoMLJob extends JobBaseProperties {
    /*
     * [Required] Specifies the type of job.
     */
    private JobType jobType = JobType.AUTO_ML;

    /*
     * Compute Resource configuration for the job.
     */
    private JobResourceConfiguration resources;

    /*
     * The ARM resource ID of the Environment specification for the job.
     * This is optional value to provide, if not provided, AutoML will default this to Production AutoML curated
     * environment version when running the job.
     */
    private String environmentId;

    /*
     * Environment variables included in the job.
     */
    private Map<String, String> environmentVariables;

    /*
     * [Required] This represents scenario which can be one of Tables/NLP/Image
     */
    private AutoMLVertical taskDetails;

    /*
     * Mapping of output data bindings used in the job.
     */
    private Map<String, JobOutput> outputs;

    /*
     * Queue settings for the job
     */
    private QueueSettings queueSettings;

    /*
     * Status of the job.
     */
    private JobStatus status;

    /**
     * Creates an instance of AutoMLJob class.
     */
    public AutoMLJob() {
    }

    /**
     * Get the jobType property: [Required] Specifies the type of job.
     * 
     * @return the jobType value.
     */
    @Override
    public JobType jobType() {
        return this.jobType;
    }

    /**
     * Get the resources property: Compute Resource configuration for the job.
     * 
     * @return the resources value.
     */
    public JobResourceConfiguration resources() {
        return this.resources;
    }

    /**
     * Set the resources property: Compute Resource configuration for the job.
     * 
     * @param resources the resources value to set.
     * @return the AutoMLJob object itself.
     */
    public AutoMLJob withResources(JobResourceConfiguration resources) {
        this.resources = resources;
        return this;
    }

    /**
     * Get the environmentId property: The ARM resource ID of the Environment specification for the job.
     * This is optional value to provide, if not provided, AutoML will default this to Production AutoML curated
     * environment version when running the job.
     * 
     * @return the environmentId value.
     */
    public String environmentId() {
        return this.environmentId;
    }

    /**
     * Set the environmentId property: The ARM resource ID of the Environment specification for the job.
     * This is optional value to provide, if not provided, AutoML will default this to Production AutoML curated
     * environment version when running the job.
     * 
     * @param environmentId the environmentId value to set.
     * @return the AutoMLJob object itself.
     */
    public AutoMLJob withEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
        return this;
    }

    /**
     * Get the environmentVariables property: Environment variables included in the job.
     * 
     * @return the environmentVariables value.
     */
    public Map<String, String> environmentVariables() {
        return this.environmentVariables;
    }

    /**
     * Set the environmentVariables property: Environment variables included in the job.
     * 
     * @param environmentVariables the environmentVariables value to set.
     * @return the AutoMLJob object itself.
     */
    public AutoMLJob withEnvironmentVariables(Map<String, String> environmentVariables) {
        this.environmentVariables = environmentVariables;
        return this;
    }

    /**
     * Get the taskDetails property: [Required] This represents scenario which can be one of Tables/NLP/Image.
     * 
     * @return the taskDetails value.
     */
    public AutoMLVertical taskDetails() {
        return this.taskDetails;
    }

    /**
     * Set the taskDetails property: [Required] This represents scenario which can be one of Tables/NLP/Image.
     * 
     * @param taskDetails the taskDetails value to set.
     * @return the AutoMLJob object itself.
     */
    public AutoMLJob withTaskDetails(AutoMLVertical taskDetails) {
        this.taskDetails = taskDetails;
        return this;
    }

    /**
     * Get the outputs property: Mapping of output data bindings used in the job.
     * 
     * @return the outputs value.
     */
    public Map<String, JobOutput> outputs() {
        return this.outputs;
    }

    /**
     * Set the outputs property: Mapping of output data bindings used in the job.
     * 
     * @param outputs the outputs value to set.
     * @return the AutoMLJob object itself.
     */
    public AutoMLJob withOutputs(Map<String, JobOutput> outputs) {
        this.outputs = outputs;
        return this;
    }

    /**
     * Get the queueSettings property: Queue settings for the job.
     * 
     * @return the queueSettings value.
     */
    public QueueSettings queueSettings() {
        return this.queueSettings;
    }

    /**
     * Set the queueSettings property: Queue settings for the job.
     * 
     * @param queueSettings the queueSettings value to set.
     * @return the AutoMLJob object itself.
     */
    public AutoMLJob withQueueSettings(QueueSettings queueSettings) {
        this.queueSettings = queueSettings;
        return this;
    }

    /**
     * Get the status property: Status of the job.
     * 
     * @return the status value.
     */
    @Override
    public JobStatus status() {
        return this.status;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AutoMLJob withDisplayName(String displayName) {
        super.withDisplayName(displayName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AutoMLJob withExperimentName(String experimentName) {
        super.withExperimentName(experimentName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AutoMLJob withServices(Map<String, JobService> services) {
        super.withServices(services);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AutoMLJob withComputeId(String computeId) {
        super.withComputeId(computeId);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AutoMLJob withIsArchived(Boolean isArchived) {
        super.withIsArchived(isArchived);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AutoMLJob withIdentity(IdentityConfiguration identity) {
        super.withIdentity(identity);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AutoMLJob withComponentId(String componentId) {
        super.withComponentId(componentId);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AutoMLJob withNotificationSetting(NotificationSetting notificationSetting) {
        super.withNotificationSetting(notificationSetting);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AutoMLJob withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AutoMLJob withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AutoMLJob withProperties(Map<String, String> properties) {
        super.withProperties(properties);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (resources() != null) {
            resources().validate();
        }
        if (taskDetails() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property taskDetails in model AutoMLJob"));
        } else {
            taskDetails().validate();
        }
        if (outputs() != null) {
            outputs().values().forEach(e -> {
                if (e != null) {
                    e.validate();
                }
            });
        }
        if (queueSettings() != null) {
            queueSettings().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AutoMLJob.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("description", description());
        jsonWriter.writeMapField("tags", tags(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeMapField("properties", properties(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("displayName", displayName());
        jsonWriter.writeStringField("experimentName", experimentName());
        jsonWriter.writeMapField("services", services(), (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("computeId", computeId());
        jsonWriter.writeBooleanField("isArchived", isArchived());
        jsonWriter.writeJsonField("identity", identity());
        jsonWriter.writeStringField("componentId", componentId());
        jsonWriter.writeJsonField("notificationSetting", notificationSetting());
        jsonWriter.writeJsonField("taskDetails", this.taskDetails);
        jsonWriter.writeStringField("jobType", this.jobType == null ? null : this.jobType.toString());
        jsonWriter.writeJsonField("resources", this.resources);
        jsonWriter.writeStringField("environmentId", this.environmentId);
        jsonWriter.writeMapField("environmentVariables", this.environmentVariables,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeMapField("outputs", this.outputs, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeJsonField("queueSettings", this.queueSettings);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AutoMLJob from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AutoMLJob if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the AutoMLJob.
     */
    public static AutoMLJob fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AutoMLJob deserializedAutoMLJob = new AutoMLJob();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("description".equals(fieldName)) {
                    deserializedAutoMLJob.withDescription(reader.getString());
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedAutoMLJob.withTags(tags);
                } else if ("properties".equals(fieldName)) {
                    Map<String, String> properties = reader.readMap(reader1 -> reader1.getString());
                    deserializedAutoMLJob.withProperties(properties);
                } else if ("displayName".equals(fieldName)) {
                    deserializedAutoMLJob.withDisplayName(reader.getString());
                } else if ("status".equals(fieldName)) {
                    deserializedAutoMLJob.status = JobStatus.fromString(reader.getString());
                } else if ("experimentName".equals(fieldName)) {
                    deserializedAutoMLJob.withExperimentName(reader.getString());
                } else if ("services".equals(fieldName)) {
                    Map<String, JobService> services = reader.readMap(reader1 -> JobService.fromJson(reader1));
                    deserializedAutoMLJob.withServices(services);
                } else if ("computeId".equals(fieldName)) {
                    deserializedAutoMLJob.withComputeId(reader.getString());
                } else if ("isArchived".equals(fieldName)) {
                    deserializedAutoMLJob.withIsArchived(reader.getNullable(JsonReader::getBoolean));
                } else if ("identity".equals(fieldName)) {
                    deserializedAutoMLJob.withIdentity(IdentityConfiguration.fromJson(reader));
                } else if ("componentId".equals(fieldName)) {
                    deserializedAutoMLJob.withComponentId(reader.getString());
                } else if ("notificationSetting".equals(fieldName)) {
                    deserializedAutoMLJob.withNotificationSetting(NotificationSetting.fromJson(reader));
                } else if ("taskDetails".equals(fieldName)) {
                    deserializedAutoMLJob.taskDetails = AutoMLVertical.fromJson(reader);
                } else if ("jobType".equals(fieldName)) {
                    deserializedAutoMLJob.jobType = JobType.fromString(reader.getString());
                } else if ("resources".equals(fieldName)) {
                    deserializedAutoMLJob.resources = JobResourceConfiguration.fromJson(reader);
                } else if ("environmentId".equals(fieldName)) {
                    deserializedAutoMLJob.environmentId = reader.getString();
                } else if ("environmentVariables".equals(fieldName)) {
                    Map<String, String> environmentVariables = reader.readMap(reader1 -> reader1.getString());
                    deserializedAutoMLJob.environmentVariables = environmentVariables;
                } else if ("outputs".equals(fieldName)) {
                    Map<String, JobOutput> outputs = reader.readMap(reader1 -> JobOutput.fromJson(reader1));
                    deserializedAutoMLJob.outputs = outputs;
                } else if ("queueSettings".equals(fieldName)) {
                    deserializedAutoMLJob.queueSettings = QueueSettings.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAutoMLJob;
        });
    }
}
