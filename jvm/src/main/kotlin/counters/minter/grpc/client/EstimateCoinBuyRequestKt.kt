//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: resources.proto

package counters.minter.grpc.client;

@kotlin.jvm.JvmSynthetic
public inline fun estimateCoinBuyRequest(block: counters.minter.grpc.client.EstimateCoinBuyRequestKt.Dsl.() -> kotlin.Unit): counters.minter.grpc.client.EstimateCoinBuyRequest =
  counters.minter.grpc.client.EstimateCoinBuyRequestKt.Dsl._create(counters.minter.grpc.client.EstimateCoinBuyRequest.newBuilder()).apply { block() }._build()
public object EstimateCoinBuyRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: counters.minter.grpc.client.EstimateCoinBuyRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: counters.minter.grpc.client.EstimateCoinBuyRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): counters.minter.grpc.client.EstimateCoinBuyRequest = _builder.build()

    /**
     * <pre>
     *        uint64 coin_id_to_buy = 1 [(grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = {
     *            type: INTEGER
     *        }];
     * </pre>
     *
     * <code>string coin_to_buy = 5 [json_name = "coinToBuy"];</code>
     */
    public var coinToBuy: kotlin.String
      @JvmName("getCoinToBuy")
      get() = _builder.getCoinToBuy()
      @JvmName("setCoinToBuy")
      set(value) {
        _builder.setCoinToBuy(value)
      }
    /**
     * <pre>
     *        uint64 coin_id_to_buy = 1 [(grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = {
     *            type: INTEGER
     *        }];
     * </pre>
     *
     * <code>string coin_to_buy = 5 [json_name = "coinToBuy"];</code>
     */
    public fun clearCoinToBuy() {
      _builder.clearCoinToBuy()
    }
    /**
     * <pre>
     *        uint64 coin_id_to_buy = 1 [(grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = {
     *            type: INTEGER
     *        }];
     * </pre>
     *
     * <code>string coin_to_buy = 5 [json_name = "coinToBuy"];</code>
     * @return Whether the coinToBuy field is set.
     */
    public fun hasCoinToBuy(): kotlin.Boolean {
      return _builder.hasCoinToBuy()
    }

    /**
     * <pre>
     *        uint64 coin_id_to_sell = 2 [(grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = {
     *            type: INTEGER
     *        }];
     * </pre>
     *
     * <code>string coin_to_sell = 6 [json_name = "coinToSell"];</code>
     */
    public var coinToSell: kotlin.String
      @JvmName("getCoinToSell")
      get() = _builder.getCoinToSell()
      @JvmName("setCoinToSell")
      set(value) {
        _builder.setCoinToSell(value)
      }
    /**
     * <pre>
     *        uint64 coin_id_to_sell = 2 [(grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = {
     *            type: INTEGER
     *        }];
     * </pre>
     *
     * <code>string coin_to_sell = 6 [json_name = "coinToSell"];</code>
     */
    public fun clearCoinToSell() {
      _builder.clearCoinToSell()
    }
    /**
     * <pre>
     *        uint64 coin_id_to_sell = 2 [(grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = {
     *            type: INTEGER
     *        }];
     * </pre>
     *
     * <code>string coin_to_sell = 6 [json_name = "coinToSell"];</code>
     * @return Whether the coinToSell field is set.
     */
    public fun hasCoinToSell(): kotlin.Boolean {
      return _builder.hasCoinToSell()
    }

    /**
     * <pre>
     *        uint64 coin_id_commission = 9 [(grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = {
     *            type: INTEGER
     *        }];
     * </pre>
     *
     * <code>string coin_commission = 10 [json_name = "coinCommission"];</code>
     */
    public var coinCommission: kotlin.String
      @JvmName("getCoinCommission")
      get() = _builder.getCoinCommission()
      @JvmName("setCoinCommission")
      set(value) {
        _builder.setCoinCommission(value)
      }
    /**
     * <pre>
     *        uint64 coin_id_commission = 9 [(grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = {
     *            type: INTEGER
     *        }];
     * </pre>
     *
     * <code>string coin_commission = 10 [json_name = "coinCommission"];</code>
     */
    public fun clearCoinCommission() {
      _builder.clearCoinCommission()
    }
    /**
     * <pre>
     *        uint64 coin_id_commission = 9 [(grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = {
     *            type: INTEGER
     *        }];
     * </pre>
     *
     * <code>string coin_commission = 10 [json_name = "coinCommission"];</code>
     * @return Whether the coinCommission field is set.
     */
    public fun hasCoinCommission(): kotlin.Boolean {
      return _builder.hasCoinCommission()
    }

    /**
     * <code>.api_pb.SwapFrom swap_from = 8 [json_name = "swapFrom"];</code>
     */
    public var swapFrom: counters.minter.grpc.client.SwapFrom
      @JvmName("getSwapFrom")
      get() = _builder.getSwapFrom()
      @JvmName("setSwapFrom")
      set(value) {
        _builder.setSwapFrom(value)
      }
    /**
     * <code>.api_pb.SwapFrom swap_from = 8 [json_name = "swapFrom"];</code>
     */
    public fun clearSwapFrom() {
      _builder.clearSwapFrom()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class RouteProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated uint64 route = 11 [json_name = "route"];</code>
     */
     public val route: com.google.protobuf.kotlin.DslList<kotlin.Long, RouteProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getRouteList()
      )
    /**
     * <code>repeated uint64 route = 11 [json_name = "route"];</code>
     * @param value The route to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addRoute")
    public fun com.google.protobuf.kotlin.DslList<kotlin.Long, RouteProxy>.add(value: kotlin.Long) {
      _builder.addRoute(value)
    }/**
     * <code>repeated uint64 route = 11 [json_name = "route"];</code>
     * @param value The route to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignRoute")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.Long, RouteProxy>.plusAssign(value: kotlin.Long) {
      add(value)
    }/**
     * <code>repeated uint64 route = 11 [json_name = "route"];</code>
     * @param values The route to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllRoute")
    public fun com.google.protobuf.kotlin.DslList<kotlin.Long, RouteProxy>.addAll(values: kotlin.collections.Iterable<kotlin.Long>) {
      _builder.addAllRoute(values)
    }/**
     * <code>repeated uint64 route = 11 [json_name = "route"];</code>
     * @param values The route to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllRoute")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.Long, RouteProxy>.plusAssign(values: kotlin.collections.Iterable<kotlin.Long>) {
      addAll(values)
    }/**
     * <code>repeated uint64 route = 11 [json_name = "route"];</code>
     * @param index The index to set the value at.
     * @param value The route to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setRoute")
    public operator fun com.google.protobuf.kotlin.DslList<kotlin.Long, RouteProxy>.set(index: kotlin.Int, value: kotlin.Long) {
      _builder.setRoute(index, value)
    }/**
     * <code>repeated uint64 route = 11 [json_name = "route"];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearRoute")
    public fun com.google.protobuf.kotlin.DslList<kotlin.Long, RouteProxy>.clear() {
      _builder.clearRoute()
    }public val buyCase: counters.minter.grpc.client.EstimateCoinBuyRequest.BuyCase
      @JvmName("getBuyCase")
      get() = _builder.getBuyCase()

    public fun clearBuy() {
      _builder.clearBuy()
    }
    public val sellCase: counters.minter.grpc.client.EstimateCoinBuyRequest.SellCase
      @JvmName("getSellCase")
      get() = _builder.getSellCase()

    public fun clearSell() {
      _builder.clearSell()
    }
    public val commissionCase: counters.minter.grpc.client.EstimateCoinBuyRequest.CommissionCase
      @JvmName("getCommissionCase")
      get() = _builder.getCommissionCase()

    public fun clearCommission() {
      _builder.clearCommission()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun counters.minter.grpc.client.EstimateCoinBuyRequest.copy(block: counters.minter.grpc.client.EstimateCoinBuyRequestKt.Dsl.() -> kotlin.Unit): counters.minter.grpc.client.EstimateCoinBuyRequest =
  counters.minter.grpc.client.EstimateCoinBuyRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()
