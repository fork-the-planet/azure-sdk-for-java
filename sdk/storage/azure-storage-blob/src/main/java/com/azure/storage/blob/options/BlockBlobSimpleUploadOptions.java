// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.blob.options;

import com.azure.core.util.BinaryData;
import com.azure.core.util.CoreUtils;
import com.azure.storage.blob.models.AccessTier;
import com.azure.storage.blob.models.BlobHttpHeaders;
import com.azure.storage.blob.models.BlobImmutabilityPolicy;
import com.azure.storage.blob.models.BlobRequestConditions;
import com.azure.storage.common.implementation.StorageImplUtils;
import reactor.core.publisher.Flux;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Map;

/**
 * Extended options that may be passed when uploading a Block Blob in a single request.
 */
public class BlockBlobSimpleUploadOptions {
    private final Flux<ByteBuffer> dataFlux;
    private final InputStream dataStream;
    private final BinaryData data;
    private final long length;
    private BlobHttpHeaders headers;
    private Map<String, String> metadata;
    private Map<String, String> tags;
    private AccessTier tier;
    private byte[] contentMd5;
    private BlobRequestConditions requestConditions;
    private BlobImmutabilityPolicy immutabilityPolicy;
    private Boolean legalHold;

    /**
     * Creates a new instance of {@link BlockBlobSimpleUploadOptions}.
     *
     * @param data The data to write to the block. Note that this {@code BinaryData} must have defined length
     * and must be replayable if retries are enabled (the default), see {@link BinaryData#isReplayable()}.
     * @throws NullPointerException If {@code data} is null or {@code data} does not have defined length.
     */
    public BlockBlobSimpleUploadOptions(BinaryData data) {
        StorageImplUtils.assertNotNull("data must not be null", data);
        StorageImplUtils.assertNotNull("data must have defined length", data.getLength());
        this.data = data;
        this.length = data.getLength();
        this.dataFlux = null;
        this.dataStream = null;
    }

    /**
     * Creates a new instance of {@link BlockBlobSimpleUploadOptions}.
     *
     * @param data The data to write to the blob. Note that this {@code Flux} must be replayable if retries are enabled
     * (the default). In other words, the Flux must produce the same data each time it is subscribed to.
     * @param length The exact length of the data. It is important that this value match precisely the length of the
     * data emitted by the data source.
     * @throws NullPointerException If {@code data} is null.
     * @throws IllegalArgumentException If {@code length} is less than 0 or greater than {@link Long#MAX_VALUE}.
     */
    public BlockBlobSimpleUploadOptions(Flux<ByteBuffer> data, long length) {
        StorageImplUtils.assertNotNull("dataFlux", data);
        StorageImplUtils.assertInBounds("length", length, 0, Long.MAX_VALUE);
        this.dataFlux = data;
        this.length = length;
        this.dataStream = null;
        this.data = null;
    }

    /**
     * Creates a new instance of {@link BlockBlobSimpleUploadOptions}.
     *
     * @param data The data to write to the blob.
     * @param length The exact length of the data. It is important that this value match precisely the length of the
     * data emitted by the data source.
     * @throws NullPointerException If {@code data} is null.
     * @throws IllegalArgumentException If {@code length} is less than 0 or greater than {@link Long#MAX_VALUE}.
     */
    public BlockBlobSimpleUploadOptions(InputStream data, long length) {
        StorageImplUtils.assertNotNull("dataStream", data);
        StorageImplUtils.assertInBounds("length", length, 0, Long.MAX_VALUE);
        this.dataStream = data;
        this.length = length;
        this.dataFlux = null;
        this.data = null;
    }

    /**
     * Gets the data to write to the blob.
     *
     * @return The data to write to the blob. Note that this {@code Flux} must be replayable if retries are enabled
     * (the default). In other words, the Flux must produce the same data each time it is subscribed to.
     */
    public Flux<ByteBuffer> getDataFlux() {
        return this.dataFlux;
    }

    /**
     * Gets the data to write to the blob.
     *
     * @return The data to write to the blob.
     */
    public InputStream getDataStream() {
        return this.dataStream;
    }

    /**
     * Gets the data to write to the blob.
     *
     * @return The data to write to the blob.
     */
    public BinaryData getData() {
        return this.data;
    }

    /**
     * Gets the exact length of the data.
     *
     * @return The exact length of the data. It is important that this value match precisely the length of the
     * data emitted by the data source.
     */
    public long getLength() {
        return this.length;
    }

    /**
     * Gets the {@link BlobHttpHeaders}.
     *
     * @return {@link BlobHttpHeaders}
     */
    public BlobHttpHeaders getHeaders() {
        return headers;
    }

    /**
     * Sets the {@link BlobHttpHeaders}.
     *
     * @param headers {@link BlobHttpHeaders}
     * @return The updated options
     */
    public BlockBlobSimpleUploadOptions setHeaders(BlobHttpHeaders headers) {
        this.headers = headers;
        return this;
    }

    /**
     * Gets the metadata to associate with the blob.
     *
     * @return The metadata to associate with the blob.
     */
    public Map<String, String> getMetadata() {
        return metadata;
    }

    /**
     * Sets the metadata to associate with the blob.
     *
     * @param metadata The metadata to associate with the blob.
     * @return The updated options
     */
    public BlockBlobSimpleUploadOptions setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Gets the tags to associate with the blob.
     *
     * @return The tags to associate with the blob.
     */
    public Map<String, String> getTags() {
        return tags;
    }

    /**
     * Sets the tags to associate with the blob.
     *
     * @param tags The tags to associate with the blob.
     * @return The updated options.
     */
    public BlockBlobSimpleUploadOptions setTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Gets the {@link AccessTier}.
     *
     * @return {@link AccessTier}
     */
    public AccessTier getTier() {
        return tier;
    }

    /**
     * Sets the {@link AccessTier}.
     *
     * @param tier {@link AccessTier}
     * @return The updated options.
     */
    public BlockBlobSimpleUploadOptions setTier(AccessTier tier) {
        this.tier = tier;
        return this;
    }

    /**
     * Gets the MD5 hash of the content.
     *
     * @return An MD5 hash of the content. This hash is used to verify the integrity of the content during
     * transport. When this header is specified, the storage service compares the hash of the content that has arrived
     * with this header value. Note that this MD5 hash is not stored with the blob. If the two hashes do not match, the
     * operation will fail.
     */
    public byte[] getContentMd5() {
        return CoreUtils.clone(contentMd5);
    }

    /**
     * Sets the MD5 hash of the content.
     *
     * @param contentMd5 An MD5 hash of the block content. This hash is used to verify the integrity of the block during
     * transport. When this header is specified, the storage service compares the hash of the content that has arrived
     * with this header value. Note that this MD5 hash is not stored with the blob. If the two hashes do not match, the
     * operation will fail.
     * @return The updated options
     */
    public BlockBlobSimpleUploadOptions setContentMd5(byte[] contentMd5) {
        this.contentMd5 = CoreUtils.clone(contentMd5);
        return this;
    }

    /**
     * Gets the {@link BlobRequestConditions}.
     *
     * @return {@link BlobRequestConditions}
     */
    public BlobRequestConditions getRequestConditions() {
        return requestConditions;
    }

    /**
     * Sets the {@link BlobRequestConditions}.
     *
     * @param requestConditions {@link BlobRequestConditions}
     * @return The updated options.
     */
    public BlockBlobSimpleUploadOptions setRequestConditions(BlobRequestConditions requestConditions) {
        this.requestConditions = requestConditions;
        return this;
    }

    /**
     * Gets the {@link BlobImmutabilityPolicy}.
     *
     * @return {@link BlobImmutabilityPolicy}
     */
    public BlobImmutabilityPolicy getImmutabilityPolicy() {
        return immutabilityPolicy;
    }

    /**
     * Sets the {@link BlobImmutabilityPolicy}.
     * <p>
     * Note that this parameter is only applicable to a blob within a container that has immutable storage with
     * versioning enabled.
     * @param immutabilityPolicy {@link BlobImmutabilityPolicy}
     * @return The updated options.
     */
    public BlockBlobSimpleUploadOptions setImmutabilityPolicy(BlobImmutabilityPolicy immutabilityPolicy) {
        this.immutabilityPolicy = immutabilityPolicy;
        return this;
    }

    /**
     * Gets if a legal hold should be placed on the blob.
     *
     * @return If a legal hold should be placed on the blob.
     */
    public Boolean isLegalHold() {
        return legalHold;
    }

    /**
     * Sets if a legal hold should be placed on the blob.
     * <p>
     * Note that this parameter is only applicable to a blob within a container that has immutable storage with
     * versioning enabled.
     * @param legalHold Indicates if a legal hold should be placed on the blob.
     * @return The updated options.
     */
    public BlockBlobSimpleUploadOptions setLegalHold(Boolean legalHold) {
        this.legalHold = legalHold;
        return this;
    }
}
