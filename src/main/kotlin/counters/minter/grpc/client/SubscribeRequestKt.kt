//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: resources.proto

package counters.minter.grpc.client;

@kotlin.jvm.JvmSynthetic
inline fun subscribeRequest(block: counters.minter.grpc.client.SubscribeRequestKt.Dsl.() -> Unit): counters.minter.grpc.client.SubscribeRequest =
  counters.minter.grpc.client.SubscribeRequestKt.Dsl._create(counters.minter.grpc.client.SubscribeRequest.newBuilder()).apply { block() }._build()
object SubscribeRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: counters.minter.grpc.client.SubscribeRequest.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: counters.minter.grpc.client.SubscribeRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): counters.minter.grpc.client.SubscribeRequest = _builder.build()

    /**
     * <code>string query = 1;</code>
     */
    var query: kotlin.String
      @JvmName("getQuery")
      get() = _builder.getQuery()
      @JvmName("setQuery")
      set(value) {
        _builder.setQuery(value)
      }
    /**
     * <code>string query = 1;</code>
     */
    fun clearQuery() {
      _builder.clearQuery()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun counters.minter.grpc.client.SubscribeRequest.copy(block: counters.minter.grpc.client.SubscribeRequestKt.Dsl.() -> Unit): counters.minter.grpc.client.SubscribeRequest =
  counters.minter.grpc.client.SubscribeRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()
