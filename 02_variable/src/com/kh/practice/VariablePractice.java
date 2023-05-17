package com.kh.practice;

import java.util.Scanner;

public class VariablePractice {
	
	// FQCN(Fully Qualified Class Name)
	// 클래스가 속한 패키지명을 모두 포함한 이름
	public static void main(String[] args) {
		VariablePractice vp = new VariablePractice();
//		vp.method1();
//		vp.method2();
//		vp.method3();
//		vp.method4();
		vp.method5();
	}

	public void method1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" 첫 번째 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		
		System.out.print(" 두 번째 정수를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		System.out.println("더하기 결과 : " + (num1 + num2));
		System.out.println("빼기 결과 : " + (num1 - num2));
		System.out.println("곱하기 결과 : " + (num1 * num2));
		System.out.println("나누기 결과 : " + (num1 / num2));
	}
	public void method2() {
		Scanner movie_count = new Scanner(System.in);
		
		int adult, teenager;
		adult = 10000;
		teenager = 7000;
		
		System.out.print("성인 수 :");
		int adult_conunt= movie_count.nextInt();

		System.out.print("청소년 수 :");
		int teenager_count = movie_count.nextInt();
		
		System.out.println("성인 "+adult_conunt+"명 : "+adult * adult_conunt+"원");
		System.out.println("청소년 "+teenager_count+"명 : "+ teenager * teenager_count+"원");
		System.out.println("총 금액 : "+(adult*adult_conunt + teenager*teenager_count)+"원");
		
	}	
	public void method3() {
		int x= 5;
		int y = 7;
		int z = 9;
		int tmp;
		// x =7 y=9 z=5
		
		tmp = z;
		z = x;
		x = y;
		y = tmp;
		
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		System.out.println("z=" + z);
	}
	public void method4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열을 입력하세요: ");
		String str = sc.nextLine();
		
		char first = str.charAt(0);
		System.out.println("첫번째 문자: " + first);
		
		char last = str.charAt(7);
		System.out.println("마지막 문자: " + last);
		
	}
	public void method5() {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("문자: ");
		char ch = sc.nextLine().charAt(0);
		
		System.out.println("A unicode : " + ch);
		System.out.println("B unicode : " + ch);
		
	}
	
}
