package com.example.demo.dao.user;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="UserReq")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "name",
    "sex",
    "addr",
    "age",
    "inUser"
})
public class UserReq {

	@XmlElement(name = "name", required = true)
	protected String name;
	@XmlElement(name = "sex", required = true)
	protected String sex;
	@XmlElement(name = "addr", required = true)
	protected String addr;
	@XmlElement(name = "age", required = true)
	protected int age;
	private List<InUserReq> inUser;
	
	public List<InUserReq> getInUser() {
		return inUser;
	}
	public void setInUser(List<InUserReq> inUser) {
		this.inUser = inUser;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "inName"
})
class InUserReq{
	private String inName;

	public String getInName() {
		return inName;
	}

	public void setInName(String inName) {
		this.inName = inName;
	}
}