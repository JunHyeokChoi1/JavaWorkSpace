package com.kh.inheritance.child;

import com.kh.inheritance.parent.Product;

public class Smartphone extends Product{
	
	private String moblieAgency;
	public Smartphone() {
	}

	public Smartphone(String brand, String pCode, String name, int price) {
		super(brand, pCode, name, price);
		this.moblieAgency = moblieAgency;
	}

	@Override
	public String toString() {
		return super.toString() + "Smartphone [moblieAgency=" + moblieAgency + "]";
	}
	
	
		
}
