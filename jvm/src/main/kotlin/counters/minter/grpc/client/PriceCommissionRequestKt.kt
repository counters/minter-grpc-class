//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: resources.proto

package counters.minter.grpc.client;

@kotlin.jvm.JvmSynthetic
public inline fun priceCommissionRequest(block: counters.minter.grpc.client.PriceCommissionRequestKt.Dsl.() -> kotlin.Unit): counters.minter.grpc.client.PriceCommissionRequest =
  counters.minter.grpc.client.PriceCommissionRequestKt.Dsl._create(counters.minter.grpc.client.PriceCommissionRequest.newBuilder()).apply { block() }._build()
public object PriceCommissionRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: counters.minter.grpc.client.PriceCommissionRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: counters.minter.grpc.client.PriceCommissionRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): counters.minter.grpc.client.PriceCommissionRequest = _builder.build()

    /**
     * <code>uint64 height = 1 [json_name = "height"];</code>
     */
    public var height: kotlin.Long
      @JvmName("getHeight")
      get() = _builder.getHeight()
      @JvmName("setHeight")
      set(value) {
        _builder.setHeight(value)
      }
    /**
     * <code>uint64 height = 1 [json_name = "height"];</code>
     */
    public fun clearHeight() {
      _builder.clearHeight()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun counters.minter.grpc.client.PriceCommissionRequest.copy(block: counters.minter.grpc.client.PriceCommissionRequestKt.Dsl.() -> kotlin.Unit): counters.minter.grpc.client.PriceCommissionRequest =
  counters.minter.grpc.client.PriceCommissionRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()
