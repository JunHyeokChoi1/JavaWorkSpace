package com.kh.varible;

import java.util.Scanner;

public class D_keyboardInput {
	
	/*
	 * Scanner
	 * - 화면(console)으로부터 데이터를 "입력"받는 클래스
	 * 
	 * 1) import jaba.utill.Scanner; 추가
	 * 
	 * 2) Scanner 클래스 생성
	 *	Scanner sc = new Scanner(System.in);
	 *
	 *3) Scanner 클래스 사용
	 *	입력 값이 
	 *	문자열일 때 sc.next() 공백이 있을 경우 공백 이전까지 sc.nextline() 공백 포함 엔터 전까지
	 *	정수일 때 sc.nextInt()
	 *	실수일 때 sc.nextFloat(), sc.nextDouble() 
	 */

public static void main(String[] agrs) {

	Scanner sc = new Scanner(System.in);
	
	System.out.print("당신의 이름은 무엇입니까? > ");
	String name = sc.next();
	sc.nextLine();
	
	System.out.println(name);
	
	System.out.print("당신의 집은 어디십니까? > ");
	String addr = sc.nextLine();
	sc.nextLine();
	
	System.out.print("당신의 나이는 몇살입니까? > ");
	int age = sc.nextInt();
	sc.nextLine();
	
	System.out.print("당신의 키는 몇입니까? > ");
	float height = sc.nextFloat();
	sc.nextLine();
	
	System.out.print("당신의 성별은 무엇입니까? (남/여) > ");
	String line = sc.nextLine();
	char gender = line.charAt(0);
	
	System.out.println("당신의 이름은" + name 
			+ "이고 사는 곳은" + addr 
			+ "이고 나이는" + age 
			+ "이고 키는" + height 
			+ "이고 성별은" + gender 
			+ "입니다.");
	}
}