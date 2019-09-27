package com.example.demo.ws;

import java.io.IOException;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.Holder;
import javax.jws.WebParam.Mode;

import com.example.demo.constant.WSConstants;
import com.example.demo.dao.common.RouteInformation;
import com.example.demo.dao.user.UserReqData;
import com.example.demo.dao.user.UserResData;

@WebService(name = "SignService",
targetNamespace = WSConstants.WS_SERVICE_NS)
public interface AppService {
    @WebMethod
    @WebResult(name = "UserReqData",targetNamespace = WSConstants.WS_SERVICE_NS) 
    public UserResData getUser(@WebParam(header=true,name="RouteInformation",targetNamespace= WSConstants.WS_HEADER_NS,mode=Mode.INOUT)
    Holder<RouteInformation> info, @WebParam(name="getUserData",targetNamespace = WSConstants.WS_SERVICE_NS) UserReqData userReq) throws IOException;
}