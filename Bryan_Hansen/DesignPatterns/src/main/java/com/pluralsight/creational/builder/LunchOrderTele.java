package com.pluralsight.creational.builder;

public class LunchOrderTele {
	private String bread;
	private String nonVeg;
	private String dessart;
	private String coolDrink;
	
	public LunchOrderTele(String bread) {
		this.bread = bread;
	}

	public LunchOrderTele(String bread, String nonVeg) {
		this(bread);
		this.nonVeg = nonVeg;
	}

	public LunchOrderTele(String bread, String nonVeg, String dessart) {
		this(bread,nonVeg);
		this.dessart = dessart;
	}

	public LunchOrderTele(String bread, String nonVeg, String dessart, String coolDrink) {
		this(bread,nonVeg,dessart);
		this.coolDrink = coolDrink;
	}
	
	public String getBread() {
		return bread;
	}
	public String getNonVeg() {
		return nonVeg;
	}
	public String getDessart() {
		return dessart;
	}
	public String getCoolDrink() {
		return coolDrink;
	}
		
	
	
	
	
	
	
	

}
