package com.yedam.classes.inherit;

public class VehicleExample {

	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		vehicle.run();
		vehicle = new Bus(); // 부모클래스 변수 = (자동형변환)자식클래스 인스턴스
		vehicle.run();
		vehicle = new Taxi(); 
		vehicle.run();
		
		// 자식클래스 = (강제형변환) 부모클래스;
		Taxi taxi = (Taxi)vehicle;
		taxi.run();
	}
}
