// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: resources.proto

package counters.minter.grpc.client;

public interface SwapPoolProviderRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api_pb.SwapPoolProviderRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 coin0 = 1 [json_name = "coin0"];</code>
   * @return The coin0.
   */
  long getCoin0();

  /**
   * <code>uint64 coin1 = 2 [json_name = "coin1"];</code>
   * @return The coin1.
   */
  long getCoin1();

  /**
   * <pre>
   *    uint64 height = 4 [(grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = {
   *        type: INTEGER
   *    }];
   * </pre>
   *
   * <code>string provider = 3 [json_name = "provider"];</code>
   * @return The provider.
   */
  java.lang.String getProvider();
  /**
   * <pre>
   *    uint64 height = 4 [(grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = {
   *        type: INTEGER
   *    }];
   * </pre>
   *
   * <code>string provider = 3 [json_name = "provider"];</code>
   * @return The bytes for provider.
   */
  com.google.protobuf.ByteString
      getProviderBytes();
}
