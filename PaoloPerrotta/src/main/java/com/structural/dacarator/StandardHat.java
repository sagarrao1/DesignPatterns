package com.structural.dacarator;

public class StandardHat implements Hat {

	private String name;
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public Double getPrice() {
		return Double.valueOf(2000);
	}

	@Override
	public String getDescription() {
		return "StandardHat ";
	}

	@Override
	public Boolean isPremium() {
		return false;
	}

}
