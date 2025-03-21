// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.responses.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The ResponsesInputContentImage model.
 */
@Fluent
public final class ResponsesInputContentImage extends ResponsesContent {

    /*
     * The type property.
     */
    @Generated
    private ResponsesContentType type = ResponsesContentType.INPUT_IMAGE;

    /*
     * The image_url property.
     */
    @Generated
    private String imageUrl;

    /*
     * The file_id property.
     */
    @Generated
    private String fileId;

    /*
     * The detail property.
     */
    @Generated
    private ResponsesInputContentImageDetail detail;

    /**
     * Creates an instance of ResponsesInputContentImage class.
     */
    @Generated
    public ResponsesInputContentImage() {
    }

    /**
     * Get the type property: The type property.
     *
     * @return the type value.
     */
    @Generated
    @Override
    public ResponsesContentType getType() {
        return this.type;
    }

    /**
     * Get the imageUrl property: The image_url property.
     *
     * @return the imageUrl value.
     */
    @Generated
    public String getImageUrl() {
        return this.imageUrl;
    }

    /**
     * Set the imageUrl property: The image_url property.
     *
     * @param imageUrl the imageUrl value to set.
     * @return the ResponsesInputContentImage object itself.
     */
    @Generated
    public ResponsesInputContentImage setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    /**
     * Get the fileId property: The file_id property.
     *
     * @return the fileId value.
     */
    @Generated
    public String getFileId() {
        return this.fileId;
    }

    /**
     * Set the fileId property: The file_id property.
     *
     * @param fileId the fileId value to set.
     * @return the ResponsesInputContentImage object itself.
     */
    @Generated
    public ResponsesInputContentImage setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }

    /**
     * Get the detail property: The detail property.
     *
     * @return the detail value.
     */
    @Generated
    public ResponsesInputContentImageDetail getDetail() {
        return this.detail;
    }

    /**
     * Set the detail property: The detail property.
     *
     * @param detail the detail value to set.
     * @return the ResponsesInputContentImage object itself.
     */
    @Generated
    public ResponsesInputContentImage setDetail(ResponsesInputContentImageDetail detail) {
        this.detail = detail;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("type", this.type == null ? null : this.type.toString());
        jsonWriter.writeStringField("image_url", this.imageUrl);
        jsonWriter.writeStringField("file_id", this.fileId);
        jsonWriter.writeStringField("detail", this.detail == null ? null : this.detail.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ResponsesInputContentImage from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of ResponsesInputContentImage if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ResponsesInputContentImage.
     */
    @Generated
    public static ResponsesInputContentImage fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ResponsesInputContentImage deserializedResponsesInputContentImage = new ResponsesInputContentImage();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("type".equals(fieldName)) {
                    deserializedResponsesInputContentImage.type = ResponsesContentType.fromString(reader.getString());
                } else if ("image_url".equals(fieldName)) {
                    deserializedResponsesInputContentImage.imageUrl = reader.getString();
                } else if ("file_id".equals(fieldName)) {
                    deserializedResponsesInputContentImage.fileId = reader.getString();
                } else if ("detail".equals(fieldName)) {
                    deserializedResponsesInputContentImage.detail
                        = ResponsesInputContentImageDetail.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedResponsesInputContentImage;
        });
    }
}
