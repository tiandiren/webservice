package com.example.demo.interceptor;

import javax.xml.namespace.QName;

import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.headers.Header;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class HeaderInInterceptor extends AbstractPhaseInterceptor<SoapMessage>{

	public HeaderInInterceptor() {
		super(Phase.PRE_PROTOCOL);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void handleMessage(SoapMessage message) throws Fault {
		// TODO Auto-generated method stub
		Header header = message.getHeader(new QName("RoutInfomation"));
		if(null != header){
			Element element = (Element) header.getObject();
			NodeList macs = element.getElementsByTagName("MAC");
		}
	}


	
}
