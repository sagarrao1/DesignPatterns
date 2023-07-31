package com.structural.dacarator;

public abstract class HatDeacarator implements Hat{

	protected Hat decaratedHat;

	public HatDeacarator() {
		super();
	}

	@Override
	public String getName() {
		return decaratedHat.getName() ;
	}

}