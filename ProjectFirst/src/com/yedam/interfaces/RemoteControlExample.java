package com.yedam.interfaces;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.turnOff();
		
		rc = new Television();
		rc.turnOn();
		rc.turnOff();
		
		// 익명객체.
		RemoteControl rc2 = new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("익명 객체 켭니");
			}

			@Override
			public void turnOff() {
				System.out.println("익명 객체 끕니");
			}
			
		};
		rc.turnOn();
		rc.turnOff();
	}
}
