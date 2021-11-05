// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: resources.proto

package counters.minter.grpc.client;

/**
 * Protobuf type {@code api_pb.CandidatesRequest}
 */
public final class CandidatesRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api_pb.CandidatesRequest)
    CandidatesRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CandidatesRequest.newBuilder() to construct.
  private CandidatesRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CandidatesRequest() {
    status_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CandidatesRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CandidatesRequest(
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
          case 8: {

            height_ = input.readUInt64();
            break;
          }
          case 16: {

            includeStakes_ = input.readBool();
            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            status_ = rawValue;
            break;
          }
          case 32: {

            notShowStakes_ = input.readBool();
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
    return counters.minter.grpc.client.Resources.internal_static_api_pb_CandidatesRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return counters.minter.grpc.client.Resources.internal_static_api_pb_CandidatesRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            counters.minter.grpc.client.CandidatesRequest.class, counters.minter.grpc.client.CandidatesRequest.Builder.class);
  }

  /**
   * Protobuf enum {@code api_pb.CandidatesRequest.CandidateStatus}
   */
  public enum CandidateStatus
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>all = 0;</code>
     */
    all(0),
    /**
     * <code>off = 1;</code>
     */
    off(1),
    /**
     * <code>on = 2;</code>
     */
    on(2),
    /**
     * <code>validator = 3;</code>
     */
    validator(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>all = 0;</code>
     */
    public static final int all_VALUE = 0;
    /**
     * <code>off = 1;</code>
     */
    public static final int off_VALUE = 1;
    /**
     * <code>on = 2;</code>
     */
    public static final int on_VALUE = 2;
    /**
     * <code>validator = 3;</code>
     */
    public static final int validator_VALUE = 3;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static CandidateStatus valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static CandidateStatus forNumber(int value) {
      switch (value) {
        case 0: return all;
        case 1: return off;
        case 2: return on;
        case 3: return validator;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<CandidateStatus>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        CandidateStatus> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<CandidateStatus>() {
            public CandidateStatus findValueByNumber(int number) {
              return CandidateStatus.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return counters.minter.grpc.client.CandidatesRequest.getDescriptor().getEnumTypes().get(0);
    }

    private static final CandidateStatus[] VALUES = values();

    public static CandidateStatus valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private CandidateStatus(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:api_pb.CandidatesRequest.CandidateStatus)
  }

  public static final int HEIGHT_FIELD_NUMBER = 1;
  private long height_;
  /**
   * <pre>
   * Blockchain state height for the current request. Optional, the last default state of the node is used
   * </pre>
   *
   * <code>uint64 height = 1 [json_name = "height"];</code>
   * @return The height.
   */
  @java.lang.Override
  public long getHeight() {
    return height_;
  }

  public static final int INCLUDE_STAKES_FIELD_NUMBER = 2;
  private boolean includeStakes_;
  /**
   * <pre>
   * Calculate field values used_slots, uniq_users, min_stake
   * </pre>
   *
   * <code>bool include_stakes = 2 [json_name = "includeStakes"];</code>
   * @return The includeStakes.
   */
  @java.lang.Override
  public boolean getIncludeStakes() {
    return includeStakes_;
  }

  public static final int NOT_SHOW_STAKES_FIELD_NUMBER = 4;
  private boolean notShowStakes_;
  /**
   * <pre>
   * Do not display the list of stakes, the include_stakes flag is also required to display. Note: used_slots, uniq_users, min_stake will still be filled if include_stakes flag is used
   * </pre>
   *
   * <code>bool not_show_stakes = 4 [json_name = "notShowStakes"];</code>
   * @return The notShowStakes.
   */
  @java.lang.Override
  public boolean getNotShowStakes() {
    return notShowStakes_;
  }

  public static final int STATUS_FIELD_NUMBER = 3;
  private int status_;
  /**
   * <code>.api_pb.CandidatesRequest.CandidateStatus status = 3 [json_name = "status"];</code>
   * @return The enum numeric value on the wire for status.
   */
  @java.lang.Override public int getStatusValue() {
    return status_;
  }
  /**
   * <code>.api_pb.CandidatesRequest.CandidateStatus status = 3 [json_name = "status"];</code>
   * @return The status.
   */
  @java.lang.Override public counters.minter.grpc.client.CandidatesRequest.CandidateStatus getStatus() {
    @SuppressWarnings("deprecation")
    counters.minter.grpc.client.CandidatesRequest.CandidateStatus result = counters.minter.grpc.client.CandidatesRequest.CandidateStatus.valueOf(status_);
    return result == null ? counters.minter.grpc.client.CandidatesRequest.CandidateStatus.UNRECOGNIZED : result;
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
    if (height_ != 0L) {
      output.writeUInt64(1, height_);
    }
    if (includeStakes_ != false) {
      output.writeBool(2, includeStakes_);
    }
    if (status_ != counters.minter.grpc.client.CandidatesRequest.CandidateStatus.all.getNumber()) {
      output.writeEnum(3, status_);
    }
    if (notShowStakes_ != false) {
      output.writeBool(4, notShowStakes_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (height_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, height_);
    }
    if (includeStakes_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, includeStakes_);
    }
    if (status_ != counters.minter.grpc.client.CandidatesRequest.CandidateStatus.all.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, status_);
    }
    if (notShowStakes_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, notShowStakes_);
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
    if (!(obj instanceof counters.minter.grpc.client.CandidatesRequest)) {
      return super.equals(obj);
    }
    counters.minter.grpc.client.CandidatesRequest other = (counters.minter.grpc.client.CandidatesRequest) obj;

    if (getHeight()
        != other.getHeight()) return false;
    if (getIncludeStakes()
        != other.getIncludeStakes()) return false;
    if (getNotShowStakes()
        != other.getNotShowStakes()) return false;
    if (status_ != other.status_) return false;
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
    hash = (37 * hash) + HEIGHT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getHeight());
    hash = (37 * hash) + INCLUDE_STAKES_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIncludeStakes());
    hash = (37 * hash) + NOT_SHOW_STAKES_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getNotShowStakes());
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + status_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static counters.minter.grpc.client.CandidatesRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static counters.minter.grpc.client.CandidatesRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static counters.minter.grpc.client.CandidatesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static counters.minter.grpc.client.CandidatesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static counters.minter.grpc.client.CandidatesRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static counters.minter.grpc.client.CandidatesRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static counters.minter.grpc.client.CandidatesRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static counters.minter.grpc.client.CandidatesRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static counters.minter.grpc.client.CandidatesRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static counters.minter.grpc.client.CandidatesRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static counters.minter.grpc.client.CandidatesRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static counters.minter.grpc.client.CandidatesRequest parseFrom(
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
  public static Builder newBuilder(counters.minter.grpc.client.CandidatesRequest prototype) {
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
   * Protobuf type {@code api_pb.CandidatesRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api_pb.CandidatesRequest)
      counters.minter.grpc.client.CandidatesRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return counters.minter.grpc.client.Resources.internal_static_api_pb_CandidatesRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return counters.minter.grpc.client.Resources.internal_static_api_pb_CandidatesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              counters.minter.grpc.client.CandidatesRequest.class, counters.minter.grpc.client.CandidatesRequest.Builder.class);
    }

    // Construct using counters.minter.grpc.client.CandidatesRequest.newBuilder()
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
      height_ = 0L;

      includeStakes_ = false;

      notShowStakes_ = false;

      status_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return counters.minter.grpc.client.Resources.internal_static_api_pb_CandidatesRequest_descriptor;
    }

    @java.lang.Override
    public counters.minter.grpc.client.CandidatesRequest getDefaultInstanceForType() {
      return counters.minter.grpc.client.CandidatesRequest.getDefaultInstance();
    }

    @java.lang.Override
    public counters.minter.grpc.client.CandidatesRequest build() {
      counters.minter.grpc.client.CandidatesRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public counters.minter.grpc.client.CandidatesRequest buildPartial() {
      counters.minter.grpc.client.CandidatesRequest result = new counters.minter.grpc.client.CandidatesRequest(this);
      result.height_ = height_;
      result.includeStakes_ = includeStakes_;
      result.notShowStakes_ = notShowStakes_;
      result.status_ = status_;
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
      if (other instanceof counters.minter.grpc.client.CandidatesRequest) {
        return mergeFrom((counters.minter.grpc.client.CandidatesRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(counters.minter.grpc.client.CandidatesRequest other) {
      if (other == counters.minter.grpc.client.CandidatesRequest.getDefaultInstance()) return this;
      if (other.getHeight() != 0L) {
        setHeight(other.getHeight());
      }
      if (other.getIncludeStakes() != false) {
        setIncludeStakes(other.getIncludeStakes());
      }
      if (other.getNotShowStakes() != false) {
        setNotShowStakes(other.getNotShowStakes());
      }
      if (other.status_ != 0) {
        setStatusValue(other.getStatusValue());
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
      counters.minter.grpc.client.CandidatesRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (counters.minter.grpc.client.CandidatesRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long height_ ;
    /**
     * <pre>
     * Blockchain state height for the current request. Optional, the last default state of the node is used
     * </pre>
     *
     * <code>uint64 height = 1 [json_name = "height"];</code>
     * @return The height.
     */
    @java.lang.Override
    public long getHeight() {
      return height_;
    }
    /**
     * <pre>
     * Blockchain state height for the current request. Optional, the last default state of the node is used
     * </pre>
     *
     * <code>uint64 height = 1 [json_name = "height"];</code>
     * @param value The height to set.
     * @return This builder for chaining.
     */
    public Builder setHeight(long value) {
      
      height_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Blockchain state height for the current request. Optional, the last default state of the node is used
     * </pre>
     *
     * <code>uint64 height = 1 [json_name = "height"];</code>
     * @return This builder for chaining.
     */
    public Builder clearHeight() {
      
      height_ = 0L;
      onChanged();
      return this;
    }

    private boolean includeStakes_ ;
    /**
     * <pre>
     * Calculate field values used_slots, uniq_users, min_stake
     * </pre>
     *
     * <code>bool include_stakes = 2 [json_name = "includeStakes"];</code>
     * @return The includeStakes.
     */
    @java.lang.Override
    public boolean getIncludeStakes() {
      return includeStakes_;
    }
    /**
     * <pre>
     * Calculate field values used_slots, uniq_users, min_stake
     * </pre>
     *
     * <code>bool include_stakes = 2 [json_name = "includeStakes"];</code>
     * @param value The includeStakes to set.
     * @return This builder for chaining.
     */
    public Builder setIncludeStakes(boolean value) {
      
      includeStakes_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Calculate field values used_slots, uniq_users, min_stake
     * </pre>
     *
     * <code>bool include_stakes = 2 [json_name = "includeStakes"];</code>
     * @return This builder for chaining.
     */
    public Builder clearIncludeStakes() {
      
      includeStakes_ = false;
      onChanged();
      return this;
    }

    private boolean notShowStakes_ ;
    /**
     * <pre>
     * Do not display the list of stakes, the include_stakes flag is also required to display. Note: used_slots, uniq_users, min_stake will still be filled if include_stakes flag is used
     * </pre>
     *
     * <code>bool not_show_stakes = 4 [json_name = "notShowStakes"];</code>
     * @return The notShowStakes.
     */
    @java.lang.Override
    public boolean getNotShowStakes() {
      return notShowStakes_;
    }
    /**
     * <pre>
     * Do not display the list of stakes, the include_stakes flag is also required to display. Note: used_slots, uniq_users, min_stake will still be filled if include_stakes flag is used
     * </pre>
     *
     * <code>bool not_show_stakes = 4 [json_name = "notShowStakes"];</code>
     * @param value The notShowStakes to set.
     * @return This builder for chaining.
     */
    public Builder setNotShowStakes(boolean value) {
      
      notShowStakes_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Do not display the list of stakes, the include_stakes flag is also required to display. Note: used_slots, uniq_users, min_stake will still be filled if include_stakes flag is used
     * </pre>
     *
     * <code>bool not_show_stakes = 4 [json_name = "notShowStakes"];</code>
     * @return This builder for chaining.
     */
    public Builder clearNotShowStakes() {
      
      notShowStakes_ = false;
      onChanged();
      return this;
    }

    private int status_ = 0;
    /**
     * <code>.api_pb.CandidatesRequest.CandidateStatus status = 3 [json_name = "status"];</code>
     * @return The enum numeric value on the wire for status.
     */
    @java.lang.Override public int getStatusValue() {
      return status_;
    }
    /**
     * <code>.api_pb.CandidatesRequest.CandidateStatus status = 3 [json_name = "status"];</code>
     * @param value The enum numeric value on the wire for status to set.
     * @return This builder for chaining.
     */
    public Builder setStatusValue(int value) {
      
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.api_pb.CandidatesRequest.CandidateStatus status = 3 [json_name = "status"];</code>
     * @return The status.
     */
    @java.lang.Override
    public counters.minter.grpc.client.CandidatesRequest.CandidateStatus getStatus() {
      @SuppressWarnings("deprecation")
      counters.minter.grpc.client.CandidatesRequest.CandidateStatus result = counters.minter.grpc.client.CandidatesRequest.CandidateStatus.valueOf(status_);
      return result == null ? counters.minter.grpc.client.CandidatesRequest.CandidateStatus.UNRECOGNIZED : result;
    }
    /**
     * <code>.api_pb.CandidatesRequest.CandidateStatus status = 3 [json_name = "status"];</code>
     * @param value The status to set.
     * @return This builder for chaining.
     */
    public Builder setStatus(counters.minter.grpc.client.CandidatesRequest.CandidateStatus value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      status_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.api_pb.CandidatesRequest.CandidateStatus status = 3 [json_name = "status"];</code>
     * @return This builder for chaining.
     */
    public Builder clearStatus() {
      
      status_ = 0;
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


    // @@protoc_insertion_point(builder_scope:api_pb.CandidatesRequest)
  }

  // @@protoc_insertion_point(class_scope:api_pb.CandidatesRequest)
  private static final counters.minter.grpc.client.CandidatesRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new counters.minter.grpc.client.CandidatesRequest();
  }

  public static counters.minter.grpc.client.CandidatesRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CandidatesRequest>
      PARSER = new com.google.protobuf.AbstractParser<CandidatesRequest>() {
    @java.lang.Override
    public CandidatesRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CandidatesRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CandidatesRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CandidatesRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public counters.minter.grpc.client.CandidatesRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

