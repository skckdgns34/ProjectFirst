package com.yedam.morning;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {

		// 마지막문제
		int[][] arr ={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
		
		for (int i = 0; i < arr.length; i++) {
			for(int j =0; j<arr.length; j++) {
				System.out.print(arr[j][i] + " ");
			}
			System.out.println();
		}

		// 입력받는거.
//		Scanner scn = new Scanner(System.in);
//
//		while (true) {
//			System.out.print("점수입력: ");
//			int a = scn.nextInt();
//			if (a < 0 || a > 100) {
//				System.out.println("입력오류!!");
//
//			} else {
//				System.out.println("입력한 값: " + a);
//				break;
//			}
//		}
//		scn.close();

		// 김철수
//		Scanner scn = new Scanner(System.in);
//		System.out.print("이름 입력: ");
//		String name = scn.nextLine();
//		System.out.print("kor: ");
//		int kor = scn.nextInt();
//		
//		System.out.print("eng: ");
//		int eng = scn.nextInt();
//		
//		System.out.print("mat: ");
//		int mat = scn.nextInt();
//		
//		int sum = kor+eng+mat;
//		double avg = sum/3;
//		System.out.println("이름: " + name);
//		System.out.println("합계점수: " + sum);
//		System.out.println("평균점수: " + avg);

//		Scanner scn = new Scanner(System.in);
//		while(true) {
//			System.out.println("메뉴선택 1,2,3");
//			System.out.print("선택>");
//			int selectNo = scn.nextInt();
//			if(selectNo==3) {
//				break;
//			}
//		}
//		System.out.println("프로그램 종료");
//		scn.close();
		
	
		
		
		Member[] members = new Member[100];
		String name = "이름";
		for(Member member : members) {
			if(member.getName().equals(name)) {
				member.showInfo();
			}
		}
			
			
			
			
//		List<Member> members = new ArrayList();
//		for(Member member : members) {
//			if(member.getName().equals("이름")) {
//				member.showInfo();
//			}
		
	}
}
