package com.yedam.nestedInterfaces;

public class Button {
	OnClickListener listener;
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	void touch() {
		listener.onClick();
	}
	
	//중첩 인터페이스는 필드로도 사용가능
	interface OnClickListener{
		void onClick();
	}
}
