//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: events.proto

package counters.minter.grpc.client;

@kotlin.jvm.JvmSynthetic
inline fun removeCandidateEvent(block: counters.minter.grpc.client.RemoveCandidateEventKt.Dsl.() -> Unit): counters.minter.grpc.client.RemoveCandidateEvent =
  counters.minter.grpc.client.RemoveCandidateEventKt.Dsl._create(counters.minter.grpc.client.RemoveCandidateEvent.newBuilder()).apply { block() }._build()
object RemoveCandidateEventKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: counters.minter.grpc.client.RemoveCandidateEvent.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: counters.minter.grpc.client.RemoveCandidateEvent.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): counters.minter.grpc.client.RemoveCandidateEvent = _builder.build()

    /**
     * <code>string candidate_pub_key = 1;</code>
     */
    var candidatePubKey: kotlin.String
      @JvmName("getCandidatePubKey")
      get() = _builder.getCandidatePubKey()
      @JvmName("setCandidatePubKey")
      set(value) {
        _builder.setCandidatePubKey(value)
      }
    /**
     * <code>string candidate_pub_key = 1;</code>
     */
    fun clearCandidatePubKey() {
      _builder.clearCandidatePubKey()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun counters.minter.grpc.client.RemoveCandidateEvent.copy(block: counters.minter.grpc.client.RemoveCandidateEventKt.Dsl.() -> Unit): counters.minter.grpc.client.RemoveCandidateEvent =
  counters.minter.grpc.client.RemoveCandidateEventKt.Dsl._create(this.toBuilder()).apply { block() }._build()
