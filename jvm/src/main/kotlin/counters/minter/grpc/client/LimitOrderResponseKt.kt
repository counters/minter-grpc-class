//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: resources.proto

package counters.minter.grpc.client;

@kotlin.jvm.JvmSynthetic
public inline fun limitOrderResponse(block: counters.minter.grpc.client.LimitOrderResponseKt.Dsl.() -> kotlin.Unit): counters.minter.grpc.client.LimitOrderResponse =
  counters.minter.grpc.client.LimitOrderResponseKt.Dsl._create(counters.minter.grpc.client.LimitOrderResponse.newBuilder()).apply { block() }._build()
public object LimitOrderResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: counters.minter.grpc.client.LimitOrderResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: counters.minter.grpc.client.LimitOrderResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): counters.minter.grpc.client.LimitOrderResponse = _builder.build()

    /**
     * <code>uint64 id = 7 [json_name = "id"];</code>
     */
    public var id: kotlin.Long
      @JvmName("getId")
      get() = _builder.getId()
      @JvmName("setId")
      set(value) {
        _builder.setId(value)
      }
    /**
     * <code>uint64 id = 7 [json_name = "id"];</code>
     */
    public fun clearId() {
      _builder.clearId()
    }

    /**
     * <code>.api_pb.Coin coin_sell = 1 [json_name = "coinSell"];</code>
     */
    public var coinSell: counters.minter.grpc.client.Coin
      @JvmName("getCoinSell")
      get() = _builder.getCoinSell()
      @JvmName("setCoinSell")
      set(value) {
        _builder.setCoinSell(value)
      }
    /**
     * <code>.api_pb.Coin coin_sell = 1 [json_name = "coinSell"];</code>
     */
    public fun clearCoinSell() {
      _builder.clearCoinSell()
    }
    /**
     * <code>.api_pb.Coin coin_sell = 1 [json_name = "coinSell"];</code>
     * @return Whether the coinSell field is set.
     */
    public fun hasCoinSell(): kotlin.Boolean {
      return _builder.hasCoinSell()
    }

    /**
     * <code>.api_pb.Coin coin_buy = 2 [json_name = "coinBuy"];</code>
     */
    public var coinBuy: counters.minter.grpc.client.Coin
      @JvmName("getCoinBuy")
      get() = _builder.getCoinBuy()
      @JvmName("setCoinBuy")
      set(value) {
        _builder.setCoinBuy(value)
      }
    /**
     * <code>.api_pb.Coin coin_buy = 2 [json_name = "coinBuy"];</code>
     */
    public fun clearCoinBuy() {
      _builder.clearCoinBuy()
    }
    /**
     * <code>.api_pb.Coin coin_buy = 2 [json_name = "coinBuy"];</code>
     * @return Whether the coinBuy field is set.
     */
    public fun hasCoinBuy(): kotlin.Boolean {
      return _builder.hasCoinBuy()
    }

    /**
     * <code>string want_sell = 3 [json_name = "wantSell"];</code>
     */
    public var wantSell: kotlin.String
      @JvmName("getWantSell")
      get() = _builder.getWantSell()
      @JvmName("setWantSell")
      set(value) {
        _builder.setWantSell(value)
      }
    /**
     * <code>string want_sell = 3 [json_name = "wantSell"];</code>
     */
    public fun clearWantSell() {
      _builder.clearWantSell()
    }

    /**
     * <code>string want_buy = 4 [json_name = "wantBuy"];</code>
     */
    public var wantBuy: kotlin.String
      @JvmName("getWantBuy")
      get() = _builder.getWantBuy()
      @JvmName("setWantBuy")
      set(value) {
        _builder.setWantBuy(value)
      }
    /**
     * <code>string want_buy = 4 [json_name = "wantBuy"];</code>
     */
    public fun clearWantBuy() {
      _builder.clearWantBuy()
    }

    /**
     * <code>string price = 8 [json_name = "price"];</code>
     */
    public var price: kotlin.String
      @JvmName("getPrice")
      get() = _builder.getPrice()
      @JvmName("setPrice")
      set(value) {
        _builder.setPrice(value)
      }
    /**
     * <code>string price = 8 [json_name = "price"];</code>
     */
    public fun clearPrice() {
      _builder.clearPrice()
    }

    /**
     * <code>string owner = 5 [json_name = "owner"];</code>
     */
    public var owner: kotlin.String
      @JvmName("getOwner")
      get() = _builder.getOwner()
      @JvmName("setOwner")
      set(value) {
        _builder.setOwner(value)
      }
    /**
     * <code>string owner = 5 [json_name = "owner"];</code>
     */
    public fun clearOwner() {
      _builder.clearOwner()
    }

    /**
     * <code>uint64 height = 6 [json_name = "height"];</code>
     */
    public var height: kotlin.Long
      @JvmName("getHeight")
      get() = _builder.getHeight()
      @JvmName("setHeight")
      set(value) {
        _builder.setHeight(value)
      }
    /**
     * <code>uint64 height = 6 [json_name = "height"];</code>
     */
    public fun clearHeight() {
      _builder.clearHeight()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun counters.minter.grpc.client.LimitOrderResponse.copy(block: counters.minter.grpc.client.LimitOrderResponseKt.Dsl.() -> kotlin.Unit): counters.minter.grpc.client.LimitOrderResponse =
  counters.minter.grpc.client.LimitOrderResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()
