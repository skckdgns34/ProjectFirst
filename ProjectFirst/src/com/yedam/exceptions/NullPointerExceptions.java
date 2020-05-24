package com.yedam.exceptions;

public class NullPointerExceptions {
	public static void main(String[] args) {
		String str = "Hello";
		try {
			System.out.println(str.toString());
			Class.forName("java.lang.String");			
		} catch (Exception e) {
			System.out.println("알수 없는 예외 발생");
		}
			
//			catch (NullPointerException e) {
//			System.out.println("실행중 오류");
//		}catch (Exception e) {
//			System.out.println("존재하지 않는 클래스입니다");
//			e.printStackTrace();
		System.out.println("프로그램 종료");
	}
}
