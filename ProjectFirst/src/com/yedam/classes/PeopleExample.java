package com.yedam.classes;

public class PeopleExample {
	public static void main(String[] args) {
		People p1 = new People();
		p1.age = 1;
		p1.height = 150.1;
		p1.name = "Kimm";
		p1.eatWater();
		p1.maxBurger(1);
		
		People p2 = new People();
		p2.age = 2;
		p2.height = 160.1;
		p2.name = "Park";
		p2.eatWater();
		p2.maxBurger(2);

		People p3 = new People();
		p3.age = 3;
		p3.height = 170.1;
		p3.name = "Choi";
		p3.eatWater();
		p3.maxBurger(3);

		People[] arr = new People[3];
		arr[0] = p1;
		arr[1] = p2;
		arr[2] = p3;
		
		for(People peo : arr) {
			peo.showInfo();
		}
	}
}
