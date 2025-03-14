// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.realtime.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.core.util.BinaryData;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The RealtimeRequestSession model.
 */
@Fluent
public final class RealtimeRequestSession implements JsonSerializable<RealtimeRequestSession> {

    /*
     * The modalities property.
     */
    @Generated
    private List<RealtimeRequestSessionModality> modalities;

    /*
     * The instructions property.
     */
    @Generated
    private String instructions;

    /*
     * The voice property.
     */
    @Generated
    private RealtimeVoice voice;

    /*
     * The input_audio_format property.
     */
    @Generated
    private RealtimeAudioFormat inputAudioFormat;

    /*
     * The output_audio_format property.
     */
    @Generated
    private RealtimeAudioFormat outputAudioFormat;

    /*
     * The input_audio_transcription property.
     */
    @Generated
    private RealtimeAudioInputTranscriptionSettings inputAudioTranscription;

    /*
     * The turn_detection property.
     */
    @Generated
    private RealtimeTurnDetection turnDetection;

    /*
     * The tools property.
     */
    @Generated
    private List<RealtimeTool> tools;

    /*
     * The tool_choice property.
     */
    @Generated
    private BinaryData toolChoice;

    /*
     * The temperature property.
     */
    @Generated
    private Double temperature;

    /*
     * The max_response_output_tokens property.
     */
    @Generated
    private BinaryData maxResponseOutputTokens;

    /**
     * Creates an instance of RealtimeRequestSession class.
     */
    @Generated
    public RealtimeRequestSession() {
    }

    /**
     * Get the modalities property: The modalities property.
     *
     * @return the modalities value.
     */
    @Generated
    public List<RealtimeRequestSessionModality> getModalities() {
        return this.modalities;
    }

    /**
     * Set the modalities property: The modalities property.
     *
     * @param modalities the modalities value to set.
     * @return the RealtimeRequestSession object itself.
     */
    @Generated
    public RealtimeRequestSession setModalities(List<RealtimeRequestSessionModality> modalities) {
        this.modalities = modalities;
        return this;
    }

    /**
     * Get the instructions property: The instructions property.
     *
     * @return the instructions value.
     */
    @Generated
    public String getInstructions() {
        return this.instructions;
    }

    /**
     * Set the instructions property: The instructions property.
     *
     * @param instructions the instructions value to set.
     * @return the RealtimeRequestSession object itself.
     */
    @Generated
    public RealtimeRequestSession setInstructions(String instructions) {
        this.instructions = instructions;
        return this;
    }

    /**
     * Get the voice property: The voice property.
     *
     * @return the voice value.
     */
    @Generated
    public RealtimeVoice getVoice() {
        return this.voice;
    }

    /**
     * Set the voice property: The voice property.
     *
     * @param voice the voice value to set.
     * @return the RealtimeRequestSession object itself.
     */
    @Generated
    public RealtimeRequestSession setVoice(RealtimeVoice voice) {
        this.voice = voice;
        return this;
    }

    /**
     * Get the inputAudioFormat property: The input_audio_format property.
     *
     * @return the inputAudioFormat value.
     */
    @Generated
    public RealtimeAudioFormat getInputAudioFormat() {
        return this.inputAudioFormat;
    }

    /**
     * Set the inputAudioFormat property: The input_audio_format property.
     *
     * @param inputAudioFormat the inputAudioFormat value to set.
     * @return the RealtimeRequestSession object itself.
     */
    @Generated
    public RealtimeRequestSession setInputAudioFormat(RealtimeAudioFormat inputAudioFormat) {
        this.inputAudioFormat = inputAudioFormat;
        return this;
    }

    /**
     * Get the outputAudioFormat property: The output_audio_format property.
     *
     * @return the outputAudioFormat value.
     */
    @Generated
    public RealtimeAudioFormat getOutputAudioFormat() {
        return this.outputAudioFormat;
    }

    /**
     * Set the outputAudioFormat property: The output_audio_format property.
     *
     * @param outputAudioFormat the outputAudioFormat value to set.
     * @return the RealtimeRequestSession object itself.
     */
    @Generated
    public RealtimeRequestSession setOutputAudioFormat(RealtimeAudioFormat outputAudioFormat) {
        this.outputAudioFormat = outputAudioFormat;
        return this;
    }

    /**
     * Get the inputAudioTranscription property: The input_audio_transcription property.
     *
     * @return the inputAudioTranscription value.
     */
    @Generated
    public RealtimeAudioInputTranscriptionSettings getInputAudioTranscription() {
        return this.inputAudioTranscription;
    }

    /**
     * Set the inputAudioTranscription property: The input_audio_transcription property.
     *
     * @param inputAudioTranscription the inputAudioTranscription value to set.
     * @return the RealtimeRequestSession object itself.
     */
    @Generated
    public RealtimeRequestSession
        setInputAudioTranscription(RealtimeAudioInputTranscriptionSettings inputAudioTranscription) {
        this.inputAudioTranscription = inputAudioTranscription;
        return this;
    }

    /**
     * Get the turnDetection property: The turn_detection property.
     *
     * @return the turnDetection value.
     */
    @Generated
    public RealtimeTurnDetection getTurnDetection() {
        return this.turnDetection;
    }

    /**
     * Set the turnDetection property: The turn_detection property.
     *
     * @param turnDetection the turnDetection value to set.
     * @return the RealtimeRequestSession object itself.
     */
    @Generated
    public RealtimeRequestSession setTurnDetection(RealtimeTurnDetection turnDetection) {
        this.turnDetection = turnDetection;
        return this;
    }

    /**
     * Get the tools property: The tools property.
     *
     * @return the tools value.
     */
    @Generated
    public List<RealtimeTool> getTools() {
        return this.tools;
    }

    /**
     * Set the tools property: The tools property.
     *
     * @param tools the tools value to set.
     * @return the RealtimeRequestSession object itself.
     */
    @Generated
    public RealtimeRequestSession setTools(List<RealtimeTool> tools) {
        this.tools = tools;
        return this;
    }

    /**
     * Get the toolChoice property: The tool_choice property.
     *
     * @return the toolChoice value.
     */
    @Generated
    public BinaryData getToolChoice() {
        return this.toolChoice;
    }

    /**
     * Set the toolChoice property: The tool_choice property.
     *
     * @param toolChoice the toolChoice value to set.
     * @return the RealtimeRequestSession object itself.
     */
    @Generated
    public RealtimeRequestSession setToolChoice(BinaryData toolChoice) {
        this.toolChoice = toolChoice;
        return this;
    }

    /**
     * Get the temperature property: The temperature property.
     *
     * @return the temperature value.
     */
    @Generated
    public Double getTemperature() {
        return this.temperature;
    }

    /**
     * Set the temperature property: The temperature property.
     *
     * @param temperature the temperature value to set.
     * @return the RealtimeRequestSession object itself.
     */
    @Generated
    public RealtimeRequestSession setTemperature(Double temperature) {
        this.temperature = temperature;
        return this;
    }

    /**
     * Get the maxResponseOutputTokens property: The max_response_output_tokens property.
     *
     * @return the maxResponseOutputTokens value.
     */
    @Generated
    public BinaryData getMaxResponseOutputTokens() {
        return this.maxResponseOutputTokens;
    }

    // @Generated
    RealtimeRequestSession setMaxResponseOutputTokens(BinaryData maxResponseOutputTokens) {
        this.maxResponseOutputTokens = maxResponseOutputTokens;
        return this;
    }

    /**
     * Set the maxResponseOutputTokens property: The max_response_output_tokens property.
     *
     * @param maxResponseOutputTokens the maxResponseOutputTokens value to set.
     * @return the RealtimeRequestSession object itself.
     */
    public RealtimeRequestSession setMaxResponseOutputTokens(int maxResponseOutputTokens) {
        this.maxResponseOutputTokens = BinaryData.fromObject(maxResponseOutputTokens);
        return this;
    }

    /**
     * Set the maxResponseOutputTokens property: The max_response_output_tokens property. Sets no limits to the token
     * usage.
     *
     * @return the RealtimeRequestSession object itself.
     */
    public RealtimeRequestSession setMaxResponseOutputTokensToInf() {
        this.maxResponseOutputTokens = BinaryData.fromObject("inf");
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("modalities", this.modalities,
            (writer, element) -> writer.writeString(element == null ? null : element.toString()));
        jsonWriter.writeStringField("instructions", this.instructions);
        jsonWriter.writeStringField("voice", this.voice == null ? null : this.voice.toString());
        jsonWriter.writeStringField("input_audio_format",
            this.inputAudioFormat == null ? null : this.inputAudioFormat.toString());
        jsonWriter.writeStringField("output_audio_format",
            this.outputAudioFormat == null ? null : this.outputAudioFormat.toString());
        jsonWriter.writeJsonField("input_audio_transcription", this.inputAudioTranscription);
        jsonWriter.writeJsonField("turn_detection", this.turnDetection);
        jsonWriter.writeArrayField("tools", this.tools, (writer, element) -> writer.writeJson(element));
        if (this.toolChoice != null) {
            jsonWriter.writeUntypedField("tool_choice", this.toolChoice.toObject(Object.class));
        }
        jsonWriter.writeNumberField("temperature", this.temperature);
        if (this.maxResponseOutputTokens != null) {
            jsonWriter.writeUntypedField("max_response_output_tokens",
                this.maxResponseOutputTokens.toObject(Object.class));
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RealtimeRequestSession from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of RealtimeRequestSession if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the RealtimeRequestSession.
     */
    @Generated
    public static RealtimeRequestSession fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RealtimeRequestSession deserializedRealtimeRequestSession = new RealtimeRequestSession();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("modalities".equals(fieldName)) {
                    List<RealtimeRequestSessionModality> modalities
                        = reader.readArray(reader1 -> RealtimeRequestSessionModality.fromString(reader1.getString()));
                    deserializedRealtimeRequestSession.modalities = modalities;
                } else if ("instructions".equals(fieldName)) {
                    deserializedRealtimeRequestSession.instructions = reader.getString();
                } else if ("voice".equals(fieldName)) {
                    deserializedRealtimeRequestSession.voice = RealtimeVoice.fromString(reader.getString());
                } else if ("input_audio_format".equals(fieldName)) {
                    deserializedRealtimeRequestSession.inputAudioFormat
                        = RealtimeAudioFormat.fromString(reader.getString());
                } else if ("output_audio_format".equals(fieldName)) {
                    deserializedRealtimeRequestSession.outputAudioFormat
                        = RealtimeAudioFormat.fromString(reader.getString());
                } else if ("input_audio_transcription".equals(fieldName)) {
                    deserializedRealtimeRequestSession.inputAudioTranscription
                        = RealtimeAudioInputTranscriptionSettings.fromJson(reader);
                } else if ("turn_detection".equals(fieldName)) {
                    deserializedRealtimeRequestSession.turnDetection = RealtimeTurnDetection.fromJson(reader);
                } else if ("tools".equals(fieldName)) {
                    List<RealtimeTool> tools = reader.readArray(reader1 -> RealtimeTool.fromJson(reader1));
                    deserializedRealtimeRequestSession.tools = tools;
                } else if ("tool_choice".equals(fieldName)) {
                    deserializedRealtimeRequestSession.toolChoice
                        = reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped()));
                } else if ("temperature".equals(fieldName)) {
                    deserializedRealtimeRequestSession.temperature = reader.getNullable(JsonReader::getDouble);
                } else if ("max_response_output_tokens".equals(fieldName)) {
                    deserializedRealtimeRequestSession.maxResponseOutputTokens
                        = reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped()));
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedRealtimeRequestSession;
        });
    }
}
