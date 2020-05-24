package com.yedam.lambda;

//class MyFuncClass implements MyFunctionalInterface{
//	@Override
//	public void run() {
//		System.out.println("실행.");
//	}
//}

public class LambdaExample {
	public static void main(String[] args) {
		// 1) 매개값이 없는 인터페이스
		MyFunctionalInterface fi = new MyFunctionalInterface() {
			//익명 구현 객체
			@Override
			public void run() {		
				System.out.println("실행.");
			}
		};
		fi.run();
		// 간단한 람다표현식.  ==> run() 메소드를 구현하는 부분만 있으면 됌.
		MyFunctionalInterface fi2 = () -> System.out.println("실행.");
		//실행구문이 하나면 이렇게도 가능(원래는 중괄호 묶어주기
		fi2.run();
		
		// 2) 매개값이 있는 인터페이스.
		MySumInterface si = (num1, num2) -> {
				int result = num1 + num2;
				System.out.println("두수의 합: " + result);
		};
		si.sum(10, 20);
		
		// 3) 반환값이 있고 매개값이 있는 인터페이스
		MyMultiInterface mi = (num1,num2) -> {
				return num1 * num2;
		};
		int result = mi.multi(10, 15);
		System.out.println("결과값은: " + result);
	}// end of main
} // end of class
