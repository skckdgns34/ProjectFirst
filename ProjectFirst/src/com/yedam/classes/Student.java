package com.yedam.classes;

public class Student {
	//생성자 --> 필드의 초기값 지정
	public Student(){
	}
	public Student(String name){
		this.name = name;
	}
	public Student(String name, int age){
		this.name = name;
		this.age = age;
	}
	public Student(String name, int age, String major){
		this(name,age); //생성자도 this로 구분 가능
		//this(name); 한번에 하나씩
 		this.name = name;
		this.age = age;
		this.major = major;
	}
	
	//속성(필드) : 이름,나이,키,몸무게,
	String name;
	int age;
	double height;
	double weight;
	String major;
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
