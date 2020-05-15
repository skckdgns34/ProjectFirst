package com.yedam.classes.inherit;

import java.util.Scanner;

public class Friend {
	public String name;
	public int tel;
	Friend[] friends = new Friend[100];
	Scanner scn = new Scanner(System.in);
	
	public Friend(String name, int tel) {
		this.name = name;
		this.tel = tel;
	}
//	public Friend choice() {
//		System.out.println("대학 선택.");
//		System.out.println("이름 입력하세요.");
//		String name = scn.nextLine();
//		System.out.println("전화번호 입력하세요.");
//		int number = scn.nextInt();
//		scn.nextLine();
//		Friend fri = new Friend(name, number);
//		for (int i = 0; i < friends.length; i++) {
//			if (friends[i] == null) {
//				friends[i] = fri;
//				break;
//			}
//		}
//		return fri;
//	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTel() {
		return tel;
	}

	public void setTel(int tel) {
		this.tel = tel;
	}
	public void showInfo(String name, int tel) {
		System.out.println("이름: " + name + ", 전화번호: " + tel);
	
	}
	
	
}
