//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: resources.proto

package counters.minter.grpc.client;

@kotlin.jvm.JvmSynthetic
inline fun validatorsRequest(block: counters.minter.grpc.client.ValidatorsRequestKt.Dsl.() -> Unit): counters.minter.grpc.client.ValidatorsRequest =
  counters.minter.grpc.client.ValidatorsRequestKt.Dsl._create(counters.minter.grpc.client.ValidatorsRequest.newBuilder()).apply { block() }._build()
object ValidatorsRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: counters.minter.grpc.client.ValidatorsRequest.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: counters.minter.grpc.client.ValidatorsRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): counters.minter.grpc.client.ValidatorsRequest = _builder.build()

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
inline fun counters.minter.grpc.client.ValidatorsRequest.copy(block: counters.minter.grpc.client.ValidatorsRequestKt.Dsl.() -> Unit): counters.minter.grpc.client.ValidatorsRequest =
  counters.minter.grpc.client.ValidatorsRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()
