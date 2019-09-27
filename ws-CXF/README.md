# webservice

#### 介绍
使用cxf进行webservice开发

#### 请求SOAP报文

```
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:com="http://com.test.demo" xmlns:sig="http://com.test.demo/business/counter/SignService">
   <soapenv:Header>
      <com:RouteInformation>
         <com:Ip>?</com:Ip>
         <com:MAC>?</com:MAC>
         <com:Addr>?</com:Addr>
      </com:RouteInformation>
   </soapenv:Header>
   <soapenv:Body>
      <sig:getUser>
         <!--Optional:-->
         <sig:getUserData>
            <sig:userReq>
               <sig:name>?</sig:name>
               <sig:sex>?</sig:sex>
               <sig:addr>?</sig:addr>
               <sig:age>?</sig:age>
               <!--Zero or more repetitions:-->
               <sig:inUser>
                  <!--Optional:-->
                  <sig:inName>?</sig:inName>
               </sig:inUser>
               <sig:inUser>
                  <!--Optional:-->
                  <sig:inName>?</sig:inName>
               </sig:inUser>
            </sig:userReq>
            <sig:traceNo>?</sig:traceNo>
         </sig:getUserData>
      </sig:getUser>
   </soapenv:Body>
</soapenv:Envelope>
```

#### 返回SOAP报文

```
<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/" xmlns:com="http://com.test.demo" xmlns:sig="http://com.test.demo/business/counter/SignService">
   <soap:Header>
      <com:RouteInformation>
         <com:Ip>?</com:Ip>
         <com:MAC>?</com:MAC>
         <com:Addr>?</com:Addr>
      </com:RouteInformation>
   </soap:Header>
   <soap:Body>
      <sig:getUserResponse>
         <sig:UserReqData>
            <sig:userRes>
               <sig:resName>12</sig:resName>
               <sig:resSex>ok</sig:resSex>
               <sig:resAge>11</sig:resAge>
            </sig:userRes>
            <sig:ResponseType>N</sig:ResponseType>
            <sig:ResponseCode>00000</sig:ResponseCode>
         </sig:UserReqData>
      </sig:getUserResponse>
   </soap:Body>
</soap:Envelope>
```

#### 说明

上述soap消息包含SOAP包络<Envelope>、SOAP头<Header>、SOAP主体<Body>。并且SOAP头和SOAP主体使用不同的命名空间。

#### 参与贡献

1. Fork 本仓库
2. 新建 Feat_xxx 分支
3. 提交代码
4. 新建 Pull Request

