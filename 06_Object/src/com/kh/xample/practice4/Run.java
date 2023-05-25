package com.kh.xample.practice4;

import java.util.Scanner;

import com.kh.example.practice4.controller.SnackController;
import com.kh.xample.practice4.model.Snack;

public class Run {
	
	static Scanner sc= new Scanner(System.in);
	
	public static void main(String[] args) {
		
		SnackController scr = new SnackController();
		Snack s = new Snack();
		
		System.out.println("스낵류를 입력하세요");
		
		System.out.println("종류: ");
		String b = sc.nextLine();
		s.setKind(b);
		
		System.out.println("이름: ");
		String c = sc.nextLine();
		s.setname(c);
		
		System.out.println("맛: ");
		String d = sc.nextLine();
		s.setflavor(d);
	
		
		System.out.println("개수: ");
		int f = sc.nextInt();
//		s.setnumOf(f);
		int numOf = Integer.parseInt(sc.nextLine());
		//s.setnumOf(Integer.parseInt(sc.nextInt()));
		
		System.out.println("가격: ");
		int g = sc.nextInt();
		int price = Integer.parseInt(sc.nextLine());
//		s.setprice(g);
		
		//s.setprice(Integer.parseInt(sc.nextInt()));
		
		Snack s = new Snack(b, c, d, f, g); 
		
		scr.saveData(s);
		if(scr.saveData(s)) {
			
			System.out.println("저장 완료 되었습니다");
			System.out.println(scr.confirmData());
			
		}
		
//		System.out.println(s);
		
	}
}
