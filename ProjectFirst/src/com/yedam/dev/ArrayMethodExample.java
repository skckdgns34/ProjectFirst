package com.yedam.dev;

public class ArrayMethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = 0;
		int[] intAry =  {1,2,3,4,5};
		
		double result2 = 0;
		double[] dobAry = {1.1,2.2,3.3,4.4};
		
		result = sumAry(intAry);
		System.out.println("배열 intAry 합: " + result);
		
		result2 = avgAry(dobAry);
		System.out.println("평균 : " + result2);

	}
	
	public static double avgAry(double[] ary) {
		double sum = 0;
		for(int i=0; i<ary.length; i++) {
			sum += ary[i];
		}
		System.out.println("합한 값 : " + sum);
		return sum/ary.length;
	}
	
	public static int sumAry(int[] ary) {
		int sum = 0;
		for(int i=0; i<ary.length; i++) {
			sum += ary[i];
		}
		return sum;
	}
}