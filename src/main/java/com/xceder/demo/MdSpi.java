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
    int iRequestID=0;
    String[] array ={"IF1612"};
    public MdSpi(CThostFtdcMdApi mdApi) {
        this.mdApi = mdApi;
    }

    @Override
    public void OnFrontConnected() {
        System.out.println("OnFrontConnected");
        CThostFtdcReqUserLoginField userLoginField = new CThostFtdcReqUserLoginField();
        userLoginField.setBrokerID("9999");
        userLoginField.setUserID("xpyl");
        userLoginField.setPassword("yaoling520");
        System.out.println(userLoginField.BrokerID());
        this.mdApi.ReqUserLogin(Pointer.pointerTo(userLoginField),iRequestID++);
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

        int result= mdApi.SubscribeMarketData(Pointer.pointerToArray(array),1);
        System.out.println(result == 0 ? "成功" : "失败");

    }

}
