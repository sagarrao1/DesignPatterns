package com.pluralsight.creational.builder.latest.enums;

public enum HDD {
	DEFAULT(512), UPGRADED(1024) ,MAX(2048);	
	
	private int size;
	
	HDD(int size) {
		this.size = size;
	}
	
//	public int getSize() {
//		return size;
//	}
}
