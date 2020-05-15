package com.yedam.classes.inherit;

public class Company extends Friend{
	public String department;
	
	public Company(String name, int tel, String department) {
		super(name, tel);
		this.department = department;
		// TODO Auto-generated constructor stub
	}

	
//	@Override
//	public Friend choice() {
//
//		Company fri = (Company)super.choice();
//		if(fri != null){
//			System.out.println("전공 입력하세요.");
//			String depart = scn.nextLine();
//			fri.setDepartment(depart);
//		}
//		return null;
//	}


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
