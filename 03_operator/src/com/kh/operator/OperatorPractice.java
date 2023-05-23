package com.kh.operator;

import java.util.Scanner;

public class OperatorPractice {
	
	public static void main(String[] args) {
		OperatorPractice o = new OperatorPractice();
//		o.method1();
//		o.method2();
		o.method3();
//		o.method4();
//		o.method5();
//		o.method6();
	}
	public void method1() {
		
		int person, pen;
		int result1, result2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("인원수를 입력하시오: ");
		person = sc.nextInt();
		
		System.out.println("연필개수를 입력하시오: ");
		pen = sc.nextInt();
		
		result1 = (pen / person);
		result2 = (pen % person);
		
		System.out.println("1인당 연필 개수 : " + result1 + "\n" + "남는 연필 개수 : " + result2);
	
	}
	public void method2() {
		
		int number;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("양수를 입력해주세요> ");
		number = sc.nextInt();
		
		int result = number - (number % 100);
		
		System.out.println(result);
		
	}
	public void method3() {
		
		int num1, num2, num3=0;
		boolean result = true;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력1 : ");
		num1 = sc.nextInt();
		
		System.out.println("입력2 : ");
		num2 = sc.nextInt();
		
		System.out.println("입력3 : ");
		num3 = sc.nextInt();
		
		result= (num1 == num2) && (num2 == num3);
		
		System.out.println(result);
	}
	public void method4() {
		
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 : ");
		num = sc.nextInt();
		
		System.out.println(num % 2 == 0 ? "짝수다" : "홀수다");
	}
	public void method5() {
		
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이 : ");
		num = sc.nextInt();
		
		System.out.println(num<= 13 ? "어린이" : num<= 19 ? "청소년" : "성인");
	}
	public void method6() {
		
		int num1, num2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("사과의 개수 : ");
		num1 = sc.nextInt();
		
		System.out.println("바구니의 크기 : ");
		num2 = sc.nextInt();
		
		System.out.println("필요한 바구니의 수 : " + (num1/num2)+1);
	}		
}