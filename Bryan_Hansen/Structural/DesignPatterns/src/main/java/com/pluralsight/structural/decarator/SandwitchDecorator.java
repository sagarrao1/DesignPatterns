package com.pluralsight.structural.decarator;

public abstract class SandwitchDecorator implements Sandwitch {
	
	Sandwitch customSandwitch;

	public SandwitchDecorator(Sandwitch customSandwitch) {
		this.customSandwitch = customSandwitch;
	}

	@Override
	public String make() {
		return customSandwitch.make();
	}

	
	

}
