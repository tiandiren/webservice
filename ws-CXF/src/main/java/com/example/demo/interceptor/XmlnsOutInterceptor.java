package com.example.demo.interceptor;

import java.util.HashMap;
import java.util.Map;

import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;

import com.example.demo.constant.WSConstants;

public class XmlnsOutInterceptor extends AbstractPhaseInterceptor<Message> {
 
    public XmlnsOutInterceptor() {
        super(Phase.PREPARE_SEND);
    }
 
	public void handleMessage(Message message) throws Fault {
        try {
            //需要放置在根节点的命名空间
            Map<String, String> envMap = new HashMap<>();
            envMap.put("com", WSConstants.WS_HEADER_NS);
            envMap.put("sig", WSConstants.WS_SERVICE_NS);
			
            message.put("soap.env.ns.map", envMap);
            message.put("disable.outputstream.optimization", true);
            
        } catch (Exception e) {
        }
    }
}
