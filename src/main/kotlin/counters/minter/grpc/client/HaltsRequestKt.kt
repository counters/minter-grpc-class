//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: resources.proto

package counters.minter.grpc.client;

@kotlin.jvm.JvmSynthetic
inline fun haltsRequest(block: counters.minter.grpc.client.HaltsRequestKt.Dsl.() -> Unit): counters.minter.grpc.client.HaltsRequest =
  counters.minter.grpc.client.HaltsRequestKt.Dsl._create(counters.minter.grpc.client.HaltsRequest.newBuilder()).apply { block() }._build()
object HaltsRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: counters.minter.grpc.client.HaltsRequest.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: counters.minter.grpc.client.HaltsRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): counters.minter.grpc.client.HaltsRequest = _builder.build()

    /**
     * <code>uint64 height = 1;</code>
     */
    var height: kotlin.Long
      @JvmName("getHeight")
      get() = _builder.getHeight()
      @JvmName("setHeight")
      set(value) {
        _builder.setHeight(value)
      }
    /**
     * <code>uint64 height = 1;</code>
     */
    fun clearHeight() {
      _builder.clearHeight()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun counters.minter.grpc.client.HaltsRequest.copy(block: counters.minter.grpc.client.HaltsRequestKt.Dsl.() -> Unit): counters.minter.grpc.client.HaltsRequest =
  counters.minter.grpc.client.HaltsRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()
