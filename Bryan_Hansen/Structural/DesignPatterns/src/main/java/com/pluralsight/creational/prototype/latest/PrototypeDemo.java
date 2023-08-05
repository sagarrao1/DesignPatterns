package com.pluralsight.creational.prototype.latest;

import java.util.ArrayList;
import java.util.List;

public class PrototypeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sql ="select * from movies where name = ?";
		List<String> parameters=  new ArrayList<>();
		parameters.add("Bahubali");
		
		Record record = new Record();
		
		Statement firstSt= new Statement(sql,parameters,record );
		
		System.out.println(firstSt.getSql());
		System.out.println(firstSt.getParameters());
		System.out.println(firstSt.getRecord());
		
		
		Statement secondSt= firstSt.clone();
		
		System.out.println(secondSt.getSql());
		System.out.println(secondSt.getParameters());
		System.out.println(secondSt.getRecord());
		
		
	}

}
