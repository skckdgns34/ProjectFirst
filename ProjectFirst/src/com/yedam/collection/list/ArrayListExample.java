package com.yedam.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {	
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add(new String("Hello"));
		list.add("World");
		list.add(2, "Hong1"); 
		list.add(2, "Hong2");
		list.add(2, "Hwang");
		list.set(2, "Park");

		for(String str : list) {
			System.out.println(str.toString());
		}
		System.out.println(list.get(1));
		list.remove(4);
		System.out.println("after remove(4)");
		
		for(String str : list) {
			System.out.println(str.toString());
		}
		System.out.println("end of remove");
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
	}
}
