//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: data.proto

package counters.minter.grpc.client;

@kotlin.jvm.JvmSynthetic
inline fun sellAllCoinData(block: counters.minter.grpc.client.SellAllCoinDataKt.Dsl.() -> Unit): counters.minter.grpc.client.SellAllCoinData =
  counters.minter.grpc.client.SellAllCoinDataKt.Dsl._create(counters.minter.grpc.client.SellAllCoinData.newBuilder()).apply { block() }._build()
object SellAllCoinDataKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: counters.minter.grpc.client.SellAllCoinData.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: counters.minter.grpc.client.SellAllCoinData.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): counters.minter.grpc.client.SellAllCoinData = _builder.build()

    /**
     * <code>.api_pb.Coin coin_to_sell = 1;</code>
     */
    var coinToSell: counters.minter.grpc.client.Coin
      @JvmName("getCoinToSell")
      get() = _builder.getCoinToSell()
      @JvmName("setCoinToSell")
      set(value) {
        _builder.setCoinToSell(value)
      }
    /**
     * <code>.api_pb.Coin coin_to_sell = 1;</code>
     */
    fun clearCoinToSell() {
      _builder.clearCoinToSell()
    }
    /**
     * <code>.api_pb.Coin coin_to_sell = 1;</code>
     * @return Whether the coinToSell field is set.
     */
    fun hasCoinToSell(): kotlin.Boolean {
      return _builder.hasCoinToSell()
    }

    /**
     * <code>.api_pb.Coin coin_to_buy = 2;</code>
     */
    var coinToBuy: counters.minter.grpc.client.Coin
      @JvmName("getCoinToBuy")
      get() = _builder.getCoinToBuy()
      @JvmName("setCoinToBuy")
      set(value) {
        _builder.setCoinToBuy(value)
      }
    /**
     * <code>.api_pb.Coin coin_to_buy = 2;</code>
     */
    fun clearCoinToBuy() {
      _builder.clearCoinToBuy()
    }
    /**
     * <code>.api_pb.Coin coin_to_buy = 2;</code>
     * @return Whether the coinToBuy field is set.
     */
    fun hasCoinToBuy(): kotlin.Boolean {
      return _builder.hasCoinToBuy()
    }

    /**
     * <code>string minimum_value_to_buy = 3;</code>
     */
    var minimumValueToBuy: kotlin.String
      @JvmName("getMinimumValueToBuy")
      get() = _builder.getMinimumValueToBuy()
      @JvmName("setMinimumValueToBuy")
      set(value) {
        _builder.setMinimumValueToBuy(value)
      }
    /**
     * <code>string minimum_value_to_buy = 3;</code>
     */
    fun clearMinimumValueToBuy() {
      _builder.clearMinimumValueToBuy()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun counters.minter.grpc.client.SellAllCoinData.copy(block: counters.minter.grpc.client.SellAllCoinDataKt.Dsl.() -> Unit): counters.minter.grpc.client.SellAllCoinData =
  counters.minter.grpc.client.SellAllCoinDataKt.Dsl._create(this.toBuilder()).apply { block() }._build()
