package com.pluralsight.creational.builder;

public class LunchorderBeanDemo {

	public static void main(String[] args) {
		LunchOrderBean lunch = new LunchOrderBean();
		
		lunch.setBread("wheat");
		lunch.setNonVeg("fish");
		lunch.setCoolDrink("maaza");
		lunch.setDessart("Veneela");		
		
		System.out.println(lunch.getBread());
		System.out.println(lunch.getNonVeg());
		System.out.println(lunch.getDessart());
		System.out.println(lunch.getCoolDrink());
		
	}

}
