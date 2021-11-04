//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: resources.proto

package counters.minter.grpc.client;

@kotlin.jvm.JvmSynthetic
public inline fun priceCommissionResponse(block: counters.minter.grpc.client.PriceCommissionResponseKt.Dsl.() -> kotlin.Unit): counters.minter.grpc.client.PriceCommissionResponse =
  counters.minter.grpc.client.PriceCommissionResponseKt.Dsl._create(counters.minter.grpc.client.PriceCommissionResponse.newBuilder()).apply { block() }._build()
public object PriceCommissionResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: counters.minter.grpc.client.PriceCommissionResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: counters.minter.grpc.client.PriceCommissionResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): counters.minter.grpc.client.PriceCommissionResponse = _builder.build()

    /**
     * <code>.api_pb.Coin coin = 3 [json_name = "coin"];</code>
     */
    public var coin: counters.minter.grpc.client.Coin
      @JvmName("getCoin")
      get() = _builder.getCoin()
      @JvmName("setCoin")
      set(value) {
        _builder.setCoin(value)
      }
    /**
     * <code>.api_pb.Coin coin = 3 [json_name = "coin"];</code>
     */
    public fun clearCoin() {
      _builder.clearCoin()
    }
    /**
     * <code>.api_pb.Coin coin = 3 [json_name = "coin"];</code>
     * @return Whether the coin field is set.
     */
    public fun hasCoin(): kotlin.Boolean {
      return _builder.hasCoin()
    }

    /**
     * <code>string payload_byte = 4 [json_name = "payloadByte"];</code>
     */
    public var payloadByte: kotlin.String
      @JvmName("getPayloadByte")
      get() = _builder.getPayloadByte()
      @JvmName("setPayloadByte")
      set(value) {
        _builder.setPayloadByte(value)
      }
    /**
     * <code>string payload_byte = 4 [json_name = "payloadByte"];</code>
     */
    public fun clearPayloadByte() {
      _builder.clearPayloadByte()
    }

    /**
     * <code>string send = 5 [json_name = "send"];</code>
     */
    public var send: kotlin.String
      @JvmName("getSend")
      get() = _builder.getSend()
      @JvmName("setSend")
      set(value) {
        _builder.setSend(value)
      }
    /**
     * <code>string send = 5 [json_name = "send"];</code>
     */
    public fun clearSend() {
      _builder.clearSend()
    }

    /**
     * <code>string buy_bancor = 38 [json_name = "buyBancor"];</code>
     */
    public var buyBancor: kotlin.String
      @JvmName("getBuyBancor")
      get() = _builder.getBuyBancor()
      @JvmName("setBuyBancor")
      set(value) {
        _builder.setBuyBancor(value)
      }
    /**
     * <code>string buy_bancor = 38 [json_name = "buyBancor"];</code>
     */
    public fun clearBuyBancor() {
      _builder.clearBuyBancor()
    }

    /**
     * <code>string sell_bancor = 39 [json_name = "sellBancor"];</code>
     */
    public var sellBancor: kotlin.String
      @JvmName("getSellBancor")
      get() = _builder.getSellBancor()
      @JvmName("setSellBancor")
      set(value) {
        _builder.setSellBancor(value)
      }
    /**
     * <code>string sell_bancor = 39 [json_name = "sellBancor"];</code>
     */
    public fun clearSellBancor() {
      _builder.clearSellBancor()
    }

    /**
     * <code>string sell_all_bancor = 40 [json_name = "sellAllBancor"];</code>
     */
    public var sellAllBancor: kotlin.String
      @JvmName("getSellAllBancor")
      get() = _builder.getSellAllBancor()
      @JvmName("setSellAllBancor")
      set(value) {
        _builder.setSellAllBancor(value)
      }
    /**
     * <code>string sell_all_bancor = 40 [json_name = "sellAllBancor"];</code>
     */
    public fun clearSellAllBancor() {
      _builder.clearSellAllBancor()
    }

    /**
     * <code>string buy_pool_base = 41 [json_name = "buyPoolBase"];</code>
     */
    public var buyPoolBase: kotlin.String
      @JvmName("getBuyPoolBase")
      get() = _builder.getBuyPoolBase()
      @JvmName("setBuyPoolBase")
      set(value) {
        _builder.setBuyPoolBase(value)
      }
    /**
     * <code>string buy_pool_base = 41 [json_name = "buyPoolBase"];</code>
     */
    public fun clearBuyPoolBase() {
      _builder.clearBuyPoolBase()
    }

    /**
     * <code>string buy_pool_delta = 53 [json_name = "buyPoolDelta"];</code>
     */
    public var buyPoolDelta: kotlin.String
      @JvmName("getBuyPoolDelta")
      get() = _builder.getBuyPoolDelta()
      @JvmName("setBuyPoolDelta")
      set(value) {
        _builder.setBuyPoolDelta(value)
      }
    /**
     * <code>string buy_pool_delta = 53 [json_name = "buyPoolDelta"];</code>
     */
    public fun clearBuyPoolDelta() {
      _builder.clearBuyPoolDelta()
    }

    /**
     * <code>string sell_pool_base = 42 [json_name = "sellPoolBase"];</code>
     */
    public var sellPoolBase: kotlin.String
      @JvmName("getSellPoolBase")
      get() = _builder.getSellPoolBase()
      @JvmName("setSellPoolBase")
      set(value) {
        _builder.setSellPoolBase(value)
      }
    /**
     * <code>string sell_pool_base = 42 [json_name = "sellPoolBase"];</code>
     */
    public fun clearSellPoolBase() {
      _builder.clearSellPoolBase()
    }

    /**
     * <code>string sell_pool_delta = 54 [json_name = "sellPoolDelta"];</code>
     */
    public var sellPoolDelta: kotlin.String
      @JvmName("getSellPoolDelta")
      get() = _builder.getSellPoolDelta()
      @JvmName("setSellPoolDelta")
      set(value) {
        _builder.setSellPoolDelta(value)
      }
    /**
     * <code>string sell_pool_delta = 54 [json_name = "sellPoolDelta"];</code>
     */
    public fun clearSellPoolDelta() {
      _builder.clearSellPoolDelta()
    }

    /**
     * <code>string sell_all_pool_base = 43 [json_name = "sellAllPoolBase"];</code>
     */
    public var sellAllPoolBase: kotlin.String
      @JvmName("getSellAllPoolBase")
      get() = _builder.getSellAllPoolBase()
      @JvmName("setSellAllPoolBase")
      set(value) {
        _builder.setSellAllPoolBase(value)
      }
    /**
     * <code>string sell_all_pool_base = 43 [json_name = "sellAllPoolBase"];</code>
     */
    public fun clearSellAllPoolBase() {
      _builder.clearSellAllPoolBase()
    }

    /**
     * <code>string sell_all_pool_delta = 55 [json_name = "sellAllPoolDelta"];</code>
     */
    public var sellAllPoolDelta: kotlin.String
      @JvmName("getSellAllPoolDelta")
      get() = _builder.getSellAllPoolDelta()
      @JvmName("setSellAllPoolDelta")
      set(value) {
        _builder.setSellAllPoolDelta(value)
      }
    /**
     * <code>string sell_all_pool_delta = 55 [json_name = "sellAllPoolDelta"];</code>
     */
    public fun clearSellAllPoolDelta() {
      _builder.clearSellAllPoolDelta()
    }

    /**
     * <code>string create_ticker3 = 7 [json_name = "createTicker3"];</code>
     */
    public var createTicker3: kotlin.String
      @JvmName("getCreateTicker3")
      get() = _builder.getCreateTicker3()
      @JvmName("setCreateTicker3")
      set(value) {
        _builder.setCreateTicker3(value)
      }
    /**
     * <code>string create_ticker3 = 7 [json_name = "createTicker3"];</code>
     */
    public fun clearCreateTicker3() {
      _builder.clearCreateTicker3()
    }

    /**
     * <code>string create_ticker4 = 8 [json_name = "createTicker4"];</code>
     */
    public var createTicker4: kotlin.String
      @JvmName("getCreateTicker4")
      get() = _builder.getCreateTicker4()
      @JvmName("setCreateTicker4")
      set(value) {
        _builder.setCreateTicker4(value)
      }
    /**
     * <code>string create_ticker4 = 8 [json_name = "createTicker4"];</code>
     */
    public fun clearCreateTicker4() {
      _builder.clearCreateTicker4()
    }

    /**
     * <code>string create_ticker5 = 9 [json_name = "createTicker5"];</code>
     */
    public var createTicker5: kotlin.String
      @JvmName("getCreateTicker5")
      get() = _builder.getCreateTicker5()
      @JvmName("setCreateTicker5")
      set(value) {
        _builder.setCreateTicker5(value)
      }
    /**
     * <code>string create_ticker5 = 9 [json_name = "createTicker5"];</code>
     */
    public fun clearCreateTicker5() {
      _builder.clearCreateTicker5()
    }

    /**
     * <code>string create_ticker6 = 10 [json_name = "createTicker6"];</code>
     */
    public var createTicker6: kotlin.String
      @JvmName("getCreateTicker6")
      get() = _builder.getCreateTicker6()
      @JvmName("setCreateTicker6")
      set(value) {
        _builder.setCreateTicker6(value)
      }
    /**
     * <code>string create_ticker6 = 10 [json_name = "createTicker6"];</code>
     */
    public fun clearCreateTicker6() {
      _builder.clearCreateTicker6()
    }

    /**
     * <code>string create_ticker7_10 = 11 [json_name = "createTicker710"];</code>
     */
    public var createTicker710: kotlin.String
      @JvmName("getCreateTicker710")
      get() = _builder.getCreateTicker710()
      @JvmName("setCreateTicker710")
      set(value) {
        _builder.setCreateTicker710(value)
      }
    /**
     * <code>string create_ticker7_10 = 11 [json_name = "createTicker710"];</code>
     */
    public fun clearCreateTicker710() {
      _builder.clearCreateTicker710()
    }

    /**
     * <code>string create_coin = 34 [json_name = "createCoin"];</code>
     */
    public var createCoin: kotlin.String
      @JvmName("getCreateCoin")
      get() = _builder.getCreateCoin()
      @JvmName("setCreateCoin")
      set(value) {
        _builder.setCreateCoin(value)
      }
    /**
     * <code>string create_coin = 34 [json_name = "createCoin"];</code>
     */
    public fun clearCreateCoin() {
      _builder.clearCreateCoin()
    }

    /**
     * <code>string create_token = 35 [json_name = "createToken"];</code>
     */
    public var createToken: kotlin.String
      @JvmName("getCreateToken")
      get() = _builder.getCreateToken()
      @JvmName("setCreateToken")
      set(value) {
        _builder.setCreateToken(value)
      }
    /**
     * <code>string create_token = 35 [json_name = "createToken"];</code>
     */
    public fun clearCreateToken() {
      _builder.clearCreateToken()
    }

    /**
     * <code>string recreate_coin = 36 [json_name = "recreateCoin"];</code>
     */
    public var recreateCoin: kotlin.String
      @JvmName("getRecreateCoin")
      get() = _builder.getRecreateCoin()
      @JvmName("setRecreateCoin")
      set(value) {
        _builder.setRecreateCoin(value)
      }
    /**
     * <code>string recreate_coin = 36 [json_name = "recreateCoin"];</code>
     */
    public fun clearRecreateCoin() {
      _builder.clearRecreateCoin()
    }

    /**
     * <code>string recreate_token = 37 [json_name = "recreateToken"];</code>
     */
    public var recreateToken: kotlin.String
      @JvmName("getRecreateToken")
      get() = _builder.getRecreateToken()
      @JvmName("setRecreateToken")
      set(value) {
        _builder.setRecreateToken(value)
      }
    /**
     * <code>string recreate_token = 37 [json_name = "recreateToken"];</code>
     */
    public fun clearRecreateToken() {
      _builder.clearRecreateToken()
    }

    /**
     * <code>string declare_candidacy = 13 [json_name = "declareCandidacy"];</code>
     */
    public var declareCandidacy: kotlin.String
      @JvmName("getDeclareCandidacy")
      get() = _builder.getDeclareCandidacy()
      @JvmName("setDeclareCandidacy")
      set(value) {
        _builder.setDeclareCandidacy(value)
      }
    /**
     * <code>string declare_candidacy = 13 [json_name = "declareCandidacy"];</code>
     */
    public fun clearDeclareCandidacy() {
      _builder.clearDeclareCandidacy()
    }

    /**
     * <code>string delegate = 14 [json_name = "delegate"];</code>
     */
    public var delegate: kotlin.String
      @JvmName("getDelegate")
      get() = _builder.getDelegate()
      @JvmName("setDelegate")
      set(value) {
        _builder.setDelegate(value)
      }
    /**
     * <code>string delegate = 14 [json_name = "delegate"];</code>
     */
    public fun clearDelegate() {
      _builder.clearDelegate()
    }

    /**
     * <code>string unbond = 15 [json_name = "unbond"];</code>
     */
    public var unbond: kotlin.String
      @JvmName("getUnbond")
      get() = _builder.getUnbond()
      @JvmName("setUnbond")
      set(value) {
        _builder.setUnbond(value)
      }
    /**
     * <code>string unbond = 15 [json_name = "unbond"];</code>
     */
    public fun clearUnbond() {
      _builder.clearUnbond()
    }

    /**
     * <code>string redeem_check = 16 [json_name = "redeemCheck"];</code>
     */
    public var redeemCheck: kotlin.String
      @JvmName("getRedeemCheck")
      get() = _builder.getRedeemCheck()
      @JvmName("setRedeemCheck")
      set(value) {
        _builder.setRedeemCheck(value)
      }
    /**
     * <code>string redeem_check = 16 [json_name = "redeemCheck"];</code>
     */
    public fun clearRedeemCheck() {
      _builder.clearRedeemCheck()
    }

    /**
     * <code>string set_candidate_on = 44 [json_name = "setCandidateOn"];</code>
     */
    public var setCandidateOn: kotlin.String
      @JvmName("getSetCandidateOn")
      get() = _builder.getSetCandidateOn()
      @JvmName("setSetCandidateOn")
      set(value) {
        _builder.setSetCandidateOn(value)
      }
    /**
     * <code>string set_candidate_on = 44 [json_name = "setCandidateOn"];</code>
     */
    public fun clearSetCandidateOn() {
      _builder.clearSetCandidateOn()
    }

    /**
     * <code>string set_candidate_off = 45 [json_name = "setCandidateOff"];</code>
     */
    public var setCandidateOff: kotlin.String
      @JvmName("getSetCandidateOff")
      get() = _builder.getSetCandidateOff()
      @JvmName("setSetCandidateOff")
      set(value) {
        _builder.setSetCandidateOff(value)
      }
    /**
     * <code>string set_candidate_off = 45 [json_name = "setCandidateOff"];</code>
     */
    public fun clearSetCandidateOff() {
      _builder.clearSetCandidateOff()
    }

    /**
     * <code>string create_multisig = 18 [json_name = "createMultisig"];</code>
     */
    public var createMultisig: kotlin.String
      @JvmName("getCreateMultisig")
      get() = _builder.getCreateMultisig()
      @JvmName("setCreateMultisig")
      set(value) {
        _builder.setCreateMultisig(value)
      }
    /**
     * <code>string create_multisig = 18 [json_name = "createMultisig"];</code>
     */
    public fun clearCreateMultisig() {
      _builder.clearCreateMultisig()
    }

    /**
     * <code>string multisend_base = 51 [json_name = "multisendBase"];</code>
     */
    public var multisendBase: kotlin.String
      @JvmName("getMultisendBase")
      get() = _builder.getMultisendBase()
      @JvmName("setMultisendBase")
      set(value) {
        _builder.setMultisendBase(value)
      }
    /**
     * <code>string multisend_base = 51 [json_name = "multisendBase"];</code>
     */
    public fun clearMultisendBase() {
      _builder.clearMultisendBase()
    }

    /**
     * <code>string multisend_delta = 52 [json_name = "multisendDelta"];</code>
     */
    public var multisendDelta: kotlin.String
      @JvmName("getMultisendDelta")
      get() = _builder.getMultisendDelta()
      @JvmName("setMultisendDelta")
      set(value) {
        _builder.setMultisendDelta(value)
      }
    /**
     * <code>string multisend_delta = 52 [json_name = "multisendDelta"];</code>
     */
    public fun clearMultisendDelta() {
      _builder.clearMultisendDelta()
    }

    /**
     * <code>string edit_candidate = 20 [json_name = "editCandidate"];</code>
     */
    public var editCandidate: kotlin.String
      @JvmName("getEditCandidate")
      get() = _builder.getEditCandidate()
      @JvmName("setEditCandidate")
      set(value) {
        _builder.setEditCandidate(value)
      }
    /**
     * <code>string edit_candidate = 20 [json_name = "editCandidate"];</code>
     */
    public fun clearEditCandidate() {
      _builder.clearEditCandidate()
    }

    /**
     * <code>string set_halt_block = 21 [json_name = "setHaltBlock"];</code>
     */
    public var setHaltBlock: kotlin.String
      @JvmName("getSetHaltBlock")
      get() = _builder.getSetHaltBlock()
      @JvmName("setSetHaltBlock")
      set(value) {
        _builder.setSetHaltBlock(value)
      }
    /**
     * <code>string set_halt_block = 21 [json_name = "setHaltBlock"];</code>
     */
    public fun clearSetHaltBlock() {
      _builder.clearSetHaltBlock()
    }

    /**
     * <code>string edit_ticker_owner = 22 [json_name = "editTickerOwner"];</code>
     */
    public var editTickerOwner: kotlin.String
      @JvmName("getEditTickerOwner")
      get() = _builder.getEditTickerOwner()
      @JvmName("setEditTickerOwner")
      set(value) {
        _builder.setEditTickerOwner(value)
      }
    /**
     * <code>string edit_ticker_owner = 22 [json_name = "editTickerOwner"];</code>
     */
    public fun clearEditTickerOwner() {
      _builder.clearEditTickerOwner()
    }

    /**
     * <code>string edit_multisig = 23 [json_name = "editMultisig"];</code>
     */
    public var editMultisig: kotlin.String
      @JvmName("getEditMultisig")
      get() = _builder.getEditMultisig()
      @JvmName("setEditMultisig")
      set(value) {
        _builder.setEditMultisig(value)
      }
    /**
     * <code>string edit_multisig = 23 [json_name = "editMultisig"];</code>
     */
    public fun clearEditMultisig() {
      _builder.clearEditMultisig()
    }

    /**
     * <code>string edit_candidate_public_key = 25 [json_name = "editCandidatePublicKey"];</code>
     */
    public var editCandidatePublicKey: kotlin.String
      @JvmName("getEditCandidatePublicKey")
      get() = _builder.getEditCandidatePublicKey()
      @JvmName("setEditCandidatePublicKey")
      set(value) {
        _builder.setEditCandidatePublicKey(value)
      }
    /**
     * <code>string edit_candidate_public_key = 25 [json_name = "editCandidatePublicKey"];</code>
     */
    public fun clearEditCandidatePublicKey() {
      _builder.clearEditCandidatePublicKey()
    }

    /**
     * <code>string create_swap_pool = 48 [json_name = "createSwapPool"];</code>
     */
    public var createSwapPool: kotlin.String
      @JvmName("getCreateSwapPool")
      get() = _builder.getCreateSwapPool()
      @JvmName("setCreateSwapPool")
      set(value) {
        _builder.setCreateSwapPool(value)
      }
    /**
     * <code>string create_swap_pool = 48 [json_name = "createSwapPool"];</code>
     */
    public fun clearCreateSwapPool() {
      _builder.clearCreateSwapPool()
    }

    /**
     * <code>string add_liquidity = 49 [json_name = "addLiquidity"];</code>
     */
    public var addLiquidity: kotlin.String
      @JvmName("getAddLiquidity")
      get() = _builder.getAddLiquidity()
      @JvmName("setAddLiquidity")
      set(value) {
        _builder.setAddLiquidity(value)
      }
    /**
     * <code>string add_liquidity = 49 [json_name = "addLiquidity"];</code>
     */
    public fun clearAddLiquidity() {
      _builder.clearAddLiquidity()
    }

    /**
     * <code>string remove_liquidity = 50 [json_name = "removeLiquidity"];</code>
     */
    public var removeLiquidity: kotlin.String
      @JvmName("getRemoveLiquidity")
      get() = _builder.getRemoveLiquidity()
      @JvmName("setRemoveLiquidity")
      set(value) {
        _builder.setRemoveLiquidity(value)
      }
    /**
     * <code>string remove_liquidity = 50 [json_name = "removeLiquidity"];</code>
     */
    public fun clearRemoveLiquidity() {
      _builder.clearRemoveLiquidity()
    }

    /**
     * <code>string edit_candidate_commission = 28 [json_name = "editCandidateCommission"];</code>
     */
    public var editCandidateCommission: kotlin.String
      @JvmName("getEditCandidateCommission")
      get() = _builder.getEditCandidateCommission()
      @JvmName("setEditCandidateCommission")
      set(value) {
        _builder.setEditCandidateCommission(value)
      }
    /**
     * <code>string edit_candidate_commission = 28 [json_name = "editCandidateCommission"];</code>
     */
    public fun clearEditCandidateCommission() {
      _builder.clearEditCandidateCommission()
    }

    /**
     * <code>string mint_token = 46 [json_name = "mintToken"];</code>
     */
    public var mintToken: kotlin.String
      @JvmName("getMintToken")
      get() = _builder.getMintToken()
      @JvmName("setMintToken")
      set(value) {
        _builder.setMintToken(value)
      }
    /**
     * <code>string mint_token = 46 [json_name = "mintToken"];</code>
     */
    public fun clearMintToken() {
      _builder.clearMintToken()
    }

    /**
     * <code>string burn_token = 47 [json_name = "burnToken"];</code>
     */
    public var burnToken: kotlin.String
      @JvmName("getBurnToken")
      get() = _builder.getBurnToken()
      @JvmName("setBurnToken")
      set(value) {
        _builder.setBurnToken(value)
      }
    /**
     * <code>string burn_token = 47 [json_name = "burnToken"];</code>
     */
    public fun clearBurnToken() {
      _builder.clearBurnToken()
    }

    /**
     * <code>string vote_commission = 31 [json_name = "voteCommission"];</code>
     */
    public var voteCommission: kotlin.String
      @JvmName("getVoteCommission")
      get() = _builder.getVoteCommission()
      @JvmName("setVoteCommission")
      set(value) {
        _builder.setVoteCommission(value)
      }
    /**
     * <code>string vote_commission = 31 [json_name = "voteCommission"];</code>
     */
    public fun clearVoteCommission() {
      _builder.clearVoteCommission()
    }

    /**
     * <code>string vote_update = 32 [json_name = "voteUpdate"];</code>
     */
    public var voteUpdate: kotlin.String
      @JvmName("getVoteUpdate")
      get() = _builder.getVoteUpdate()
      @JvmName("setVoteUpdate")
      set(value) {
        _builder.setVoteUpdate(value)
      }
    /**
     * <code>string vote_update = 32 [json_name = "voteUpdate"];</code>
     */
    public fun clearVoteUpdate() {
      _builder.clearVoteUpdate()
    }

    /**
     * <code>string failed_tx = 56 [json_name = "failedTx"];</code>
     */
    public var failedTx: kotlin.String
      @JvmName("getFailedTx")
      get() = _builder.getFailedTx()
      @JvmName("setFailedTx")
      set(value) {
        _builder.setFailedTx(value)
      }
    /**
     * <code>string failed_tx = 56 [json_name = "failedTx"];</code>
     */
    public fun clearFailedTx() {
      _builder.clearFailedTx()
    }

    /**
     * <code>string add_limit_order = 57 [json_name = "addLimitOrder"];</code>
     */
    public var addLimitOrder: kotlin.String
      @JvmName("getAddLimitOrder")
      get() = _builder.getAddLimitOrder()
      @JvmName("setAddLimitOrder")
      set(value) {
        _builder.setAddLimitOrder(value)
      }
    /**
     * <code>string add_limit_order = 57 [json_name = "addLimitOrder"];</code>
     */
    public fun clearAddLimitOrder() {
      _builder.clearAddLimitOrder()
    }

    /**
     * <code>string remove_limit_order = 58 [json_name = "removeLimitOrder"];</code>
     */
    public var removeLimitOrder: kotlin.String
      @JvmName("getRemoveLimitOrder")
      get() = _builder.getRemoveLimitOrder()
      @JvmName("setRemoveLimitOrder")
      set(value) {
        _builder.setRemoveLimitOrder(value)
      }
    /**
     * <code>string remove_limit_order = 58 [json_name = "removeLimitOrder"];</code>
     */
    public fun clearRemoveLimitOrder() {
      _builder.clearRemoveLimitOrder()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun counters.minter.grpc.client.PriceCommissionResponse.copy(block: counters.minter.grpc.client.PriceCommissionResponseKt.Dsl.() -> kotlin.Unit): counters.minter.grpc.client.PriceCommissionResponse =
  counters.minter.grpc.client.PriceCommissionResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()
