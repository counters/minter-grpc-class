// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: resources.proto

package counters.minter.grpc.client;

public interface SendTransactionResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api_pb.SendTransactionResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *    option (grpc.gateway.protoc_gen_openapiv2.options.openapiv2_schema) = {
   *example: "{&#92;"code&#92;":&#92;"0&#92;",&#92;"log&#92;":&#92;"&#92;", &#92;"hash&#92;":&#92;"Mt6019f740983dc43b53ea9c37891af0c9ce7251399ebaafc4ea56d68d665adfcb&#92;"}"
   *};
   * </pre>
   *
   * <code>uint64 code = 1;</code>
   * @return The code.
   */
  long getCode();

  /**
   * <code>string log = 3;</code>
   * @return The log.
   */
  java.lang.String getLog();
  /**
   * <code>string log = 3;</code>
   * @return The bytes for log.
   */
  com.google.protobuf.ByteString
      getLogBytes();

  /**
   * <code>string hash = 4;</code>
   * @return The hash.
   */
  java.lang.String getHash();
  /**
   * <code>string hash = 4;</code>
   * @return The bytes for hash.
   */
  com.google.protobuf.ByteString
      getHashBytes();
}
