// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.ai.vision.face.tests.commands.liveness;

import com.azure.ai.vision.face.FaceSessionAsyncClient;
import com.azure.ai.vision.face.models.CreateLivenessWithVerifySessionContent;
import com.azure.ai.vision.face.models.CreateLivenessWithVerifySessionResult;
import com.azure.ai.vision.face.models.LivenessWithVerifySession;
import com.azure.ai.vision.face.tests.function.FunctionUtils;
import com.azure.core.util.BinaryData;
import reactor.core.publisher.Mono;

class LivenessWithVerifySessionAsyncCommands implements ILivenessWithVerifySessionSyncCommands {
    private final FaceSessionAsyncClient mAsyncClient;

    LivenessWithVerifySessionAsyncCommands(FaceSessionAsyncClient asyncClient) {
        this.mAsyncClient = asyncClient;
    }

    public Mono<CreateLivenessWithVerifySessionResult>
        createLivenessWithVerifySession(CreateLivenessWithVerifySessionContent content, BinaryData verifyImage) {
        return mAsyncClient.createLivenessWithVerifySession(content, verifyImage);
    }

    public Mono<LivenessWithVerifySession> getLivenessWithVerifySessionResult(String sessionId) {
        return mAsyncClient.getLivenessWithVerifySessionResult(sessionId);
    }

    public Mono<Void> deleteLivenessWithVerifySession(String sessionId) {
        return mAsyncClient.deleteLivenessWithVerifySession(sessionId);
    }

    @Override
    public CreateLivenessWithVerifySessionResult
        createLivenessWithVerifySessionSync(CreateLivenessWithVerifySessionContent content, BinaryData verifyImage) {
        return FunctionUtils.callAndAwait(() -> createLivenessWithVerifySession(content, verifyImage));
    }

    @Override
    public LivenessWithVerifySession getLivenessWithVerifySessionResultSync(String sessionId) {
        return FunctionUtils.callAndAwait(() -> getLivenessWithVerifySessionResult(sessionId));
    }

    @Override
    public void deleteLivenessWithVerifySessionSync(String sessionId) {
        FunctionUtils.callAndAwait(() -> deleteLivenessWithVerifySession(sessionId));
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
