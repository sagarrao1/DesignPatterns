package com.pluralsight.creational.builder;

public class LunchorderTeleDemo {

	public static void main(String[] args) {
		LunchOrderTele lunch = new LunchOrderTele("wheat","fish","sprite","straberry");
		
		System.out.println(lunch.getBread());
		System.out.println(lunch.getNonVeg());
		System.out.println(lunch.getDessart());
		System.out.println(lunch.getCoolDrink());
		
	}

}
