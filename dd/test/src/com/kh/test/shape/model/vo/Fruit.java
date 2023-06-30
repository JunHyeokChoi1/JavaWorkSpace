package com.kh.test.shape.model.vo;

import java.util.Objects;

public class Fruit {
	String name;
	String color;
	
	public Fruit() {
	}
	
	public Fruit(String name, String color) {
		this.name = name;
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Fruit [name=" + name + ", color=" + color + "]";
	}
	
}
