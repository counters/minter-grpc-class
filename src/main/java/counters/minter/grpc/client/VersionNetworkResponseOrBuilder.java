// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: resources.proto

package counters.minter.grpc.client;

public interface VersionNetworkResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api_pb.VersionNetworkResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string current = 1;</code>
   * @return The current.
   */
  java.lang.String getCurrent();
  /**
   * <code>string current = 1;</code>
   * @return The bytes for current.
   */
  com.google.protobuf.ByteString
      getCurrentBytes();

  /**
   * <code>repeated .api_pb.VersionNetworkResponse.Version versions = 3;</code>
   */
  java.util.List<counters.minter.grpc.client.VersionNetworkResponse.Version> 
      getVersionsList();
  /**
   * <code>repeated .api_pb.VersionNetworkResponse.Version versions = 3;</code>
   */
  counters.minter.grpc.client.VersionNetworkResponse.Version getVersions(int index);
  /**
   * <code>repeated .api_pb.VersionNetworkResponse.Version versions = 3;</code>
   */
  int getVersionsCount();
  /**
   * <code>repeated .api_pb.VersionNetworkResponse.Version versions = 3;</code>
   */
  java.util.List<? extends counters.minter.grpc.client.VersionNetworkResponse.VersionOrBuilder> 
      getVersionsOrBuilderList();
  /**
   * <code>repeated .api_pb.VersionNetworkResponse.Version versions = 3;</code>
   */
  counters.minter.grpc.client.VersionNetworkResponse.VersionOrBuilder getVersionsOrBuilder(
      int index);
}
