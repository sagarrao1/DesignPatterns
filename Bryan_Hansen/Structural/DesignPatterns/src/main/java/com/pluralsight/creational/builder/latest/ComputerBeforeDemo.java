package com.pluralsight.creational.builder.latest;

import com.pluralsight.creational.builder.latest.enums.*;

public class ComputerBeforeDemo {

	public static void main(String[] args) {
		ComputerBefore computer = new ComputerBefore();
		
		computer.setHddSize(HDD.DEFAULT);
		computer.setRamSize(RAM.MAX);
		computer.setHasUsb(true);
		computer.setHasWifi(true);
		
		
		System.out.println(computer.getHddSize());
		System.out.println(computer.getRamSize());
		System.out.println(computer.getHasUsb());
		System.out.println(computer.getHasWifi());

//		System.out.println(computer.getHddSize().getSize());
//		System.out.println(HDD.DEFAULT);
		
	}

}
