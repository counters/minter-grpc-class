//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: data.proto

package counters.minter.grpc.client;

@kotlin.jvm.JvmSynthetic
inline fun buySwapPoolData(block: counters.minter.grpc.client.BuySwapPoolDataKt.Dsl.() -> Unit): counters.minter.grpc.client.BuySwapPoolData =
  counters.minter.grpc.client.BuySwapPoolDataKt.Dsl._create(counters.minter.grpc.client.BuySwapPoolData.newBuilder()).apply { block() }._build()
object BuySwapPoolDataKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: counters.minter.grpc.client.BuySwapPoolData.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: counters.minter.grpc.client.BuySwapPoolData.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): counters.minter.grpc.client.BuySwapPoolData = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    class CoinsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated .api_pb.Coin coins = 1;</code>
     */
     val coins: com.google.protobuf.kotlin.DslList<counters.minter.grpc.client.Coin, CoinsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getCoinsList()
      )
    /**
     * <code>repeated .api_pb.Coin coins = 1;</code>
     * @param value The coins to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addCoins")
    fun com.google.protobuf.kotlin.DslList<counters.minter.grpc.client.Coin, CoinsProxy>.add(value: counters.minter.grpc.client.Coin) {
      _builder.addCoins(value)
    }/**
     * <code>repeated .api_pb.Coin coins = 1;</code>
     * @param value The coins to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignCoins")
    inline operator fun com.google.protobuf.kotlin.DslList<counters.minter.grpc.client.Coin, CoinsProxy>.plusAssign(value: counters.minter.grpc.client.Coin) {
      add(value)
    }/**
     * <code>repeated .api_pb.Coin coins = 1;</code>
     * @param values The coins to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllCoins")
    fun com.google.protobuf.kotlin.DslList<counters.minter.grpc.client.Coin, CoinsProxy>.addAll(values: kotlin.collections.Iterable<counters.minter.grpc.client.Coin>) {
      _builder.addAllCoins(values)
    }/**
     * <code>repeated .api_pb.Coin coins = 1;</code>
     * @param values The coins to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllCoins")
    inline operator fun com.google.protobuf.kotlin.DslList<counters.minter.grpc.client.Coin, CoinsProxy>.plusAssign(values: kotlin.collections.Iterable<counters.minter.grpc.client.Coin>) {
      addAll(values)
    }/**
     * <code>repeated .api_pb.Coin coins = 1;</code>
     * @param index The index to set the value at.
     * @param value The coins to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setCoins")
    operator fun com.google.protobuf.kotlin.DslList<counters.minter.grpc.client.Coin, CoinsProxy>.set(index: kotlin.Int, value: counters.minter.grpc.client.Coin) {
      _builder.setCoins(index, value)
    }/**
     * <code>repeated .api_pb.Coin coins = 1;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearCoins")
    fun com.google.protobuf.kotlin.DslList<counters.minter.grpc.client.Coin, CoinsProxy>.clear() {
      _builder.clearCoins()
    }
    /**
     * <code>string value_to_buy = 2;</code>
     */
    var valueToBuy: kotlin.String
      @JvmName("getValueToBuy")
      get() = _builder.getValueToBuy()
      @JvmName("setValueToBuy")
      set(value) {
        _builder.setValueToBuy(value)
      }
    /**
     * <code>string value_to_buy = 2;</code>
     */
    fun clearValueToBuy() {
      _builder.clearValueToBuy()
    }

    /**
     * <code>string maximum_value_to_sell = 4;</code>
     */
    var maximumValueToSell: kotlin.String
      @JvmName("getMaximumValueToSell")
      get() = _builder.getMaximumValueToSell()
      @JvmName("setMaximumValueToSell")
      set(value) {
        _builder.setMaximumValueToSell(value)
      }
    /**
     * <code>string maximum_value_to_sell = 4;</code>
     */
    fun clearMaximumValueToSell() {
      _builder.clearMaximumValueToSell()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun counters.minter.grpc.client.BuySwapPoolData.copy(block: counters.minter.grpc.client.BuySwapPoolDataKt.Dsl.() -> Unit): counters.minter.grpc.client.BuySwapPoolData =
  counters.minter.grpc.client.BuySwapPoolDataKt.Dsl._create(this.toBuilder()).apply { block() }._build()
