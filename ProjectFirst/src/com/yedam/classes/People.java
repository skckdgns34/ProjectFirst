package com.yedam.classes;

public class People {
	//속성(필드) 3가지
	int age;
	String name;
	double height;
	
	//기능(메소드) 2가지
	void maxBurger(int a) {
		System.out.println("햄최몇 :" + a);
	}
	void eatWater() {
		System.out.println("물 마신다");
	}
	void showInfo() {
		System.out.println("나이 :" + age + "  이름 :" + name + "  키 :" + height);
	}
}