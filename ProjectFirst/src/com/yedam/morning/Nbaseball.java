package com.yedam.morning;

import java.util.Scanner;

public class Nbaseball {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Baseball base = new Baseball();

		int scnt, bcnt;
		int[] a = new int[3];
		int[] b = new int[3];

		// a에 3개 랜덤
		for (int i = 0; i < 3; i++) {
			a[i] = (int) (Math.random() * 9) + 1;	
		}

		// 중복제거
		base.dedu(a);
		base.printAry(a);
	
		while (true) {
			System.out.println("숫자 3개 입력");
			// b에 3개받기
			for (int i = 0; i < b.length; i++) {
				b[i] = scn.nextInt();
			}
			// 입력한 값
			base.printAry(b);
			int cnt = base.compare(a, b);
			if (cnt == 3) {
				System.out.println("정답");
				break;
			}
		}
	}
}
