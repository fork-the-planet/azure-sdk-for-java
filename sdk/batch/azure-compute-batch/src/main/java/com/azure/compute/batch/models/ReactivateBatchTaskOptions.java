// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.compute.batch.models;

import com.azure.core.http.RequestConditions;

/**
 * Optional parameters for reactivating a Batch Task, allowing it to
 * run again even if its retry count has been exhausted.
 */
public class ReactivateBatchTaskOptions extends BatchBaseOptions {
    private RequestConditions requestConditions;

    /**
     * Creates an instance of {@link ReactivateBatchTaskOptions}.
     */
    public ReactivateBatchTaskOptions() {
    }

    /**
     * Gets the HTTP options for conditional requests based on modification time.
     *
     * <p>The request conditions allow you to specify conditions that must be met for the request to be processed.
     *
     * @return The HTTP options for conditional requests.
     */
    public RequestConditions getRequestConditions() {
        return requestConditions;
    }

    /**
     * Sets the HTTP options for conditional requests based on modification time.
     *
     * <p>The request conditions allow you to specify conditions that must be met for the request to be processed.
     *
     * @param requestConditions The HTTP options for conditional requests.
     * @return The {@link ReactivateBatchTaskOptions} object itself, allowing for method chaining.
     */
    public ReactivateBatchTaskOptions setRequestConditions(RequestConditions requestConditions) {
        this.requestConditions = requestConditions;
        return this;
    }

}
