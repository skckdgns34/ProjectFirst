package com.yedam.classes.inherit;

public class Car {
	 Tire frontLeftTire = new Tire("앞왼쪽", 1);
	 Tire frontRightTire = new Tire("앞오른쪽", 2);
	 Tire backLeftTire = new Tire("뒤왼쪽", 3);
	 Tire backRigthTire = new Tire("뒤오른쪽", 4);
	 
	 int run() {
		 if(frontLeftTire.roll()==false) {
			  stop();
			 return 1;
		 }
		 if(frontRightTire.roll()==false) {
			  stop();
			 return 2;
		 }
		 if(backLeftTire.roll()==false) {
			  stop();
			 return 3;
		 }		 
		 if(backRigthTire.roll()==false) {
			  stop();
			 return 4;
		 }
		 return 0;
	 } //end of run()
	 void stop() {
		 System.out.println("자동차가 멈춥니다");
	 }
} //end of class
