package com.model.vo;

public class Book implements Seriallizable{
	private String title;
	private int Price;
	
	public Book() {
	}
	
	public Book(String title, int price) {
		this.title = title;
		Price = price;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", Price=" + Price + "]";
	}
	
	
}
