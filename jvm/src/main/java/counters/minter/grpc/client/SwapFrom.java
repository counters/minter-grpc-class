// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: resources.proto

package counters.minter.grpc.client;

/**
 * Protobuf enum {@code api_pb.SwapFrom}
 */
public enum SwapFrom
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>optimal = 0;</code>
   */
  optimal(0),
  /**
   * <code>bancor = 1;</code>
   */
  bancor(1),
  /**
   * <code>pool = 2;</code>
   */
  pool(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>optimal = 0;</code>
   */
  public static final int optimal_VALUE = 0;
  /**
   * <code>bancor = 1;</code>
   */
  public static final int bancor_VALUE = 1;
  /**
   * <code>pool = 2;</code>
   */
  public static final int pool_VALUE = 2;


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
  public static SwapFrom valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static SwapFrom forNumber(int value) {
    switch (value) {
      case 0: return optimal;
      case 1: return bancor;
      case 2: return pool;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<SwapFrom>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      SwapFrom> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<SwapFrom>() {
          public SwapFrom findValueByNumber(int number) {
            return SwapFrom.forNumber(number);
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
    return counters.minter.grpc.client.Resources.getDescriptor().getEnumTypes().get(1);
  }

  private static final SwapFrom[] VALUES = values();

  public static SwapFrom valueOf(
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

  private SwapFrom(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:api_pb.SwapFrom)
}

