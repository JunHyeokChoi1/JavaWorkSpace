package com.kh.practice;

public class S23Ultra extends Smartphone implements Pen{
	
	String name= "S23 Ultra";
	String brand = "삼성";
	
	public S23Ultra() {
	}
	
	public void printInformation() {
		super.PrintInformation(name, brand);
		System.out.println("팬 탑재 여부: " + pen());
	}

	@Override
	public String makeCall() {
		return "번호는 누르고 통화번튼을 누름";
	}

	@Override
	public String takeCall() {
		return "수신 버튼을 누름";
	}

	@Override
	public String picture() {
		return "2억 화소 카메라";
	}

	@Override
	public boolean pen() {
		return true;
	}
}
