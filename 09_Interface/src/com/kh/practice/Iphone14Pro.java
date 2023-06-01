package com.kh.practice;

public class Iphone14Pro extends Smartphone implements Pen{
	
	String name = "iphone14Pro";
	String brand = "애플";
	
	public Iphone14Pro() {
	
	}
	
	public void printInformation() {
		super.PrintInformation(name, brand);
		System.out.println("팬 탑재 여부: " + pen());
	}

	@Override
	public String makeCall() {
		return "번호를 누르고 통화버튼을 누름";
	}

	@Override
	public String takeCall() {
		return "수신 버튼을 누름";
	}

	@Override
	public String picture() {
		return "4800만 화소 카메라";
	}

	@Override
	public boolean pen() {
		return false;
	}

	
	
}
