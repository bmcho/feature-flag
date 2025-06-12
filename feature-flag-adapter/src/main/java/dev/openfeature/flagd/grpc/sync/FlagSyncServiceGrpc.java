package dev.openfeature.flagd.grpc.sync;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * FlagService implements a server streaming to provide realtime flag configurations
 * </pre>
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class FlagSyncServiceGrpc {

  private FlagSyncServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "flagd.sync.v1.FlagSyncService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<dev.openfeature.flagd.grpc.sync.Sync.SyncFlagsRequest,
      dev.openfeature.flagd.grpc.sync.Sync.SyncFlagsResponse> getSyncFlagsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SyncFlags",
      requestType = dev.openfeature.flagd.grpc.sync.Sync.SyncFlagsRequest.class,
      responseType = dev.openfeature.flagd.grpc.sync.Sync.SyncFlagsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<dev.openfeature.flagd.grpc.sync.Sync.SyncFlagsRequest,
      dev.openfeature.flagd.grpc.sync.Sync.SyncFlagsResponse> getSyncFlagsMethod() {
    io.grpc.MethodDescriptor<dev.openfeature.flagd.grpc.sync.Sync.SyncFlagsRequest, dev.openfeature.flagd.grpc.sync.Sync.SyncFlagsResponse> getSyncFlagsMethod;
    if ((getSyncFlagsMethod = FlagSyncServiceGrpc.getSyncFlagsMethod) == null) {
      synchronized (FlagSyncServiceGrpc.class) {
        if ((getSyncFlagsMethod = FlagSyncServiceGrpc.getSyncFlagsMethod) == null) {
          FlagSyncServiceGrpc.getSyncFlagsMethod = getSyncFlagsMethod =
              io.grpc.MethodDescriptor.<dev.openfeature.flagd.grpc.sync.Sync.SyncFlagsRequest, dev.openfeature.flagd.grpc.sync.Sync.SyncFlagsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SyncFlags"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.openfeature.flagd.grpc.sync.Sync.SyncFlagsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.openfeature.flagd.grpc.sync.Sync.SyncFlagsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FlagSyncServiceMethodDescriptorSupplier("SyncFlags"))
              .build();
        }
      }
    }
    return getSyncFlagsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dev.openfeature.flagd.grpc.sync.Sync.FetchAllFlagsRequest,
      dev.openfeature.flagd.grpc.sync.Sync.FetchAllFlagsResponse> getFetchAllFlagsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FetchAllFlags",
      requestType = dev.openfeature.flagd.grpc.sync.Sync.FetchAllFlagsRequest.class,
      responseType = dev.openfeature.flagd.grpc.sync.Sync.FetchAllFlagsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dev.openfeature.flagd.grpc.sync.Sync.FetchAllFlagsRequest,
      dev.openfeature.flagd.grpc.sync.Sync.FetchAllFlagsResponse> getFetchAllFlagsMethod() {
    io.grpc.MethodDescriptor<dev.openfeature.flagd.grpc.sync.Sync.FetchAllFlagsRequest, dev.openfeature.flagd.grpc.sync.Sync.FetchAllFlagsResponse> getFetchAllFlagsMethod;
    if ((getFetchAllFlagsMethod = FlagSyncServiceGrpc.getFetchAllFlagsMethod) == null) {
      synchronized (FlagSyncServiceGrpc.class) {
        if ((getFetchAllFlagsMethod = FlagSyncServiceGrpc.getFetchAllFlagsMethod) == null) {
          FlagSyncServiceGrpc.getFetchAllFlagsMethod = getFetchAllFlagsMethod =
              io.grpc.MethodDescriptor.<dev.openfeature.flagd.grpc.sync.Sync.FetchAllFlagsRequest, dev.openfeature.flagd.grpc.sync.Sync.FetchAllFlagsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FetchAllFlags"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.openfeature.flagd.grpc.sync.Sync.FetchAllFlagsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.openfeature.flagd.grpc.sync.Sync.FetchAllFlagsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FlagSyncServiceMethodDescriptorSupplier("FetchAllFlags"))
              .build();
        }
      }
    }
    return getFetchAllFlagsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dev.openfeature.flagd.grpc.sync.Sync.GetMetadataRequest,
      dev.openfeature.flagd.grpc.sync.Sync.GetMetadataResponse> getGetMetadataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMetadata",
      requestType = dev.openfeature.flagd.grpc.sync.Sync.GetMetadataRequest.class,
      responseType = dev.openfeature.flagd.grpc.sync.Sync.GetMetadataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dev.openfeature.flagd.grpc.sync.Sync.GetMetadataRequest,
      dev.openfeature.flagd.grpc.sync.Sync.GetMetadataResponse> getGetMetadataMethod() {
    io.grpc.MethodDescriptor<dev.openfeature.flagd.grpc.sync.Sync.GetMetadataRequest, dev.openfeature.flagd.grpc.sync.Sync.GetMetadataResponse> getGetMetadataMethod;
    if ((getGetMetadataMethod = FlagSyncServiceGrpc.getGetMetadataMethod) == null) {
      synchronized (FlagSyncServiceGrpc.class) {
        if ((getGetMetadataMethod = FlagSyncServiceGrpc.getGetMetadataMethod) == null) {
          FlagSyncServiceGrpc.getGetMetadataMethod = getGetMetadataMethod =
              io.grpc.MethodDescriptor.<dev.openfeature.flagd.grpc.sync.Sync.GetMetadataRequest, dev.openfeature.flagd.grpc.sync.Sync.GetMetadataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMetadata"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.openfeature.flagd.grpc.sync.Sync.GetMetadataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.openfeature.flagd.grpc.sync.Sync.GetMetadataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FlagSyncServiceMethodDescriptorSupplier("GetMetadata"))
              .build();
        }
      }
    }
    return getGetMetadataMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FlagSyncServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FlagSyncServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FlagSyncServiceStub>() {
        @java.lang.Override
        public FlagSyncServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FlagSyncServiceStub(channel, callOptions);
        }
      };
    return FlagSyncServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FlagSyncServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FlagSyncServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FlagSyncServiceBlockingStub>() {
        @java.lang.Override
        public FlagSyncServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FlagSyncServiceBlockingStub(channel, callOptions);
        }
      };
    return FlagSyncServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FlagSyncServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FlagSyncServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FlagSyncServiceFutureStub>() {
        @java.lang.Override
        public FlagSyncServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FlagSyncServiceFutureStub(channel, callOptions);
        }
      };
    return FlagSyncServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * FlagService implements a server streaming to provide realtime flag configurations
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void syncFlags(dev.openfeature.flagd.grpc.sync.Sync.SyncFlagsRequest request,
        io.grpc.stub.StreamObserver<dev.openfeature.flagd.grpc.sync.Sync.SyncFlagsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSyncFlagsMethod(), responseObserver);
    }

    /**
     */
    default void fetchAllFlags(dev.openfeature.flagd.grpc.sync.Sync.FetchAllFlagsRequest request,
        io.grpc.stub.StreamObserver<dev.openfeature.flagd.grpc.sync.Sync.FetchAllFlagsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFetchAllFlagsMethod(), responseObserver);
    }

    /**
     */
    @java.lang.Deprecated
    default void getMetadata(dev.openfeature.flagd.grpc.sync.Sync.GetMetadataRequest request,
        io.grpc.stub.StreamObserver<dev.openfeature.flagd.grpc.sync.Sync.GetMetadataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMetadataMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service FlagSyncService.
   * <pre>
   * FlagService implements a server streaming to provide realtime flag configurations
   * </pre>
   */
  public static abstract class FlagSyncServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return FlagSyncServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service FlagSyncService.
   * <pre>
   * FlagService implements a server streaming to provide realtime flag configurations
   * </pre>
   */
  public static final class FlagSyncServiceStub
      extends io.grpc.stub.AbstractAsyncStub<FlagSyncServiceStub> {
    private FlagSyncServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FlagSyncServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FlagSyncServiceStub(channel, callOptions);
    }

    /**
     */
    public void syncFlags(dev.openfeature.flagd.grpc.sync.Sync.SyncFlagsRequest request,
        io.grpc.stub.StreamObserver<dev.openfeature.flagd.grpc.sync.Sync.SyncFlagsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSyncFlagsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void fetchAllFlags(dev.openfeature.flagd.grpc.sync.Sync.FetchAllFlagsRequest request,
        io.grpc.stub.StreamObserver<dev.openfeature.flagd.grpc.sync.Sync.FetchAllFlagsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFetchAllFlagsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    @java.lang.Deprecated
    public void getMetadata(dev.openfeature.flagd.grpc.sync.Sync.GetMetadataRequest request,
        io.grpc.stub.StreamObserver<dev.openfeature.flagd.grpc.sync.Sync.GetMetadataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMetadataMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service FlagSyncService.
   * <pre>
   * FlagService implements a server streaming to provide realtime flag configurations
   * </pre>
   */
  public static final class FlagSyncServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<FlagSyncServiceBlockingStub> {
    private FlagSyncServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FlagSyncServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FlagSyncServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<dev.openfeature.flagd.grpc.sync.Sync.SyncFlagsResponse> syncFlags(
        dev.openfeature.flagd.grpc.sync.Sync.SyncFlagsRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSyncFlagsMethod(), getCallOptions(), request);
    }

    /**
     */
    public dev.openfeature.flagd.grpc.sync.Sync.FetchAllFlagsResponse fetchAllFlags(dev.openfeature.flagd.grpc.sync.Sync.FetchAllFlagsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFetchAllFlagsMethod(), getCallOptions(), request);
    }

    /**
     */
    @java.lang.Deprecated
    public dev.openfeature.flagd.grpc.sync.Sync.GetMetadataResponse getMetadata(dev.openfeature.flagd.grpc.sync.Sync.GetMetadataRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMetadataMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service FlagSyncService.
   * <pre>
   * FlagService implements a server streaming to provide realtime flag configurations
   * </pre>
   */
  public static final class FlagSyncServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<FlagSyncServiceFutureStub> {
    private FlagSyncServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FlagSyncServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FlagSyncServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dev.openfeature.flagd.grpc.sync.Sync.FetchAllFlagsResponse> fetchAllFlags(
        dev.openfeature.flagd.grpc.sync.Sync.FetchAllFlagsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFetchAllFlagsMethod(), getCallOptions()), request);
    }

    /**
     */
    @java.lang.Deprecated
    public com.google.common.util.concurrent.ListenableFuture<dev.openfeature.flagd.grpc.sync.Sync.GetMetadataResponse> getMetadata(
        dev.openfeature.flagd.grpc.sync.Sync.GetMetadataRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMetadataMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SYNC_FLAGS = 0;
  private static final int METHODID_FETCH_ALL_FLAGS = 1;
  private static final int METHODID_GET_METADATA = 2;

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
        case METHODID_SYNC_FLAGS:
          serviceImpl.syncFlags((dev.openfeature.flagd.grpc.sync.Sync.SyncFlagsRequest) request,
              (io.grpc.stub.StreamObserver<dev.openfeature.flagd.grpc.sync.Sync.SyncFlagsResponse>) responseObserver);
          break;
        case METHODID_FETCH_ALL_FLAGS:
          serviceImpl.fetchAllFlags((dev.openfeature.flagd.grpc.sync.Sync.FetchAllFlagsRequest) request,
              (io.grpc.stub.StreamObserver<dev.openfeature.flagd.grpc.sync.Sync.FetchAllFlagsResponse>) responseObserver);
          break;
        case METHODID_GET_METADATA:
          serviceImpl.getMetadata((dev.openfeature.flagd.grpc.sync.Sync.GetMetadataRequest) request,
              (io.grpc.stub.StreamObserver<dev.openfeature.flagd.grpc.sync.Sync.GetMetadataResponse>) responseObserver);
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
          getSyncFlagsMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              dev.openfeature.flagd.grpc.sync.Sync.SyncFlagsRequest,
              dev.openfeature.flagd.grpc.sync.Sync.SyncFlagsResponse>(
                service, METHODID_SYNC_FLAGS)))
        .addMethod(
          getFetchAllFlagsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              dev.openfeature.flagd.grpc.sync.Sync.FetchAllFlagsRequest,
              dev.openfeature.flagd.grpc.sync.Sync.FetchAllFlagsResponse>(
                service, METHODID_FETCH_ALL_FLAGS)))
        .addMethod(
          getGetMetadataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              dev.openfeature.flagd.grpc.sync.Sync.GetMetadataRequest,
              dev.openfeature.flagd.grpc.sync.Sync.GetMetadataResponse>(
                service, METHODID_GET_METADATA)))
        .build();
  }

  private static abstract class FlagSyncServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FlagSyncServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return dev.openfeature.flagd.grpc.sync.Sync.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FlagSyncService");
    }
  }

  private static final class FlagSyncServiceFileDescriptorSupplier
      extends FlagSyncServiceBaseDescriptorSupplier {
    FlagSyncServiceFileDescriptorSupplier() {}
  }

  private static final class FlagSyncServiceMethodDescriptorSupplier
      extends FlagSyncServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    FlagSyncServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (FlagSyncServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FlagSyncServiceFileDescriptorSupplier())
              .addMethod(getSyncFlagsMethod())
              .addMethod(getFetchAllFlagsMethod())
              .addMethod(getGetMetadataMethod())
              .build();
        }
      }
    }
    return result;
  }
}
