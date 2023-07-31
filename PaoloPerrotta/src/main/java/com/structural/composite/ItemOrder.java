package com.structural.composite;

public class ItemOrder implements IOrder {

	private String code;
	private String name;
	private int total;
	
	public ItemOrder(String code, String name, int total) {
		this.code = code;
		this.name = name;
		this.total = total;
	}

	@Override
	public String getDescription() {
		return code +" - " + name + " $ "+ total;
	}

	@Override
	public int getTotal() {
		return total;
	}


	
	

	
	
}
