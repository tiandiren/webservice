package com.example.demo.dao.user;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="UserResData")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "userRes",
    "ResponseType",
    "ResponseMsg",
    "ResponseCode"
})
public class UserResData{
	@XmlElement(name = "userRes", required = true)
	protected UserRes userRes;
	@XmlElement(name = "ResponseType", required = true)
	protected String ResponseType;
	@XmlElement(name = "ResponseMsg", required = true)
	protected String ResponseMsg;
	@XmlElement(name = "ResponseCode", required = true)
	protected String ResponseCode;

	public UserRes getUserRes() {
		return userRes;
	}

	public void setUserRes(UserRes userRes) {
		this.userRes = userRes;
	}

	public String getResponseType() {
		return ResponseType;
	}

	public void setResponseType(String responseType) {
		ResponseType = responseType;
	}

	public String getResponseMsg() {
		return ResponseMsg;
	}

	public void setResponseMsg(String responseMsg) {
		ResponseMsg = responseMsg;
	}

	public String getResponseCode() {
		return ResponseCode;
	}

	public void setResponseCode(String responseCode) {
		ResponseCode = responseCode;
	}

}
