package com.yedam.generic;

import java.util.Arrays;

// <T>
// <?>, <? extends class> : 하위만 오도록 하는거, <? super class> 상위만 오게 하는거
// Person -> Worker
//		  -> Student -> HighStudent
// Course<T>

public class WildCardExample {
	public static void registerCourse(Course<?> course) {
		// Course<Person>, Course<Worker>, Couse<Student>, Course<HighStudent>
		System.out.println(course.getName() + " 수강생:" + Arrays.toString(course.getStudents()));
	}
	
	public static void registerStudent(Course<? extends Student> course) { //student 이하만 오는거
		System.out.println(course.getName() + " 수강생:" + Arrays.toString(course.getStudents()));
	}
	public static void registerWorker(Course<? super Worker> course) { //worker가 가장 하위 worker 이상만 오는거
		System.out.println(course.getName() + " 수강생:" + Arrays.toString(course.getStudents()));

	}
	public static void main(String[] args) {
		Course<Person> coursePerson = new Course<Person>("일반인 과정", 5);
		coursePerson.add(new Person("일반인"));
		coursePerson.add(new Worker("직장인"));
		coursePerson.add(new Student("학생"));
		coursePerson.add(new HighStudent("고등학생"));

		Course<Worker> courseWorker = new Course<Worker>("직장인 과정", 5);
		courseWorker.add(new Worker("직장인"));
		
		Course<Student> courseStudent = new Course<Student>("학생 과정", 5);
		courseStudent.add(new Student("학생"));
		courseStudent.add(new HighStudent("고등 학생"));

		Course<HighStudent> courseHighStudent = new Course<HighStudent>("고등학생 과정", 5);
		courseStudent.add(new HighStudent("고등 학생"));

		// Course<?>
		registerCourse(coursePerson);
		registerCourse(courseWorker);
		registerCourse(courseStudent);
		registerCourse(courseHighStudent);

		//Course<? extends class>
		registerStudent(courseStudent);
		registerStudent(courseHighStudent);
		
		//Course<? super class>
		registerWorker(courseWorker);
		registerWorker(coursePerson);
	}
}
