package com.pluralsight.structural.flyweight;

public class FlyWightInventoryDemo {

	public static void main(String[] args) {
		InventoryMgmtSystem ims = new InventoryMgmtSystem();
		
		ims.takeOrder("Roomba", 221);
		ims.takeOrder("Sony TV", 325);
		ims.takeOrder("Bose headphones", 226);
		
		ims.takeOrder("Roomba", 321);
		ims.takeOrder("Sony TV", 102);
		ims.takeOrder("Bose headphones", 235);
		
		ims.takeOrder("Roomba", 227);
		ims.takeOrder("Sony TV", 320);
		ims.takeOrder("Bose headphones", 103);

		ims.process();
		
		System.out.println(ims.report());
	}

}
