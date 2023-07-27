package com.pluralsight.structural.decarator;

public class DressingDecorator extends SandwitchDecorator {

	public DressingDecorator(Sandwitch customSandwitch) {
		super(customSandwitch);
	}

	@Override
	public String make() {
		return super.make() + addDressing();
	}

	private String addDressing() {
		return " + mustard";
	}
}
