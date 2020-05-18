package com.yedam.morning;

public class Code20200518 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intAry = {10,8,5,3,7,1};
		int temp = 0;
		
		for(int i = 0; i<intAry.length; i++) {
			for(int j = 0; j<intAry.length; j++) {
				if(intAry[i] < intAry[j]) {
					temp = intAry[i];
					intAry[i]=intAry[j];
					intAry[j]=temp;
				}
			}
		}
		
		for(int i : intAry) {
			System.out.print(i + "\t");
		}
		
	}
}
