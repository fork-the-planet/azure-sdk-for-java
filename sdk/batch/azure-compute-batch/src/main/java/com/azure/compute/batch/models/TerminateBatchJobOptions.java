// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;

/**
 * Optional parameters for Terminate Job operation.
 */
@Fluent
public final class TerminateBatchJobOptions {

    /*
     * The maximum time that the server can spend processing the request, in seconds. The default is 30 seconds. If the
     * value is larger than 30, the default will be used instead.".
     */
    @Generated
    private Integer timeOutInSeconds;

    /*
     * The options to use for terminating the Job.
     */
    @Generated
    private BatchJobTerminateContent parameters;

    /*
     * If true, the server will terminate the Job even if the corresponding nodes have not fully processed the
     * termination. The default value is false.
     */
    @Generated
    private Boolean force;

    /**
     * Creates an instance of TerminateBatchJobOptions class.
     */
    @Generated
    public TerminateBatchJobOptions() {
    }

    /**
     * Get the timeOutInSeconds property: The maximum time that the server can spend processing the request, in seconds.
     * The default is 30 seconds. If the value is larger than 30, the default will be used instead.".
     *
     * @return the timeOutInSeconds value.
     */
    @Generated
    public Integer getTimeOutInSeconds() {
        return this.timeOutInSeconds;
    }

    /**
     * Set the timeOutInSeconds property: The maximum time that the server can spend processing the request, in seconds.
     * The default is 30 seconds. If the value is larger than 30, the default will be used instead.".
     *
     * @param timeOutInSeconds the timeOutInSeconds value to set.
     * @return the TerminateBatchJobOptions object itself.
     */
    @Generated
    public TerminateBatchJobOptions setTimeOutInSeconds(Integer timeOutInSeconds) {
        this.timeOutInSeconds = timeOutInSeconds;
        return this;
    }

    /**
     * Get the parameters property: The options to use for terminating the Job.
     *
     * @return the parameters value.
     */
    @Generated
    public BatchJobTerminateContent getParameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: The options to use for terminating the Job.
     *
     * @param parameters the parameters value to set.
     * @return the TerminateBatchJobOptions object itself.
     */
    @Generated
    public TerminateBatchJobOptions setParameters(BatchJobTerminateContent parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Get the force property: If true, the server will terminate the Job even if the corresponding nodes have not fully
     * processed the termination. The default value is false.
     *
     * @return the force value.
     */
    @Generated
    public Boolean isForce() {
        return this.force;
    }

    /**
     * Set the force property: If true, the server will terminate the Job even if the corresponding nodes have not fully
     * processed the termination. The default value is false.
     *
     * @param force the force value to set.
     * @return the TerminateBatchJobOptions object itself.
     */
    @Generated
    public TerminateBatchJobOptions setForce(Boolean force) {
        this.force = force;
        return this;
    }
}
