package com.structural.dacarator;

public class GoldenHat implements Hat {

	private Hat hat;

	public GoldenHat(Hat hat) {
		super();
		this.hat = hat;
	}

	@Override
	public String getName() {
		return hat.getName() + " Golden ";
	}

	@Override
	public Double getPrice() {
		return hat.getPrice() + Double.valueOf(2000);
	}

	@Override
	public String getDescription() {
		return hat.getDescription() + " Golden ";
	}

	@Override
	public Boolean isPremium() {
		return hat.isPremium();
	}
	
	
}
