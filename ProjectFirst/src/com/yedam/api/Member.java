package com.yedam.api;

public class Member {
	public String id;
	
	public Member() {
		// 기본 생성자
	}
	public Member(String id) {
		this.id = id;
	}
	@Override
	public boolean equals(Object obj) {
//		return super.equals(obj);
		Member m = (Member) obj;
		return this.id.equals(m.id);
	}
	@Override
	public String toString() {
		return "id값은: " + this.id;
	}
	@Override
	public int hashCode() {
		return id.hashCode();
	}
	
	
	
}
