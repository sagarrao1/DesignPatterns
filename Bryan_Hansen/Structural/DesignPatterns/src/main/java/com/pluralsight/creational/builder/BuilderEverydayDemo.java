package com.pluralsight.creational.builder;

public class BuilderEverydayDemo {

	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder();
		builder.append("This is a example of");
		builder.append(" a builder pattern.");
		builder.append(" It has methods to append ");
		builder.append("almost anything we want to a String. ");
		builder.append(42);
		
		
		System.out.println(builder.toString());
//		String builderString = builder.toString();
//		System.out.println(builderString);
	}

}
