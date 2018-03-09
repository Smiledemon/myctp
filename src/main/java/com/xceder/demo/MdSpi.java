package com.xceder.demo;

import com.xceder.ctp.market.*;
import org.bridj.Pointer;
import org.bridj.ann.Virtual;

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
    @Virtual(0)
    public void OnFrontConnected() {
        System.out.println("OnFrontConnected");
        CThostFtdcReqUserLoginField userLoginField = new CThostFtdcReqUserLoginField();
        userLoginField.setBrokerID("9999");
        userLoginField.setUserID("xpyl");
        userLoginField.setPassword("yaoling520");
        int iResult = mdApi.ReqUserLogin(Pointer.getPointer(userLoginField),0);
    }

    @Virtual(1)
    public void OnFrontDisconnected(int nReason) {
        System.out.println("OnFrontDisconnected");
        System.out.println(nReason);

    }

    @Virtual(2)
    public void OnRspUserLogin(Pointer<CThostFtdcRspUserLoginField> pRspUserLogin, Pointer<CThostFtdcRspInfoField> pRspInfo, int nRequestID, boolean bIsLast) {
        System.out.println("OnRspUserLogin");
        System.out.println("获取当前交易日"+this.mdApi.GetTradingDay());
        int result= this.mdApi.SubscribeMarketData(Pointer.pointerToCStrings("cu1205"),1);
        System.out.println(result == 0 ? "成功" : "失败");
        int res = this.mdApi.SubscribeForQuoteRsp(Pointer.pointerToCStrings("cu1206"),2);
        System.out.println(res == 0 ? "成功" : "失败");

    }


    @Virtual(3)
    public void OnRspError(Pointer<CThostFtdcRspInfoField> pRspInfo, int nRequestID, boolean bIsLast) {
        System.out.println("OnRspError");
    }

    @Virtual(4)
    public void OnRspSubMarketData(Pointer<CThostFtdcSpecificInstrumentField> pSpecificInstrument, Pointer<CThostFtdcRspInfoField> pRspInfo, int nRequestID, boolean bIsLast) {
        System.out.println("OnRspSubMarketData");
    }

    @Virtual(5)
    public void OnRspUnSubMarketData(Pointer<CThostFtdcSpecificInstrumentField> pSpecificInstrument, Pointer<CThostFtdcRspInfoField> pRspInfo, int nRequestID, boolean bIsLast) {
        System.out.println("OnRspUnSubMarketData");
    }

    @Virtual(6)
    public void OnRspSubForQuoteRsp(Pointer<CThostFtdcSpecificInstrumentField> pSpecificInstrument, Pointer<CThostFtdcRspInfoField> pRspInfo, int nRequestID, boolean bIsLast) {
        System.out.println("OnRspSubForQuoteRsp");
    }

    @Virtual(7)
    public void OnRspUnSubForQuoteRsp(Pointer<CThostFtdcSpecificInstrumentField> pSpecificInstrument, Pointer<CThostFtdcRspInfoField> pRspInfo, int nRequestID, boolean bIsLast) {
        System.out.println("OnRspUnSubForQuoteRsp");
    }

    @Virtual(8)
    public void OnRtnForQuoteRsp(Pointer<CThostFtdcForQuoteRspField> pForQuoteRsp) {
    }

}
