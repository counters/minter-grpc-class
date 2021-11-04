// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: resources.proto

package counters.minter.grpc.client;

public interface EstimateCoinSellAllRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api_pb.EstimateCoinSellAllRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 coin_id_to_buy = 1 [json_name = "coinIdToBuy"];</code>
   * @return Whether the coinIdToBuy field is set.
   */
  boolean hasCoinIdToBuy();
  /**
   * <code>uint64 coin_id_to_buy = 1 [json_name = "coinIdToBuy"];</code>
   * @return The coinIdToBuy.
   */
  long getCoinIdToBuy();

  /**
   * <code>string coin_to_buy = 7 [json_name = "coinToBuy"];</code>
   * @return Whether the coinToBuy field is set.
   */
  boolean hasCoinToBuy();
  /**
   * <code>string coin_to_buy = 7 [json_name = "coinToBuy"];</code>
   * @return The coinToBuy.
   */
  java.lang.String getCoinToBuy();
  /**
   * <code>string coin_to_buy = 7 [json_name = "coinToBuy"];</code>
   * @return The bytes for coinToBuy.
   */
  com.google.protobuf.ByteString
      getCoinToBuyBytes();

  /**
   * <code>uint64 coin_id_to_sell = 2 [json_name = "coinIdToSell"];</code>
   * @return Whether the coinIdToSell field is set.
   */
  boolean hasCoinIdToSell();
  /**
   * <code>uint64 coin_id_to_sell = 2 [json_name = "coinIdToSell"];</code>
   * @return The coinIdToSell.
   */
  long getCoinIdToSell();

  /**
   * <code>string coin_to_sell = 6 [json_name = "coinToSell"];</code>
   * @return Whether the coinToSell field is set.
   */
  boolean hasCoinToSell();
  /**
   * <code>string coin_to_sell = 6 [json_name = "coinToSell"];</code>
   * @return The coinToSell.
   */
  java.lang.String getCoinToSell();
  /**
   * <code>string coin_to_sell = 6 [json_name = "coinToSell"];</code>
   * @return The bytes for coinToSell.
   */
  com.google.protobuf.ByteString
      getCoinToSellBytes();

  /**
   * <code>string value_to_sell = 3 [json_name = "valueToSell"];</code>
   * @return The valueToSell.
   */
  java.lang.String getValueToSell();
  /**
   * <code>string value_to_sell = 3 [json_name = "valueToSell"];</code>
   * @return The bytes for valueToSell.
   */
  com.google.protobuf.ByteString
      getValueToSellBytes();

  /**
   * <pre>
   *    uint64 gas_price = 4 [(grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = {
   *        type: INTEGER
   *        default: '1'
   *    }];
   *    uint64 height = 5 [(grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = {
   *        type: INTEGER
   *    }];
   * </pre>
   *
   * <code>.api_pb.SwapFrom swap_from = 8 [json_name = "swapFrom"];</code>
   * @return The enum numeric value on the wire for swapFrom.
   */
  int getSwapFromValue();
  /**
   * <pre>
   *    uint64 gas_price = 4 [(grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = {
   *        type: INTEGER
   *        default: '1'
   *    }];
   *    uint64 height = 5 [(grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = {
   *        type: INTEGER
   *    }];
   * </pre>
   *
   * <code>.api_pb.SwapFrom swap_from = 8 [json_name = "swapFrom"];</code>
   * @return The swapFrom.
   */
  counters.minter.grpc.client.SwapFrom getSwapFrom();

  /**
   * <code>repeated uint64 route = 11 [json_name = "route"];</code>
   * @return A list containing the route.
   */
  java.util.List<java.lang.Long> getRouteList();
  /**
   * <code>repeated uint64 route = 11 [json_name = "route"];</code>
   * @return The count of route.
   */
  int getRouteCount();
  /**
   * <code>repeated uint64 route = 11 [json_name = "route"];</code>
   * @param index The index of the element to return.
   * @return The route at the given index.
   */
  long getRoute(int index);

  public counters.minter.grpc.client.EstimateCoinSellAllRequest.BuyCase getBuyCase();

  public counters.minter.grpc.client.EstimateCoinSellAllRequest.SellCase getSellCase();
}
