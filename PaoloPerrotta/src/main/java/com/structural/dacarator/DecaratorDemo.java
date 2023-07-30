package com.structural.dacarator;

public class DecaratorDemo {

	public static void main(String[] args) {
		Hat hat =  new GoldenHat(new RibbonHat( new StandardHat()));
		System.out.println(hat.getDescription());
		System.out.println(hat.getPrice());
		
		Hat hat1 =  new GoldenHat(new RibbonHat( new PremiumHat()));
		System.out.println(hat1.getDescription());
		System.out.println(hat1.getPrice());
	}

}
