package com.yedam.api.arrays;

public class Member implements Comparable<Member>{
	String name;
	int age;
	
	public Member(String name, int age){
		this.name = name;
		this.age = age;
	}
	public Member(String name){
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int compareTo(Member o) {
		return name.compareTo(o.name);
	}

}
//Member m1 = new Member("aaaa",35);
//Member m2 = new Member("bbbb",10);
//Member m3 = new Member("cccc",15);
//Member[] ary = { m1, m2, m3};
//Arrays.sort(ary);
//for (Member m : ary) {
//	System.out.println(m.getName());
//}
//String s = "aaa";
//System.out.println(s.compareTo("abb"));