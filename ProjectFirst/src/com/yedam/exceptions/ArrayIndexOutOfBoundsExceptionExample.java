package com.yedam.exceptions;

public class ArrayIndexOutOfBoundsExceptionExample {
	public static void main(String[] args) {
		int[] intAry = new int[5];
		
		for(int i = 0; i<=intAry.length; i++) {
			try {
				int num1 = Integer.parseInt(args[0]); //문자열을 숫자타입으로 바꿔주는거
				intAry[i] = i+1;
				System.out.println(intAry[i]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("배열범위 초과");
			} catch (NumberFormatException e1) {
				System.out.println("변환 불가.");
			} catch (Exception e2) {
				System.out.println("알수 없는 오류");
			}
		}
		System.out.println("end of program.");
	} // end of main
} // end of class
