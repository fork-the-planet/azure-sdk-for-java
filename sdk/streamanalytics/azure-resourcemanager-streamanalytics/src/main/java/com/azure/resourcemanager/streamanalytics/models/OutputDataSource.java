// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Describes the data source that output will be written to.
 */
@Immutable
public class OutputDataSource implements JsonSerializable<OutputDataSource> {
    /*
     * Indicates the type of data source output will be written to. Required on PUT (CreateOrReplace) requests.
     */
    private String type = "OutputDataSource";

    /**
     * Creates an instance of OutputDataSource class.
     */
    public OutputDataSource() {
    }

    /**
     * Get the type property: Indicates the type of data source output will be written to. Required on PUT
     * (CreateOrReplace) requests.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
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
        jsonWriter.writeStringField("type", this.type);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of OutputDataSource from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of OutputDataSource if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the OutputDataSource.
     */
    public static OutputDataSource fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String discriminatorValue = null;
            try (JsonReader readerToUse = reader.bufferObject()) {
                readerToUse.nextToken(); // Prepare for reading
                while (readerToUse.nextToken() != JsonToken.END_OBJECT) {
                    String fieldName = readerToUse.getFieldName();
                    readerToUse.nextToken();
                    if ("type".equals(fieldName)) {
                        discriminatorValue = readerToUse.getString();
                        break;
                    } else {
                        readerToUse.skipChildren();
                    }
                }
                // Use the discriminator value to determine which subtype should be deserialized.
                if ("Microsoft.Storage/Blob".equals(discriminatorValue)) {
                    return BlobOutputDataSource.fromJson(readerToUse.reset());
                } else if ("Microsoft.Storage/Table".equals(discriminatorValue)) {
                    return AzureTableOutputDataSource.fromJson(readerToUse.reset());
                } else if ("Microsoft.ServiceBus/EventHub".equals(discriminatorValue)) {
                    return EventHubOutputDataSource.fromJson(readerToUse.reset());
                } else if ("Microsoft.EventHub/EventHub".equals(discriminatorValue)) {
                    return EventHubV2OutputDataSource.fromJson(readerToUse.reset());
                } else if ("Microsoft.Sql/Server/Database".equals(discriminatorValue)) {
                    return AzureSqlDatabaseOutputDataSource.fromJson(readerToUse.reset());
                } else if ("Microsoft.Sql/Server/DataWarehouse".equals(discriminatorValue)) {
                    return AzureSynapseOutputDataSource.fromJson(readerToUse.reset());
                } else if ("Microsoft.Storage/DocumentDB".equals(discriminatorValue)) {
                    return DocumentDbOutputDataSource.fromJson(readerToUse.reset());
                } else if ("Microsoft.AzureFunction".equals(discriminatorValue)) {
                    return AzureFunctionOutputDataSource.fromJson(readerToUse.reset());
                } else if ("Microsoft.ServiceBus/Queue".equals(discriminatorValue)) {
                    return ServiceBusQueueOutputDataSource.fromJson(readerToUse.reset());
                } else if ("Microsoft.ServiceBus/Topic".equals(discriminatorValue)) {
                    return ServiceBusTopicOutputDataSource.fromJson(readerToUse.reset());
                } else if ("PowerBI".equals(discriminatorValue)) {
                    return PowerBIOutputDataSource.fromJson(readerToUse.reset());
                } else if ("Microsoft.DataLake/Accounts".equals(discriminatorValue)) {
                    return AzureDataLakeStoreOutputDataSource.fromJson(readerToUse.reset());
                } else if ("GatewayMessageBus".equals(discriminatorValue)) {
                    return GatewayMessageBusOutputDataSource.fromJson(readerToUse.reset());
                } else {
                    return fromJsonKnownDiscriminator(readerToUse.reset());
                }
            }
        });
    }

    static OutputDataSource fromJsonKnownDiscriminator(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            OutputDataSource deserializedOutputDataSource = new OutputDataSource();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("type".equals(fieldName)) {
                    deserializedOutputDataSource.type = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedOutputDataSource;
        });
    }
}
