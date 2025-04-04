// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package io.clientcore.core.utils;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;

import static io.clientcore.core.utils.CoreUtils.isNullOrEmpty;

/**
 * Encodes and decodes using Base64 URI encoding.
 */
public final class Base64Uri {
    /**
     * The Base64Uri encoded bytes.
     */
    private final byte[] bytes;

    /**
     * Creates a new Base64Uri object with the specified encoded string.
     *
     * @param string The encoded string.
     */
    public Base64Uri(String string) {
        if (string == null) {
            this.bytes = null;
        } else {
            string = unquote(string);
            this.bytes = string.getBytes(StandardCharsets.UTF_8);
        }
    }

    /**
     * Creates a new Base64Uri object with the specified encoded bytes.
     *
     * @param bytes The encoded bytes.
     */
    public Base64Uri(byte[] bytes) {
        this.bytes = unquote(bytes);
    }

    private static byte[] unquote(byte[] bytes) {
        if (bytes != null && bytes.length > 1) {
            byte firstByte = bytes[0];
            if (firstByte == '\"' || firstByte == '\'') {
                byte lastByte = bytes[bytes.length - 1];
                if (lastByte == firstByte) {
                    return Arrays.copyOfRange(bytes, 1, bytes.length - 1);
                }
            }
        }
        return bytes;
    }

    private static String unquote(String string) {
        if (!isNullOrEmpty(string)) {
            final char firstCharacter = string.charAt(0);
            if (firstCharacter == '\"' || firstCharacter == '\'') {
                final int base64UriStringLength = string.length();
                final char lastCharacter = string.charAt(base64UriStringLength - 1);
                if (lastCharacter == firstCharacter) {
                    return string.substring(1, base64UriStringLength - 1);
                }
            }
        }
        return string;
    }

    /**
     * Encodes a byte array into Base64Uri encoded bytes.
     *
     * @param bytes The byte array to encode.
     * @return A new Base64Uri instance.
     */
    public static Base64Uri encode(byte[] bytes) {
        if (bytes == null) {
            return new Base64Uri((String) null);
        } else {
            return new Base64Uri(encodeURIWithoutPadding(bytes));
        }
    }

    /**
     * Encodes a byte array to base64 URI format.
     * @param src the byte array to encode
     * @return the base64 URI encoded bytes
     */
    private static byte[] encodeURIWithoutPadding(byte[] src) {
        return src == null ? null : Base64.getUrlEncoder().withoutPadding().encode(src);
    }

    /**
     * Returns the underlying encoded byte array.
     *
     * @return The underlying encoded byte array.
     */
    public byte[] encodedBytes() {
        if (bytes == null) {
            return null;
        }

        return CoreUtils.arrayCopy(bytes);
    }

    /**
     * Decode the bytes and returns its value.
     *
     * @return The decoded byte array.
     */
    public byte[] decodedBytes() {
        if (this.bytes == null) {
            return null;
        }

        return Base64.getUrlDecoder().decode(bytes);
    }

    @Override
    public String toString() {
        return bytes == null ? "" : new String(bytes, StandardCharsets.UTF_8);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(bytes);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof Base64Uri)) {
            return false;
        }

        return Arrays.equals(this.bytes, ((Base64Uri) obj).encodedBytes());
    }
}
