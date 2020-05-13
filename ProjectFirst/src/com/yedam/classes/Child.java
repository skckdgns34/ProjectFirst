package com.yedam.classes;

import com.yedam.classes.inherit.Parent;

public class Child extends Parent{
	
	Child(){
		super();  //default가 private으로 되어있어서 그럼
	}
	Child(String lastName, String firstName, String telNumber){
		super(lastName, firstName, telNumber);
	}
	//protected 구분.
	void showInfo() {
		Child child = new Child();
//		child.getLastName(); //default라서 접근불가
		child.getFirstName(); //protected
		child.getTelNumber();
	}
}
	
