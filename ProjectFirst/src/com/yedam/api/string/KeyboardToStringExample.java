package com.yedam.api.string;

import java.io.IOException;


public class KeyboardToStringExample {
	public static void main(String[] args) throws IOException {
		byte[] bytes = new byte[100];
		
		System.out.print("입력: ");

		int readByteNo = System.in.read(bytes);
		
		
		String str = new String(bytes, 0, readByteNo);
		System.out.println(str);
		
		for(byte a: bytes) {
			System.out.println(a);
		}
	}
}
