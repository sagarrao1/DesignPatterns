package com.structural.dacarator;

public class RibbonHat implements Hat {
	
	private Hat decaratedHat;	

	public RibbonHat(Hat decaratedHat) {
		super();
		this.decaratedHat = decaratedHat;
	}

	@Override
	public String getName() {
		return decaratedHat.getName();
	}

	@Override
	public Double getPrice() {
		return decaratedHat.getPrice() + Double.valueOf(1000);
	}

	@Override
	public String getDescription() {
		return decaratedHat.getDescription() + " Ribbon ";
	}

	@Override
	public Boolean isPremium() {
		return decaratedHat.isPremium();
	}

}
