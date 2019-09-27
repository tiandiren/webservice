package com.example.demo.ws.impl;

import java.io.IOException;

import javax.jws.WebService;
import javax.xml.ws.Holder;

import org.apache.cxf.interceptor.InInterceptors;
import org.apache.cxf.interceptor.OutInterceptors;

import com.example.demo.constant.WSConstants;
import com.example.demo.dao.common.RouteInformation;
import com.example.demo.dao.user.UserReqData;
import com.example.demo.dao.user.UserRes;
import com.example.demo.dao.user.UserResData;
import com.example.demo.ws.AppService;

//name暴露的服务名称, targetNamespace:命名空间,设置为接口的包名倒写(默认是本类包名倒写). endpointInterface接口地址
@WebService(name = "SignService",
serviceName = "SignService",
portName= "AppServiceImpl",
targetNamespace = WSConstants.WS_SERVICE_NS, 
endpointInterface = "com.example.demo.ws.AppService")
@InInterceptors(interceptors={"com.example.demo.interceptor.HeaderInInterceptor"})
@OutInterceptors(interceptors={"com.example.demo.interceptor.XmlnsOutInterceptor"})
public class AppServiceImpl implements AppService {
	@Override 
	  public UserResData getUser(Holder<RouteInformation> info,UserReqData userreq) throws IOException  {
	      System.out.println("==========================="+userreq.getTraceNo());
	      UserResData userres = new UserResData();
	      userres.setResponseCode("00000");
	      userres.setResponseType("N");
	      UserRes res= new UserRes();
	      res.setResAge(11);
	      res.setResName("12");
	      res.setResSex("ok");
	      userres.setUserRes(res);
	      return userres;
	  }

}
