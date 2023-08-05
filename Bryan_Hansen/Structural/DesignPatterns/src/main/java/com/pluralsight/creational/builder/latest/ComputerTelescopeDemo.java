package com.pluralsight.creational.builder.latest;

import com.pluralsight.creational.builder.latest.enums.HDD;
import com.pluralsight.creational.builder.latest.enums.RAM;

public class ComputerTelescopeDemo {

	public static void main(String[] args) {
		ComputerTelescope computer = new ComputerTelescope(
								HDD.DEFAULT,
								RAM.MAX,
								true,
								true);
				
		System.out.println(computer.getHddSize());
		System.out.println(computer.getRamSize());
		System.out.println(computer.getHasUsb());
		System.out.println(computer.getHasWifi());

	}

}
