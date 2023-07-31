package com.structural.dacarator;

public class DecaratorDemo {

	public static void main(String[] args) {
		Hat hat =  new GoldenHat(new RibbonHat( new StandardHat("base ball hat")));
		System.out.println(hat.getName());
		System.out.println(hat.getDescription());
		System.out.println(hat.getPrice());
		System.out.println("");
		
		Hat hat1 =  new GoldenHat(new RibbonHat( new PremiumHat("top hat")));
		System.out.println(hat1.getName());		
		System.out.println(hat1.getDescription());
		System.out.println(hat1.getPrice());
	}

}
