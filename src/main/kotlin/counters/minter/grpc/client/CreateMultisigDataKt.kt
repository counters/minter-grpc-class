//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: data.proto

package counters.minter.grpc.client;

@kotlin.jvm.JvmSynthetic
inline fun createMultisigData(block: counters.minter.grpc.client.CreateMultisigDataKt.Dsl.() -> Unit): counters.minter.grpc.client.CreateMultisigData =
  counters.minter.grpc.client.CreateMultisigDataKt.Dsl._create(counters.minter.grpc.client.CreateMultisigData.newBuilder()).apply { block() }._build()
object CreateMultisigDataKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: counters.minter.grpc.client.CreateMultisigData.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: counters.minter.grpc.client.CreateMultisigData.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): counters.minter.grpc.client.CreateMultisigData = _builder.build()

    /**
     * <code>uint64 threshold = 1;</code>
     */
    var threshold: kotlin.Long
      @JvmName("getThreshold")
      get() = _builder.getThreshold()
      @JvmName("setThreshold")
      set(value) {
        _builder.setThreshold(value)
      }
    /**
     * <code>uint64 threshold = 1;</code>
     */
    fun clearThreshold() {
      _builder.clearThreshold()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    class WeightsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated uint64 weights = 2;</code>
     */
     val weights: com.google.protobuf.kotlin.DslList<kotlin.Long, WeightsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getWeightsList()
      )
    /**
     * <code>repeated uint64 weights = 2;</code>
     * @param value The weights to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addWeights")
    fun com.google.protobuf.kotlin.DslList<kotlin.Long, WeightsProxy>.add(value: kotlin.Long) {
      _builder.addWeights(value)
    }/**
     * <code>repeated uint64 weights = 2;</code>
     * @param value The weights to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignWeights")
    inline operator fun com.google.protobuf.kotlin.DslList<kotlin.Long, WeightsProxy>.plusAssign(value: kotlin.Long) {
      add(value)
    }/**
     * <code>repeated uint64 weights = 2;</code>
     * @param values The weights to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllWeights")
    fun com.google.protobuf.kotlin.DslList<kotlin.Long, WeightsProxy>.addAll(values: kotlin.collections.Iterable<kotlin.Long>) {
      _builder.addAllWeights(values)
    }/**
     * <code>repeated uint64 weights = 2;</code>
     * @param values The weights to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllWeights")
    inline operator fun com.google.protobuf.kotlin.DslList<kotlin.Long, WeightsProxy>.plusAssign(values: kotlin.collections.Iterable<kotlin.Long>) {
      addAll(values)
    }/**
     * <code>repeated uint64 weights = 2;</code>
     * @param index The index to set the value at.
     * @param value The weights to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setWeights")
    operator fun com.google.protobuf.kotlin.DslList<kotlin.Long, WeightsProxy>.set(index: kotlin.Int, value: kotlin.Long) {
      _builder.setWeights(index, value)
    }/**
     * <code>repeated uint64 weights = 2;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearWeights")
    fun com.google.protobuf.kotlin.DslList<kotlin.Long, WeightsProxy>.clear() {
      _builder.clearWeights()
    }
    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    class AddressesProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated string addresses = 3;</code>
     * @return A list containing the addresses.
     */
    val addresses: com.google.protobuf.kotlin.DslList<kotlin.String, AddressesProxy>
      @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getAddressesList()
      )
    /**
     * <code>repeated string addresses = 3;</code>
     * @param value The addresses to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAddresses")
    fun com.google.protobuf.kotlin.DslList<kotlin.String, AddressesProxy>.add(value: kotlin.String) {
      _builder.addAddresses(value)
    }
    /**
     * <code>repeated string addresses = 3;</code>
     * @param value The addresses to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAddresses")
    operator fun com.google.protobuf.kotlin.DslList<kotlin.String, AddressesProxy>.plusAssign(value: kotlin.String) {
      _builder.addAddresses(value)
    }
    /**
     * <code>repeated string addresses = 3;</code>
     * @param values The addresses to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllAddresses")
    fun com.google.protobuf.kotlin.DslList<kotlin.String, AddressesProxy>.addAll(values: kotlin.collections.Iterable<kotlin.String>) {
      _builder.addAllAddresses(values)
    }
    /**
     * <code>repeated string addresses = 3;</code>
     * @param values The addresses to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllAddresses")
    operator fun com.google.protobuf.kotlin.DslList<kotlin.String, AddressesProxy>.plusAssign(values: kotlin.collections.Iterable<kotlin.String>) {
      _builder.addAllAddresses(values)
    }
    /**
     * <code>repeated string addresses = 3;</code>
     * @param index The index to set the value at.
     * @param value The addresses to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setAddresses")
    operator fun com.google.protobuf.kotlin.DslList<kotlin.String, AddressesProxy>.set(index: kotlin.Int, value: kotlin.String) {
      _builder.setAddresses(index, value)
    }/**
     * <code>repeated string addresses = 3;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearAddresses")
    fun com.google.protobuf.kotlin.DslList<kotlin.String, AddressesProxy>.clear() {
      _builder.clearAddresses()
    }}
}
@kotlin.jvm.JvmSynthetic
inline fun counters.minter.grpc.client.CreateMultisigData.copy(block: counters.minter.grpc.client.CreateMultisigDataKt.Dsl.() -> Unit): counters.minter.grpc.client.CreateMultisigData =
  counters.minter.grpc.client.CreateMultisigDataKt.Dsl._create(this.toBuilder()).apply { block() }._build()
