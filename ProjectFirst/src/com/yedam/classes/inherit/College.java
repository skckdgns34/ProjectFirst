package com.yedam.classes.inherit;

public class College extends Friend{
	public String major;
	public College(String name, int tel,String major) {
		super(name, tel);
		this.major = major;
	}
	
//	@Override
//	public Friend choice() {
//		System.out.println("대학 선택.");
//		System.out.println("이름 입력하세요.");
//		String name = scn.nextLine();
//		System.out.println("전화번호 입력하세요.");
//		int number = scn.nextInt();
//		scn.nextLine();
//		System.out.println("전공 입력하세요.");
//		String major = scn.nextLine();
//		Friend fri = new College(name, number, major);
//		for (int i = 0; i < friends.length; i++) {
//			if (friends[i] == null) {
//				friends[i] = fri;
//				break;
//			}
//		Company fri = (Company)super.choice();
//		if(fri != null){
//			System.out.println("전공 입력하세요.");
//			String depart = scn.nextLine();
//			fri.setDepartment(depart);
//		}
//		return null;
//	}

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
