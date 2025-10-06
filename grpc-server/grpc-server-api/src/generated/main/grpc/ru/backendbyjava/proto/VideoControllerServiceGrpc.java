package ru.backendbyjava.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.73.0)",
    comments = "Source: videocontroller/videocontroller.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class VideoControllerServiceGrpc {

  private VideoControllerServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "videocontroller.VideoControllerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ru.backendbyjava.proto.VideoRequest,
      ru.backendbyjava.proto.VideoResponse> getGetVideoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getVideo",
      requestType = ru.backendbyjava.proto.VideoRequest.class,
      responseType = ru.backendbyjava.proto.VideoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ru.backendbyjava.proto.VideoRequest,
      ru.backendbyjava.proto.VideoResponse> getGetVideoMethod() {
    io.grpc.MethodDescriptor<ru.backendbyjava.proto.VideoRequest, ru.backendbyjava.proto.VideoResponse> getGetVideoMethod;
    if ((getGetVideoMethod = VideoControllerServiceGrpc.getGetVideoMethod) == null) {
      synchronized (VideoControllerServiceGrpc.class) {
        if ((getGetVideoMethod = VideoControllerServiceGrpc.getGetVideoMethod) == null) {
          VideoControllerServiceGrpc.getGetVideoMethod = getGetVideoMethod =
              io.grpc.MethodDescriptor.<ru.backendbyjava.proto.VideoRequest, ru.backendbyjava.proto.VideoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getVideo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.backendbyjava.proto.VideoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.backendbyjava.proto.VideoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VideoControllerServiceMethodDescriptorSupplier("getVideo"))
              .build();
        }
      }
    }
    return getGetVideoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static VideoControllerServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VideoControllerServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VideoControllerServiceStub>() {
        @java.lang.Override
        public VideoControllerServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VideoControllerServiceStub(channel, callOptions);
        }
      };
    return VideoControllerServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static VideoControllerServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VideoControllerServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VideoControllerServiceBlockingV2Stub>() {
        @java.lang.Override
        public VideoControllerServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VideoControllerServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return VideoControllerServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static VideoControllerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VideoControllerServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VideoControllerServiceBlockingStub>() {
        @java.lang.Override
        public VideoControllerServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VideoControllerServiceBlockingStub(channel, callOptions);
        }
      };
    return VideoControllerServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static VideoControllerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VideoControllerServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VideoControllerServiceFutureStub>() {
        @java.lang.Override
        public VideoControllerServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VideoControllerServiceFutureStub(channel, callOptions);
        }
      };
    return VideoControllerServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * unary rpc call to retrieve a video
     * </pre>
     */
    default void getVideo(ru.backendbyjava.proto.VideoRequest request,
        io.grpc.stub.StreamObserver<ru.backendbyjava.proto.VideoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetVideoMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service VideoControllerService.
   */
  public static abstract class VideoControllerServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return VideoControllerServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service VideoControllerService.
   */
  public static final class VideoControllerServiceStub
      extends io.grpc.stub.AbstractAsyncStub<VideoControllerServiceStub> {
    private VideoControllerServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VideoControllerServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VideoControllerServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * unary rpc call to retrieve a video
     * </pre>
     */
    public void getVideo(ru.backendbyjava.proto.VideoRequest request,
        io.grpc.stub.StreamObserver<ru.backendbyjava.proto.VideoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetVideoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service VideoControllerService.
   */
  public static final class VideoControllerServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<VideoControllerServiceBlockingV2Stub> {
    private VideoControllerServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VideoControllerServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VideoControllerServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * unary rpc call to retrieve a video
     * </pre>
     */
    public ru.backendbyjava.proto.VideoResponse getVideo(ru.backendbyjava.proto.VideoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetVideoMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service VideoControllerService.
   */
  public static final class VideoControllerServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<VideoControllerServiceBlockingStub> {
    private VideoControllerServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VideoControllerServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VideoControllerServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * unary rpc call to retrieve a video
     * </pre>
     */
    public ru.backendbyjava.proto.VideoResponse getVideo(ru.backendbyjava.proto.VideoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetVideoMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service VideoControllerService.
   */
  public static final class VideoControllerServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<VideoControllerServiceFutureStub> {
    private VideoControllerServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VideoControllerServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VideoControllerServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * unary rpc call to retrieve a video
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ru.backendbyjava.proto.VideoResponse> getVideo(
        ru.backendbyjava.proto.VideoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetVideoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_VIDEO = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_VIDEO:
          serviceImpl.getVideo((ru.backendbyjava.proto.VideoRequest) request,
              (io.grpc.stub.StreamObserver<ru.backendbyjava.proto.VideoResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetVideoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ru.backendbyjava.proto.VideoRequest,
              ru.backendbyjava.proto.VideoResponse>(
                service, METHODID_GET_VIDEO)))
        .build();
  }

  private static abstract class VideoControllerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    VideoControllerServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ru.backendbyjava.proto.Videocontroller.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("VideoControllerService");
    }
  }

  private static final class VideoControllerServiceFileDescriptorSupplier
      extends VideoControllerServiceBaseDescriptorSupplier {
    VideoControllerServiceFileDescriptorSupplier() {}
  }

  private static final class VideoControllerServiceMethodDescriptorSupplier
      extends VideoControllerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    VideoControllerServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (VideoControllerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new VideoControllerServiceFileDescriptorSupplier())
              .addMethod(getGetVideoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
