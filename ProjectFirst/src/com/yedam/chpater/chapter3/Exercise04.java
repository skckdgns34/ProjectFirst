package com.yedam.chpater.chapter3;

public class Exercise04 {
	public static void main(String[] args) {
		int pencils = 534;
		int students = 30;
		
		//학생 한 명이 가지는 연필 수
		int pencilsperStudent = pencils/students;
		System.out.println(pencilsperStudent);
		
		//남은 연필 수
		int pencilsLeft = pencils%students;
		System.out.println(pencilsLeft);
	}
}
