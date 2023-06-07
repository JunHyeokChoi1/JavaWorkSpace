package com.kh.practice2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class Application {

	TreeSet<Model> set = new TreeSet<Model>();

	public static void main(String[] args) {
		Application app = new Application();
		app.method1();

	}

	// TreeSet
	public void method1() {

		TreeSet<Integer> lotto = new TreeSet<>();
//		while(lotto.size()<6) {
//			lotto.add((int)(Math.random()*45 + 1));
//		}
//		System.out.println(lotto);

		// size
		for (int i = 0; lotto.size() < 6; i++) {
			int num = (int) (Math.random() * 45 + 1);
			lotto.add(num);
			// 내 번호는 반복문 안에 반복문
		}
		System.out.println(lotto);

		int count = 0;
		while (true) {
			TreeSet<Integer> myLotto = new TreeSet<>();
			// 내 번호가 랜덤 6개 숫자 추출
			// 내 번호랑 로또 번호가 일치한지
			// 횟수
			for (int j = 0; myLotto.size() < 6; j++) {
				int num2 = (int) (Math.random() * 45 + 1);
				myLotto.add(num2);
			}
			
			count++;
			System.out.println("로또번호" + lotto);
			System.out.println("내 번호" + myLotto);
			
			if (lotto.equals(myLotto)) {
				System.out.println("횟수:" + count);
				break;
			}
		}
		
		System.out.println("로또번호" + lotto);
	}

	// HashSet
	public void method2() {
		HashSet<Integer> lotto = new HashSet<>();
	 	   
 	    for(int i=0; lotto.size()<6; i++) {
 			int m = (int) (Math.random()*45+1);
 			lotto.add(m);
 		}
 	   
 	    List lottoList = new ArrayList(lotto);
 	    Collections.sort(lottoList);
 	   
 		boolean check = true;
 		int count = 0;
 		
 		while(check) {
 			HashSet<Integer> set = new HashSet<Integer>();
 			count++;
 		    System.out.println("로또 번호 : "+lottoList);
 			
 			for(int i=0; set.size()<6; i++) {
 				int m = (int) (Math.random()*45+1);
 				set.add(m);
 			}
 			
 			List setList = new ArrayList(set);
 	 	    Collections.sort(setList);
 			
 			System.out.println("내 번호 : "+setList);
 			
 			if(lottoList.equals(setList)) {
 				check = false;
 				System.out.println("횟수 : "+ count);
 			}
 			
 		}
	}
}
