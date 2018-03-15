package com.xceder.demo;

import com.xceder.ctp.market.*;
import org.bridj.Pointer;
import org.bridj.ann.Virtual;

import static org.bridj.Pointer.getPointer;

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
    String[] array ={"cu1309"};
    public MdSpi(CThostFtdcMdApi mdApi) {
        this.mdApi = mdApi;
    }

    @Override
    public void OnFrontConnected() {
        System.out.println("OnFrontConnected");
        CThostFtdcReqUserLoginField userLoginField = new CThostFtdcReqUserLoginField();
        userLoginField.setBrokerID("9999");
        userLoginField.setUserID("113705");
        userLoginField.setPassword("666666");
        System.out.println(userLoginField.BrokerID());
        this.mdApi.ReqUserLogin(getPointer(userLoginField),iRequestID++);
    }

    @Override
    public void OnFrontDisconnected(int nReason) {
        System.out.println("OnFrontDisconnected");
        System.out.println(nReason);

    }

    @Override
    public void OnRspUserLogin(Pointer<CThostFtdcRspUserLoginField> pRsplsUserLogin, Pointer<CThostFtdcRspInfoField> pRspInfo, int nRequestID, boolean bIsLast) {
        System.out.println("OnRspUserLogin");
        System.out.println("获取当前交易日"+this.mdApi.GetTradingDay());

        int result= mdApi.SubscribeMarketData(Pointer.pointerToCStrings(array),1);
        System.out.println(result == 0 ? "成功" : "失败");

    }

    @Override
    public void OnRtnDepthMarketData(Pointer<CThostFtdcDepthMarketDataField> pDepthMarketData) {
        CThostFtdcDepthMarketDataField data = pDepthMarketData.get();
        System.out.println("OnRtnDepthMarketData : " + this.ToString_CThostFtdcDepthMarketDataField( data ));
    }


    private String ToString_CThostFtdcDepthMarketDataField( CThostFtdcDepthMarketDataField data )
    {
        return String.format( "%s %s.%03d %f %d %f %d %f %d" ,
                data.InstrumentID().getCString( )  ,
                data.UpdateTime().getCString( ) ,
                data.UpdateMillisec( ) ,
                data.LastPrice( ) ,
                data.Volume( ) ,
                data.AskPrice1( ) ,
                data.AskVolume1( ) ,
                data.BidPrice1( ) ,
                data.BidVolume1( )
        ) ;
    }
}
