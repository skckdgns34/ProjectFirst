package com.yedam.generic;

public class Person {
	private String name;
	
	Person(String name){
		this.name = name;
	}
	String getName() {
		return this.name;
	}
	@Override
	public String toString() {
		return "Person" + this.getName();
	}
	
}
