// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: data.proto

package counters.minter.grpc.client;

/**
 * Protobuf type {@code api_pb.RecreateTokenData}
 */
public final class RecreateTokenData extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api_pb.RecreateTokenData)
    RecreateTokenDataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RecreateTokenData.newBuilder() to construct.
  private RecreateTokenData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RecreateTokenData() {
    name_ = "";
    symbol_ = "";
    initialAmount_ = "";
    maxSupply_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RecreateTokenData();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RecreateTokenData(
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

            name_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            symbol_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            initialAmount_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            maxSupply_ = s;
            break;
          }
          case 40: {

            mintable_ = input.readBool();
            break;
          }
          case 48: {

            burnable_ = input.readBool();
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
    return counters.minter.grpc.client.Data.internal_static_api_pb_RecreateTokenData_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return counters.minter.grpc.client.Data.internal_static_api_pb_RecreateTokenData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            counters.minter.grpc.client.RecreateTokenData.class, counters.minter.grpc.client.RecreateTokenData.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <code>string name = 1;</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SYMBOL_FIELD_NUMBER = 2;
  private volatile java.lang.Object symbol_;
  /**
   * <code>string symbol = 2;</code>
   * @return The symbol.
   */
  @java.lang.Override
  public java.lang.String getSymbol() {
    java.lang.Object ref = symbol_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      symbol_ = s;
      return s;
    }
  }
  /**
   * <code>string symbol = 2;</code>
   * @return The bytes for symbol.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSymbolBytes() {
    java.lang.Object ref = symbol_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      symbol_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int INITIAL_AMOUNT_FIELD_NUMBER = 3;
  private volatile java.lang.Object initialAmount_;
  /**
   * <code>string initial_amount = 3;</code>
   * @return The initialAmount.
   */
  @java.lang.Override
  public java.lang.String getInitialAmount() {
    java.lang.Object ref = initialAmount_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      initialAmount_ = s;
      return s;
    }
  }
  /**
   * <code>string initial_amount = 3;</code>
   * @return The bytes for initialAmount.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getInitialAmountBytes() {
    java.lang.Object ref = initialAmount_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      initialAmount_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MAX_SUPPLY_FIELD_NUMBER = 4;
  private volatile java.lang.Object maxSupply_;
  /**
   * <code>string max_supply = 4;</code>
   * @return The maxSupply.
   */
  @java.lang.Override
  public java.lang.String getMaxSupply() {
    java.lang.Object ref = maxSupply_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      maxSupply_ = s;
      return s;
    }
  }
  /**
   * <code>string max_supply = 4;</code>
   * @return The bytes for maxSupply.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMaxSupplyBytes() {
    java.lang.Object ref = maxSupply_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      maxSupply_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MINTABLE_FIELD_NUMBER = 5;
  private boolean mintable_;
  /**
   * <code>bool mintable = 5;</code>
   * @return The mintable.
   */
  @java.lang.Override
  public boolean getMintable() {
    return mintable_;
  }

  public static final int BURNABLE_FIELD_NUMBER = 6;
  private boolean burnable_;
  /**
   * <code>bool burnable = 6;</code>
   * @return The burnable.
   */
  @java.lang.Override
  public boolean getBurnable() {
    return burnable_;
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
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (!getSymbolBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, symbol_);
    }
    if (!getInitialAmountBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, initialAmount_);
    }
    if (!getMaxSupplyBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, maxSupply_);
    }
    if (mintable_ != false) {
      output.writeBool(5, mintable_);
    }
    if (burnable_ != false) {
      output.writeBool(6, burnable_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (!getSymbolBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, symbol_);
    }
    if (!getInitialAmountBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, initialAmount_);
    }
    if (!getMaxSupplyBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, maxSupply_);
    }
    if (mintable_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, mintable_);
    }
    if (burnable_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(6, burnable_);
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
    if (!(obj instanceof counters.minter.grpc.client.RecreateTokenData)) {
      return super.equals(obj);
    }
    counters.minter.grpc.client.RecreateTokenData other = (counters.minter.grpc.client.RecreateTokenData) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (!getSymbol()
        .equals(other.getSymbol())) return false;
    if (!getInitialAmount()
        .equals(other.getInitialAmount())) return false;
    if (!getMaxSupply()
        .equals(other.getMaxSupply())) return false;
    if (getMintable()
        != other.getMintable()) return false;
    if (getBurnable()
        != other.getBurnable()) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + SYMBOL_FIELD_NUMBER;
    hash = (53 * hash) + getSymbol().hashCode();
    hash = (37 * hash) + INITIAL_AMOUNT_FIELD_NUMBER;
    hash = (53 * hash) + getInitialAmount().hashCode();
    hash = (37 * hash) + MAX_SUPPLY_FIELD_NUMBER;
    hash = (53 * hash) + getMaxSupply().hashCode();
    hash = (37 * hash) + MINTABLE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getMintable());
    hash = (37 * hash) + BURNABLE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getBurnable());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static counters.minter.grpc.client.RecreateTokenData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static counters.minter.grpc.client.RecreateTokenData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static counters.minter.grpc.client.RecreateTokenData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static counters.minter.grpc.client.RecreateTokenData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static counters.minter.grpc.client.RecreateTokenData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static counters.minter.grpc.client.RecreateTokenData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static counters.minter.grpc.client.RecreateTokenData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static counters.minter.grpc.client.RecreateTokenData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static counters.minter.grpc.client.RecreateTokenData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static counters.minter.grpc.client.RecreateTokenData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static counters.minter.grpc.client.RecreateTokenData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static counters.minter.grpc.client.RecreateTokenData parseFrom(
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
  public static Builder newBuilder(counters.minter.grpc.client.RecreateTokenData prototype) {
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
   * Protobuf type {@code api_pb.RecreateTokenData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api_pb.RecreateTokenData)
      counters.minter.grpc.client.RecreateTokenDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return counters.minter.grpc.client.Data.internal_static_api_pb_RecreateTokenData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return counters.minter.grpc.client.Data.internal_static_api_pb_RecreateTokenData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              counters.minter.grpc.client.RecreateTokenData.class, counters.minter.grpc.client.RecreateTokenData.Builder.class);
    }

    // Construct using counters.minter.grpc.client.RecreateTokenData.newBuilder()
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
      name_ = "";

      symbol_ = "";

      initialAmount_ = "";

      maxSupply_ = "";

      mintable_ = false;

      burnable_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return counters.minter.grpc.client.Data.internal_static_api_pb_RecreateTokenData_descriptor;
    }

    @java.lang.Override
    public counters.minter.grpc.client.RecreateTokenData getDefaultInstanceForType() {
      return counters.minter.grpc.client.RecreateTokenData.getDefaultInstance();
    }

    @java.lang.Override
    public counters.minter.grpc.client.RecreateTokenData build() {
      counters.minter.grpc.client.RecreateTokenData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public counters.minter.grpc.client.RecreateTokenData buildPartial() {
      counters.minter.grpc.client.RecreateTokenData result = new counters.minter.grpc.client.RecreateTokenData(this);
      result.name_ = name_;
      result.symbol_ = symbol_;
      result.initialAmount_ = initialAmount_;
      result.maxSupply_ = maxSupply_;
      result.mintable_ = mintable_;
      result.burnable_ = burnable_;
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
      if (other instanceof counters.minter.grpc.client.RecreateTokenData) {
        return mergeFrom((counters.minter.grpc.client.RecreateTokenData)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(counters.minter.grpc.client.RecreateTokenData other) {
      if (other == counters.minter.grpc.client.RecreateTokenData.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (!other.getSymbol().isEmpty()) {
        symbol_ = other.symbol_;
        onChanged();
      }
      if (!other.getInitialAmount().isEmpty()) {
        initialAmount_ = other.initialAmount_;
        onChanged();
      }
      if (!other.getMaxSupply().isEmpty()) {
        maxSupply_ = other.maxSupply_;
        onChanged();
      }
      if (other.getMintable() != false) {
        setMintable(other.getMintable());
      }
      if (other.getBurnable() != false) {
        setBurnable(other.getBurnable());
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
      counters.minter.grpc.client.RecreateTokenData parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (counters.minter.grpc.client.RecreateTokenData) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 1;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string name = 1;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 1;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>string name = 1;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object symbol_ = "";
    /**
     * <code>string symbol = 2;</code>
     * @return The symbol.
     */
    public java.lang.String getSymbol() {
      java.lang.Object ref = symbol_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        symbol_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string symbol = 2;</code>
     * @return The bytes for symbol.
     */
    public com.google.protobuf.ByteString
        getSymbolBytes() {
      java.lang.Object ref = symbol_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        symbol_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string symbol = 2;</code>
     * @param value The symbol to set.
     * @return This builder for chaining.
     */
    public Builder setSymbol(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      symbol_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string symbol = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSymbol() {
      
      symbol_ = getDefaultInstance().getSymbol();
      onChanged();
      return this;
    }
    /**
     * <code>string symbol = 2;</code>
     * @param value The bytes for symbol to set.
     * @return This builder for chaining.
     */
    public Builder setSymbolBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      symbol_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object initialAmount_ = "";
    /**
     * <code>string initial_amount = 3;</code>
     * @return The initialAmount.
     */
    public java.lang.String getInitialAmount() {
      java.lang.Object ref = initialAmount_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        initialAmount_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string initial_amount = 3;</code>
     * @return The bytes for initialAmount.
     */
    public com.google.protobuf.ByteString
        getInitialAmountBytes() {
      java.lang.Object ref = initialAmount_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        initialAmount_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string initial_amount = 3;</code>
     * @param value The initialAmount to set.
     * @return This builder for chaining.
     */
    public Builder setInitialAmount(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      initialAmount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string initial_amount = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearInitialAmount() {
      
      initialAmount_ = getDefaultInstance().getInitialAmount();
      onChanged();
      return this;
    }
    /**
     * <code>string initial_amount = 3;</code>
     * @param value The bytes for initialAmount to set.
     * @return This builder for chaining.
     */
    public Builder setInitialAmountBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      initialAmount_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object maxSupply_ = "";
    /**
     * <code>string max_supply = 4;</code>
     * @return The maxSupply.
     */
    public java.lang.String getMaxSupply() {
      java.lang.Object ref = maxSupply_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        maxSupply_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string max_supply = 4;</code>
     * @return The bytes for maxSupply.
     */
    public com.google.protobuf.ByteString
        getMaxSupplyBytes() {
      java.lang.Object ref = maxSupply_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        maxSupply_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string max_supply = 4;</code>
     * @param value The maxSupply to set.
     * @return This builder for chaining.
     */
    public Builder setMaxSupply(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      maxSupply_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string max_supply = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearMaxSupply() {
      
      maxSupply_ = getDefaultInstance().getMaxSupply();
      onChanged();
      return this;
    }
    /**
     * <code>string max_supply = 4;</code>
     * @param value The bytes for maxSupply to set.
     * @return This builder for chaining.
     */
    public Builder setMaxSupplyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      maxSupply_ = value;
      onChanged();
      return this;
    }

    private boolean mintable_ ;
    /**
     * <code>bool mintable = 5;</code>
     * @return The mintable.
     */
    @java.lang.Override
    public boolean getMintable() {
      return mintable_;
    }
    /**
     * <code>bool mintable = 5;</code>
     * @param value The mintable to set.
     * @return This builder for chaining.
     */
    public Builder setMintable(boolean value) {
      
      mintable_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool mintable = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearMintable() {
      
      mintable_ = false;
      onChanged();
      return this;
    }

    private boolean burnable_ ;
    /**
     * <code>bool burnable = 6;</code>
     * @return The burnable.
     */
    @java.lang.Override
    public boolean getBurnable() {
      return burnable_;
    }
    /**
     * <code>bool burnable = 6;</code>
     * @param value The burnable to set.
     * @return This builder for chaining.
     */
    public Builder setBurnable(boolean value) {
      
      burnable_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool burnable = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearBurnable() {
      
      burnable_ = false;
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


    // @@protoc_insertion_point(builder_scope:api_pb.RecreateTokenData)
  }

  // @@protoc_insertion_point(class_scope:api_pb.RecreateTokenData)
  private static final counters.minter.grpc.client.RecreateTokenData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new counters.minter.grpc.client.RecreateTokenData();
  }

  public static counters.minter.grpc.client.RecreateTokenData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RecreateTokenData>
      PARSER = new com.google.protobuf.AbstractParser<RecreateTokenData>() {
    @java.lang.Override
    public RecreateTokenData parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RecreateTokenData(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RecreateTokenData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RecreateTokenData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public counters.minter.grpc.client.RecreateTokenData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

