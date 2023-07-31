package com.structural.dacarator;

//we can refactor goldenhat and ribbonHat by extracting duplicated code into new class c
//HatDeacarator

public class GoldenHat implements Hat {

	private Hat decaratedHat;

	public GoldenHat(Hat decaratedHat) {
		this.decaratedHat = decaratedHat;
	}

	@Override
	public String getName() {
		return decaratedHat.getName() ;
	}

	@Override
	public Double getPrice() {
			if (isPremium()) {
				return decaratedHat.getPrice() + Double.valueOf(3000);
			} else {
				return decaratedHat.getPrice() + Double.valueOf(1000);
			}
	}

	@Override
	public String getDescription() {
		return decaratedHat.getDescription() + " Golden ";
	}

	@Override
	public Boolean isPremium() {
		return decaratedHat.isPremium();
	}
	
	
}
