package com.pluralsight.creational.singleton;

public class SingletonEverydayDemo {

	public static void main(String[] args) {
		Runtime singletonRuntime = Runtime.getRuntime();
		singletonRuntime.gc();		
		System.out.println(singletonRuntime);
		
		Runtime anotherInstance = Runtime.getRuntime();
		System.out.println(anotherInstance);
		
		if (singletonRuntime.equals(anotherInstance)) {
			System.out.println("Both are pointing to same object");
		}

		
	}

}
