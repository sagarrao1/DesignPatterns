package com.structural.dacarator;

public class RibbonHat implements Hat {
	
	private Hat hat;	

	public RibbonHat(Hat hat) {
		super();
		this.hat = hat;
	}

	@Override
	public String getName() {
		return hat.getName();
	}

	@Override
	public Double getPrice() {
		return hat.getPrice() + Double.valueOf(1000);
	}

	@Override
	public String getDescription() {
		return hat.getDescription() + " Ribbon ";
	}

	@Override
	public Boolean isPremium() {
		return hat.isPremium();
	}

}
