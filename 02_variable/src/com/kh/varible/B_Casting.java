package com.kh.varible;

public class B_Casting {
	
	/*
	 * 형변환(Casting)
	 * - 값의 타입을 다른 타입으로 변환하는 것
	 * - boolean을 제외한 기본형은 서로 형변환이 가능	
	 */
	public static void main(String[] agrs) {
		B_Casting b = new B_Casting();
//		b.autoCasting();
		b.Casting();
	}
	
	/*
	 * 자동 형 변환(묵시적 형 변환)
	 * 자동으로 형 변환이 이루어지기 때문에 따로 형변환하지 않아도 된다.
	 * 데이터 범위가 작은 자료형을 큰 자료형으로 변환한다.
	 */
	public void autoCasting() {
		byte b = 10; // 1byte
		short s = b; // 2byte
		int i = s; // 4byte
		long l = i; // 8byte
		
		float f = l; // 4byte(표현 가능한 수의 범위가 더 크기 때문에 자동 형 변환이 가능))
		double d = f; 
		
		System.out.println("b : " + b);
		System.out.println("s : " + s);
		System.out.println("i : " + i);
		System.out.println("l : " + l);
		System.out.println("f : " + f);
		System.out.println("d : " + d);
		
		System.out.println("-------------------");
		
		double result = 12 + 3.3;
		// byte, short 타입의 데이터는 연산 시 무조건 int 타입으로 변환 후 처리한다.
		int result2 = b + s;
		
		System.out.println(result);
		System.out.println(result2);
		
	}
	
	/*
	 * 강제 형 변환 (명시적 형 변환)
	 * [표현법] (자료형) 데이터;
	 * 
	 * 범위가 큰 크기의 자료형의 데이터를 작은 크기의 자료형으로 변환하려고 할 때 사용한다.
	 * 강제 형 변환의 경우 데이터 손실이 발생할 수 있다.
	 */
	
	public void Casting() {
		double d = 4.12345678904567890; // 15자리수
		float f = (float) d; // 6자리수
		int i = (int) f;
		
		System.out.println("d : " + d);
		System.out.println("f : " + f);
		System.out.println("i : " + i);
		
		int sum = (int) (i + d);
		int sum2 = i + (int)d;
		System.out.println("sum : " + sum);
		System.out.println("sum2 : " + sum2);
		
		System.out.println("-------------------");
		int number = 290;
		byte bnumber = (byte)number;
		
		System.out.println(bnumber);
		
		int number2 = 128;
		byte bnumber2 = (byte)number2;
		
		System.out.println(bnumber2);
		
		// char <-> : 각 문자들마다 고유한 숫자가 지정되어 있기 때문에 쌍방향으로 형변환 가능(유니코드)
		// char는 음수값 저장 불가 -> 값의 범위가 0~65535
		int num = 'A';
		System.out.println("num : " + num);
		
		char ch = 52143;
		System.out.println("ch : " + ch);
	}
}
