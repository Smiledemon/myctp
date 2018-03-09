package com.xceder.ctp.market;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \u05b4\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
 * <i>native declaration : ThostFtdcUserApiStruct.h:2966</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Thostmduserapi") 
public class CThostFtdcExecOrderField extends StructObject {
	/**
	 * \ufffd\ufffd\ufffd\u0379\ufffd\u02fe\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcBrokerIDType
	 */
	@Array({11}) 
	@Field(0) 
	public Pointer<Byte > BrokerID() {
		return this.io.getPointerField(this, 0);
	}
	/**
	 * \u0376\ufffd\ufffd\ufffd\u07f4\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcInvestorIDType
	 */
	@Array({13}) 
	@Field(1) 
	public Pointer<Byte > InvestorID() {
		return this.io.getPointerField(this, 1);
	}
	/**
	 * \ufffd\ufffd\u053c\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcInstrumentIDType
	 */
	@Array({31}) 
	@Field(2) 
	public Pointer<Byte > InstrumentID() {
		return this.io.getPointerField(this, 2);
	}
	/**
	 * \u05b4\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcOrderRefType
	 */
	@Array({13}) 
	@Field(3) 
	public Pointer<Byte > ExecOrderRef() {
		return this.io.getPointerField(this, 3);
	}
	/**
	 * \ufffd\u00fb\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcUserIDType
	 */
	@Array({16}) 
	@Field(4) 
	public Pointer<Byte > UserID() {
		return this.io.getPointerField(this, 4);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(5) 
	public int Volume() {
		return this.io.getIntField(this, 5);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(5) 
	public CThostFtdcExecOrderField Volume(int Volume) {
		this.io.setIntField(this, 5, Volume);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRequestIDType
	 */
	@Field(6) 
	public int RequestID() {
		return this.io.getIntField(this, 6);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRequestIDType
	 */
	@Field(6) 
	public CThostFtdcExecOrderField RequestID(int RequestID) {
		this.io.setIntField(this, 6, RequestID);
		return this;
	}
	/**
	 * \u04b5\ufffd\ufffd\u052a<br>
	 * C type : TThostFtdcBusinessUnitType
	 */
	@Array({21}) 
	@Field(7) 
	public Pointer<Byte > BusinessUnit() {
		return this.io.getPointerField(this, 7);
	}
	/**
	 * \ufffd\ufffd\u01bd\ufffd\ufffd\u05be<br>
	 * C type : TThostFtdcOffsetFlagType
	 */
	@Field(8) 
	public byte OffsetFlag() {
		return this.io.getByteField(this, 8);
	}
	/**
	 * \ufffd\ufffd\u01bd\ufffd\ufffd\u05be<br>
	 * C type : TThostFtdcOffsetFlagType
	 */
	@Field(8) 
	public CThostFtdcExecOrderField OffsetFlag(byte OffsetFlag) {
		this.io.setByteField(this, 8, OffsetFlag);
		return this;
	}
	/**
	 * \u0376\ufffd\ufffd\ufffd\u05f1\ufffd\ufffd\ufffd\u05be<br>
	 * C type : TThostFtdcHedgeFlagType
	 */
	@Field(9) 
	public byte HedgeFlag() {
		return this.io.getByteField(this, 9);
	}
	/**
	 * \u0376\ufffd\ufffd\ufffd\u05f1\ufffd\ufffd\ufffd\u05be<br>
	 * C type : TThostFtdcHedgeFlagType
	 */
	@Field(9) 
	public CThostFtdcExecOrderField HedgeFlag(byte HedgeFlag) {
		this.io.setByteField(this, 9, HedgeFlag);
		return this;
	}
	/**
	 * \u05b4\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcActionTypeType
	 */
	@Field(10) 
	public byte ActionType() {
		return this.io.getByteField(this, 10);
	}
	/**
	 * \u05b4\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcActionTypeType
	 */
	@Field(10) 
	public CThostFtdcExecOrderField ActionType(byte ActionType) {
		this.io.setByteField(this, 10, ActionType);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\u0377\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u0133\u05b2\u05b7\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcPosiDirectionType
	 */
	@Field(11) 
	public byte PosiDirection() {
		return this.io.getByteField(this, 11);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\u0377\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u0133\u05b2\u05b7\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcPosiDirectionType
	 */
	@Field(11) 
	public CThostFtdcExecOrderField PosiDirection(byte PosiDirection) {
		this.io.setByteField(this, 11, PosiDirection);
		return this;
	}
	/**
	 * \ufffd\ufffd\u0228\ufffd\ufffd\u0228\ufffd\ufffd\ufffd\u01f7\ufffd\ufffd\ufffd\ufffd\u06bb\ufffd\u0377\ufffd\ufffd\u0131\ufffd\ufffd,\ufffd\ufffd\ufffd\u05b6\ufffd\ufffd\u0477\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcExecOrderPositionFlagType
	 */
	@Field(12) 
	public byte ReservePositionFlag() {
		return this.io.getByteField(this, 12);
	}
	/**
	 * \ufffd\ufffd\u0228\ufffd\ufffd\u0228\ufffd\ufffd\ufffd\u01f7\ufffd\ufffd\ufffd\ufffd\u06bb\ufffd\u0377\ufffd\ufffd\u0131\ufffd\ufffd,\ufffd\ufffd\ufffd\u05b6\ufffd\ufffd\u0477\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcExecOrderPositionFlagType
	 */
	@Field(12) 
	public CThostFtdcExecOrderField ReservePositionFlag(byte ReservePositionFlag) {
		this.io.setByteField(this, 12, ReservePositionFlag);
		return this;
	}
	/**
	 * \ufffd\ufffd\u0228\ufffd\ufffd\u0228\ufffd\ufffd\ufffd\ufffd\ufffd\u0275\ufffd\u0377\ufffd\ufffd\ufffd\u01f7\ufffd\ufffd\u0536\ufffd\u01bd\ufffd\ufffd<br>
	 * C type : TThostFtdcExecOrderCloseFlagType
	 */
	@Field(13) 
	public byte CloseFlag() {
		return this.io.getByteField(this, 13);
	}
	/**
	 * \ufffd\ufffd\u0228\ufffd\ufffd\u0228\ufffd\ufffd\ufffd\ufffd\ufffd\u0275\ufffd\u0377\ufffd\ufffd\ufffd\u01f7\ufffd\ufffd\u0536\ufffd\u01bd\ufffd\ufffd<br>
	 * C type : TThostFtdcExecOrderCloseFlagType
	 */
	@Field(13) 
	public CThostFtdcExecOrderField CloseFlag(byte CloseFlag) {
		this.io.setByteField(this, 13, CloseFlag);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\u05b4\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcOrderLocalIDType
	 */
	@Array({13}) 
	@Field(14) 
	public Pointer<Byte > ExecOrderLocalID() {
		return this.io.getPointerField(this, 14);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcExchangeIDType
	 */
	@Array({9}) 
	@Field(15) 
	public Pointer<Byte > ExchangeID() {
		return this.io.getPointerField(this, 15);
	}
	/**
	 * \ufffd\ufffd\u0531\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcParticipantIDType
	 */
	@Array({11}) 
	@Field(16) 
	public Pointer<Byte > ParticipantID() {
		return this.io.getPointerField(this, 16);
	}
	/**
	 * \ufffd\u037b\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcClientIDType
	 */
	@Array({11}) 
	@Field(17) 
	public Pointer<Byte > ClientID() {
		return this.io.getPointerField(this, 17);
	}
	/**
	 * \ufffd\ufffd\u053c\ufffd\u06bd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u0134\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcExchangeInstIDType
	 */
	@Array({31}) 
	@Field(18) 
	public Pointer<Byte > ExchangeInstID() {
		return this.io.getPointerField(this, 18);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u0531\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcTraderIDType
	 */
	@Array({21}) 
	@Field(19) 
	public Pointer<Byte > TraderID() {
		return this.io.getPointerField(this, 19);
	}
	/**
	 * \ufffd\ufffd\u05f0\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcInstallIDType
	 */
	@Field(20) 
	public int InstallID() {
		return this.io.getIntField(this, 20);
	}
	/**
	 * \ufffd\ufffd\u05f0\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcInstallIDType
	 */
	@Field(20) 
	public CThostFtdcExecOrderField InstallID(int InstallID) {
		this.io.setIntField(this, 20, InstallID);
		return this;
	}
	/**
	 * \u05b4\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u1f7b\u05f4\u032c<br>
	 * C type : TThostFtdcOrderSubmitStatusType
	 */
	@Field(21) 
	public byte OrderSubmitStatus() {
		return this.io.getByteField(this, 21);
	}
	/**
	 * \u05b4\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u1f7b\u05f4\u032c<br>
	 * C type : TThostFtdcOrderSubmitStatusType
	 */
	@Field(21) 
	public CThostFtdcExecOrderField OrderSubmitStatus(byte OrderSubmitStatus) {
		this.io.setByteField(this, 21, OrderSubmitStatus);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u02be\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcSequenceNoType
	 */
	@Field(22) 
	public int NotifySequence() {
		return this.io.getIntField(this, 22);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u02be\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcSequenceNoType
	 */
	@Field(22) 
	public CThostFtdcExecOrderField NotifySequence(int NotifySequence) {
		this.io.setIntField(this, 22, NotifySequence);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcDateType
	 */
	@Array({9}) 
	@Field(23) 
	public Pointer<Byte > TradingDay() {
		return this.io.getPointerField(this, 23);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcSettlementIDType
	 */
	@Field(24) 
	public int SettlementID() {
		return this.io.getIntField(this, 24);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcSettlementIDType
	 */
	@Field(24) 
	public CThostFtdcExecOrderField SettlementID(int SettlementID) {
		this.io.setIntField(this, 24, SettlementID);
		return this;
	}
	/**
	 * \u05b4\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcExecOrderSysIDType
	 */
	@Array({21}) 
	@Field(25) 
	public Pointer<Byte > ExecOrderSysID() {
		return this.io.getPointerField(this, 25);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcDateType
	 */
	@Array({9}) 
	@Field(26) 
	public Pointer<Byte > InsertDate() {
		return this.io.getPointerField(this, 26);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\u02b1\ufffd\ufffd<br>
	 * C type : TThostFtdcTimeType
	 */
	@Array({9}) 
	@Field(27) 
	public Pointer<Byte > InsertTime() {
		return this.io.getPointerField(this, 27);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\u02b1\ufffd\ufffd<br>
	 * C type : TThostFtdcTimeType
	 */
	@Array({9}) 
	@Field(28) 
	public Pointer<Byte > CancelTime() {
		return this.io.getPointerField(this, 28);
	}
	/**
	 * \u05b4\ufffd\u043d\ufffd\ufffd<br>
	 * C type : TThostFtdcExecResultType
	 */
	@Field(29) 
	public byte ExecResult() {
		return this.io.getByteField(this, 29);
	}
	/**
	 * \u05b4\ufffd\u043d\ufffd\ufffd<br>
	 * C type : TThostFtdcExecResultType
	 */
	@Field(29) 
	public CThostFtdcExecOrderField ExecResult(byte ExecResult) {
		this.io.setByteField(this, 29, ExecResult);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u0531\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcParticipantIDType
	 */
	@Array({11}) 
	@Field(30) 
	public Pointer<Byte > ClearingPartID() {
		return this.io.getPointerField(this, 30);
	}
	/**
	 * \ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcSequenceNoType
	 */
	@Field(31) 
	public int SequenceNo() {
		return this.io.getIntField(this, 31);
	}
	/**
	 * \ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcSequenceNoType
	 */
	@Field(31) 
	public CThostFtdcExecOrderField SequenceNo(int SequenceNo) {
		this.io.setIntField(this, 31, SequenceNo);
		return this;
	}
	/**
	 * \u01f0\ufffd\u00f1\ufffd\ufffd<br>
	 * C type : TThostFtdcFrontIDType
	 */
	@Field(32) 
	public int FrontID() {
		return this.io.getIntField(this, 32);
	}
	/**
	 * \u01f0\ufffd\u00f1\ufffd\ufffd<br>
	 * C type : TThostFtdcFrontIDType
	 */
	@Field(32) 
	public CThostFtdcExecOrderField FrontID(int FrontID) {
		this.io.setIntField(this, 32, FrontID);
		return this;
	}
	/**
	 * \ufffd\u1ef0\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcSessionIDType
	 */
	@Field(33) 
	public int SessionID() {
		return this.io.getIntField(this, 33);
	}
	/**
	 * \ufffd\u1ef0\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcSessionIDType
	 */
	@Field(33) 
	public CThostFtdcExecOrderField SessionID(int SessionID) {
		this.io.setIntField(this, 33, SessionID);
		return this;
	}
	/**
	 * \ufffd\u00fb\ufffd\ufffd\u02f2\ufffd\u01b7\ufffd\ufffd\u03e2<br>
	 * C type : TThostFtdcProductInfoType
	 */
	@Array({11}) 
	@Field(34) 
	public Pointer<Byte > UserProductInfo() {
		return this.io.getPointerField(this, 34);
	}
	/**
	 * \u05f4\u032c\ufffd\ufffd\u03e2<br>
	 * C type : TThostFtdcErrorMsgType
	 */
	@Array({81}) 
	@Field(35) 
	public Pointer<Byte > StatusMsg() {
		return this.io.getPointerField(this, 35);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u00fb\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcUserIDType
	 */
	@Array({16}) 
	@Field(36) 
	public Pointer<Byte > ActiveUserID() {
		return this.io.getPointerField(this, 36);
	}
	/**
	 * \ufffd\ufffd\ufffd\u0379\ufffd\u02fe\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcSequenceNoType
	 */
	@Field(37) 
	public int BrokerExecOrderSeq() {
		return this.io.getIntField(this, 37);
	}
	/**
	 * \ufffd\ufffd\ufffd\u0379\ufffd\u02fe\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcSequenceNoType
	 */
	@Field(37) 
	public CThostFtdcExecOrderField BrokerExecOrderSeq(int BrokerExecOrderSeq) {
		this.io.setIntField(this, 37, BrokerExecOrderSeq);
		return this;
	}
	/**
	 * \u04ea\u04b5\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcBranchIDType
	 */
	@Array({9}) 
	@Field(38) 
	public Pointer<Byte > BranchID() {
		return this.io.getPointerField(this, 38);
	}
	/**
	 * \u0376\ufffd\u02b5\ufffd\u052a\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcInvestUnitIDType
	 */
	@Array({17}) 
	@Field(39) 
	public Pointer<Byte > InvestUnitID() {
		return this.io.getPointerField(this, 39);
	}
	/**
	 * \ufffd\u02bd\ufffd\ufffd\u02fa\ufffd<br>
	 * C type : TThostFtdcAccountIDType
	 */
	@Array({13}) 
	@Field(40) 
	public Pointer<Byte > AccountID() {
		return this.io.getPointerField(this, 40);
	}
	/**
	 * \ufffd\ufffd\ufffd\u05b4\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcCurrencyIDType
	 */
	@Array({4}) 
	@Field(41) 
	public Pointer<Byte > CurrencyID() {
		return this.io.getPointerField(this, 41);
	}
	/**
	 * IP\ufffd\ufffd\u05b7<br>
	 * C type : TThostFtdcIPAddressType
	 */
	@Array({16}) 
	@Field(42) 
	public Pointer<Byte > IPAddress() {
		return this.io.getPointerField(this, 42);
	}
	/**
	 * Mac\ufffd\ufffd\u05b7<br>
	 * C type : TThostFtdcMacAddressType
	 */
	@Array({21}) 
	@Field(43) 
	public Pointer<Byte > MacAddress() {
		return this.io.getPointerField(this, 43);
	}
	public CThostFtdcExecOrderField() {
		super();
	}
	public CThostFtdcExecOrderField(Pointer pointer) {
		super(pointer);
	}
}