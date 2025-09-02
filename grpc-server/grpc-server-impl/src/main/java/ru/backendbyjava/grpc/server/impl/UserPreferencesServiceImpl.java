package ru.backendbyjava.grpc.server.impl;

import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import ru.backendbyjava.proto.UserPreferencesRequest;
import ru.backendbyjava.proto.UserPreferencesResponse;
import ru.backendbyjava.proto.UserPreferencesServiceGrpc;
import ru.backendbyjava.proto.Video;
import ru.backendbyjava.service.VideoHelper;

import java.security.SecureRandom;
import java.util.Random;

@GrpcService
public class UserPreferencesServiceImpl extends UserPreferencesServiceGrpc.UserPreferencesServiceImplBase {

    @Override
    public StreamObserver<UserPreferencesRequest> getShortlistedVideos(StreamObserver<UserPreferencesResponse> responseObserver) {
        return new UserPreferencesResponseStreamObserver(responseObserver);
    }

    private boolean isEligible(String userId) {
        return (new SecureRandom().nextInt() % 4 != 0);
    }

    private Video getRandomVideo() {
        Random rand = new Random();
        int index = rand.nextInt(VideoHelper.buildVideoList().size());
        return VideoHelper.buildVideoList().get(index);
    }

    private class UserPreferencesResponseStreamObserver implements StreamObserver<UserPreferencesRequest> {

        private final StreamObserver<UserPreferencesResponse> responseObserver;

        private UserPreferencesResponseStreamObserver(StreamObserver<UserPreferencesResponse> responseObserver) {
            this.responseObserver = responseObserver;
        }

        @Override
        public void onNext(UserPreferencesRequest value) {
            if (isEligible(value.getUserid())) {
                responseObserver
                        .onNext(UserPreferencesResponse
                                .newBuilder()
                                .setVideo(getRandomVideo()).build());
            }
        }

        @Override
        public void onError(Throwable t) {
            responseObserver.onError(Status.INTERNAL
                    .withDescription("Internal server error")
                    .asRuntimeException());
        }

        @Override
        public void onCompleted() {
            responseObserver.onCompleted();
        }
    }
}
