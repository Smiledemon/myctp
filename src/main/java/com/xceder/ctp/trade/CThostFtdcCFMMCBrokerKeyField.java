package com.xceder.ctp.trade;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \ufffd\ufffd\u05a4\ufffd\ufffd\ufffd\ufffd\u03f5\u0373\ufffd\ufffd\ufffd\u0379\ufffd\u02fe\ufffd\ufffd\u053f<br>
 * <i>native declaration : ThostFtdcUserApiStruct.h:6462</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Thosttraderapi") 
public class CThostFtdcCFMMCBrokerKeyField extends StructObject {
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
	 * \ufffd\ufffd\ufffd\u0379\ufffd\u02fe\u0373\u04bb\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcParticipantIDType
	 */
	@Array({11}) 
	@Field(1) 
	public Pointer<Byte > ParticipantID() {
		return this.io.getPointerField(this, 1);
	}
	/**
	 * \ufffd\ufffd\u053f\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcDateType
	 */
	@Array({9}) 
	@Field(2) 
	public Pointer<Byte > CreateDate() {
		return this.io.getPointerField(this, 2);
	}
	/**
	 * \ufffd\ufffd\u053f\ufffd\ufffd\ufffd\ufffd\u02b1\ufffd\ufffd<br>
	 * C type : TThostFtdcTimeType
	 */
	@Array({9}) 
	@Field(3) 
	public Pointer<Byte > CreateTime() {
		return this.io.getPointerField(this, 3);
	}
	/**
	 * \ufffd\ufffd\u053f\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcSequenceNoType
	 */
	@Field(4) 
	public int KeyID() {
		return this.io.getIntField(this, 4);
	}
	/**
	 * \ufffd\ufffd\u053f\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcSequenceNoType
	 */
	@Field(4) 
	public CThostFtdcCFMMCBrokerKeyField KeyID(int KeyID) {
		this.io.setIntField(this, 4, KeyID);
		return this;
	}
	/**
	 * \ufffd\ufffd\u032c\ufffd\ufffd\u053f<br>
	 * C type : TThostFtdcCFMMCKeyType
	 */
	@Array({21}) 
	@Field(5) 
	public Pointer<Byte > CurrentKey() {
		return this.io.getPointerField(this, 5);
	}
	/**
	 * \ufffd\ufffd\u032c\ufffd\ufffd\u053f\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcCFMMCKeyKindType
	 */
	@Field(6) 
	public byte KeyKind() {
		return this.io.getByteField(this, 6);
	}
	/**
	 * \ufffd\ufffd\u032c\ufffd\ufffd\u053f\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcCFMMCKeyKindType
	 */
	@Field(6) 
	public CThostFtdcCFMMCBrokerKeyField KeyKind(byte KeyKind) {
		this.io.setByteField(this, 6, KeyKind);
		return this;
	}
	public CThostFtdcCFMMCBrokerKeyField() {
		super();
	}
	public CThostFtdcCFMMCBrokerKeyField(Pointer pointer) {
		super(pointer);
	}
}
