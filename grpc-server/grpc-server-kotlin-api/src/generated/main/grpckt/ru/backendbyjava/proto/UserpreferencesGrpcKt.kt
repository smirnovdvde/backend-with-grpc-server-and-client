package ru.backendbyjava.proto

import io.grpc.CallOptions
import io.grpc.CallOptions.DEFAULT
import io.grpc.Channel
import io.grpc.Metadata
import io.grpc.MethodDescriptor
import io.grpc.ServerServiceDefinition
import io.grpc.ServerServiceDefinition.builder
import io.grpc.ServiceDescriptor
import io.grpc.Status.UNIMPLEMENTED
import io.grpc.StatusException
import io.grpc.kotlin.AbstractCoroutineServerImpl
import io.grpc.kotlin.AbstractCoroutineStub
import io.grpc.kotlin.ClientCalls.bidiStreamingRpc
import io.grpc.kotlin.ServerCalls.bidiStreamingServerMethodDefinition
import io.grpc.kotlin.StubFor
import kotlin.String
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic
import kotlinx.coroutines.flow.Flow
import ru.backendbyjava.proto.UserPreferencesServiceGrpc.getServiceDescriptor

/**
 * Holder for Kotlin coroutine-based client and server APIs for
 * userpreferences.UserPreferencesService.
 */
public object UserPreferencesServiceGrpcKt {
  public const val SERVICE_NAME: String = UserPreferencesServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val getShortlistedVideosMethod:
      MethodDescriptor<UserPreferencesRequest, UserPreferencesResponse>
    @JvmStatic
    get() = UserPreferencesServiceGrpc.getGetShortlistedVideosMethod()

  /**
   * A stub for issuing RPCs to a(n) userpreferences.UserPreferencesService service as suspending
   * coroutines.
   */
  @StubFor(UserPreferencesServiceGrpc::class)
  public class UserPreferencesServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<UserPreferencesServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions):
        UserPreferencesServiceCoroutineStub = UserPreferencesServiceCoroutineStub(channel,
        callOptions)

    /**
     * Returns a [Flow] that, when collected, executes this RPC and emits responses from the
     * server as they arrive.  That flow finishes normally if the server closes its response with
     * [`Status.OK`][io.grpc.Status], and fails by throwing a [StatusException] otherwise.  If
     * collecting the flow downstream fails exceptionally (including via cancellation), the RPC
     * is cancelled with that exception as a cause.
     *
     * The [Flow] of requests is collected once each time the [Flow] of responses is
     * collected. If collection of the [Flow] of responses completes normally or
     * exceptionally before collection of `requests` completes, the collection of
     * `requests` is cancelled.  If the collection of `requests` completes
     * exceptionally for any other reason, then the collection of the [Flow] of responses
     * completes exceptionally for the same reason and the RPC is cancelled with that reason.
     *
     * @param requests A [Flow] of request messages.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return A flow that, when collected, emits the responses from the server.
     */
    public fun getShortlistedVideos(requests: Flow<UserPreferencesRequest>, headers: Metadata =
        Metadata()): Flow<UserPreferencesResponse> = bidiStreamingRpc(
      channel,
      UserPreferencesServiceGrpc.getGetShortlistedVideosMethod(),
      requests,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the userpreferences.UserPreferencesService service based on Kotlin
   * coroutines.
   */
  public abstract class UserPreferencesServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns a [Flow] of responses to an RPC for
     * userpreferences.UserPreferencesService.getShortlistedVideos.
     *
     * If creating or collecting the returned flow fails with a [StatusException], the RPC
     * will fail with the corresponding [io.grpc.Status].  If it fails with a
     * [java.util.concurrent.CancellationException], the RPC will fail with status
     * `Status.CANCELLED`.  If creating
     * or collecting the returned flow fails for any other reason, the RPC will fail with
     * `Status.UNKNOWN` with the exception as a cause.
     *
     * @param requests A [Flow] of requests from the client.  This flow can be
     *        collected only once and throws [java.lang.IllegalStateException] on attempts to
     * collect
     *        it more than once.
     */
    public open fun getShortlistedVideos(requests: Flow<UserPreferencesRequest>):
        Flow<UserPreferencesResponse> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method userpreferences.UserPreferencesService.getShortlistedVideos is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(bidiStreamingServerMethodDefinition(
      context = this.context,
      descriptor = UserPreferencesServiceGrpc.getGetShortlistedVideosMethod(),
      implementation = ::getShortlistedVideos
    )).build()
  }
}
