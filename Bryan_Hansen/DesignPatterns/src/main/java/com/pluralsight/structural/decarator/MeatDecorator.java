package com.pluralsight.structural.decarator;

public class MeatDecorator extends SandwitchDecorator {

	public MeatDecorator(Sandwitch customSandwitch) {
		super(customSandwitch);
	}

	@Override
	public String make() {
		return super.make() + addMeat();
	}
	
	private String addMeat() {
		return " + turkey";
	}

}
