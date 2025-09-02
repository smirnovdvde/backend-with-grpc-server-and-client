package ru.backendbyjava.grpc.server.impl;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import ru.backendbyjava.proto.VideoStoreRequest;
import ru.backendbyjava.proto.VideoStoreResponse;
import ru.backendbyjava.proto.VideoStoreServiceGrpc;
import ru.backendbyjava.service.VideoHelper;

@GrpcService
public class VideoStoreServiceImpl extends VideoStoreServiceGrpc.VideoStoreServiceImplBase {

    @Override
    public void getMovies(VideoStoreRequest request, StreamObserver<VideoStoreResponse> responseObserver) {
        VideoHelper.buildVideoList().stream().
                filter(video -> video.getCategory().equals(request.getCategory()))
                .forEach(video -> {
                    responseObserver.onNext(VideoStoreResponse.newBuilder().setVideo(video).build());
                });
        responseObserver.onCompleted();
    }
}
