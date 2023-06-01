package com.kh._interface.step2;

public class Advanced implements Player{

	@Override
	public void run() {
		System.out.println("빨리 달리다");
	}

	@Override
	public void jump() {
		System.out.println("점프를 할수있지");
	}

	@Override
	public void turn() {
		System.out.println("턴은못해");
	};

	@Override
	public void showLevleMessage() {
		System.out.println("중급자레벨");
		
	}

}
