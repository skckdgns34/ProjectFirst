package com.yedam.classes;

public class StudentExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu = new Student();
		stu.name = "Hong";
		stu.age = 20;
		stu.height = 178.4;
		stu.weight = 70.5;
		//stu.study();		
		//System.out.println("이름 : " + stu.name + " 나이 : " + stu.age);
		//stu.eat("banana");
		
		Student stu1 = new Student();
		stu1.name = "Park";
		stu1.age = 30;
		stu1.height = 178.4;
		stu1.weight = 70.5;
		//System.out.println("이름 :" + stu1.name + " 나이 :" + stu1.age);
		//stu1.eat("사과");
		
		Student stu2 = new Student("Choi");
		stu2.age = 40;
		stu2.height = 168.4;
		stu2.weight = 60.5;
		//System.out.println("이름 :" + stu2.name + " 나이 :" + stu2.age);
		//stu2.eat("수박");
		
		People peo = new People();
		peo.age = 5;
		peo.name = "Kim";
		peo.height = 213.5;
		//peo.eatWater();
		//peo.maxBurger(15);
		//peo.showInfo();
		
		Student[] s1 = new Student[3];
		s1[0] = stu;
		s1[1] = stu1;
		s1[2] = stu2;
		
		String inputStr = "Choi";
		for(Student stud : s1) {
			if(inputStr.equals(stud.name)) {
				System.out.println(stud.name + " / " + stud.age);
			}
		}
		
	} //main
} //class
