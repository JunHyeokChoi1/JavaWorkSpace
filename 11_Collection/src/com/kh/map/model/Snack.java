package com.kh.map.model;

public class Snack {
	private String flavor;
	private int calolie;
	
	
	public Snack() {
	}
	public Snack(String flavor, int calolie) {
		this.flavor = flavor;
		this.calolie = calolie;
	}
	public String getFlavor() {
		return flavor;
	}
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	public int getCalolie() {
		return calolie;
	}
	public void setCalolie(int calolie) {
		this.calolie = calolie;
	}
	@Override
	public String toString() {
		return "Snack [flavor=" + flavor + ", calolie=" + calolie + "]";
	}
	
	
}
