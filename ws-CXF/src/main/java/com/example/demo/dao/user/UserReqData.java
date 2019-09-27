package com.example.demo.dao.user;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="UserReqData")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "userReq",
    "traceNo"
})
public class UserReqData {

	@XmlElement(name = "traceNo",required = true)
	protected String traceNo;
	@XmlElement(name = "userReq",required = true)
	private UserReq userReq;
	
	public UserReq getUserReq() {
		return userReq;
	}
	public void setUserReq(UserReq userReq) {
		this.userReq = userReq;
	}
	public String getTraceNo() {
		return traceNo;
	}
	public void setTraceNo(String traceNo) {
		this.traceNo = traceNo;
	}
}
