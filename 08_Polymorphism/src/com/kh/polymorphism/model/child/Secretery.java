package com.kh.polymorphism.model.child;

import com.kh.polymorphism.moedel.parent.Employee;

public class Secretery extends Employee{

	private String nameOfBoss;

	public Secretery() {
	}

	public Secretery(String name, int salary, String nameOfBoss) {
		super(name, salary);
		this.nameOfBoss = nameOfBoss;
	}

	public String getNameOfBoss() {
		return nameOfBoss;
	}

	public void setNameOfBoss(String nameOfBoss) {
		this.nameOfBoss = nameOfBoss;
	}

	@Override
	public String toString() {
		return super.toString() + "/Secretery [nameOfBoss=" + nameOfBoss + "]";
	}
	
	
	
}
