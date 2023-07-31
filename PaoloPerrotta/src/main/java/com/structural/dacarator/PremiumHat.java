package com.structural.dacarator;

public class PremiumHat implements Hat {

	private String name;
	
	public PremiumHat(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public Double getPrice() {
		return Double.valueOf(3000);
	}

	@Override
	public String getDescription() {
		return "PremiumHat ";
	}

	@Override
	public Boolean isPremium() {
		return true;
	}

}
