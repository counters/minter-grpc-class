//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: resources.proto

package counters.minter.grpc.client;

@kotlin.jvm.JvmSynthetic
inline fun coinInfoRequest(block: counters.minter.grpc.client.CoinInfoRequestKt.Dsl.() -> Unit): counters.minter.grpc.client.CoinInfoRequest =
  counters.minter.grpc.client.CoinInfoRequestKt.Dsl._create(counters.minter.grpc.client.CoinInfoRequest.newBuilder()).apply { block() }._build()
object CoinInfoRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: counters.minter.grpc.client.CoinInfoRequest.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: counters.minter.grpc.client.CoinInfoRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): counters.minter.grpc.client.CoinInfoRequest = _builder.build()

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

    /**
     * <code>string symbol = 2;</code>
     */
    var symbol: kotlin.String
      @JvmName("getSymbol")
      get() = _builder.getSymbol()
      @JvmName("setSymbol")
      set(value) {
        _builder.setSymbol(value)
      }
    /**
     * <code>string symbol = 2;</code>
     */
    fun clearSymbol() {
      _builder.clearSymbol()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun counters.minter.grpc.client.CoinInfoRequest.copy(block: counters.minter.grpc.client.CoinInfoRequestKt.Dsl.() -> Unit): counters.minter.grpc.client.CoinInfoRequest =
  counters.minter.grpc.client.CoinInfoRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()
