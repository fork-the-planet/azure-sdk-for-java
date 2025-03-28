// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.resourcemanager.compute.implementation;

import com.azure.core.management.SubResource;
import com.azure.resourcemanager.compute.ComputeManager;
import com.azure.resourcemanager.compute.models.CachingTypes;
import com.azure.resourcemanager.compute.models.Disk;
import com.azure.resourcemanager.compute.models.HyperVGenerationTypes;
import com.azure.resourcemanager.compute.models.ImageDataDisk;
import com.azure.resourcemanager.compute.models.ImageOSDisk;
import com.azure.resourcemanager.compute.models.ImageStorageProfile;
import com.azure.resourcemanager.compute.models.OperatingSystemStateTypes;
import com.azure.resourcemanager.compute.models.OperatingSystemTypes;
import com.azure.resourcemanager.compute.models.Snapshot;
import com.azure.resourcemanager.compute.models.VirtualMachine;
import com.azure.resourcemanager.compute.models.VirtualMachineCustomImage;
import com.azure.resourcemanager.compute.fluent.models.ImageInner;
import com.azure.resourcemanager.resources.fluentcore.arm.models.implementation.GroupableResourceImpl;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** The implementation for VirtualMachineCustomImage. */
class VirtualMachineCustomImageImpl
    extends GroupableResourceImpl<VirtualMachineCustomImage, ImageInner, VirtualMachineCustomImageImpl, ComputeManager>
    implements VirtualMachineCustomImage, VirtualMachineCustomImage.Definition {

    VirtualMachineCustomImageImpl(final String name, ImageInner innerModel, final ComputeManager computeManager) {
        super(name, innerModel, computeManager);
    }

    @Override
    public boolean isCreatedFromVirtualMachine() {
        return this.sourceVirtualMachineId() != null;
    }

    @Override
    public HyperVGenerationTypes hyperVGeneration() {
        return this.innerModel().hyperVGeneration();
    }

    @Override
    public String sourceVirtualMachineId() {
        if (this.innerModel().sourceVirtualMachine() == null) {
            return null;
        }
        return this.innerModel().sourceVirtualMachine().id();
    }

    @Override
    public ImageOSDisk osDiskImage() {
        if (this.innerModel().storageProfile() == null) {
            return null;
        }
        return this.innerModel().storageProfile().osDisk();
    }

    @Override
    public Map<Integer, ImageDataDisk> dataDiskImages() {
        if (this.innerModel().storageProfile() == null || this.innerModel().storageProfile().dataDisks() == null) {
            return Collections.unmodifiableMap(new HashMap<>());
        }
        HashMap<Integer, ImageDataDisk> diskImages = new HashMap<>();
        for (ImageDataDisk dataDisk : this.innerModel().storageProfile().dataDisks()) {
            diskImages.put(dataDisk.lun(), dataDisk);
        }
        return Collections.unmodifiableMap(diskImages);
    }

    @Override
    public VirtualMachineCustomImageImpl fromVirtualMachine(String virtualMachineId) {
        this.innerModel().withSourceVirtualMachine(new SubResource().withId(virtualMachineId));
        return this;
    }

    @Override
    public VirtualMachineCustomImageImpl fromVirtualMachine(VirtualMachine virtualMachine) {
        return this.fromVirtualMachine(virtualMachine.id());
    }

    @Override
    public VirtualMachineCustomImageImpl withWindowsFromVhd(String sourceVhdUrl, OperatingSystemStateTypes osState) {
        this.ensureOsDiskImage()
            .withOsState(osState)
            .withOsType(OperatingSystemTypes.WINDOWS)
            .withBlobUri(sourceVhdUrl);
        return this;
    }

    @Override
    public VirtualMachineCustomImageImpl withLinuxFromVhd(String sourceVhdUrl, OperatingSystemStateTypes osState) {
        this.ensureOsDiskImage().withOsState(osState).withOsType(OperatingSystemTypes.LINUX).withBlobUri(sourceVhdUrl);
        return this;
    }

    @Override
    public VirtualMachineCustomImageImpl withWindowsFromSnapshot(String sourceSnapshotId,
        OperatingSystemStateTypes osState) {
        this.ensureOsDiskImage()
            .withOsState(osState)
            .withOsType(OperatingSystemTypes.WINDOWS)
            .withSnapshot(new SubResource().withId(sourceSnapshotId));
        return this;
    }

    @Override
    public VirtualMachineCustomImageImpl withLinuxFromSnapshot(String sourceSnapshotId,
        OperatingSystemStateTypes osState) {
        this.ensureOsDiskImage()
            .withOsState(osState)
            .withOsType(OperatingSystemTypes.LINUX)
            .withSnapshot(new SubResource().withId(sourceSnapshotId));

        return this;
    }

    @Override
    public VirtualMachineCustomImageImpl withWindowsFromSnapshot(Snapshot sourceSnapshot,
        OperatingSystemStateTypes osState) {
        return this.withWindowsFromSnapshot(sourceSnapshot.id(), osState);
    }

    @Override
    public VirtualMachineCustomImageImpl withLinuxFromSnapshot(Snapshot sourceSnapshot,
        OperatingSystemStateTypes osState) {
        return this.withLinuxFromSnapshot(sourceSnapshot.id(), osState);
    }

    @Override
    public VirtualMachineCustomImageImpl withWindowsFromDisk(String sourceManagedDiskId,
        OperatingSystemStateTypes osState) {
        this.ensureOsDiskImage()
            .withOsState(osState)
            .withOsType(OperatingSystemTypes.WINDOWS)
            .withManagedDisk(new SubResource().withId(sourceManagedDiskId));
        return this;
    }

    @Override
    public VirtualMachineCustomImageImpl withLinuxFromDisk(String sourceManagedDiskId,
        OperatingSystemStateTypes osState) {
        this.ensureOsDiskImage()
            .withOsState(osState)
            .withOsType(OperatingSystemTypes.LINUX)
            .withManagedDisk(new SubResource().withId(sourceManagedDiskId));
        return this;
    }

    @Override
    public VirtualMachineCustomImageImpl withWindowsFromDisk(Disk sourceManagedDisk,
        OperatingSystemStateTypes osState) {
        return withWindowsFromDisk(sourceManagedDisk.id(), osState);
    }

    @Override
    public VirtualMachineCustomImageImpl withLinuxFromDisk(Disk sourceManagedDisk, OperatingSystemStateTypes osState) {
        return withLinuxFromDisk(sourceManagedDisk.id(), osState);
    }

    @Override
    public VirtualMachineCustomImageImpl withDataDiskImageFromVhd(String sourceVhdUrl) {
        this.defineDataDiskImage().withLun(-1).fromVhd(sourceVhdUrl).attach();
        return this;
    }

    @Override
    public VirtualMachineCustomImageImpl withDataDiskImageFromSnapshot(String sourceSnapshotId) {
        this.defineDataDiskImage().withLun(-1).fromSnapshot(sourceSnapshotId).attach();
        return this;
    }

    @Override
    public VirtualMachineCustomImageImpl withDataDiskImageFromManagedDisk(String sourceManagedDiskId) {
        this.defineDataDiskImage().withLun(-1).fromManagedDisk(sourceManagedDiskId).attach();
        return this;
    }

    @Override
    public CustomImageDataDiskImpl defineDataDiskImage() {
        return new CustomImageDataDiskImpl(new ImageDataDisk(), this);
    }

    @Override
    public VirtualMachineCustomImageImpl withOSDiskSizeInGB(int diskSizeGB) {
        this.ensureOsDiskImage().withDiskSizeGB(diskSizeGB);
        return this;
    }

    @Override
    public VirtualMachineCustomImageImpl withOSDiskCaching(CachingTypes cachingType) {
        this.ensureOsDiskImage().withCaching(cachingType);
        return this;
    }

    @Override
    public VirtualMachineCustomImageImpl withZoneResilient() {
        this.ensureStorageProfile().withZoneResilient(true);
        return this;
    }

    @Override
    public Mono<VirtualMachineCustomImage> createResourceAsync() {
        ensureDefaultLuns();
        return this.manager()
            .serviceClient()
            .getImages()
            .createOrUpdateAsync(resourceGroupName(), name(), this.innerModel())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Mono<ImageInner> getInnerAsync() {
        return this.manager()
            .serviceClient()
            .getImages()
            .getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    private ImageOSDisk ensureOsDiskImage() {
        this.ensureStorageProfile();
        if (this.innerModel().storageProfile().osDisk() == null) {
            this.innerModel().storageProfile().withOsDisk(new ImageOSDisk());
        }
        return this.innerModel().storageProfile().osDisk();
    }

    private ImageStorageProfile ensureStorageProfile() {
        if (this.innerModel().storageProfile() == null) {
            this.innerModel().withStorageProfile(new ImageStorageProfile());
        }
        return this.innerModel().storageProfile();
    }

    private void ensureDefaultLuns() {
        if (this.innerModel().storageProfile() != null && this.innerModel().storageProfile().dataDisks() != null) {
            List<ImageDataDisk> imageDisks = this.innerModel().storageProfile().dataDisks();
            List<Integer> usedLuns = new ArrayList<>();
            for (ImageDataDisk imageDisk : imageDisks) {
                if (imageDisk.lun() != -1) {
                    usedLuns.add(imageDisk.lun());
                }
            }
            if (usedLuns.size() == imageDisks.size()) {
                return;
            }
            for (ImageDataDisk imageDisk : imageDisks) {
                if (imageDisk.lun() != -1) {
                    continue;
                }
                Integer i = 0;
                while (usedLuns.contains(i)) {
                    i += 1;
                }
                imageDisk.withLun(i);
                usedLuns.add(i);
            }
        }
    }

    VirtualMachineCustomImageImpl withCustomImageDataDisk(CustomImageDataDiskImpl customImageDataDisk) {
        if (this.innerModel().storageProfile() == null) {
            this.innerModel().withStorageProfile(new ImageStorageProfile());
        }
        if (this.innerModel().storageProfile().dataDisks() == null) {
            this.innerModel().storageProfile().withDataDisks(new ArrayList<ImageDataDisk>());
        }
        this.innerModel().storageProfile().dataDisks().add(customImageDataDisk.innerModel());
        return this;
    }

    @Override
    public VirtualMachineCustomImageImpl withHyperVGeneration(HyperVGenerationTypes hyperVGeneration) {
        this.innerModel().withHyperVGeneration(hyperVGeneration);
        return this;
    }
}
