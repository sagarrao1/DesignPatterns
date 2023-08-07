package com.pluralsight.bavavioral.command;

//Client
public class CommandDemo {

	public static void main(String[] args) {
		Light light = new Light();
		Switch lightSwitch= new Switch();

		Command command = new OnCommand(light);
		lightSwitch.storeAndExecute(command);
		
	}

}
