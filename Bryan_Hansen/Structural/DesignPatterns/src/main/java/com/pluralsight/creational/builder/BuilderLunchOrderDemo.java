package com.pluralsight.creational.builder;

public class BuilderLunchOrderDemo {

	public static void main(String[] args) {
		LunchOrder.Builder builder = new LunchOrder.Builder();
		
		builder.bread("wheat").coolDrink("ThumsUp").nonVeg("mutton");
		
		LunchOrder lunchOrder = builder.build();
		
		System.out.println(lunchOrder.getBread());
		System.out.println(lunchOrder.getCoolDrink());
		System.out.println(lunchOrder.getDessart());
		System.out.println(lunchOrder.getNonVeg());
		
	}

}
