package com.yedam.morning;

public class Code20200515 {

	public static void main(String[] args) {
	
//		int[][] arr = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
		int[][] arr = new int[5][5];
		int a = 1;
		for(int i = 0; i < 5; i++) {
			for(int j = 1; j <= 5; j++) {
				System.out.print((5*i+j) + "\t");
			}
			System.out.println();
		}
		System.out.println("====================================");
		for(int i = 1; i <= 5; i++) {
			for(int j = 0; j < 5; j++) {
		//		System.out.println(i + " " + j);
				System.out.print((i+5*j) + "\t");
			}
			System.out.println();

		}
		System.out.println("====================================");

		a=1;
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				arr[i][j]=a++;
				System.out.print(arr[i][j] + "\t");
			}
			
			System.out.println();
		}
		System.out.println("====================================");
		
//		a=1;
//		for(int i = 0; i<arr.length; i++) {
//			for(int j = 0; j<arr[i].length; j++) {
//				arr[j][i]=a++;
//				System.out.print(arr[i][j] + "\t");
//				
//			}
//			System.out.println();
//		}
		
		
		
	}// end of main
}// end of class
