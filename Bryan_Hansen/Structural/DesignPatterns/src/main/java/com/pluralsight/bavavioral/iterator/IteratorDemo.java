package com.pluralsight.bavavioral.iterator;

import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		BikeRepository repo=  new BikeRepository();
		
		repo.addBike("Activa");
		repo.addBike("Libero");
		repo.addBike("Jupiter");
		
		Iterator<String> bikeIterator = repo.iterator();
		
		while(bikeIterator.hasNext()) {
			String next = bikeIterator.next();
			System.out.println(next);
		}
		
		
//		for (String bike : repo) {
//			System.out.println(bike);
//		}
		
//		System.out.println(repo.getRepoSize());
//		System.out.println(repo.getBikebyindex(1));
		
	}

}
