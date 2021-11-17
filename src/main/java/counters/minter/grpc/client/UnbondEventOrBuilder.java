// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: events.proto

package counters.minter.grpc.client;

public interface UnbondEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api_pb.UnbondEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string address = 1;</code>
   * @return The address.
   */
  java.lang.String getAddress();
  /**
   * <code>string address = 1;</code>
   * @return The bytes for address.
   */
  com.google.protobuf.ByteString
      getAddressBytes();

  /**
   * <code>string amount = 2;</code>
   * @return The amount.
   */
  java.lang.String getAmount();
  /**
   * <code>string amount = 2;</code>
   * @return The bytes for amount.
   */
  com.google.protobuf.ByteString
      getAmountBytes();

  /**
   * <code>uint64 coin = 3;</code>
   * @return The coin.
   */
  long getCoin();

  /**
   * <code>string validator_pub_key = 4;</code>
   * @return The validatorPubKey.
   */
  java.lang.String getValidatorPubKey();
  /**
   * <code>string validator_pub_key = 4;</code>
   * @return The bytes for validatorPubKey.
   */
  com.google.protobuf.ByteString
      getValidatorPubKeyBytes();
}
