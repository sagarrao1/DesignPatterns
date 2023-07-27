package com.pluralsight.creational.singleton;

public class DbSingletonDemo {

	public static void main(String[] args) {
		DbSingleton instance = DbSingleton.getInstance();				
		System.out.println(instance);
				
		DbSingleton instance2 = DbSingleton.getInstance();				
		System.out.println(instance2);
		
//		DbSingleton instance3 = new DbSingleton(); 
//		System.out.println(instance3);
		
		DbSingleton instance4 = DbSingleton.getInstance();				
		System.out.println(instance4);

	}

}
