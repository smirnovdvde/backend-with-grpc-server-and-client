package ru.backendbyjava;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import ru.backendbyjava.grpc.client.service.GrpcClientService;

@Component
public class ApplicationRunnerImpl implements ApplicationRunner {

    private final GrpcClientService grpcClientService;

    public ApplicationRunnerImpl(GrpcClientService grpcClientService) {
        this.grpcClientService = grpcClientService;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        grpcClientService.getUserPreferences();
    }
}
