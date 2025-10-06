package ru.backendbyjava.grpc.server.impl;

import com.google.rpc.Code;
import com.google.rpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.protobuf.StatusProto;
import net.devh.boot.grpc.server.advice.GrpcAdvice;
import net.devh.boot.grpc.server.advice.GrpcExceptionHandler;
import ru.backendbyjava.exception.VideoRequestValidationException;

@GrpcAdvice
public class ExceptionHandler {

    @GrpcExceptionHandler(VideoRequestValidationException.class)
    public StatusRuntimeException handleException(VideoRequestValidationException exception) {

        Status status = Status.newBuilder()
                .setCode(Code.INVALID_ARGUMENT.getNumber())
                .setMessage(exception.getMessage())
                .build();

        return StatusProto.toStatusRuntimeException(status);
    }
}
