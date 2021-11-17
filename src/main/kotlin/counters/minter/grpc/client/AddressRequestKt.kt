//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: resources.proto

package counters.minter.grpc.client;

@kotlin.jvm.JvmSynthetic
inline fun addressRequest(block: counters.minter.grpc.client.AddressRequestKt.Dsl.() -> Unit): counters.minter.grpc.client.AddressRequest =
  counters.minter.grpc.client.AddressRequestKt.Dsl._create(counters.minter.grpc.client.AddressRequest.newBuilder()).apply { block() }._build()
object AddressRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: counters.minter.grpc.client.AddressRequest.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: counters.minter.grpc.client.AddressRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): counters.minter.grpc.client.AddressRequest = _builder.build()

    /**
     * <code>string address = 1;</code>
     */
    var address: kotlin.String
      @JvmName("getAddress")
      get() = _builder.getAddress()
      @JvmName("setAddress")
      set(value) {
        _builder.setAddress(value)
      }
    /**
     * <code>string address = 1;</code>
     */
    fun clearAddress() {
      _builder.clearAddress()
    }

    /**
     * <code>uint64 height = 2;</code>
     */
    var height: kotlin.Long
      @JvmName("getHeight")
      get() = _builder.getHeight()
      @JvmName("setHeight")
      set(value) {
        _builder.setHeight(value)
      }
    /**
     * <code>uint64 height = 2;</code>
     */
    fun clearHeight() {
      _builder.clearHeight()
    }

    /**
     * <code>bool delegated = 4;</code>
     */
    var delegated: kotlin.Boolean
      @JvmName("getDelegated")
      get() = _builder.getDelegated()
      @JvmName("setDelegated")
      set(value) {
        _builder.setDelegated(value)
      }
    /**
     * <code>bool delegated = 4;</code>
     */
    fun clearDelegated() {
      _builder.clearDelegated()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun counters.minter.grpc.client.AddressRequest.copy(block: counters.minter.grpc.client.AddressRequestKt.Dsl.() -> Unit): counters.minter.grpc.client.AddressRequest =
  counters.minter.grpc.client.AddressRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()
