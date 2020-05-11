package com.yedam.classes;

public class CalExample {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		cal.powerOn();
		int result1 = cal.sum(10, 50);
		double result2 = cal.sum(10.1, 50.3);
		cal.println("30");
		cal.println(result1);
		cal.println(result2);
		
		double area1 = cal.getAreaRectangle(4.6, 5.5);
		cal.println("직사각형의 넓이: " + area1); // 요렇게 같이쓰면 하나의 문자열로 인식함
		
		double area2 = cal.getAreaRectangle(5.5);
		cal.println(area2);
		cal.getAreaRectangle(area1, area2);
	}
}
