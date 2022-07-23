package com.pluralsight.creational.builder;

public class LunchOrder {
	
	public static class Builder {
		private String bread;
		private String nonVeg;
		private String dessart;
		private String coolDrink;		
		
		public Builder() {
		}

		public Builder bread(String bread) {
			this.bread = bread;
			return this;
		}
		
		public Builder nonVeg(String nonVeg) {
			this.nonVeg = nonVeg;
			return this;
		}
		
		public Builder dessart(String dessart) {
			this.dessart = dessart;
			return this;
		}
		
		public Builder coolDrink(String coolDrink) {
			this.coolDrink = coolDrink;
			return this;
		}
		
		public LunchOrder build() {
			return new LunchOrder(this);
		}
		
	}
		
	
	private final String bread;
	private final String nonVeg;
	private final String dessart;
	private final String coolDrink;	
	
	private LunchOrder(Builder builder) {
		this.bread = builder.bread;
		this.nonVeg = builder.nonVeg;
		this.coolDrink= builder.coolDrink;
		this.dessart = builder.dessart;
	}
	
	//	getters
	public String getBread() { return bread;}
	public String getNonVeg() { return nonVeg;	}
	public String getDessart() { return dessart;}
	public String getCoolDrink() {return coolDrink;	}
		
	
	

}
