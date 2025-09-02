package ru.backendbyjava.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.73.0)",
    comments = "Source: userpreferences/userpreferences.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class UserPreferencesServiceGrpc {

  private UserPreferencesServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "userpreferences.UserPreferencesService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ru.backendbyjava.proto.UserPreferencesRequest,
      ru.backendbyjava.proto.UserPreferencesResponse> getGetShortlistedVideosMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getShortlistedVideos",
      requestType = ru.backendbyjava.proto.UserPreferencesRequest.class,
      responseType = ru.backendbyjava.proto.UserPreferencesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<ru.backendbyjava.proto.UserPreferencesRequest,
      ru.backendbyjava.proto.UserPreferencesResponse> getGetShortlistedVideosMethod() {
    io.grpc.MethodDescriptor<ru.backendbyjava.proto.UserPreferencesRequest, ru.backendbyjava.proto.UserPreferencesResponse> getGetShortlistedVideosMethod;
    if ((getGetShortlistedVideosMethod = UserPreferencesServiceGrpc.getGetShortlistedVideosMethod) == null) {
      synchronized (UserPreferencesServiceGrpc.class) {
        if ((getGetShortlistedVideosMethod = UserPreferencesServiceGrpc.getGetShortlistedVideosMethod) == null) {
          UserPreferencesServiceGrpc.getGetShortlistedVideosMethod = getGetShortlistedVideosMethod =
              io.grpc.MethodDescriptor.<ru.backendbyjava.proto.UserPreferencesRequest, ru.backendbyjava.proto.UserPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getShortlistedVideos"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.backendbyjava.proto.UserPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.backendbyjava.proto.UserPreferencesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserPreferencesServiceMethodDescriptorSupplier("getShortlistedVideos"))
              .build();
        }
      }
    }
    return getGetShortlistedVideosMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserPreferencesServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserPreferencesServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserPreferencesServiceStub>() {
        @java.lang.Override
        public UserPreferencesServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserPreferencesServiceStub(channel, callOptions);
        }
      };
    return UserPreferencesServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static UserPreferencesServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserPreferencesServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserPreferencesServiceBlockingV2Stub>() {
        @java.lang.Override
        public UserPreferencesServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserPreferencesServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return UserPreferencesServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserPreferencesServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserPreferencesServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserPreferencesServiceBlockingStub>() {
        @java.lang.Override
        public UserPreferencesServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserPreferencesServiceBlockingStub(channel, callOptions);
        }
      };
    return UserPreferencesServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserPreferencesServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserPreferencesServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserPreferencesServiceFutureStub>() {
        @java.lang.Override
        public UserPreferencesServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserPreferencesServiceFutureStub(channel, callOptions);
        }
      };
    return UserPreferencesServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * Bidirectional streaming rpc call to receive a stream of videos shortlisted based on user preferences
     * </pre>
     */
    default io.grpc.stub.StreamObserver<ru.backendbyjava.proto.UserPreferencesRequest> getShortlistedVideos(
        io.grpc.stub.StreamObserver<ru.backendbyjava.proto.UserPreferencesResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getGetShortlistedVideosMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service UserPreferencesService.
   */
  public static abstract class UserPreferencesServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return UserPreferencesServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service UserPreferencesService.
   */
  public static final class UserPreferencesServiceStub
      extends io.grpc.stub.AbstractAsyncStub<UserPreferencesServiceStub> {
    private UserPreferencesServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserPreferencesServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserPreferencesServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Bidirectional streaming rpc call to receive a stream of videos shortlisted based on user preferences
     * </pre>
     */
    public io.grpc.stub.StreamObserver<ru.backendbyjava.proto.UserPreferencesRequest> getShortlistedVideos(
        io.grpc.stub.StreamObserver<ru.backendbyjava.proto.UserPreferencesResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getGetShortlistedVideosMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service UserPreferencesService.
   */
  public static final class UserPreferencesServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<UserPreferencesServiceBlockingV2Stub> {
    private UserPreferencesServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserPreferencesServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserPreferencesServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Bidirectional streaming rpc call to receive a stream of videos shortlisted based on user preferences
     * </pre>
     */
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/10918")
    public io.grpc.stub.BlockingClientCall<ru.backendbyjava.proto.UserPreferencesRequest, ru.backendbyjava.proto.UserPreferencesResponse>
        getShortlistedVideos() {
      return io.grpc.stub.ClientCalls.blockingBidiStreamingCall(
          getChannel(), getGetShortlistedVideosMethod(), getCallOptions());
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service UserPreferencesService.
   */
  public static final class UserPreferencesServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<UserPreferencesServiceBlockingStub> {
    private UserPreferencesServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserPreferencesServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserPreferencesServiceBlockingStub(channel, callOptions);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service UserPreferencesService.
   */
  public static final class UserPreferencesServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<UserPreferencesServiceFutureStub> {
    private UserPreferencesServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserPreferencesServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserPreferencesServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_GET_SHORTLISTED_VIDEOS = 0;

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
        case METHODID_GET_SHORTLISTED_VIDEOS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.getShortlistedVideos(
              (io.grpc.stub.StreamObserver<ru.backendbyjava.proto.UserPreferencesResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetShortlistedVideosMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              ru.backendbyjava.proto.UserPreferencesRequest,
              ru.backendbyjava.proto.UserPreferencesResponse>(
                service, METHODID_GET_SHORTLISTED_VIDEOS)))
        .build();
  }

  private static abstract class UserPreferencesServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserPreferencesServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ru.backendbyjava.proto.Userpreferences.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserPreferencesService");
    }
  }

  private static final class UserPreferencesServiceFileDescriptorSupplier
      extends UserPreferencesServiceBaseDescriptorSupplier {
    UserPreferencesServiceFileDescriptorSupplier() {}
  }

  private static final class UserPreferencesServiceMethodDescriptorSupplier
      extends UserPreferencesServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    UserPreferencesServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (UserPreferencesServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserPreferencesServiceFileDescriptorSupplier())
              .addMethod(getGetShortlistedVideosMethod())
              .build();
        }
      }
    }
    return result;
  }
}
