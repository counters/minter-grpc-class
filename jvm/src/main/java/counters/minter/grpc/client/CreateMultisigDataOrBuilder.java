// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: data.proto

package counters.minter.grpc.client;

public interface CreateMultisigDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api_pb.CreateMultisigData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 threshold = 1 [json_name = "threshold"];</code>
   * @return The threshold.
   */
  long getThreshold();

  /**
   * <code>repeated uint64 weights = 2 [json_name = "weights"];</code>
   * @return A list containing the weights.
   */
  java.util.List<java.lang.Long> getWeightsList();
  /**
   * <code>repeated uint64 weights = 2 [json_name = "weights"];</code>
   * @return The count of weights.
   */
  int getWeightsCount();
  /**
   * <code>repeated uint64 weights = 2 [json_name = "weights"];</code>
   * @param index The index of the element to return.
   * @return The weights at the given index.
   */
  long getWeights(int index);

  /**
   * <code>repeated string addresses = 3 [json_name = "addresses"];</code>
   * @return A list containing the addresses.
   */
  java.util.List<java.lang.String>
      getAddressesList();
  /**
   * <code>repeated string addresses = 3 [json_name = "addresses"];</code>
   * @return The count of addresses.
   */
  int getAddressesCount();
  /**
   * <code>repeated string addresses = 3 [json_name = "addresses"];</code>
   * @param index The index of the element to return.
   * @return The addresses at the given index.
   */
  java.lang.String getAddresses(int index);
  /**
   * <code>repeated string addresses = 3 [json_name = "addresses"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the addresses at the given index.
   */
  com.google.protobuf.ByteString
      getAddressesBytes(int index);
}
