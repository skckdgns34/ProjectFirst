package com.yedam.classes.abstract_class;

public abstract class Animal {
	String kind;
	public Animal(String kind) {
		this.kind = kind;
	}
	
	public void breathe() {
		System.out.println("숨을 쉰다.");
	}
	public abstract void sound();//추상메소드
	
}
