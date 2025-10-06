package ru.backendbyjava.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.73.0)",
    comments = "Source: recommender/recommender.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class RecommenderServiceGrpc {

  private RecommenderServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "recommender.RecommenderService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ru.backendbyjava.proto.RecommenderRequest,
      ru.backendbyjava.proto.RecommenderResponse> getGetRecommendedMovieMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getRecommendedMovie",
      requestType = ru.backendbyjava.proto.RecommenderRequest.class,
      responseType = ru.backendbyjava.proto.RecommenderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<ru.backendbyjava.proto.RecommenderRequest,
      ru.backendbyjava.proto.RecommenderResponse> getGetRecommendedMovieMethod() {
    io.grpc.MethodDescriptor<ru.backendbyjava.proto.RecommenderRequest, ru.backendbyjava.proto.RecommenderResponse> getGetRecommendedMovieMethod;
    if ((getGetRecommendedMovieMethod = RecommenderServiceGrpc.getGetRecommendedMovieMethod) == null) {
      synchronized (RecommenderServiceGrpc.class) {
        if ((getGetRecommendedMovieMethod = RecommenderServiceGrpc.getGetRecommendedMovieMethod) == null) {
          RecommenderServiceGrpc.getGetRecommendedMovieMethod = getGetRecommendedMovieMethod =
              io.grpc.MethodDescriptor.<ru.backendbyjava.proto.RecommenderRequest, ru.backendbyjava.proto.RecommenderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getRecommendedMovie"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.backendbyjava.proto.RecommenderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.backendbyjava.proto.RecommenderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RecommenderServiceMethodDescriptorSupplier("getRecommendedMovie"))
              .build();
        }
      }
    }
    return getGetRecommendedMovieMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RecommenderServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RecommenderServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RecommenderServiceStub>() {
        @java.lang.Override
        public RecommenderServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RecommenderServiceStub(channel, callOptions);
        }
      };
    return RecommenderServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static RecommenderServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RecommenderServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RecommenderServiceBlockingV2Stub>() {
        @java.lang.Override
        public RecommenderServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RecommenderServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return RecommenderServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RecommenderServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RecommenderServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RecommenderServiceBlockingStub>() {
        @java.lang.Override
        public RecommenderServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RecommenderServiceBlockingStub(channel, callOptions);
        }
      };
    return RecommenderServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RecommenderServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RecommenderServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RecommenderServiceFutureStub>() {
        @java.lang.Override
        public RecommenderServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RecommenderServiceFutureStub(channel, callOptions);
        }
      };
    return RecommenderServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * client streaming request that receives a stream of videos and recommends one
     * </pre>
     */
    default io.grpc.stub.StreamObserver<ru.backendbyjava.proto.RecommenderRequest> getRecommendedMovie(
        io.grpc.stub.StreamObserver<ru.backendbyjava.proto.RecommenderResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getGetRecommendedMovieMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service RecommenderService.
   */
  public static abstract class RecommenderServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return RecommenderServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service RecommenderService.
   */
  public static final class RecommenderServiceStub
      extends io.grpc.stub.AbstractAsyncStub<RecommenderServiceStub> {
    private RecommenderServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RecommenderServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RecommenderServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * client streaming request that receives a stream of videos and recommends one
     * </pre>
     */
    public io.grpc.stub.StreamObserver<ru.backendbyjava.proto.RecommenderRequest> getRecommendedMovie(
        io.grpc.stub.StreamObserver<ru.backendbyjava.proto.RecommenderResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getGetRecommendedMovieMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service RecommenderService.
   */
  public static final class RecommenderServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<RecommenderServiceBlockingV2Stub> {
    private RecommenderServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RecommenderServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RecommenderServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * client streaming request that receives a stream of videos and recommends one
     * </pre>
     */
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/10918")
    public io.grpc.stub.BlockingClientCall<ru.backendbyjava.proto.RecommenderRequest, ru.backendbyjava.proto.RecommenderResponse>
        getRecommendedMovie() {
      return io.grpc.stub.ClientCalls.blockingClientStreamingCall(
          getChannel(), getGetRecommendedMovieMethod(), getCallOptions());
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service RecommenderService.
   */
  public static final class RecommenderServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<RecommenderServiceBlockingStub> {
    private RecommenderServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RecommenderServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RecommenderServiceBlockingStub(channel, callOptions);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service RecommenderService.
   */
  public static final class RecommenderServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<RecommenderServiceFutureStub> {
    private RecommenderServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RecommenderServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RecommenderServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_GET_RECOMMENDED_MOVIE = 0;

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
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_RECOMMENDED_MOVIE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.getRecommendedMovie(
              (io.grpc.stub.StreamObserver<ru.backendbyjava.proto.RecommenderResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetRecommendedMovieMethod(),
          io.grpc.stub.ServerCalls.asyncClientStreamingCall(
            new MethodHandlers<
              ru.backendbyjava.proto.RecommenderRequest,
              ru.backendbyjava.proto.RecommenderResponse>(
                service, METHODID_GET_RECOMMENDED_MOVIE)))
        .build();
  }

  private static abstract class RecommenderServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RecommenderServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ru.backendbyjava.proto.Recommender.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RecommenderService");
    }
  }

  private static final class RecommenderServiceFileDescriptorSupplier
      extends RecommenderServiceBaseDescriptorSupplier {
    RecommenderServiceFileDescriptorSupplier() {}
  }

  private static final class RecommenderServiceMethodDescriptorSupplier
      extends RecommenderServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    RecommenderServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (RecommenderServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RecommenderServiceFileDescriptorSupplier())
              .addMethod(getGetRecommendedMovieMethod())
              .build();
        }
      }
    }
    return result;
  }
}
