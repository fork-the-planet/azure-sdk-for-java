// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Extended information of the container.
 */
@Fluent
public final class AzureWorkloadContainerExtendedInfo implements JsonSerializable<AzureWorkloadContainerExtendedInfo> {
    /*
     * Host Os Name in case of Stand Alone and Cluster Name in case of distributed container.
     */
    private String hostServerName;

    /*
     * Inquiry Status for the container.
     */
    private InquiryInfo inquiryInfo;

    /*
     * List of the nodes in case of distributed container.
     */
    private List<DistributedNodesInfo> nodesList;

    /**
     * Creates an instance of AzureWorkloadContainerExtendedInfo class.
     */
    public AzureWorkloadContainerExtendedInfo() {
    }

    /**
     * Get the hostServerName property: Host Os Name in case of Stand Alone and Cluster Name in case of distributed
     * container.
     * 
     * @return the hostServerName value.
     */
    public String hostServerName() {
        return this.hostServerName;
    }

    /**
     * Set the hostServerName property: Host Os Name in case of Stand Alone and Cluster Name in case of distributed
     * container.
     * 
     * @param hostServerName the hostServerName value to set.
     * @return the AzureWorkloadContainerExtendedInfo object itself.
     */
    public AzureWorkloadContainerExtendedInfo withHostServerName(String hostServerName) {
        this.hostServerName = hostServerName;
        return this;
    }

    /**
     * Get the inquiryInfo property: Inquiry Status for the container.
     * 
     * @return the inquiryInfo value.
     */
    public InquiryInfo inquiryInfo() {
        return this.inquiryInfo;
    }

    /**
     * Set the inquiryInfo property: Inquiry Status for the container.
     * 
     * @param inquiryInfo the inquiryInfo value to set.
     * @return the AzureWorkloadContainerExtendedInfo object itself.
     */
    public AzureWorkloadContainerExtendedInfo withInquiryInfo(InquiryInfo inquiryInfo) {
        this.inquiryInfo = inquiryInfo;
        return this;
    }

    /**
     * Get the nodesList property: List of the nodes in case of distributed container.
     * 
     * @return the nodesList value.
     */
    public List<DistributedNodesInfo> nodesList() {
        return this.nodesList;
    }

    /**
     * Set the nodesList property: List of the nodes in case of distributed container.
     * 
     * @param nodesList the nodesList value to set.
     * @return the AzureWorkloadContainerExtendedInfo object itself.
     */
    public AzureWorkloadContainerExtendedInfo withNodesList(List<DistributedNodesInfo> nodesList) {
        this.nodesList = nodesList;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (inquiryInfo() != null) {
            inquiryInfo().validate();
        }
        if (nodesList() != null) {
            nodesList().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("hostServerName", this.hostServerName);
        jsonWriter.writeJsonField("inquiryInfo", this.inquiryInfo);
        jsonWriter.writeArrayField("nodesList", this.nodesList, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AzureWorkloadContainerExtendedInfo from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AzureWorkloadContainerExtendedInfo if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AzureWorkloadContainerExtendedInfo.
     */
    public static AzureWorkloadContainerExtendedInfo fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AzureWorkloadContainerExtendedInfo deserializedAzureWorkloadContainerExtendedInfo
                = new AzureWorkloadContainerExtendedInfo();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("hostServerName".equals(fieldName)) {
                    deserializedAzureWorkloadContainerExtendedInfo.hostServerName = reader.getString();
                } else if ("inquiryInfo".equals(fieldName)) {
                    deserializedAzureWorkloadContainerExtendedInfo.inquiryInfo = InquiryInfo.fromJson(reader);
                } else if ("nodesList".equals(fieldName)) {
                    List<DistributedNodesInfo> nodesList
                        = reader.readArray(reader1 -> DistributedNodesInfo.fromJson(reader1));
                    deserializedAzureWorkloadContainerExtendedInfo.nodesList = nodesList;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAzureWorkloadContainerExtendedInfo;
        });
    }
}
