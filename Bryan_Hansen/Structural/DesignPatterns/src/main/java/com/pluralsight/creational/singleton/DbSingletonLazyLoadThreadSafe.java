package com.pluralsight.creational.singleton;

// New way of writing singleton with lazy loader and threadsafe
// we create new inner static classs and create static final variable call it static method
public class DbSingletonLazyLoadThreadSafe{
	
//	private static DbSingletonLazyLoadThreadSafe instance = new DbSingletonLazyLoadThreadSafe();
	
	private static class LazyLoader{
		 static final DbSingletonLazyLoadThreadSafe INSTANCE = new DbSingletonLazyLoadThreadSafe();
		
	}
	
	private DbSingletonLazyLoadThreadSafe() {
		
	}
	
	public  static DbSingletonLazyLoadThreadSafe getInstance() {		
		return LazyLoader.INSTANCE;
	}
}
