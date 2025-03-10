// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** Represents a Query Statistic. */
@Fluent
public final class QueryStatisticInner extends ProxyResource {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(QueryStatisticInner.class);

    /*
     * The properties of a query statistic.
     */
    @JsonProperty(value = "properties")
    private QueryStatisticProperties innerProperties;

    /**
     * Get the innerProperties property: The properties of a query statistic.
     *
     * @return the innerProperties value.
     */
    private QueryStatisticProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the queryId property: Database query identifier.
     *
     * @return the queryId value.
     */
    public String queryId() {
        return this.innerProperties() == null ? null : this.innerProperties().queryId();
    }

    /**
     * Set the queryId property: Database query identifier.
     *
     * @param queryId the queryId value to set.
     * @return the QueryStatisticInner object itself.
     */
    public QueryStatisticInner withQueryId(String queryId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new QueryStatisticProperties();
        }
        this.innerProperties().withQueryId(queryId);
        return this;
    }

    /**
     * Get the startTime property: Observation start time.
     *
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.innerProperties() == null ? null : this.innerProperties().startTime();
    }

    /**
     * Set the startTime property: Observation start time.
     *
     * @param startTime the startTime value to set.
     * @return the QueryStatisticInner object itself.
     */
    public QueryStatisticInner withStartTime(OffsetDateTime startTime) {
        if (this.innerProperties() == null) {
            this.innerProperties = new QueryStatisticProperties();
        }
        this.innerProperties().withStartTime(startTime);
        return this;
    }

    /**
     * Get the endTime property: Observation end time.
     *
     * @return the endTime value.
     */
    public OffsetDateTime endTime() {
        return this.innerProperties() == null ? null : this.innerProperties().endTime();
    }

    /**
     * Set the endTime property: Observation end time.
     *
     * @param endTime the endTime value to set.
     * @return the QueryStatisticInner object itself.
     */
    public QueryStatisticInner withEndTime(OffsetDateTime endTime) {
        if (this.innerProperties() == null) {
            this.innerProperties = new QueryStatisticProperties();
        }
        this.innerProperties().withEndTime(endTime);
        return this;
    }

    /**
     * Get the aggregationFunction property: Aggregation function name.
     *
     * @return the aggregationFunction value.
     */
    public String aggregationFunction() {
        return this.innerProperties() == null ? null : this.innerProperties().aggregationFunction();
    }

    /**
     * Set the aggregationFunction property: Aggregation function name.
     *
     * @param aggregationFunction the aggregationFunction value to set.
     * @return the QueryStatisticInner object itself.
     */
    public QueryStatisticInner withAggregationFunction(String aggregationFunction) {
        if (this.innerProperties() == null) {
            this.innerProperties = new QueryStatisticProperties();
        }
        this.innerProperties().withAggregationFunction(aggregationFunction);
        return this;
    }

    /**
     * Get the databaseNames property: The list of database names.
     *
     * @return the databaseNames value.
     */
    public List<String> databaseNames() {
        return this.innerProperties() == null ? null : this.innerProperties().databaseNames();
    }

    /**
     * Set the databaseNames property: The list of database names.
     *
     * @param databaseNames the databaseNames value to set.
     * @return the QueryStatisticInner object itself.
     */
    public QueryStatisticInner withDatabaseNames(List<String> databaseNames) {
        if (this.innerProperties() == null) {
            this.innerProperties = new QueryStatisticProperties();
        }
        this.innerProperties().withDatabaseNames(databaseNames);
        return this;
    }

    /**
     * Get the queryExecutionCount property: Number of query executions in this time interval.
     *
     * @return the queryExecutionCount value.
     */
    public Long queryExecutionCount() {
        return this.innerProperties() == null ? null : this.innerProperties().queryExecutionCount();
    }

    /**
     * Set the queryExecutionCount property: Number of query executions in this time interval.
     *
     * @param queryExecutionCount the queryExecutionCount value to set.
     * @return the QueryStatisticInner object itself.
     */
    public QueryStatisticInner withQueryExecutionCount(Long queryExecutionCount) {
        if (this.innerProperties() == null) {
            this.innerProperties = new QueryStatisticProperties();
        }
        this.innerProperties().withQueryExecutionCount(queryExecutionCount);
        return this;
    }

    /**
     * Get the metricName property: Metric name.
     *
     * @return the metricName value.
     */
    public String metricName() {
        return this.innerProperties() == null ? null : this.innerProperties().metricName();
    }

    /**
     * Set the metricName property: Metric name.
     *
     * @param metricName the metricName value to set.
     * @return the QueryStatisticInner object itself.
     */
    public QueryStatisticInner withMetricName(String metricName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new QueryStatisticProperties();
        }
        this.innerProperties().withMetricName(metricName);
        return this;
    }

    /**
     * Get the metricDisplayName property: Metric display name.
     *
     * @return the metricDisplayName value.
     */
    public String metricDisplayName() {
        return this.innerProperties() == null ? null : this.innerProperties().metricDisplayName();
    }

    /**
     * Set the metricDisplayName property: Metric display name.
     *
     * @param metricDisplayName the metricDisplayName value to set.
     * @return the QueryStatisticInner object itself.
     */
    public QueryStatisticInner withMetricDisplayName(String metricDisplayName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new QueryStatisticProperties();
        }
        this.innerProperties().withMetricDisplayName(metricDisplayName);
        return this;
    }

    /**
     * Get the metricValue property: Metric value.
     *
     * @return the metricValue value.
     */
    public Double metricValue() {
        return this.innerProperties() == null ? null : this.innerProperties().metricValue();
    }

    /**
     * Set the metricValue property: Metric value.
     *
     * @param metricValue the metricValue value to set.
     * @return the QueryStatisticInner object itself.
     */
    public QueryStatisticInner withMetricValue(Double metricValue) {
        if (this.innerProperties() == null) {
            this.innerProperties = new QueryStatisticProperties();
        }
        this.innerProperties().withMetricValue(metricValue);
        return this;
    }

    /**
     * Get the metricValueUnit property: Metric value unit.
     *
     * @return the metricValueUnit value.
     */
    public String metricValueUnit() {
        return this.innerProperties() == null ? null : this.innerProperties().metricValueUnit();
    }

    /**
     * Set the metricValueUnit property: Metric value unit.
     *
     * @param metricValueUnit the metricValueUnit value to set.
     * @return the QueryStatisticInner object itself.
     */
    public QueryStatisticInner withMetricValueUnit(String metricValueUnit) {
        if (this.innerProperties() == null) {
            this.innerProperties = new QueryStatisticProperties();
        }
        this.innerProperties().withMetricValueUnit(metricValueUnit);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
