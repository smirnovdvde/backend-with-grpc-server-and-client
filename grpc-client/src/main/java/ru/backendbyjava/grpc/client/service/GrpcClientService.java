package ru.backendbyjava.grpc.client.service;

import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import ru.backendbyjava.proto.UserPreferencesRequest;
import ru.backendbyjava.proto.UserPreferencesResponse;
import ru.backendbyjava.proto.UserPreferencesServiceGrpc.UserPreferencesServiceStub;

import java.util.concurrent.CountDownLatch;

@Service
public class GrpcClientService {
    private static final Logger log = LoggerFactory.getLogger(GrpcClientService.class);

    @GrpcClient("local-grpc-server")
    private UserPreferencesServiceStub userPreferenceStub;

    public void getUserPreferences() {
        CountDownLatch finishLatch = new CountDownLatch(1);
        UserPreferencesRequest[] requests = {
                UserPreferencesRequest.newBuilder().setUserid("123").build(),
                UserPreferencesRequest.newBuilder().setUserid("321").build(),
                UserPreferencesRequest.newBuilder().setUserid("456").build()
        };

        StreamObserver<UserPreferencesRequest> requestObserver = userPreferenceStub.getShortlistedVideos(
                new UserPreferencesRequestStreamObserver(finishLatch)
        );

        try {
            for (UserPreferencesRequest request : requests) {
                requestObserver.onNext(request);
            }
            requestObserver.onCompleted();
            finishLatch.await();
        } catch (RuntimeException e) {
            requestObserver.onError(e);
            throw e;
        } catch (InterruptedException e) {
            requestObserver.onError(e);
            throw new RuntimeException(e);
        }

    }

    private record UserPreferencesRequestStreamObserver(CountDownLatch countDownLatch)
            implements StreamObserver<UserPreferencesResponse> {

        @Override
            public void onNext(UserPreferencesResponse response) {
                log.info("Get response with video with Title: {}, Category: {}, Description: {}",
                        response.getVideo().getTitle(),
                        response.getVideo().getCategory(),
                        response.getVideo().getDescription());
            }

            @Override
            public void onError(Throwable throwable) {
                Status status = Status.fromThrowable(throwable);
                log.warn("User preferences failed: {}", status);
                countDownLatch.countDown();
            }

            @Override
            public void onCompleted() {
                log.info("Finished User preferences requesting");
                countDownLatch.countDown();
            }
        }
}
