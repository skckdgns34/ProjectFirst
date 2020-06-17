package com.yedam.morning;

public class Baseball {
	//출력
	public void printAry(int[] ary) {
		for (int i = 0; i < ary.length; i++) {
			System.out.print(ary[i] + "\t");
		}
		System.out.println();
	}
	//중복제거
	public void dedu(int[] ary) {
		for (int i = 0; i < 3; i++) {
			//i=3;
			for (int j =0; j < i; j++) {
				if(ary[i]==ary[j]) {
					ary[i] = (int) (Math.random() * 9) + 1;
					i--;
				}
			}
		}
	}
	
	//비교
	public int compare(int[] ary, int[] ary1) {
		int scnt = 0;
		int bcnt = 0;
		for (int i = 0; i < 3; i++) {
			if (ary[i] == ary1[i]) {
				scnt++;
			}else
			for (int j = 0; j < 3; j++) {
				if (ary[i] == ary1[j]) {
					bcnt++;
				}
			}
		}
		System.out.print(bcnt + "볼\t");
		System.out.println(scnt + "스트라이크");
		
		return scnt;
	}
}
