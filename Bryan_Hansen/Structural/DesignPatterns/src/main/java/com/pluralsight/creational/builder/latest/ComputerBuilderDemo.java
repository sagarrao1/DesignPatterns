package com.pluralsight.creational.builder.latest;

import com.pluralsight.creational.builder.latest.enums.*;

public class ComputerBuilderDemo {

	public static void main(String[] args) {
		Computer.ComputerBuilder builder = new Computer.ComputerBuilder();
		
		builder.addHdd(HDD.DEFAULT)
						 .addRam(RAM.MAX)
						 .addUsb(true)
						 .addWifi(true);
		
		  Computer computer = builder.build();
		  
		  System.out.println(computer.getHddSize());
			System.out.println(computer.getRamSize());
			System.out.println(computer.getHasUsb());
			System.out.println(computer.getHasWifi());
		

	}

}
