package com.yedam.classes;

public class Calculator {
	
	String model;
	
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	int sum(int num1, int num2) {
		return num1 + num2;
	}
	double sum(double num1, double num2) {
		return num1 + num2;
	}
	void println(String str) {
		System.out.println("결과값: " + str);
	}
	void println(int str) {
		System.out.println("결과값: " + str);
	}
	void println(double str) {
		System.out.println("결과값: " + str);
	}
	double getAreaRectangle(double width, double height) {
		return width * height;
	}
	double getAreaRectangle(double width) {
		return width * width;
	}
	
}
