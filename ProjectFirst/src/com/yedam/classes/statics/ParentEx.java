package com.yedam.classes.statics;

import com.yedam.classes.inherit.Parent;

public class ParentEx {

	public static void main(String[] args) {
		Parent parent = new Parent("Hong", "kildong", "111-111");
//		parent.getLastName(); // default
//		parent.getFirstName();// protected
		parent.getTelNumber();// public
		
	}

}
