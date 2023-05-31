package com.kh.inheritance;

import com.kh.inheritance.child.Notebook;
import com.kh.inheritance.child.Smartphone;
import com.kh.inheritance.child.Tv;

public class Application {

	public static void main(String[] args) {
		
		Notebook notebook = new Notebook("애플", "a1111", "맥북프로14", 279000, "m2");
		Smartphone smartphone = new Smartphone("삼성", "a1111", "맥북프로14", 279000, "");
		Tv tv = new Tv("애플", "a1111", "맥북프로14", 279000, "");
		
		System.out.println(notebook);
		System.out.println(smartphone);
		System.out.println(tv);
	}

}
