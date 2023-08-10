package com.pluralsight.bavavioral.iterator;

import java.util.Iterator;

public class BikeRepository  implements Iterable<String> {

	private String[] bikes;
	private int index;
		
	public BikeRepository() {
		bikes = new String[10];
		index=0;
	}

	public void addBike(String bikeName) {
		if(index == bikes.length) {
			String[] largeBikes =  new String[bikes.length + 5];
			System.arraycopy(bikes, 0, largeBikes, 0, bikes.length);
			bikes=largeBikes;
			largeBikes=null;			
		}
		bikes[index]= bikeName;
		index++;		
	}

	public int getRepoSize() {
		return index;
	}
	
	public String getBikebyindex( int i) {
		return bikes[i];
	}
	
	
	@Override
	public Iterator<String> iterator() {
//		we need to implement anonymous inner class of iterator
		Iterator<String> it =  new Iterator<String>() {
			
			private int currentIndex=0;
			@Override
			public boolean hasNext() {
				return currentIndex < bikes.length && bikes[currentIndex] != null;
			}
			
			@Override
			public String next() {
				return bikes[currentIndex++];
			}
			
		};
		
		return it;
		
	} 

}
