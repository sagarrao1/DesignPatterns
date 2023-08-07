package com.pluralsight.bavavioral.command;

//concrete command
public class OnCommand implements Command {
	
	private Light light;

	public OnCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.on();
	}

}
