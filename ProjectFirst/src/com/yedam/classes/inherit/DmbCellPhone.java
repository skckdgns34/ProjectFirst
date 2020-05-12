package com.yedam.classes.inherit;

public class DmbCellPhone extends CellPhone{
	int channel;

	
	public DmbCellPhone(String model, String color, int channel) {
		super(model, color); // super => CellPhone(a,b);
		this.channel = channel;
	}
	public DmbCellPhone(String model, String color) {
		super(model, color); // super => CellPhone(a,b);
	}

	
	@Override
	void powerOn() {
		System.out.println("DMB폰의 전원을 켭니다");
	}

	@Override
	void powerOff() {
		System.out.println("DMB폰의 전원을 끕니다");
	}

	void turnOnDmb() {
		System.out.println("채널: " + channel + "번 방송을 수신.");
	}
	void changeChannel(int channel) {
		this.channel = channel;
		System.out.println("채널: " + channel + "번으로 변경");
	}
	void turnOffDmb() {
		System.out.println("DMB 수신을 종료.");
	}
	
}
