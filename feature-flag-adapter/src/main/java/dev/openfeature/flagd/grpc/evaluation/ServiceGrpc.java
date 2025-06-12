package dev.openfeature.flagd.grpc.evaluation;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service defines the exposed rpcs of flagd
 * </pre>
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class ServiceGrpc {

  private ServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "flagd.evaluation.v1.Service";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveAllRequest,
      dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveAllResponse> getResolveAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ResolveAll",
      requestType = dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveAllRequest.class,
      responseType = dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveAllResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveAllRequest,
      dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveAllResponse> getResolveAllMethod() {
    io.grpc.MethodDescriptor<dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveAllRequest, dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveAllResponse> getResolveAllMethod;
    if ((getResolveAllMethod = ServiceGrpc.getResolveAllMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getResolveAllMethod = ServiceGrpc.getResolveAllMethod) == null) {
          ServiceGrpc.getResolveAllMethod = getResolveAllMethod =
              io.grpc.MethodDescriptor.<dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveAllRequest, dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveAllResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ResolveAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveAllRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveAllResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("ResolveAll"))
              .build();
        }
      }
    }
    return getResolveAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveBooleanRequest,
      dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveBooleanResponse> getResolveBooleanMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ResolveBoolean",
      requestType = dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveBooleanRequest.class,
      responseType = dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveBooleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveBooleanRequest,
      dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveBooleanResponse> getResolveBooleanMethod() {
    io.grpc.MethodDescriptor<dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveBooleanRequest, dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveBooleanResponse> getResolveBooleanMethod;
    if ((getResolveBooleanMethod = ServiceGrpc.getResolveBooleanMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getResolveBooleanMethod = ServiceGrpc.getResolveBooleanMethod) == null) {
          ServiceGrpc.getResolveBooleanMethod = getResolveBooleanMethod =
              io.grpc.MethodDescriptor.<dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveBooleanRequest, dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveBooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ResolveBoolean"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveBooleanRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveBooleanResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("ResolveBoolean"))
              .build();
        }
      }
    }
    return getResolveBooleanMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveStringRequest,
      dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveStringResponse> getResolveStringMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ResolveString",
      requestType = dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveStringRequest.class,
      responseType = dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveStringResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveStringRequest,
      dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveStringResponse> getResolveStringMethod() {
    io.grpc.MethodDescriptor<dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveStringRequest, dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveStringResponse> getResolveStringMethod;
    if ((getResolveStringMethod = ServiceGrpc.getResolveStringMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getResolveStringMethod = ServiceGrpc.getResolveStringMethod) == null) {
          ServiceGrpc.getResolveStringMethod = getResolveStringMethod =
              io.grpc.MethodDescriptor.<dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveStringRequest, dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveStringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ResolveString"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveStringRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveStringResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("ResolveString"))
              .build();
        }
      }
    }
    return getResolveStringMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveFloatRequest,
      dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveFloatResponse> getResolveFloatMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ResolveFloat",
      requestType = dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveFloatRequest.class,
      responseType = dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveFloatResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveFloatRequest,
      dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveFloatResponse> getResolveFloatMethod() {
    io.grpc.MethodDescriptor<dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveFloatRequest, dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveFloatResponse> getResolveFloatMethod;
    if ((getResolveFloatMethod = ServiceGrpc.getResolveFloatMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getResolveFloatMethod = ServiceGrpc.getResolveFloatMethod) == null) {
          ServiceGrpc.getResolveFloatMethod = getResolveFloatMethod =
              io.grpc.MethodDescriptor.<dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveFloatRequest, dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveFloatResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ResolveFloat"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveFloatRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveFloatResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("ResolveFloat"))
              .build();
        }
      }
    }
    return getResolveFloatMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveIntRequest,
      dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveIntResponse> getResolveIntMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ResolveInt",
      requestType = dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveIntRequest.class,
      responseType = dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveIntResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveIntRequest,
      dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveIntResponse> getResolveIntMethod() {
    io.grpc.MethodDescriptor<dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveIntRequest, dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveIntResponse> getResolveIntMethod;
    if ((getResolveIntMethod = ServiceGrpc.getResolveIntMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getResolveIntMethod = ServiceGrpc.getResolveIntMethod) == null) {
          ServiceGrpc.getResolveIntMethod = getResolveIntMethod =
              io.grpc.MethodDescriptor.<dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveIntRequest, dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveIntResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ResolveInt"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveIntRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveIntResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("ResolveInt"))
              .build();
        }
      }
    }
    return getResolveIntMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveObjectRequest,
      dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveObjectResponse> getResolveObjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ResolveObject",
      requestType = dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveObjectRequest.class,
      responseType = dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveObjectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveObjectRequest,
      dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveObjectResponse> getResolveObjectMethod() {
    io.grpc.MethodDescriptor<dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveObjectRequest, dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveObjectResponse> getResolveObjectMethod;
    if ((getResolveObjectMethod = ServiceGrpc.getResolveObjectMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getResolveObjectMethod = ServiceGrpc.getResolveObjectMethod) == null) {
          ServiceGrpc.getResolveObjectMethod = getResolveObjectMethod =
              io.grpc.MethodDescriptor.<dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveObjectRequest, dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveObjectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ResolveObject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveObjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveObjectResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("ResolveObject"))
              .build();
        }
      }
    }
    return getResolveObjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dev.openfeature.flagd.grpc.evaluation.Evaluation.EventStreamRequest,
      dev.openfeature.flagd.grpc.evaluation.Evaluation.EventStreamResponse> getEventStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EventStream",
      requestType = dev.openfeature.flagd.grpc.evaluation.Evaluation.EventStreamRequest.class,
      responseType = dev.openfeature.flagd.grpc.evaluation.Evaluation.EventStreamResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<dev.openfeature.flagd.grpc.evaluation.Evaluation.EventStreamRequest,
      dev.openfeature.flagd.grpc.evaluation.Evaluation.EventStreamResponse> getEventStreamMethod() {
    io.grpc.MethodDescriptor<dev.openfeature.flagd.grpc.evaluation.Evaluation.EventStreamRequest, dev.openfeature.flagd.grpc.evaluation.Evaluation.EventStreamResponse> getEventStreamMethod;
    if ((getEventStreamMethod = ServiceGrpc.getEventStreamMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getEventStreamMethod = ServiceGrpc.getEventStreamMethod) == null) {
          ServiceGrpc.getEventStreamMethod = getEventStreamMethod =
              io.grpc.MethodDescriptor.<dev.openfeature.flagd.grpc.evaluation.Evaluation.EventStreamRequest, dev.openfeature.flagd.grpc.evaluation.Evaluation.EventStreamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EventStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.openfeature.flagd.grpc.evaluation.Evaluation.EventStreamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.openfeature.flagd.grpc.evaluation.Evaluation.EventStreamResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("EventStream"))
              .build();
        }
      }
    }
    return getEventStreamMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServiceStub>() {
        @java.lang.Override
        public ServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServiceStub(channel, callOptions);
        }
      };
    return ServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServiceBlockingStub>() {
        @java.lang.Override
        public ServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServiceBlockingStub(channel, callOptions);
        }
      };
    return ServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServiceFutureStub>() {
        @java.lang.Override
        public ServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServiceFutureStub(channel, callOptions);
        }
      };
    return ServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service defines the exposed rpcs of flagd
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void resolveAll(dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveAllRequest request,
        io.grpc.stub.StreamObserver<dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveAllResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getResolveAllMethod(), responseObserver);
    }

    /**
     */
    default void resolveBoolean(dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveBooleanRequest request,
        io.grpc.stub.StreamObserver<dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveBooleanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getResolveBooleanMethod(), responseObserver);
    }

    /**
     */
    default void resolveString(dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveStringRequest request,
        io.grpc.stub.StreamObserver<dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveStringResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getResolveStringMethod(), responseObserver);
    }

    /**
     */
    default void resolveFloat(dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveFloatRequest request,
        io.grpc.stub.StreamObserver<dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveFloatResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getResolveFloatMethod(), responseObserver);
    }

    /**
     */
    default void resolveInt(dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveIntRequest request,
        io.grpc.stub.StreamObserver<dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveIntResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getResolveIntMethod(), responseObserver);
    }

    /**
     */
    default void resolveObject(dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveObjectRequest request,
        io.grpc.stub.StreamObserver<dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveObjectResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getResolveObjectMethod(), responseObserver);
    }

    /**
     */
    default void eventStream(dev.openfeature.flagd.grpc.evaluation.Evaluation.EventStreamRequest request,
        io.grpc.stub.StreamObserver<dev.openfeature.flagd.grpc.evaluation.Evaluation.EventStreamResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEventStreamMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Service.
   * <pre>
   * Service defines the exposed rpcs of flagd
   * </pre>
   */
  public static abstract class ServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Service.
   * <pre>
   * Service defines the exposed rpcs of flagd
   * </pre>
   */
  public static final class ServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ServiceStub> {
    private ServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServiceStub(channel, callOptions);
    }

    /**
     */
    public void resolveAll(dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveAllRequest request,
        io.grpc.stub.StreamObserver<dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveAllResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getResolveAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void resolveBoolean(dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveBooleanRequest request,
        io.grpc.stub.StreamObserver<dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveBooleanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getResolveBooleanMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void resolveString(dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveStringRequest request,
        io.grpc.stub.StreamObserver<dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveStringResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getResolveStringMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void resolveFloat(dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveFloatRequest request,
        io.grpc.stub.StreamObserver<dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveFloatResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getResolveFloatMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void resolveInt(dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveIntRequest request,
        io.grpc.stub.StreamObserver<dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveIntResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getResolveIntMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void resolveObject(dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveObjectRequest request,
        io.grpc.stub.StreamObserver<dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveObjectResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getResolveObjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void eventStream(dev.openfeature.flagd.grpc.evaluation.Evaluation.EventStreamRequest request,
        io.grpc.stub.StreamObserver<dev.openfeature.flagd.grpc.evaluation.Evaluation.EventStreamResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getEventStreamMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Service.
   * <pre>
   * Service defines the exposed rpcs of flagd
   * </pre>
   */
  public static final class ServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ServiceBlockingStub> {
    private ServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveAllResponse resolveAll(dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveAllRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getResolveAllMethod(), getCallOptions(), request);
    }

    /**
     */
    public dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveBooleanResponse resolveBoolean(dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveBooleanRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getResolveBooleanMethod(), getCallOptions(), request);
    }

    /**
     */
    public dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveStringResponse resolveString(dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveStringRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getResolveStringMethod(), getCallOptions(), request);
    }

    /**
     */
    public dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveFloatResponse resolveFloat(dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveFloatRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getResolveFloatMethod(), getCallOptions(), request);
    }

    /**
     */
    public dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveIntResponse resolveInt(dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveIntRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getResolveIntMethod(), getCallOptions(), request);
    }

    /**
     */
    public dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveObjectResponse resolveObject(dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveObjectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getResolveObjectMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<dev.openfeature.flagd.grpc.evaluation.Evaluation.EventStreamResponse> eventStream(
        dev.openfeature.flagd.grpc.evaluation.Evaluation.EventStreamRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getEventStreamMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Service.
   * <pre>
   * Service defines the exposed rpcs of flagd
   * </pre>
   */
  public static final class ServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ServiceFutureStub> {
    private ServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveAllResponse> resolveAll(
        dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveAllRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getResolveAllMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveBooleanResponse> resolveBoolean(
        dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveBooleanRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getResolveBooleanMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveStringResponse> resolveString(
        dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveStringRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getResolveStringMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveFloatResponse> resolveFloat(
        dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveFloatRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getResolveFloatMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveIntResponse> resolveInt(
        dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveIntRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getResolveIntMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveObjectResponse> resolveObject(
        dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveObjectRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getResolveObjectMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_RESOLVE_ALL = 0;
  private static final int METHODID_RESOLVE_BOOLEAN = 1;
  private static final int METHODID_RESOLVE_STRING = 2;
  private static final int METHODID_RESOLVE_FLOAT = 3;
  private static final int METHODID_RESOLVE_INT = 4;
  private static final int METHODID_RESOLVE_OBJECT = 5;
  private static final int METHODID_EVENT_STREAM = 6;

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
        case METHODID_RESOLVE_ALL:
          serviceImpl.resolveAll((dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveAllRequest) request,
              (io.grpc.stub.StreamObserver<dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveAllResponse>) responseObserver);
          break;
        case METHODID_RESOLVE_BOOLEAN:
          serviceImpl.resolveBoolean((dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveBooleanRequest) request,
              (io.grpc.stub.StreamObserver<dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveBooleanResponse>) responseObserver);
          break;
        case METHODID_RESOLVE_STRING:
          serviceImpl.resolveString((dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveStringRequest) request,
              (io.grpc.stub.StreamObserver<dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveStringResponse>) responseObserver);
          break;
        case METHODID_RESOLVE_FLOAT:
          serviceImpl.resolveFloat((dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveFloatRequest) request,
              (io.grpc.stub.StreamObserver<dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveFloatResponse>) responseObserver);
          break;
        case METHODID_RESOLVE_INT:
          serviceImpl.resolveInt((dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveIntRequest) request,
              (io.grpc.stub.StreamObserver<dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveIntResponse>) responseObserver);
          break;
        case METHODID_RESOLVE_OBJECT:
          serviceImpl.resolveObject((dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveObjectRequest) request,
              (io.grpc.stub.StreamObserver<dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveObjectResponse>) responseObserver);
          break;
        case METHODID_EVENT_STREAM:
          serviceImpl.eventStream((dev.openfeature.flagd.grpc.evaluation.Evaluation.EventStreamRequest) request,
              (io.grpc.stub.StreamObserver<dev.openfeature.flagd.grpc.evaluation.Evaluation.EventStreamResponse>) responseObserver);
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
          getResolveAllMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveAllRequest,
              dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveAllResponse>(
                service, METHODID_RESOLVE_ALL)))
        .addMethod(
          getResolveBooleanMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveBooleanRequest,
              dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveBooleanResponse>(
                service, METHODID_RESOLVE_BOOLEAN)))
        .addMethod(
          getResolveStringMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveStringRequest,
              dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveStringResponse>(
                service, METHODID_RESOLVE_STRING)))
        .addMethod(
          getResolveFloatMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveFloatRequest,
              dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveFloatResponse>(
                service, METHODID_RESOLVE_FLOAT)))
        .addMethod(
          getResolveIntMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveIntRequest,
              dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveIntResponse>(
                service, METHODID_RESOLVE_INT)))
        .addMethod(
          getResolveObjectMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveObjectRequest,
              dev.openfeature.flagd.grpc.evaluation.Evaluation.ResolveObjectResponse>(
                service, METHODID_RESOLVE_OBJECT)))
        .addMethod(
          getEventStreamMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              dev.openfeature.flagd.grpc.evaluation.Evaluation.EventStreamRequest,
              dev.openfeature.flagd.grpc.evaluation.Evaluation.EventStreamResponse>(
                service, METHODID_EVENT_STREAM)))
        .build();
  }

  private static abstract class ServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return dev.openfeature.flagd.grpc.evaluation.Evaluation.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Service");
    }
  }

  private static final class ServiceFileDescriptorSupplier
      extends ServiceBaseDescriptorSupplier {
    ServiceFileDescriptorSupplier() {}
  }

  private static final class ServiceMethodDescriptorSupplier
      extends ServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ServiceFileDescriptorSupplier())
              .addMethod(getResolveAllMethod())
              .addMethod(getResolveBooleanMethod())
              .addMethod(getResolveStringMethod())
              .addMethod(getResolveFloatMethod())
              .addMethod(getResolveIntMethod())
              .addMethod(getResolveObjectMethod())
              .addMethod(getEventStreamMethod())
              .build();
        }
      }
    }
    return result;
  }
}
