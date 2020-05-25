package com.yedam.generic;

public class Worker extends Person{
	Worker(String name){
		super(name);
	}

	@Override
	public String toString() {
		return "Worker" + this.getName();
	}
	
}
