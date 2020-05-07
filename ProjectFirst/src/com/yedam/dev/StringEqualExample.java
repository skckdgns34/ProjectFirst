package com.yedam.dev;

class Student{
	String name;
}

public class StringEqualExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Hello"; //new String("Hello")
		String str2 = "Hello";
		String str3 = new String("Hello");

		Student st1 = new Student();
		Student st2 = new Student();

		st1.name = "Hong";
		st2.name = "Park";
		
		System.out.println(st1); //주소값 나옴
		System.out.println(st2); //주소값 나옴
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		if(str1 == str3) {
			System.out.println("참조가 같음");
		} else {
			System.out.println("참조가 다름");
		}
	}

}