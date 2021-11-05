//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: resources.proto

package counters.minter.grpc.client;

@kotlin.jvm.JvmSynthetic
public inline fun addressesRequest(block: counters.minter.grpc.client.AddressesRequestKt.Dsl.() -> kotlin.Unit): counters.minter.grpc.client.AddressesRequest =
  counters.minter.grpc.client.AddressesRequestKt.Dsl._create(counters.minter.grpc.client.AddressesRequest.newBuilder()).apply { block() }._build()
public object AddressesRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: counters.minter.grpc.client.AddressesRequest.Builder
  ) {
    public companion object {
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
    public class AddressesProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated string addresses = 1 [json_name = "addresses"];</code>
     * @return A list containing the addresses.
     */
    public val addresses: com.google.protobuf.kotlin.DslList<kotlin.String, AddressesProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getAddressesList()
      )
    /**
     * <code>repeated string addresses = 1 [json_name = "addresses"];</code>
     * @param value The addresses to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAddresses")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, AddressesProxy>.add(value: kotlin.String) {
      _builder.addAddresses(value)
    }
    /**
     * <code>repeated string addresses = 1 [json_name = "addresses"];</code>
     * @param value The addresses to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAddresses")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, AddressesProxy>.plusAssign(value: kotlin.String) {
      add(value)
    }
    /**
     * <code>repeated string addresses = 1 [json_name = "addresses"];</code>
     * @param values The addresses to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllAddresses")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, AddressesProxy>.addAll(values: kotlin.collections.Iterable<kotlin.String>) {
      _builder.addAllAddresses(values)
    }
    /**
     * <code>repeated string addresses = 1 [json_name = "addresses"];</code>
     * @param values The addresses to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllAddresses")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, AddressesProxy>.plusAssign(values: kotlin.collections.Iterable<kotlin.String>) {
      addAll(values)
    }
    /**
     * <code>repeated string addresses = 1 [json_name = "addresses"];</code>
     * @param index The index to set the value at.
     * @param value The addresses to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setAddresses")
    public operator fun com.google.protobuf.kotlin.DslList<kotlin.String, AddressesProxy>.set(index: kotlin.Int, value: kotlin.String) {
      _builder.setAddresses(index, value)
    }/**
     * <code>repeated string addresses = 1 [json_name = "addresses"];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearAddresses")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, AddressesProxy>.clear() {
      _builder.clearAddresses()
    }
    /**
     * <code>uint64 height = 2 [json_name = "height"];</code>
     */
    public var height: kotlin.Long
      @JvmName("getHeight")
      get() = _builder.getHeight()
      @JvmName("setHeight")
      set(value) {
        _builder.setHeight(value)
      }
    /**
     * <code>uint64 height = 2 [json_name = "height"];</code>
     */
    public fun clearHeight() {
      _builder.clearHeight()
    }

    /**
     * <code>bool delegated = 4 [json_name = "delegated"];</code>
     */
    public var delegated: kotlin.Boolean
      @JvmName("getDelegated")
      get() = _builder.getDelegated()
      @JvmName("setDelegated")
      set(value) {
        _builder.setDelegated(value)
      }
    /**
     * <code>bool delegated = 4 [json_name = "delegated"];</code>
     */
    public fun clearDelegated() {
      _builder.clearDelegated()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun counters.minter.grpc.client.AddressesRequest.copy(block: counters.minter.grpc.client.AddressesRequestKt.Dsl.() -> kotlin.Unit): counters.minter.grpc.client.AddressesRequest =
  counters.minter.grpc.client.AddressesRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()
