package com.cjc.bms.model; 
import java.util.*;

public class Amount {
private long accNo;
private String name;
private long mobNo;
private long aadharNo;
private String gender;
private byte age;
private double balnce;
public long getAccNo() {
	return accNo;
}
public void setAccNo(long accNo) {
	this.accNo = accNo;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public long getMobNo() {
	return mobNo;
}
public void setMobNo(long mobNo) {
	this.mobNo = mobNo;
}
public long getAadharNo() {
	return aadharNo;
}
public void setAadharNo(long aadharNo) {
	this.aadharNo = aadharNo;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public byte getAge() {
	return age;
}
public void setAge(byte age) {
	this.age = age;
}
public double getBalnce() {
	return balnce;
}
public void setBalnce(double balnce) {
	this.balnce = balnce;
}
}