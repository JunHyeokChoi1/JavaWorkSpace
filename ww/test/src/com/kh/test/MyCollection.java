package com.kh.test;

import java.util.ArrayList;

import com.kh.test.model.vo.Test;

public class MyCollection {
	
	public static void main(String[] args) {
		MyCollection m = new MyCollection();
		m.test();
	}
		
	public void test() {
		
		ArrayList<Test> list = new ArrayList<Test>();
		list.add(new test("자바", 93.5));
		list.add(new test("디비", 74.1));
		list.add(new test("서버", 82.7));
//		list.add(100);
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	
}
