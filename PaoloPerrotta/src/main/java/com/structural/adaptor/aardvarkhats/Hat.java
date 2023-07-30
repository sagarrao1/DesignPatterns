package com.structural.adaptor.aardvarkhats;

public class Hat {

	private static final double VAT_PERCENT = 0.2;

	private final String shortName;

	private final String longName;

	private final int basePrice;

	public Hat(String shortName, String longName, int price) {
		this.shortName = shortName;
		this.longName = longName;
		this.basePrice = price;
	}

	public String getShortName() {
		return shortName;
	}

	public String getLongName() {
		return longName;
	}

	public int getPrice() {
		return (int) (basePrice * (1 + VAT_PERCENT));
	}
}
