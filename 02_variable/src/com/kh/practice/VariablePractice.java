package com.kh.practice;

import java.util.Scanner;

public class VariablePractice {

	// FQCN(Fully Qualified Class Name)
	// 클래스가 속한 패키지명을 모두 포함한 이름
	
	public static void main(String[] args) {
		
		VariablePractice vp = new VariablePractice();
//		vp.method1();
		vp.method2();
		
	}
	
	public void method1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 정수를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		System.out.println("더하기 결과 : " + (num1 + num2));
		System.out.println("빼기 결과 : " + (num1 - num2));
		System.out.println("곱하기 결과 : " + (num1 * num2));
		System.out.println("나누기 몫 결과 : " + (num1 / num2));
		
	}
	
	public void method2() {
		
	}
	
}





