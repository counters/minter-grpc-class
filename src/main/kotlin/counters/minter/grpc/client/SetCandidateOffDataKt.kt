//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: data.proto

package counters.minter.grpc.client;

@kotlin.jvm.JvmSynthetic
inline fun setCandidateOffData(block: counters.minter.grpc.client.SetCandidateOffDataKt.Dsl.() -> Unit): counters.minter.grpc.client.SetCandidateOffData =
  counters.minter.grpc.client.SetCandidateOffDataKt.Dsl._create(counters.minter.grpc.client.SetCandidateOffData.newBuilder()).apply { block() }._build()
object SetCandidateOffDataKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: counters.minter.grpc.client.SetCandidateOffData.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: counters.minter.grpc.client.SetCandidateOffData.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): counters.minter.grpc.client.SetCandidateOffData = _builder.build()

    /**
     * <code>string pub_key = 1;</code>
     */
    var pubKey: kotlin.String
      @JvmName("getPubKey")
      get() = _builder.getPubKey()
      @JvmName("setPubKey")
      set(value) {
        _builder.setPubKey(value)
      }
    /**
     * <code>string pub_key = 1;</code>
     */
    fun clearPubKey() {
      _builder.clearPubKey()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun counters.minter.grpc.client.SetCandidateOffData.copy(block: counters.minter.grpc.client.SetCandidateOffDataKt.Dsl.() -> Unit): counters.minter.grpc.client.SetCandidateOffData =
  counters.minter.grpc.client.SetCandidateOffDataKt.Dsl._create(this.toBuilder()).apply { block() }._build()
