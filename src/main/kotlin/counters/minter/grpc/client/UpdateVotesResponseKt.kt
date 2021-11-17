//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: resources.proto

package counters.minter.grpc.client;

@kotlin.jvm.JvmSynthetic
inline fun updateVotesResponse(block: counters.minter.grpc.client.UpdateVotesResponseKt.Dsl.() -> Unit): counters.minter.grpc.client.UpdateVotesResponse =
  counters.minter.grpc.client.UpdateVotesResponseKt.Dsl._create(counters.minter.grpc.client.UpdateVotesResponse.newBuilder()).apply { block() }._build()
object UpdateVotesResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: counters.minter.grpc.client.UpdateVotesResponse.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: counters.minter.grpc.client.UpdateVotesResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): counters.minter.grpc.client.UpdateVotesResponse = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    class VotesProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated .api_pb.UpdateVotesResponse.Vote votes = 1;</code>
     */
     val votes: com.google.protobuf.kotlin.DslList<counters.minter.grpc.client.UpdateVotesResponse.Vote, VotesProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getVotesList()
      )
    /**
     * <code>repeated .api_pb.UpdateVotesResponse.Vote votes = 1;</code>
     * @param value The votes to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addVotes")
    fun com.google.protobuf.kotlin.DslList<counters.minter.grpc.client.UpdateVotesResponse.Vote, VotesProxy>.add(value: counters.minter.grpc.client.UpdateVotesResponse.Vote) {
      _builder.addVotes(value)
    }/**
     * <code>repeated .api_pb.UpdateVotesResponse.Vote votes = 1;</code>
     * @param value The votes to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignVotes")
    inline operator fun com.google.protobuf.kotlin.DslList<counters.minter.grpc.client.UpdateVotesResponse.Vote, VotesProxy>.plusAssign(value: counters.minter.grpc.client.UpdateVotesResponse.Vote) {
      add(value)
    }/**
     * <code>repeated .api_pb.UpdateVotesResponse.Vote votes = 1;</code>
     * @param values The votes to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllVotes")
    fun com.google.protobuf.kotlin.DslList<counters.minter.grpc.client.UpdateVotesResponse.Vote, VotesProxy>.addAll(values: kotlin.collections.Iterable<counters.minter.grpc.client.UpdateVotesResponse.Vote>) {
      _builder.addAllVotes(values)
    }/**
     * <code>repeated .api_pb.UpdateVotesResponse.Vote votes = 1;</code>
     * @param values The votes to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllVotes")
    inline operator fun com.google.protobuf.kotlin.DslList<counters.minter.grpc.client.UpdateVotesResponse.Vote, VotesProxy>.plusAssign(values: kotlin.collections.Iterable<counters.minter.grpc.client.UpdateVotesResponse.Vote>) {
      addAll(values)
    }/**
     * <code>repeated .api_pb.UpdateVotesResponse.Vote votes = 1;</code>
     * @param index The index to set the value at.
     * @param value The votes to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setVotes")
    operator fun com.google.protobuf.kotlin.DslList<counters.minter.grpc.client.UpdateVotesResponse.Vote, VotesProxy>.set(index: kotlin.Int, value: counters.minter.grpc.client.UpdateVotesResponse.Vote) {
      _builder.setVotes(index, value)
    }/**
     * <code>repeated .api_pb.UpdateVotesResponse.Vote votes = 1;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearVotes")
    fun com.google.protobuf.kotlin.DslList<counters.minter.grpc.client.UpdateVotesResponse.Vote, VotesProxy>.clear() {
      _builder.clearVotes()
    }}
  @kotlin.jvm.JvmSynthetic
  inline fun vote(block: counters.minter.grpc.client.UpdateVotesResponseKt.VoteKt.Dsl.() -> Unit): counters.minter.grpc.client.UpdateVotesResponse.Vote =
    counters.minter.grpc.client.UpdateVotesResponseKt.VoteKt.Dsl._create(counters.minter.grpc.client.UpdateVotesResponse.Vote.newBuilder()).apply { block() }._build()
  object VoteKt {
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    @com.google.protobuf.kotlin.ProtoDslMarker
    class Dsl private constructor(
      @kotlin.jvm.JvmField private val _builder: counters.minter.grpc.client.UpdateVotesResponse.Vote.Builder
    ) {
      companion object {
        @kotlin.jvm.JvmSynthetic
        @kotlin.PublishedApi
        internal fun _create(builder: counters.minter.grpc.client.UpdateVotesResponse.Vote.Builder): Dsl = Dsl(builder)
      }

      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _build(): counters.minter.grpc.client.UpdateVotesResponse.Vote = _builder.build()

      /**
       * <code>string version = 2;</code>
       */
      var version: kotlin.String
        @JvmName("getVersion")
        get() = _builder.getVersion()
        @JvmName("setVersion")
        set(value) {
          _builder.setVersion(value)
        }
      /**
       * <code>string version = 2;</code>
       */
      fun clearVersion() {
        _builder.clearVersion()
      }

      /**
       * An uninstantiable, behaviorless type to represent the field in
       * generics.
       */
      @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
      class PublicKeysProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
      /**
       * <code>repeated string public_keys = 1;</code>
       * @return A list containing the publicKeys.
       */
      val publicKeys: com.google.protobuf.kotlin.DslList<kotlin.String, PublicKeysProxy>
        @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
        get() = com.google.protobuf.kotlin.DslList(
          _builder.getPublicKeysList()
        )
      /**
       * <code>repeated string public_keys = 1;</code>
       * @param value The publicKeys to add.
       */
      @kotlin.jvm.JvmSynthetic
      @kotlin.jvm.JvmName("addPublicKeys")
      fun com.google.protobuf.kotlin.DslList<kotlin.String, PublicKeysProxy>.add(value: kotlin.String) {
        _builder.addPublicKeys(value)
      }
      /**
       * <code>repeated string public_keys = 1;</code>
       * @param value The publicKeys to add.
       */
      @kotlin.jvm.JvmSynthetic
      @kotlin.jvm.JvmName("plusAssignPublicKeys")
      operator fun com.google.protobuf.kotlin.DslList<kotlin.String, PublicKeysProxy>.plusAssign(value: kotlin.String) {
        _builder.addPublicKeys(value)
      }
      /**
       * <code>repeated string public_keys = 1;</code>
       * @param values The publicKeys to add.
       */
      @kotlin.jvm.JvmSynthetic
      @kotlin.jvm.JvmName("addAllPublicKeys")
      fun com.google.protobuf.kotlin.DslList<kotlin.String, PublicKeysProxy>.addAll(values: kotlin.collections.Iterable<kotlin.String>) {
        _builder.addAllPublicKeys(values)
      }
      /**
       * <code>repeated string public_keys = 1;</code>
       * @param values The publicKeys to add.
       */
      @kotlin.jvm.JvmSynthetic
      @kotlin.jvm.JvmName("plusAssignAllPublicKeys")
      operator fun com.google.protobuf.kotlin.DslList<kotlin.String, PublicKeysProxy>.plusAssign(values: kotlin.collections.Iterable<kotlin.String>) {
        _builder.addAllPublicKeys(values)
      }
      /**
       * <code>repeated string public_keys = 1;</code>
       * @param index The index to set the value at.
       * @param value The publicKeys to set.
       */
      @kotlin.jvm.JvmSynthetic
      @kotlin.jvm.JvmName("setPublicKeys")
      operator fun com.google.protobuf.kotlin.DslList<kotlin.String, PublicKeysProxy>.set(index: kotlin.Int, value: kotlin.String) {
        _builder.setPublicKeys(index, value)
      }/**
       * <code>repeated string public_keys = 1;</code>
       */
      @kotlin.jvm.JvmSynthetic
      @kotlin.jvm.JvmName("clearPublicKeys")
      fun com.google.protobuf.kotlin.DslList<kotlin.String, PublicKeysProxy>.clear() {
        _builder.clearPublicKeys()
      }}
  }
}
@kotlin.jvm.JvmSynthetic
inline fun counters.minter.grpc.client.UpdateVotesResponse.copy(block: counters.minter.grpc.client.UpdateVotesResponseKt.Dsl.() -> Unit): counters.minter.grpc.client.UpdateVotesResponse =
  counters.minter.grpc.client.UpdateVotesResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()
@kotlin.jvm.JvmSynthetic
inline fun counters.minter.grpc.client.UpdateVotesResponse.Vote.copy(block: counters.minter.grpc.client.UpdateVotesResponseKt.VoteKt.Dsl.() -> Unit): counters.minter.grpc.client.UpdateVotesResponse.Vote =
  counters.minter.grpc.client.UpdateVotesResponseKt.VoteKt.Dsl._create(this.toBuilder()).apply { block() }._build()
