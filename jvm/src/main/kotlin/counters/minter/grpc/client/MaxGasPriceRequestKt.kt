//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: resources.proto

package counters.minter.grpc.client;

@kotlin.jvm.JvmSynthetic
public inline fun maxGasPriceRequest(block: counters.minter.grpc.client.MaxGasPriceRequestKt.Dsl.() -> kotlin.Unit): counters.minter.grpc.client.MaxGasPriceRequest =
  counters.minter.grpc.client.MaxGasPriceRequestKt.Dsl._create(counters.minter.grpc.client.MaxGasPriceRequest.newBuilder()).apply { block() }._build()
public object MaxGasPriceRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: counters.minter.grpc.client.MaxGasPriceRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: counters.minter.grpc.client.MaxGasPriceRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): counters.minter.grpc.client.MaxGasPriceRequest = _builder.build()
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun counters.minter.grpc.client.MaxGasPriceRequest.copy(block: counters.minter.grpc.client.MaxGasPriceRequestKt.Dsl.() -> kotlin.Unit): counters.minter.grpc.client.MaxGasPriceRequest =
  counters.minter.grpc.client.MaxGasPriceRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()
