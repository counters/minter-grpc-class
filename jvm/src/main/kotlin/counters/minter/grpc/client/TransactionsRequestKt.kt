//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: resources.proto

package counters.minter.grpc.client;

@kotlin.jvm.JvmSynthetic
public inline fun transactionsRequest(block: counters.minter.grpc.client.TransactionsRequestKt.Dsl.() -> kotlin.Unit): counters.minter.grpc.client.TransactionsRequest =
  counters.minter.grpc.client.TransactionsRequestKt.Dsl._create(counters.minter.grpc.client.TransactionsRequest.newBuilder()).apply { block() }._build()
public object TransactionsRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: counters.minter.grpc.client.TransactionsRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: counters.minter.grpc.client.TransactionsRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): counters.minter.grpc.client.TransactionsRequest = _builder.build()
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun counters.minter.grpc.client.TransactionsRequest.copy(block: counters.minter.grpc.client.TransactionsRequestKt.Dsl.() -> kotlin.Unit): counters.minter.grpc.client.TransactionsRequest =
  counters.minter.grpc.client.TransactionsRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()
