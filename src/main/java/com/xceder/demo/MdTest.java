package com.xceder.demo;

import com.xceder.ctp.market.CThostFtdcMdApi;
import com.xceder.ctp.market.CThostFtdcMdSpi;
import org.bridj.BridJ;
import org.bridj.Pointer;

import static org.bridj.Pointer.getPointer;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: xiaopan
 * Date: 2018-03-09
 * Time: 下午4:00
 */
public class MdTest {
    public static void main(String[] args) {

        BridJ.register(CThostFtdcMdApi.class);
        BridJ.register(CThostFtdcMdSpi.class);
        CThostFtdcMdApi mdApi = CThostFtdcMdApi.CreateFtdcMdApi(Pointer.pointerToCString("./"),false,false).get();
        CThostFtdcMdSpi mdSpi = new MdSpi(mdApi);
        mdApi.RegisterSpi(getPointer(mdSpi));
        mdApi.RegisterFront(Pointer.pointerToCString("tcp://180.168.146.187:10031"));
        mdApi.Init();
        mdApi.Join();
    }
}
