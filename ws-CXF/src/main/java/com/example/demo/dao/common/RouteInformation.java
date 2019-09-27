package com.example.demo.dao.common;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import javax.xml.bind.annotation.XmlAccessType;

@XmlRootElement(name="RouteInformation")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ip",
    "mac",
    "addr"
})
public class RouteInformation {

	@XmlElement(name = "Ip",required = true)
    protected String ip;
    @XmlElement(name = "MAC", required = true)
    protected String mac;
    @XmlElement(name = "Addr", required = true)
    protected String addr;
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getMac() {
		return mac;
	}
	public void setMac(String mac) {
		this.mac = mac;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
    

}
