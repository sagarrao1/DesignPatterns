package com.pluralsight.structural.decarator;

public class MeatDecarator extends SandwitchDecarator {

	public MeatDecarator(Sandwitch customSandwitch) {
		super(customSandwitch);
	}

	@Override
	public String make() {
		return super.make() + addMeat();
	}
	
	public String addMeat() {
		return " +Turkey ";
	}

}
