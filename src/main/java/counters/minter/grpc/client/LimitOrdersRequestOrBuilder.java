// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: resources.proto

package counters.minter.grpc.client;

public interface LimitOrdersRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api_pb.LimitOrdersRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated uint64 ids = 1;</code>
   * @return A list containing the ids.
   */
  java.util.List<java.lang.Long> getIdsList();
  /**
   * <code>repeated uint64 ids = 1;</code>
   * @return The count of ids.
   */
  int getIdsCount();
  /**
   * <code>repeated uint64 ids = 1;</code>
   * @param index The index of the element to return.
   * @return The ids at the given index.
   */
  long getIds(int index);

  /**
   * <code>uint64 height = 2;</code>
   * @return The height.
   */
  long getHeight();
}
