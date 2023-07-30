package com.pluralsight.structural.decarator;

public abstract class SandwitchDecarator implements Sandwitch {
	
	protected Sandwitch customSandwitch;	

	public SandwitchDecarator(Sandwitch customSandwitch) {
		this.customSandwitch = customSandwitch;
	}

	@Override
	public String make() {
		return customSandwitch.make();
	}
	

}
