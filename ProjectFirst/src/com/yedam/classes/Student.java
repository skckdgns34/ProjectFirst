package com.yedam.classes;

public class Student {
	//생성자 --> 필드의 초기값 지정
	Student(){
	}
	Student(String name){
		this.name = name;
	}
	
	//속성(필드) : 이름,나이,키,몸무게,
	String name;
	int age;
	double height;
	double weight;
	
	//기능(메소드) : 공부,운동,밥
	void study() {
		System.out.println("공부합.");
	}
	void exercise() {
		System.out.println("운동한다");
	}
	void eat(String str) {
		System.out.println(str + "을 먹는다");
	}
}
