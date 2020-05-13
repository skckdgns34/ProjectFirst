package com.yedam.classes.inherit;

public class College extends Friend{
	public String major;
	public College(String name, int tel,String major) {
		super(name, tel);
		this.major = major;
	}
	
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public void showInfo(String name, int tel) {
		// TODO Auto-generated method stub
		System.out.println("이름: " + name + ", 전화번호: " + tel + ", 전공: " + major);
	}
}
