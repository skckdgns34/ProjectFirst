package com.yedam.chpater.chapter3;

public class Exercise08 {
	public static void main(String[] args) {
		double x = 5.0;
		double y = 1.0;
		
		double z = x%y;
		
		if(y==0.0) {
			System.out.println("0.0으로 나눌수 없음");
		}else {
			double result = z+10;
			System.out.println(result);
		}
	}
}
