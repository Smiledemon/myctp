package com.xceder.demo;

import com.xceder.ctp.trade.*;
import org.bridj.Pointer;
import org.bridj.ann.Virtual;



/**
 * Copyright (c) 2011-2013, z16304607@163.com
 * Created with IntelliJ IDEA.
 * User: trade
 * Date: 13-5-16
 * Time: 下午10:25
 * To change this template use File | Settings | File Templates.
 */
public class TestTradeSpi extends CThostFtdcTraderSpi
{
    private String m_brokerID = "9999" ;        // 申万期货
    private String m_userID = "xpyl" ;
    //private String m_brokerID = "1019" ;
    //private String m_userID = "00000080" ;    // 中大期货
    //private String m_brokerID = "1002" ;
    //private String m_userID = "00000063" ;    // 上海中期
    private String m_password = "888888" ;
    private String m_testInstrumentID = "IF1612" ;
    private double m_testLimitPrice = 2569.40 ;
    private int m_frontID ;
    private int m_sessionID ;

    private CThostFtdcTraderApi m_api ;

    public TestTradeSpi( CThostFtdcTraderApi api )
    {
        this.m_api = api ;
    }

    /**
     * \ufffd\ufffd\ufffd\u037b\ufffd\ufffd\ufffd\ufffd\ubf7b\ufffd\u05fa\ufffd\u0328\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u0368\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u02b1\ufffd\ufffd\ufffd\ufffd\u03b4\ufffd\ufffd\u00bc\u01f0\ufffd\ufffd\ufffd\ufffd\ufffd\u00f7\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u00e1\ufffd<br>
     * Original signature : <code>void OnFrontConnected()</code><br>
     * <i>native declaration : ctpapi/linux/ThostFtdcTraderApi.h:22</i>
     */
    @Virtual(0)
    public void OnFrontConnected( )
    {
        System.out.println( "TestTradeSpi OnFrontConnected" );

        CThostFtdcReqUserLoginField login = new CThostFtdcReqUserLoginField( ) ;
        login.setBrokerID( this.m_brokerID ) ;
        login.setUserID( this.m_userID );
        login.setPassword( this.m_password );

        this.m_api.ReqUserLogin( Pointer.pointerTo( login ) , 1 ) ;
    }

    /**
     * 0x2003 \ufffd\u0575\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
     * Original signature : <code>void OnFrontDisconnected(int)</code><br>
     * <i>native declaration : ctpapi/linux/ThostFtdcTraderApi.h:31</i>
     */
    @Virtual(1)
    public void OnFrontDisconnected(int nReason)
    {
        System.out.println( "TestTradeSpi OnFrontDisconnected" );
    }

    /**
     * @param nTimeLapse \ufffd\ufffd\ufffd\ufffd\ufffd\u03f4\u03bd\ufffd\ufffd\u0571\ufffd\ufffd\u0135\ufffd\u02b1\ufffd\ufffd<br>
     * Original signature : <code>void OnHeartBeatWarning(int)</code><br>
     * <i>native declaration : ctpapi/linux/ThostFtdcTraderApi.h:35</i>
     */
    @Virtual(2)
    public void OnHeartBeatWarning(int nTimeLapse)
    {
        System.out.println( "TestTradeSpi OnHeartBeatWarning" );
    }

    /**
     * \ufffd\u037b\ufffd\ufffd\ufffd\ufffd\ufffd\u05a4\ufffd\ufffd\u04e6<br>
     * Original signature : <code>void OnRspAuthenticate(CThostFtdcRspAuthenticateField*, CThostFtdcRspInfoField*, int, bool)</code><br>
     * <i>native declaration : ctpapi/linux/ThostFtdcTraderApi.h:38</i>
     */
    @Virtual(3)
    public void OnRspAuthenticate(Pointer<CThostFtdcRspAuthenticateField> pRspAuthenticateField, Pointer<CThostFtdcRspInfoField> pRspInfo, int nRequestID, boolean bIsLast)
    {
        System.out.println( "TestTradeSpi OnRspAuthenticate" );
    }

    /**
     * \ufffd\ufffd\u00bc\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u04e6<br>
     * Original signature : <code>void OnRspUserLogin(CThostFtdcRspUserLoginField*, CThostFtdcRspInfoField*, int, bool)</code><br>
     * <i>native declaration : ctpapi/linux/ThostFtdcTraderApi.h:42</i>
     */
    @Virtual(4)
    public void OnRspUserLogin(Pointer<CThostFtdcRspUserLoginField> pRspUserLogin, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
        System.out.println("TestTradeSpi OnRspUserLogin");

        CThostFtdcRspInfoField rspInfo = pRspInfo.get();
        System.out.println("RspInfo.ErrorID = " + rspInfo.ErrorID() + " ErrorMsg = " + rspInfo.ErrorMsg().getCString());

        CThostFtdcRspUserLoginField rspLogin = pRspUserLogin.get();

        String msg = String.format("BrokerID = %s UserID = %s TradingDay = %s FrontID = %d SessionID = %d MaxOrderRef = %s",
                rspLogin.BrokerID().getCString(),
                rspLogin.UserID().getCString(),
                rspLogin.TradingDay().getCString(),
                rspLogin.FrontID(),
                rspLogin.SessionID(),
                rspLogin.MaxOrderRef().getCString()
        );

        System.out.println(msg);

        this.m_frontID = rspLogin.FrontID();
        this.m_sessionID = rspLogin.SessionID();

    }
}