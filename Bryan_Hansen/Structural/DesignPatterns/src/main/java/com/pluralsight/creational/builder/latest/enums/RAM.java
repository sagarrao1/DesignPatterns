package com.pluralsight.creational.builder.latest.enums;

public enum RAM {
	DEFAULT(6), MAX(16);	
	private int size;
	
	RAM(int size) {
		this.size = size;
	}	
}
