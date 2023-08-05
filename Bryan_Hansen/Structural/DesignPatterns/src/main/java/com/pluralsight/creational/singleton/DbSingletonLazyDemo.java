package com.pluralsight.creational.singleton;

public class DbSingletonLazyDemo {

	public static void main(String[] args) {
		DbSingletonLazyLoadThreadSafe instance = DbSingletonLazyLoadThreadSafe.getInstance();				
		System.out.println(instance);
				
		DbSingletonLazyLoadThreadSafe instance2 = DbSingletonLazyLoadThreadSafe.getInstance();				
		System.out.println(instance2);
		
//		DbSingleton instance3 = new DbSingleton(); 
//		System.out.println(instance3);
		
		DbSingletonLazyLoadThreadSafe instance4 = DbSingletonLazyLoadThreadSafe.getInstance();				
		System.out.println(instance4);

	}

}
