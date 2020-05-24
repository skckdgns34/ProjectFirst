package com.yedam.nestedClasses;

//외부 클래스
class A {
	A(){
		System.out.println("A객체가 생성됨.");
	}
	// 인스턴스 멤버 클래스
	class B{
		B(){
			System.out.println("B객체가 생성됨");
		}
		int field1;
//		static int field2;  정적 필드는 못옴
		void method1() {
			System.out.println("method1() 호출됨.");
		}
//		static void method2() { 		정적 메소드도 몬옴
//			System.out.println("method2() 호출됨.");
		
//		}
		C field5 = new C();
	}
	
	//정적 멤버 클래스 
	static class C{
		C(){
			System.out.println("C객체가 생성됨.");
		}
		int field1;
		static int field2;  //정적 필드 가능
		void method1() {
			System.out.println("method1() 호출됨");
		}
		static void method2() {  //정적 메소드 가능
			System.out.println("method2() 호출됨");
		}
	
	}
	
	//로컬 클래스 (메소드 안에꺼)
	void method() {
		class D{
			D(){
				System.out.println("D객체가 생성됨.");
			}
			B b = new B();
			int field1;
			void method1() {
				System.out.println("method1() 호출됨");
				C.method2();
			}
		}
		D d = new D();
		d.field1 = 10;
		d.method1();
	}
}
public class Main {
	public static void a() {
		
	}
	public static void main(String[] args) {
		
		a();
		A a = new A();
		A.B b = a.new B();
		
		b.field1 = 5;
		b.method1();
		
		A.C c = new A.C();
		//정적 멤버 클래스의 인스턴스 필드/메소드
		c.field1 = 10;
		c.method1();
		
		//정적 멤버 클래스의 정적 필드/메소드
		A.C.field2 = 10;
		A.C.method2();
		
		
		a.method();
	
	}
}
