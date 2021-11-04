//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: resources.proto

package counters.minter.grpc.client;

@kotlin.jvm.JvmSynthetic
public inline fun blockRequest(block: counters.minter.grpc.client.BlockRequestKt.Dsl.() -> kotlin.Unit): counters.minter.grpc.client.BlockRequest =
  counters.minter.grpc.client.BlockRequestKt.Dsl._create(counters.minter.grpc.client.BlockRequest.newBuilder()).apply { block() }._build()
public object BlockRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: counters.minter.grpc.client.BlockRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: counters.minter.grpc.client.BlockRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): counters.minter.grpc.client.BlockRequest = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class FieldsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <pre>
     *    uint64 height = 1 [(grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = {
     *        type: INTEGER
     *    }];
     * </pre>
     *
     * <code>repeated .api_pb.BlockField fields = 2 [json_name = "fields"];</code>
     */
     public val fields: com.google.protobuf.kotlin.DslList<counters.minter.grpc.client.BlockField, FieldsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getFieldsList()
      )
    /**
     * <pre>
     *    uint64 height = 1 [(grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = {
     *        type: INTEGER
     *    }];
     * </pre>
     *
     * <code>repeated .api_pb.BlockField fields = 2 [json_name = "fields"];</code>
     * @param value The fields to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addFields")
    public fun com.google.protobuf.kotlin.DslList<counters.minter.grpc.client.BlockField, FieldsProxy>.add(value: counters.minter.grpc.client.BlockField) {
      _builder.addFields(value)
    }/**
     * <pre>
     *    uint64 height = 1 [(grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = {
     *        type: INTEGER
     *    }];
     * </pre>
     *
     * <code>repeated .api_pb.BlockField fields = 2 [json_name = "fields"];</code>
     * @param value The fields to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignFields")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<counters.minter.grpc.client.BlockField, FieldsProxy>.plusAssign(value: counters.minter.grpc.client.BlockField) {
      add(value)
    }/**
     * <pre>
     *    uint64 height = 1 [(grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = {
     *        type: INTEGER
     *    }];
     * </pre>
     *
     * <code>repeated .api_pb.BlockField fields = 2 [json_name = "fields"];</code>
     * @param values The fields to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllFields")
    public fun com.google.protobuf.kotlin.DslList<counters.minter.grpc.client.BlockField, FieldsProxy>.addAll(values: kotlin.collections.Iterable<counters.minter.grpc.client.BlockField>) {
      _builder.addAllFields(values)
    }/**
     * <pre>
     *    uint64 height = 1 [(grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = {
     *        type: INTEGER
     *    }];
     * </pre>
     *
     * <code>repeated .api_pb.BlockField fields = 2 [json_name = "fields"];</code>
     * @param values The fields to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllFields")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<counters.minter.grpc.client.BlockField, FieldsProxy>.plusAssign(values: kotlin.collections.Iterable<counters.minter.grpc.client.BlockField>) {
      addAll(values)
    }/**
     * <pre>
     *    uint64 height = 1 [(grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = {
     *        type: INTEGER
     *    }];
     * </pre>
     *
     * <code>repeated .api_pb.BlockField fields = 2 [json_name = "fields"];</code>
     * @param index The index to set the value at.
     * @param value The fields to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setFields")
    public operator fun com.google.protobuf.kotlin.DslList<counters.minter.grpc.client.BlockField, FieldsProxy>.set(index: kotlin.Int, value: counters.minter.grpc.client.BlockField) {
      _builder.setFields(index, value)
    }/**
     * <pre>
     *    uint64 height = 1 [(grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = {
     *        type: INTEGER
     *    }];
     * </pre>
     *
     * <code>repeated .api_pb.BlockField fields = 2 [json_name = "fields"];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearFields")
    public fun com.google.protobuf.kotlin.DslList<counters.minter.grpc.client.BlockField, FieldsProxy>.clear() {
      _builder.clearFields()
    }}
}
@kotlin.jvm.JvmSynthetic
public inline fun counters.minter.grpc.client.BlockRequest.copy(block: counters.minter.grpc.client.BlockRequestKt.Dsl.() -> kotlin.Unit): counters.minter.grpc.client.BlockRequest =
  counters.minter.grpc.client.BlockRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()
