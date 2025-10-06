package ru.backendbyjava.grpc.server.impl;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import ru.backendbyjava.proto.*;
import ru.backendbyjava.service.VideoRequestValidator;

@GrpcService
public class VideoControllerServiceImpl extends VideoControllerServiceGrpc.VideoControllerServiceImplBase {

    private final VideoRequestValidator validator;

    public VideoControllerServiceImpl(VideoRequestValidator validator) {
        this.validator = validator;
    }

    @Override
    public void getVideo(VideoRequest request, StreamObserver<VideoResponse> responseObserver) {
        validator.validate(request);

        Video video = Video.newBuilder()
                .setTitle("New Video unary operation")
                .setRating(1)
                .setCategory(request.getCategory())
                .setDescription("Video with category " + request.getCategory())
                .build();

        VideoResponse videoResponse = VideoResponse.newBuilder()
                .setVideo(video)
                .build();

        responseObserver.onNext(videoResponse);
        responseObserver.onCompleted();
    }
}
