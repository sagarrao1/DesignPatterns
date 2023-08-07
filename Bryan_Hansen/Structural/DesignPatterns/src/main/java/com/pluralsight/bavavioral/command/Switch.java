package com.pluralsight.bavavioral.command;

//invoker
public class Switch {
	public void storeAndExecute(Command command) {
		command.execute();
	}

}
