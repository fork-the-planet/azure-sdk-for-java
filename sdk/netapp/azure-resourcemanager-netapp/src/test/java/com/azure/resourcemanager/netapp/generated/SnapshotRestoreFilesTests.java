// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.models.SnapshotRestoreFiles;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class SnapshotRestoreFilesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SnapshotRestoreFiles model
            = BinaryData.fromString("{\"filePaths\":[\"jpxac\"],\"destinationPath\":\"udfnbyxba\"}")
                .toObject(SnapshotRestoreFiles.class);
        Assertions.assertEquals("jpxac", model.filePaths().get(0));
        Assertions.assertEquals("udfnbyxba", model.destinationPath());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SnapshotRestoreFiles model
            = new SnapshotRestoreFiles().withFilePaths(Arrays.asList("jpxac")).withDestinationPath("udfnbyxba");
        model = BinaryData.fromObject(model).toObject(SnapshotRestoreFiles.class);
        Assertions.assertEquals("jpxac", model.filePaths().get(0));
        Assertions.assertEquals("udfnbyxba", model.destinationPath());
    }
}
