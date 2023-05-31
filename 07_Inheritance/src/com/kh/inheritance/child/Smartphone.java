package com.kh.inheritance.child;

import com.kh.inheritance.parent.Product;

public class Smartphone extends Product{
	
	private String mobileAgency;
	public Smartphone() {
	}

	public Smartphone(String brand, String pCode, String name, int price, String mobileAgnecy) {
		super(brand, pCode, name, price);
		this.mobileAgency = mobileAgency;
	}

	@Override
	public String toString() {
		return super.toString() + "Smartphone [moblieAgency=" + mobileAgency + "]";
	}
	
	
		
}
