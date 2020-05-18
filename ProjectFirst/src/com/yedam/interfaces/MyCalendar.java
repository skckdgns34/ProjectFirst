package com.yedam.interfaces;

import java.util.Calendar;

public class MyCalendar {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance(); //오늘 날짜 현재 시간 기준
//		System.out.println(cal);
//		cal.set(2019, 3, 8);
//		System.out.println("년도: " + cal.get(Calendar.YEAR));
//		System.out.println("월: " + cal.get(Calendar.MONTH));
//		System.out.println("일: " + cal.get(Calendar.DAY_OF_MONTH));
//		System.out.println("요일: " + cal.get(Calendar.DAY_OF_WEEK));
//		System.out.println("=====================");
//		
	
		showcal(2020,9);
	}
	public static void showcal(int year, int month) {
		//year, month 달력 출력.
		int today = 1;
		int lastDay = getLastDay(year,month);
		int dayOfWeek = getDayOfWeek(year, month);
		
		System.out.println("         ["+year+"년"+month+"월]");
		String[] week = {"Sun","Mon","Tue","Wed","Thr","Fri","Sat"};
		
		for(int i = 0; i<week.length; i++) {
			System.out.print(" "+week[i]);
		}
		System.out.println();
	
		for(int i=1; i<dayOfWeek; i++) {
			System.out.printf("%4s", "");
		}
		
		for (int i = 0; i<lastDay; i++) {
			System.out.printf("%4d", today);
			if((dayOfWeek+today-1) % 7 == 0)
				System.out.println();
			today++;
		}
		System.out.println();
		System.out.println("프로그램 종료");
	}
	
	public static int getDayOfWeek(int year, int month) {
		int dayOfWeek = 0;
		Calendar cal = Calendar.getInstance(); 
		cal.set(year, month-1, 1);
		dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		
		return dayOfWeek;
	}
	
	
	//1,3,5,7,8,10,12
	//4,6,9,11
	//2
	public static int getLastDay(int year, int month) {
		//윤년 규칙 : 년도가 4로 나누어지면서 100으로는 안나누어지는 해, 400으로 나누어지는 해

		int lastDay = 0;
		if((month <= 7 && month%2 == 1) || (month >= 8 && month % 2 == 0) ) {
			lastDay = 31;
		}else if(month==2){
			if((year%4==0 && year%100!=0) || (year%400==0)) {
				lastDay = 29;
			}else
				lastDay = 28;
		}else
			lastDay = 30;
		return lastDay;
	}
}
