package com.kh.example.practice2.model;

import com.kh.example.practice2.Circle;

public class Run {
	
	public static void main(String[] args) {
		Circle c = new Circle();
		
		c.incrementRadius();
		c.incrementRadius();
		
		System.out.println(2*c.radius*Circle.PI);
		System.out.println(c.radius*c.radius*Circle.PI);
		
		
	}
	
}

