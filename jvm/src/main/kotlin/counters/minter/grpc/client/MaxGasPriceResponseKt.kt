//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: resources.proto

package counters.minter.grpc.client;

@kotlin.jvm.JvmSynthetic
public inline fun maxGasPriceResponse(block: counters.minter.grpc.client.MaxGasPriceResponseKt.Dsl.() -> kotlin.Unit): counters.minter.grpc.client.MaxGasPriceResponse =
  counters.minter.grpc.client.MaxGasPriceResponseKt.Dsl._create(counters.minter.grpc.client.MaxGasPriceResponse.newBuilder()).apply { block() }._build()
public object MaxGasPriceResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: counters.minter.grpc.client.MaxGasPriceResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: counters.minter.grpc.client.MaxGasPriceResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): counters.minter.grpc.client.MaxGasPriceResponse = _builder.build()

    /**
     * <code>uint64 max_gas_price = 3 [json_name = "maxGasPrice"];</code>
     */
    public var maxGasPrice: kotlin.Long
      @JvmName("getMaxGasPrice")
      get() = _builder.getMaxGasPrice()
      @JvmName("setMaxGasPrice")
      set(value) {
        _builder.setMaxGasPrice(value)
      }
    /**
     * <code>uint64 max_gas_price = 3 [json_name = "maxGasPrice"];</code>
     */
    public fun clearMaxGasPrice() {
      _builder.clearMaxGasPrice()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun counters.minter.grpc.client.MaxGasPriceResponse.copy(block: counters.minter.grpc.client.MaxGasPriceResponseKt.Dsl.() -> kotlin.Unit): counters.minter.grpc.client.MaxGasPriceResponse =
  counters.minter.grpc.client.MaxGasPriceResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()
