// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: data.proto

package counters.minter.grpc.client;

public interface RecreateTokenDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api_pb.RecreateTokenData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string symbol = 2 [json_name = "symbol"];</code>
   * @return The symbol.
   */
  java.lang.String getSymbol();
  /**
   * <code>string symbol = 2 [json_name = "symbol"];</code>
   * @return The bytes for symbol.
   */
  com.google.protobuf.ByteString
      getSymbolBytes();

  /**
   * <code>string initial_amount = 3 [json_name = "initialAmount"];</code>
   * @return The initialAmount.
   */
  java.lang.String getInitialAmount();
  /**
   * <code>string initial_amount = 3 [json_name = "initialAmount"];</code>
   * @return The bytes for initialAmount.
   */
  com.google.protobuf.ByteString
      getInitialAmountBytes();

  /**
   * <code>string max_supply = 4 [json_name = "maxSupply"];</code>
   * @return The maxSupply.
   */
  java.lang.String getMaxSupply();
  /**
   * <code>string max_supply = 4 [json_name = "maxSupply"];</code>
   * @return The bytes for maxSupply.
   */
  com.google.protobuf.ByteString
      getMaxSupplyBytes();

  /**
   * <code>bool mintable = 5 [json_name = "mintable"];</code>
   * @return The mintable.
   */
  boolean getMintable();

  /**
   * <code>bool burnable = 6 [json_name = "burnable"];</code>
   * @return The burnable.
   */
  boolean getBurnable();
}
