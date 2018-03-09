#!/usr/bin/env bash
output=../src/main/java
rm -rf ${output}/com/xceder/api

java -jar jnaerator-0.12-SNAPSHOT-20130323-2.jar -library Thostmduserapi -package com.xceder.ctp.market -o ../src/main/java/ ./ThostFtdcMdApi.h ./thostmduserapi.so -mode Directory -runtime BridJ 

java -jar jnaerator-0.12-SNAPSHOT-20130323-2.jar -library Thosttraderapi -package com.xceder.ctp.trade -o ../src/main/java/ ./ThostFtdcTraderApi.h ./thosttraderapi.so -mode Directory -runtime BridJ

