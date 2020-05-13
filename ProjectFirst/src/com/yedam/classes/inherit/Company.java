package com.yedam.classes.inherit;

public class Company extends Friend{
	public String department;
	
	public Company(String name, int tel, String department) {
		super(name, tel);
		this.department = department;
		// TODO Auto-generated constructor stub
	}

	
	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	@Override
	public void showInfo(String name, int tel) {
		
		System.out.println("이름: " + name + ", 전화번호: " + tel + ", 부서: " + department);
	}
	
}
