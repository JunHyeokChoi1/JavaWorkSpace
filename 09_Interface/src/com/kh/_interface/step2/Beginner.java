package com.kh._interface.step2;

public class Beginner implements Player {

	@Override
	public void run() {
		System.out.println("달리기");
	}

	@Override
	public void jump() {
		System.out.println("점프는 할줄몰라");
	}

	@Override
	public void turn() {
		System.out.println("턴도 할줄몰라");
	}

	@Override
	public void showLevleMessage() {
		// TODO Auto-generated method stub
		System.out.println("===초보자레벨===");
	}
	
}
