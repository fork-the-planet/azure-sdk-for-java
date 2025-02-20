// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The policy used for monitoring the application upgrade.
 */
@Fluent
public final class ArmRollingUpgradeMonitoringPolicy implements JsonSerializable<ArmRollingUpgradeMonitoringPolicy> {
    /*
     * The activation Mode of the service package
     */
    private ArmUpgradeFailureAction failureAction;

    /*
     * The amount of time to wait after completing an upgrade domain before applying health policies. It is first
     * interpreted as a string representing an ISO 8601 duration. If that fails, then it is interpreted as a number
     * representing the total number of milliseconds.
     */
    private String healthCheckWaitDuration;

    /*
     * The amount of time that the application or cluster must remain healthy before the upgrade proceeds to the next
     * upgrade domain. It is first interpreted as a string representing an ISO 8601 duration. If that fails, then it is
     * interpreted as a number representing the total number of milliseconds.
     */
    private String healthCheckStableDuration;

    /*
     * The amount of time to retry health evaluation when the application or cluster is unhealthy before FailureAction
     * is executed. It is first interpreted as a string representing an ISO 8601 duration. If that fails, then it is
     * interpreted as a number representing the total number of milliseconds.
     */
    private String healthCheckRetryTimeout;

    /*
     * The amount of time the overall upgrade has to complete before FailureAction is executed. It is first interpreted
     * as a string representing an ISO 8601 duration. If that fails, then it is interpreted as a number representing the
     * total number of milliseconds.
     */
    private String upgradeTimeout;

    /*
     * The amount of time each upgrade domain has to complete before FailureAction is executed. It is first interpreted
     * as a string representing an ISO 8601 duration. If that fails, then it is interpreted as a number representing the
     * total number of milliseconds.
     */
    private String upgradeDomainTimeout;

    /**
     * Creates an instance of ArmRollingUpgradeMonitoringPolicy class.
     */
    public ArmRollingUpgradeMonitoringPolicy() {
    }

    /**
     * Get the failureAction property: The activation Mode of the service package.
     * 
     * @return the failureAction value.
     */
    public ArmUpgradeFailureAction failureAction() {
        return this.failureAction;
    }

    /**
     * Set the failureAction property: The activation Mode of the service package.
     * 
     * @param failureAction the failureAction value to set.
     * @return the ArmRollingUpgradeMonitoringPolicy object itself.
     */
    public ArmRollingUpgradeMonitoringPolicy withFailureAction(ArmUpgradeFailureAction failureAction) {
        this.failureAction = failureAction;
        return this;
    }

    /**
     * Get the healthCheckWaitDuration property: The amount of time to wait after completing an upgrade domain before
     * applying health policies. It is first interpreted as a string representing an ISO 8601 duration. If that fails,
     * then it is interpreted as a number representing the total number of milliseconds.
     * 
     * @return the healthCheckWaitDuration value.
     */
    public String healthCheckWaitDuration() {
        return this.healthCheckWaitDuration;
    }

    /**
     * Set the healthCheckWaitDuration property: The amount of time to wait after completing an upgrade domain before
     * applying health policies. It is first interpreted as a string representing an ISO 8601 duration. If that fails,
     * then it is interpreted as a number representing the total number of milliseconds.
     * 
     * @param healthCheckWaitDuration the healthCheckWaitDuration value to set.
     * @return the ArmRollingUpgradeMonitoringPolicy object itself.
     */
    public ArmRollingUpgradeMonitoringPolicy withHealthCheckWaitDuration(String healthCheckWaitDuration) {
        this.healthCheckWaitDuration = healthCheckWaitDuration;
        return this;
    }

    /**
     * Get the healthCheckStableDuration property: The amount of time that the application or cluster must remain
     * healthy before the upgrade proceeds to the next upgrade domain. It is first interpreted as a string representing
     * an ISO 8601 duration. If that fails, then it is interpreted as a number representing the total number of
     * milliseconds.
     * 
     * @return the healthCheckStableDuration value.
     */
    public String healthCheckStableDuration() {
        return this.healthCheckStableDuration;
    }

    /**
     * Set the healthCheckStableDuration property: The amount of time that the application or cluster must remain
     * healthy before the upgrade proceeds to the next upgrade domain. It is first interpreted as a string representing
     * an ISO 8601 duration. If that fails, then it is interpreted as a number representing the total number of
     * milliseconds.
     * 
     * @param healthCheckStableDuration the healthCheckStableDuration value to set.
     * @return the ArmRollingUpgradeMonitoringPolicy object itself.
     */
    public ArmRollingUpgradeMonitoringPolicy withHealthCheckStableDuration(String healthCheckStableDuration) {
        this.healthCheckStableDuration = healthCheckStableDuration;
        return this;
    }

    /**
     * Get the healthCheckRetryTimeout property: The amount of time to retry health evaluation when the application or
     * cluster is unhealthy before FailureAction is executed. It is first interpreted as a string representing an ISO
     * 8601 duration. If that fails, then it is interpreted as a number representing the total number of milliseconds.
     * 
     * @return the healthCheckRetryTimeout value.
     */
    public String healthCheckRetryTimeout() {
        return this.healthCheckRetryTimeout;
    }

    /**
     * Set the healthCheckRetryTimeout property: The amount of time to retry health evaluation when the application or
     * cluster is unhealthy before FailureAction is executed. It is first interpreted as a string representing an ISO
     * 8601 duration. If that fails, then it is interpreted as a number representing the total number of milliseconds.
     * 
     * @param healthCheckRetryTimeout the healthCheckRetryTimeout value to set.
     * @return the ArmRollingUpgradeMonitoringPolicy object itself.
     */
    public ArmRollingUpgradeMonitoringPolicy withHealthCheckRetryTimeout(String healthCheckRetryTimeout) {
        this.healthCheckRetryTimeout = healthCheckRetryTimeout;
        return this;
    }

    /**
     * Get the upgradeTimeout property: The amount of time the overall upgrade has to complete before FailureAction is
     * executed. It is first interpreted as a string representing an ISO 8601 duration. If that fails, then it is
     * interpreted as a number representing the total number of milliseconds.
     * 
     * @return the upgradeTimeout value.
     */
    public String upgradeTimeout() {
        return this.upgradeTimeout;
    }

    /**
     * Set the upgradeTimeout property: The amount of time the overall upgrade has to complete before FailureAction is
     * executed. It is first interpreted as a string representing an ISO 8601 duration. If that fails, then it is
     * interpreted as a number representing the total number of milliseconds.
     * 
     * @param upgradeTimeout the upgradeTimeout value to set.
     * @return the ArmRollingUpgradeMonitoringPolicy object itself.
     */
    public ArmRollingUpgradeMonitoringPolicy withUpgradeTimeout(String upgradeTimeout) {
        this.upgradeTimeout = upgradeTimeout;
        return this;
    }

    /**
     * Get the upgradeDomainTimeout property: The amount of time each upgrade domain has to complete before
     * FailureAction is executed. It is first interpreted as a string representing an ISO 8601 duration. If that fails,
     * then it is interpreted as a number representing the total number of milliseconds.
     * 
     * @return the upgradeDomainTimeout value.
     */
    public String upgradeDomainTimeout() {
        return this.upgradeDomainTimeout;
    }

    /**
     * Set the upgradeDomainTimeout property: The amount of time each upgrade domain has to complete before
     * FailureAction is executed. It is first interpreted as a string representing an ISO 8601 duration. If that fails,
     * then it is interpreted as a number representing the total number of milliseconds.
     * 
     * @param upgradeDomainTimeout the upgradeDomainTimeout value to set.
     * @return the ArmRollingUpgradeMonitoringPolicy object itself.
     */
    public ArmRollingUpgradeMonitoringPolicy withUpgradeDomainTimeout(String upgradeDomainTimeout) {
        this.upgradeDomainTimeout = upgradeDomainTimeout;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("failureAction", this.failureAction == null ? null : this.failureAction.toString());
        jsonWriter.writeStringField("healthCheckWaitDuration", this.healthCheckWaitDuration);
        jsonWriter.writeStringField("healthCheckStableDuration", this.healthCheckStableDuration);
        jsonWriter.writeStringField("healthCheckRetryTimeout", this.healthCheckRetryTimeout);
        jsonWriter.writeStringField("upgradeTimeout", this.upgradeTimeout);
        jsonWriter.writeStringField("upgradeDomainTimeout", this.upgradeDomainTimeout);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ArmRollingUpgradeMonitoringPolicy from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ArmRollingUpgradeMonitoringPolicy if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ArmRollingUpgradeMonitoringPolicy.
     */
    public static ArmRollingUpgradeMonitoringPolicy fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ArmRollingUpgradeMonitoringPolicy deserializedArmRollingUpgradeMonitoringPolicy
                = new ArmRollingUpgradeMonitoringPolicy();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("failureAction".equals(fieldName)) {
                    deserializedArmRollingUpgradeMonitoringPolicy.failureAction
                        = ArmUpgradeFailureAction.fromString(reader.getString());
                } else if ("healthCheckWaitDuration".equals(fieldName)) {
                    deserializedArmRollingUpgradeMonitoringPolicy.healthCheckWaitDuration = reader.getString();
                } else if ("healthCheckStableDuration".equals(fieldName)) {
                    deserializedArmRollingUpgradeMonitoringPolicy.healthCheckStableDuration = reader.getString();
                } else if ("healthCheckRetryTimeout".equals(fieldName)) {
                    deserializedArmRollingUpgradeMonitoringPolicy.healthCheckRetryTimeout = reader.getString();
                } else if ("upgradeTimeout".equals(fieldName)) {
                    deserializedArmRollingUpgradeMonitoringPolicy.upgradeTimeout = reader.getString();
                } else if ("upgradeDomainTimeout".equals(fieldName)) {
                    deserializedArmRollingUpgradeMonitoringPolicy.upgradeDomainTimeout = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedArmRollingUpgradeMonitoringPolicy;
        });
    }
}
