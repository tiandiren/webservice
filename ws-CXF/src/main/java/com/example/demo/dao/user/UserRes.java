package com.example.demo.dao.user;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="UserRes")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "resName",
    "resSex",
    "resAge"
})
public class UserRes {
	@XmlElement(name = "resName",required = true)
	protected String resName;
	@XmlElement(name = "resSex",required = true)
	protected String resSex;
	@XmlElement(name = "resAge",required = true)
	protected int resAge;
	
	public String getResName() {
		return resName;
	}
	public void setResName(String resName) {
		this.resName = resName;
	}
	public String getResSex() {
		return resSex;
	}
	public void setResSex(String resSex) {
		this.resSex = resSex;
	}
	public int getResAge() {
		return resAge;
	}
	public void setResAge(int resAge) {
		this.resAge = resAge;
	}
}
