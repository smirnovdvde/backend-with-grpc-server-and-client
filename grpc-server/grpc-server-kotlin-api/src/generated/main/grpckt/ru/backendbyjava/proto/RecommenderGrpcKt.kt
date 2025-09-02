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
import io.grpc.kotlin.ClientCalls.clientStreamingRpc
import io.grpc.kotlin.ServerCalls.clientStreamingServerMethodDefinition
import io.grpc.kotlin.StubFor
import kotlin.String
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic
import kotlinx.coroutines.flow.Flow
import ru.backendbyjava.proto.RecommenderServiceGrpc.getServiceDescriptor

/**
 * Holder for Kotlin coroutine-based client and server APIs for recommender.RecommenderService.
 */
public object RecommenderServiceGrpcKt {
  public const val SERVICE_NAME: String = RecommenderServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val getRecommendedMovieMethod: MethodDescriptor<RecommenderRequest, RecommenderResponse>
    @JvmStatic
    get() = RecommenderServiceGrpc.getGetRecommendedMovieMethod()

  /**
   * A stub for issuing RPCs to a(n) recommender.RecommenderService service as suspending
   * coroutines.
   */
  @StubFor(RecommenderServiceGrpc::class)
  public class RecommenderServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<RecommenderServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): RecommenderServiceCoroutineStub
        = RecommenderServiceCoroutineStub(channel, callOptions)

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * This function collects the [Flow] of requests.  If the server terminates the RPC
     * for any reason before collection of requests is complete, the collection of requests
     * will be cancelled.  If the collection of requests completes exceptionally for any other
     * reason, the RPC will be cancelled for that reason and this method will throw that
     * exception.
     *
     * @param requests A [Flow] of request messages.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun getRecommendedMovie(requests: Flow<RecommenderRequest>, headers: Metadata =
        Metadata()): RecommenderResponse = clientStreamingRpc(
      channel,
      RecommenderServiceGrpc.getGetRecommendedMovieMethod(),
      requests,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the recommender.RecommenderService service based on Kotlin
   * coroutines.
   */
  public abstract class RecommenderServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for recommender.RecommenderService.getRecommendedMovie.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param requests A [Flow] of requests from the client.  This flow can be
     *        collected only once and throws [java.lang.IllegalStateException] on attempts to
     * collect
     *        it more than once.
     */
    public open suspend fun getRecommendedMovie(requests: Flow<RecommenderRequest>):
        RecommenderResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method recommender.RecommenderService.getRecommendedMovie is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(clientStreamingServerMethodDefinition(
      context = this.context,
      descriptor = RecommenderServiceGrpc.getGetRecommendedMovieMethod(),
      implementation = ::getRecommendedMovie
    )).build()
  }
}
