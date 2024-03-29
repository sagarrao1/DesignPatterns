package com.pluralsight.structural.decarator;

public class DecoratorSandwitchDemo {

	public static void main(String[] args) {
		Sandwitch sandwitch = new DressingDecorator(new MeatDecarator(new SimpleSandwitch()));
		
		System.out.println(sandwitch.make());
	}

}
