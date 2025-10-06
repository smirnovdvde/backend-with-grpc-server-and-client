package ru.backendbyjava.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.73.0)",
    comments = "Source: videostore/videostore.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class VideoStoreServiceGrpc {

  private VideoStoreServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "videostore.VideoStoreService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ru.backendbyjava.proto.VideoStoreRequest,
      ru.backendbyjava.proto.VideoStoreResponse> getGetMoviesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getMovies",
      requestType = ru.backendbyjava.proto.VideoStoreRequest.class,
      responseType = ru.backendbyjava.proto.VideoStoreResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<ru.backendbyjava.proto.VideoStoreRequest,
      ru.backendbyjava.proto.VideoStoreResponse> getGetMoviesMethod() {
    io.grpc.MethodDescriptor<ru.backendbyjava.proto.VideoStoreRequest, ru.backendbyjava.proto.VideoStoreResponse> getGetMoviesMethod;
    if ((getGetMoviesMethod = VideoStoreServiceGrpc.getGetMoviesMethod) == null) {
      synchronized (VideoStoreServiceGrpc.class) {
        if ((getGetMoviesMethod = VideoStoreServiceGrpc.getGetMoviesMethod) == null) {
          VideoStoreServiceGrpc.getGetMoviesMethod = getGetMoviesMethod =
              io.grpc.MethodDescriptor.<ru.backendbyjava.proto.VideoStoreRequest, ru.backendbyjava.proto.VideoStoreResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getMovies"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.backendbyjava.proto.VideoStoreRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.backendbyjava.proto.VideoStoreResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VideoStoreServiceMethodDescriptorSupplier("getMovies"))
              .build();
        }
      }
    }
    return getGetMoviesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static VideoStoreServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VideoStoreServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VideoStoreServiceStub>() {
        @java.lang.Override
        public VideoStoreServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VideoStoreServiceStub(channel, callOptions);
        }
      };
    return VideoStoreServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static VideoStoreServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VideoStoreServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VideoStoreServiceBlockingV2Stub>() {
        @java.lang.Override
        public VideoStoreServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VideoStoreServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return VideoStoreServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static VideoStoreServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VideoStoreServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VideoStoreServiceBlockingStub>() {
        @java.lang.Override
        public VideoStoreServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VideoStoreServiceBlockingStub(channel, callOptions);
        }
      };
    return VideoStoreServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static VideoStoreServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VideoStoreServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VideoStoreServiceFutureStub>() {
        @java.lang.Override
        public VideoStoreServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VideoStoreServiceFutureStub(channel, callOptions);
        }
      };
    return VideoStoreServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * server streaming rpc call to receive a stream of videos
     * </pre>
     */
    default void getMovies(ru.backendbyjava.proto.VideoStoreRequest request,
        io.grpc.stub.StreamObserver<ru.backendbyjava.proto.VideoStoreResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMoviesMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service VideoStoreService.
   */
  public static abstract class VideoStoreServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return VideoStoreServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service VideoStoreService.
   */
  public static final class VideoStoreServiceStub
      extends io.grpc.stub.AbstractAsyncStub<VideoStoreServiceStub> {
    private VideoStoreServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VideoStoreServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VideoStoreServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * server streaming rpc call to receive a stream of videos
     * </pre>
     */
    public void getMovies(ru.backendbyjava.proto.VideoStoreRequest request,
        io.grpc.stub.StreamObserver<ru.backendbyjava.proto.VideoStoreResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetMoviesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service VideoStoreService.
   */
  public static final class VideoStoreServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<VideoStoreServiceBlockingV2Stub> {
    private VideoStoreServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VideoStoreServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VideoStoreServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * server streaming rpc call to receive a stream of videos
     * </pre>
     */
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/10918")
    public io.grpc.stub.BlockingClientCall<?, ru.backendbyjava.proto.VideoStoreResponse>
        getMovies(ru.backendbyjava.proto.VideoStoreRequest request) {
      return io.grpc.stub.ClientCalls.blockingV2ServerStreamingCall(
          getChannel(), getGetMoviesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service VideoStoreService.
   */
  public static final class VideoStoreServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<VideoStoreServiceBlockingStub> {
    private VideoStoreServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VideoStoreServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VideoStoreServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * server streaming rpc call to receive a stream of videos
     * </pre>
     */
    public java.util.Iterator<ru.backendbyjava.proto.VideoStoreResponse> getMovies(
        ru.backendbyjava.proto.VideoStoreRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetMoviesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service VideoStoreService.
   */
  public static final class VideoStoreServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<VideoStoreServiceFutureStub> {
    private VideoStoreServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VideoStoreServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VideoStoreServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_GET_MOVIES = 0;

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
        case METHODID_GET_MOVIES:
          serviceImpl.getMovies((ru.backendbyjava.proto.VideoStoreRequest) request,
              (io.grpc.stub.StreamObserver<ru.backendbyjava.proto.VideoStoreResponse>) responseObserver);
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
          getGetMoviesMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              ru.backendbyjava.proto.VideoStoreRequest,
              ru.backendbyjava.proto.VideoStoreResponse>(
                service, METHODID_GET_MOVIES)))
        .build();
  }

  private static abstract class VideoStoreServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    VideoStoreServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ru.backendbyjava.proto.Videostore.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("VideoStoreService");
    }
  }

  private static final class VideoStoreServiceFileDescriptorSupplier
      extends VideoStoreServiceBaseDescriptorSupplier {
    VideoStoreServiceFileDescriptorSupplier() {}
  }

  private static final class VideoStoreServiceMethodDescriptorSupplier
      extends VideoStoreServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    VideoStoreServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (VideoStoreServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new VideoStoreServiceFileDescriptorSupplier())
              .addMethod(getGetMoviesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
