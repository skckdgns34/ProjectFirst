package com.yedam.api.string;

public class StringSubstringExample {
	public static void main(String[] args) {
		String ssn = "880815-1234567";
		
		//0이상 6미만
		String firstNum = ssn.substring(0,6);
		System.out.println(firstNum);
		
		
		String secondNum = ssn.substring(6);
		System.out.println(secondNum);
	}
}
