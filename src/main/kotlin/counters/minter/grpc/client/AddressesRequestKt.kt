//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: resources.proto

package counters.minter.grpc.client;

@kotlin.jvm.JvmSynthetic
inline fun addressesRequest(block: counters.minter.grpc.client.AddressesRequestKt.Dsl.() -> Unit): counters.minter.grpc.client.AddressesRequest =
  counters.minter.grpc.client.AddressesRequestKt.Dsl._create(counters.minter.grpc.client.AddressesRequest.newBuilder()).apply { block() }._build()
object AddressesRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: counters.minter.grpc.client.AddressesRequest.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: counters.minter.grpc.client.AddressesRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): counters.minter.grpc.client.AddressesRequest = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    class AddressesProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated string addresses = 1;</code>
     * @return A list containing the addresses.
     */
    val addresses: com.google.protobuf.kotlin.DslList<kotlin.String, AddressesProxy>
      @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getAddressesList()
      )
    /**
     * <code>repeated string addresses = 1;</code>
     * @param value The addresses to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAddresses")
    fun com.google.protobuf.kotlin.DslList<kotlin.String, AddressesProxy>.add(value: kotlin.String) {
      _builder.addAddresses(value)
    }
    /**
     * <code>repeated string addresses = 1;</code>
     * @param value The addresses to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAddresses")
    operator fun com.google.protobuf.kotlin.DslList<kotlin.String, AddressesProxy>.plusAssign(value: kotlin.String) {
      _builder.addAddresses(value)
    }
    /**
     * <code>repeated string addresses = 1;</code>
     * @param values The addresses to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllAddresses")
    fun com.google.protobuf.kotlin.DslList<kotlin.String, AddressesProxy>.addAll(values: kotlin.collections.Iterable<kotlin.String>) {
      _builder.addAllAddresses(values)
    }
    /**
     * <code>repeated string addresses = 1;</code>
     * @param values The addresses to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllAddresses")
    operator fun com.google.protobuf.kotlin.DslList<kotlin.String, AddressesProxy>.plusAssign(values: kotlin.collections.Iterable<kotlin.String>) {
      _builder.addAllAddresses(values)
    }
    /**
     * <code>repeated string addresses = 1;</code>
     * @param index The index to set the value at.
     * @param value The addresses to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setAddresses")
    operator fun com.google.protobuf.kotlin.DslList<kotlin.String, AddressesProxy>.set(index: kotlin.Int, value: kotlin.String) {
      _builder.setAddresses(index, value)
    }/**
     * <code>repeated string addresses = 1;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearAddresses")
    fun com.google.protobuf.kotlin.DslList<kotlin.String, AddressesProxy>.clear() {
      _builder.clearAddresses()
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
inline fun counters.minter.grpc.client.AddressesRequest.copy(block: counters.minter.grpc.client.AddressesRequestKt.Dsl.() -> Unit): counters.minter.grpc.client.AddressesRequest =
  counters.minter.grpc.client.AddressesRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()
