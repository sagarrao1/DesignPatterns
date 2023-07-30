package com.pluralsight.structural.decarator;

public class DressingDecorator extends SandwitchDecarator {

	public DressingDecorator(Sandwitch customSandwitch) {
		super(customSandwitch);
	}

	@Override
	public String make() {
		return super.make()+ addDressing();
	}

	public String addDressing() {
		return " +Mustard";
	}
}
