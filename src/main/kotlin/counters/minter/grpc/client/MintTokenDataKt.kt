//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: data.proto

package counters.minter.grpc.client;

@kotlin.jvm.JvmSynthetic
inline fun mintTokenData(block: counters.minter.grpc.client.MintTokenDataKt.Dsl.() -> Unit): counters.minter.grpc.client.MintTokenData =
  counters.minter.grpc.client.MintTokenDataKt.Dsl._create(counters.minter.grpc.client.MintTokenData.newBuilder()).apply { block() }._build()
object MintTokenDataKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: counters.minter.grpc.client.MintTokenData.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: counters.minter.grpc.client.MintTokenData.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): counters.minter.grpc.client.MintTokenData = _builder.build()

    /**
     * <code>.api_pb.Coin coin = 1;</code>
     */
    var coin: counters.minter.grpc.client.Coin
      @JvmName("getCoin")
      get() = _builder.getCoin()
      @JvmName("setCoin")
      set(value) {
        _builder.setCoin(value)
      }
    /**
     * <code>.api_pb.Coin coin = 1;</code>
     */
    fun clearCoin() {
      _builder.clearCoin()
    }
    /**
     * <code>.api_pb.Coin coin = 1;</code>
     * @return Whether the coin field is set.
     */
    fun hasCoin(): kotlin.Boolean {
      return _builder.hasCoin()
    }

    /**
     * <code>string value = 2;</code>
     */
    var value: kotlin.String
      @JvmName("getValue")
      get() = _builder.getValue()
      @JvmName("setValue")
      set(value) {
        _builder.setValue(value)
      }
    /**
     * <code>string value = 2;</code>
     */
    fun clearValue() {
      _builder.clearValue()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun counters.minter.grpc.client.MintTokenData.copy(block: counters.minter.grpc.client.MintTokenDataKt.Dsl.() -> Unit): counters.minter.grpc.client.MintTokenData =
  counters.minter.grpc.client.MintTokenDataKt.Dsl._create(this.toBuilder()).apply { block() }._build()
