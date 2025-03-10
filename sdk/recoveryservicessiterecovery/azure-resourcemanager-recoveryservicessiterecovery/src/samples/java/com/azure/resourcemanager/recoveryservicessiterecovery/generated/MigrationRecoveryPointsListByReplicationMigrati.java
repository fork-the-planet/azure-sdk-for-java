// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

/**
 * Samples for MigrationRecoveryPoints ListByReplicationMigrationItems.
 */
public final class MigrationRecoveryPointsListByReplicationMigrati {
    /*
     * x-ms-original-file:
     * specification/recoveryservicessiterecovery/resource-manager/Microsoft.RecoveryServices/stable/2023-08-01/examples
     * /MigrationRecoveryPoints_ListByReplicationMigrationItems.json
     */
    /**
     * Sample code: Gets the recovery points for a migration item.
     * 
     * @param manager Entry point to SiteRecoveryManager.
     */
    public static void getsTheRecoveryPointsForAMigrationItem(
        com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager manager) {
        manager.migrationRecoveryPoints()
            .listByReplicationMigrationItems("migrationvault", "resourcegroup1", "vmwarefabric1", "vmwareContainer1",
                "virtualmachine1", com.azure.core.util.Context.NONE);
    }
}
