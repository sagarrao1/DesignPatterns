package com.pluralsight.creational.singleton;

public class DbSingleton{
	
//	private static DbSingleton instance = new DbSingleton();
	
//	Lazy loading creating instance when needed not at starting of application
//	volatile help us ensure that it makes single inside jvm  
	private static volatile DbSingleton instance = null;
	
	private DbSingleton() {
//		nobody should able to create object using reflection
//		it will protect reflection class go ahead and create this class
		if (instance != null) {
			throw new RuntimeException("Use getINstance method to create");
		}
	};
	
//	we can make threadsafe using 2 ways 
//	1. adding syncronized to methos this will have perofomace impact
//	2. adding where it is need using syncronized block
	
//	public synchronized static DbSingleton getInstance() {		
////		Lazy loading
//		if (instance == null) {
//			instance = new DbSingleton();
//		}				
//		return instance;
//	}
	
	public  static DbSingleton getInstance() {		
		if (instance == null) {
			synchronized(DbSingleton.class) {
				if (instance == null) {
					instance = new DbSingleton();
				}
			}
		}				
		return instance;
	}
}
