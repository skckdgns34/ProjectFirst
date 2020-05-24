package com.yedam.exceptions;

import java.awt.geom.NoninvertibleTransformException;
import java.io.FileInputStream;

public class LoginExample {
	public static void main(String[] args) {
		
		try {
			login("white", "12345");
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			login("blue", "54321");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public static void login(String id, String password) throws Exception{
		//id가 ""가 아니라면 nonexistIDException 발생시킴
		if(!id.equals("blue")) {
			throw new NotExistIDException("아이디가 존재하지 않습니다.");
		}
		
		if(!password.equals("12345")) {
			throw new WrongPasswordException("비밀번호가 틀립니다.");
		}
	}
}
