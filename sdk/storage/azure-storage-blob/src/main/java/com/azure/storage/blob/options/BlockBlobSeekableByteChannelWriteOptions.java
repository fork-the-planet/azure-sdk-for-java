// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.storage.blob.options;

import com.azure.core.util.ExpandableStringEnum;
import com.azure.storage.blob.models.AccessTier;
import com.azure.storage.blob.models.BlobHttpHeaders;
import com.azure.storage.blob.models.BlobRequestConditions;

import java.util.Collection;
import java.util.Map;
import java.util.Objects;

/**
 * Options for obtaining a {@link java.nio.channels.SeekableByteChannel} backed by an Azure Storage Share File.
 */
public final class BlockBlobSeekableByteChannelWriteOptions {
    /**
     * Mode to open the channel for writing.
     */
    public static final class WriteMode extends ExpandableStringEnum<WriteMode> {
        /**
         * Replaces the existing block blob, if any, with the newly written contents. Creates a new blob if none exists.
         */
        public static final WriteMode OVERWRITE = fromString("Overwrite");

        /**
         * Creates a new instance of {@link WriteMode} with no string value.
         *
         * @deprecated Please use {@link #fromString(String)}.
         */
        @Deprecated
        public WriteMode() {
        }

        /**
         * Creates or finds a AccessTier from its string representation.
         *
         * @param name a name to look for.
         * @return the corresponding AccessTier.
         */
        public static WriteMode fromString(String name) {
            return fromString(name, WriteMode.class);
        }

        /**
         * Gets known WriteMode values.
         *
         * @return known WriteMode values.
         */
        public static Collection<WriteMode> values() {
            return values(WriteMode.class);
        }
    }

    private final WriteMode writeMode;
    private Long blockSizeInBytes;
    private BlobHttpHeaders headers;
    private Map<String, String> metadata;
    private Map<String, String> tags;
    private AccessTier tier;
    private BlobRequestConditions conditions;

    /**
     * Options constructor.
     * @param mode What usage mode to open the channel in.
     * @throws NullPointerException If {@code mode} is null.
     */
    public BlockBlobSeekableByteChannelWriteOptions(WriteMode mode) {
        writeMode = Objects.requireNonNull(mode, "'mode' cannot be null.");
    }

    /**
     * Gets the usage mode to be used by the resulting channel.
     *
     * @return Usage mode to be used by the resulting channel.
     */
    public WriteMode getWriteMode() {
        return writeMode;
    }

    /**
     * Gets the size of individual writes to the service.
     *
     * @return The size of individual writes to the service.
     */
    public Long getBlockSizeInBytes() {
        return blockSizeInBytes;
    }

    /**
     * Sets the size of individual writes to the service.
     *
     * @param blockSizeInBytes The size of individual writes to the service.
     * @return The updated instance.
     */
    public BlockBlobSeekableByteChannelWriteOptions setBlockSizeInBytes(Long blockSizeInBytes) {
        this.blockSizeInBytes = blockSizeInBytes;
        return this;
    }

    /**
     * Gets the HTTP headers to write.
     *
     * @return Blob HTTP headers to write.
     */
    public BlobHttpHeaders getHeaders() {
        return headers;
    }

    /**
     * Sets the HTTP headers to write.
     *
     * @param headers Blob HTTP headers to write.
     * @return The updated instance.
     */
    public BlockBlobSeekableByteChannelWriteOptions setHeaders(BlobHttpHeaders headers) {
        this.headers = headers;
        return this;
    }

    /**
     * Gets the metadata to write.
     *
     * @return Blob metadata to write.
     */
    public Map<String, String> getMetadata() {
        return metadata;
    }

    /**
     * Sets the metadata to write.
     *
     * @param metadata Blob metadata to write.
     * @return The updated instance.
     */
    public BlockBlobSeekableByteChannelWriteOptions setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Gets the tags to write.
     *
     * @return Blob tags to write.
     */
    public Map<String, String> getTags() {
        return tags;
    }

    /**
     * Sets the tags to write.
     *
     * @param tags Blob tags to write.
     * @return The updated instance.
     */
    public BlockBlobSeekableByteChannelWriteOptions setTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Gets the access tier for the target blob.
     *
     * @return Access tier for the target blob.
     */
    public AccessTier getTier() {
        return tier;
    }

    /**
     * Sets the access tier for the target blob.
     *
     * @param tier Access tier for the target blob.
     * @return The updated instance.
     */
    public BlockBlobSeekableByteChannelWriteOptions setTier(AccessTier tier) {
        this.tier = tier;
        return this;
    }

    /**
     * Gets the request conditions for writing to the blob.
     *
     * @return Request conditions for writing to the blob.
     */
    public BlobRequestConditions getRequestConditions() {
        return conditions;
    }

    /**
     * Sets the request conditions for writing to the blob.
     *
     * @param conditions Request conditions for writing to the blob.
     * @return The updated instance.
     */
    public BlockBlobSeekableByteChannelWriteOptions setRequestConditions(BlobRequestConditions conditions) {
        this.conditions = conditions;
        return this;
    }

}
