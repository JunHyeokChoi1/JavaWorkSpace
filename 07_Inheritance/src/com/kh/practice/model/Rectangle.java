package com.kh.practice.model;

public class Rectangle extends Point{
	protected int width;
	protected int height;
	
	public Rectangle() {
	}

	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}
	
	public String draw() {
		return super.draw() + "너비 : " + this.width + "높이: " + this.height;
	}
}
