// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: resources.proto

package counters.minter.grpc.client;

/**
 * Protobuf type {@code api_pb.EstimateTxCommissionRequest}
 */
public final class EstimateTxCommissionRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api_pb.EstimateTxCommissionRequest)
    EstimateTxCommissionRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EstimateTxCommissionRequest.newBuilder() to construct.
  private EstimateTxCommissionRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EstimateTxCommissionRequest() {
    tx_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EstimateTxCommissionRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private EstimateTxCommissionRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            tx_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return counters.minter.grpc.client.Resources.internal_static_api_pb_EstimateTxCommissionRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return counters.minter.grpc.client.Resources.internal_static_api_pb_EstimateTxCommissionRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            counters.minter.grpc.client.EstimateTxCommissionRequest.class, counters.minter.grpc.client.EstimateTxCommissionRequest.Builder.class);
  }

  public static final int TX_FIELD_NUMBER = 1;
  private volatile java.lang.Object tx_;
  /**
   * <pre>
   *    uint64 height = 2 [(grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = {
   *        type: INTEGER
   *    }];
   * </pre>
   *
   * <code>string tx = 1 [json_name = "tx"];</code>
   * @return The tx.
   */
  @java.lang.Override
  public java.lang.String getTx() {
    java.lang.Object ref = tx_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      tx_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *    uint64 height = 2 [(grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = {
   *        type: INTEGER
   *    }];
   * </pre>
   *
   * <code>string tx = 1 [json_name = "tx"];</code>
   * @return The bytes for tx.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTxBytes() {
    java.lang.Object ref = tx_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      tx_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(tx_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, tx_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(tx_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, tx_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof counters.minter.grpc.client.EstimateTxCommissionRequest)) {
      return super.equals(obj);
    }
    counters.minter.grpc.client.EstimateTxCommissionRequest other = (counters.minter.grpc.client.EstimateTxCommissionRequest) obj;

    if (!getTx()
        .equals(other.getTx())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + TX_FIELD_NUMBER;
    hash = (53 * hash) + getTx().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static counters.minter.grpc.client.EstimateTxCommissionRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static counters.minter.grpc.client.EstimateTxCommissionRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static counters.minter.grpc.client.EstimateTxCommissionRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static counters.minter.grpc.client.EstimateTxCommissionRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static counters.minter.grpc.client.EstimateTxCommissionRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static counters.minter.grpc.client.EstimateTxCommissionRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static counters.minter.grpc.client.EstimateTxCommissionRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static counters.minter.grpc.client.EstimateTxCommissionRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static counters.minter.grpc.client.EstimateTxCommissionRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static counters.minter.grpc.client.EstimateTxCommissionRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static counters.minter.grpc.client.EstimateTxCommissionRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static counters.minter.grpc.client.EstimateTxCommissionRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(counters.minter.grpc.client.EstimateTxCommissionRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code api_pb.EstimateTxCommissionRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api_pb.EstimateTxCommissionRequest)
      counters.minter.grpc.client.EstimateTxCommissionRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return counters.minter.grpc.client.Resources.internal_static_api_pb_EstimateTxCommissionRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return counters.minter.grpc.client.Resources.internal_static_api_pb_EstimateTxCommissionRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              counters.minter.grpc.client.EstimateTxCommissionRequest.class, counters.minter.grpc.client.EstimateTxCommissionRequest.Builder.class);
    }

    // Construct using counters.minter.grpc.client.EstimateTxCommissionRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      tx_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return counters.minter.grpc.client.Resources.internal_static_api_pb_EstimateTxCommissionRequest_descriptor;
    }

    @java.lang.Override
    public counters.minter.grpc.client.EstimateTxCommissionRequest getDefaultInstanceForType() {
      return counters.minter.grpc.client.EstimateTxCommissionRequest.getDefaultInstance();
    }

    @java.lang.Override
    public counters.minter.grpc.client.EstimateTxCommissionRequest build() {
      counters.minter.grpc.client.EstimateTxCommissionRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public counters.minter.grpc.client.EstimateTxCommissionRequest buildPartial() {
      counters.minter.grpc.client.EstimateTxCommissionRequest result = new counters.minter.grpc.client.EstimateTxCommissionRequest(this);
      result.tx_ = tx_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof counters.minter.grpc.client.EstimateTxCommissionRequest) {
        return mergeFrom((counters.minter.grpc.client.EstimateTxCommissionRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(counters.minter.grpc.client.EstimateTxCommissionRequest other) {
      if (other == counters.minter.grpc.client.EstimateTxCommissionRequest.getDefaultInstance()) return this;
      if (!other.getTx().isEmpty()) {
        tx_ = other.tx_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      counters.minter.grpc.client.EstimateTxCommissionRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (counters.minter.grpc.client.EstimateTxCommissionRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object tx_ = "";
    /**
     * <pre>
     *    uint64 height = 2 [(grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = {
     *        type: INTEGER
     *    }];
     * </pre>
     *
     * <code>string tx = 1 [json_name = "tx"];</code>
     * @return The tx.
     */
    public java.lang.String getTx() {
      java.lang.Object ref = tx_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        tx_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *    uint64 height = 2 [(grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = {
     *        type: INTEGER
     *    }];
     * </pre>
     *
     * <code>string tx = 1 [json_name = "tx"];</code>
     * @return The bytes for tx.
     */
    public com.google.protobuf.ByteString
        getTxBytes() {
      java.lang.Object ref = tx_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        tx_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *    uint64 height = 2 [(grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = {
     *        type: INTEGER
     *    }];
     * </pre>
     *
     * <code>string tx = 1 [json_name = "tx"];</code>
     * @param value The tx to set.
     * @return This builder for chaining.
     */
    public Builder setTx(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      tx_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *    uint64 height = 2 [(grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = {
     *        type: INTEGER
     *    }];
     * </pre>
     *
     * <code>string tx = 1 [json_name = "tx"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTx() {
      
      tx_ = getDefaultInstance().getTx();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *    uint64 height = 2 [(grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = {
     *        type: INTEGER
     *    }];
     * </pre>
     *
     * <code>string tx = 1 [json_name = "tx"];</code>
     * @param value The bytes for tx to set.
     * @return This builder for chaining.
     */
    public Builder setTxBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      tx_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:api_pb.EstimateTxCommissionRequest)
  }

  // @@protoc_insertion_point(class_scope:api_pb.EstimateTxCommissionRequest)
  private static final counters.minter.grpc.client.EstimateTxCommissionRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new counters.minter.grpc.client.EstimateTxCommissionRequest();
  }

  public static counters.minter.grpc.client.EstimateTxCommissionRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EstimateTxCommissionRequest>
      PARSER = new com.google.protobuf.AbstractParser<EstimateTxCommissionRequest>() {
    @java.lang.Override
    public EstimateTxCommissionRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new EstimateTxCommissionRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<EstimateTxCommissionRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EstimateTxCommissionRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public counters.minter.grpc.client.EstimateTxCommissionRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

