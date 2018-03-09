package com.xceder.demo;

import com.xceder.ctp.market.*;
import org.bridj.Pointer;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: xiaopan
 * Date: 2018-03-09
 * Time: 下午3:31
 */
public class MdSpi extends CThostFtdcMdSpi{
    CThostFtdcMdApi mdApi;
    @Override
    public void OnFrontConnected() {
        System.out.println("OnFrontConnected");
        CThostFtdcReqUserLoginField userLoginField = new CThostFtdcReqUserLoginField();
        userLoginField.setBrokerID("9999");
        userLoginField.setUserID("xpyl");
        userLoginField.setPassword("yaoling520");
        int iResult = mdApi.ReqUserLogin(Pointer.getPointer(userLoginField),0);
    }

    @Override
    public void OnFrontDisconnected(int nReason) {
        System.out.println("OnFrontDisconnected");
        System.out.println(nReason);

    }

    @Override
    public void OnRspUserLogin(Pointer<CThostFtdcRspUserLoginField> pRspUserLogin, Pointer<CThostFtdcRspInfoField> pRspInfo, int nRequestID, boolean bIsLast) {
        System.out.println("OnRspUserLogin");
        System.out.println("获取当前交易日"+this.mdApi.GetTradingDay());
        int result= this.mdApi.SubscribeMarketData(Pointer.pointerToCStrings("cu1205"),1);
        System.out.println(result == 0 ? "成功" : "失败");
        int res = this.mdApi.SubscribeForQuoteRsp(Pointer.pointerToCStrings("cu1206"),2);
        System.out.println(res == 0 ? "成功" : "失败");

    }


    @Override
    public void OnRspError(Pointer<CThostFtdcRspInfoField> pRspInfo, int nRequestID, boolean bIsLast) {
        System.out.println("OnRspError");
    }

    @Override
    public void OnRspSubMarketData(Pointer<CThostFtdcSpecificInstrumentField> pSpecificInstrument, Pointer<CThostFtdcRspInfoField> pRspInfo, int nRequestID, boolean bIsLast) {
        System.out.println("OnRspSubMarketData");
    }

    @Override
    public void OnRspUnSubMarketData(Pointer<CThostFtdcSpecificInstrumentField> pSpecificInstrument, Pointer<CThostFtdcRspInfoField> pRspInfo, int nRequestID, boolean bIsLast) {
        System.out.println("OnRspUnSubMarketData");
    }

    @Override
    public void OnRspSubForQuoteRsp(Pointer<CThostFtdcSpecificInstrumentField> pSpecificInstrument, Pointer<CThostFtdcRspInfoField> pRspInfo, int nRequestID, boolean bIsLast) {
        System.out.println("OnRspSubForQuoteRsp");
    }

    @Override
    public void OnRspUnSubForQuoteRsp(Pointer<CThostFtdcSpecificInstrumentField> pSpecificInstrument, Pointer<CThostFtdcRspInfoField> pRspInfo, int nRequestID, boolean bIsLast) {
        System.out.println("OnRspUnSubForQuoteRsp");
    }

    @Override
    public void OnRtnForQuoteRsp(Pointer<CThostFtdcForQuoteRspField> pForQuoteRsp) {
    }

}
