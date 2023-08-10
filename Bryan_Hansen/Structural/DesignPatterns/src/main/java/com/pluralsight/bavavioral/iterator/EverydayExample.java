package com.pluralsight.bavavioral.iterator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class EverydayExample {

	public static void main(String[] args) {
		List<String> names =  new ArrayList<>();
//		Set<String> names =  new HashSet<>();
		names.add("Sanju");
		names.add("raju");
		names.add("Naresh");
		
//		1. first way
		Iterator<String> namesItr = names.iterator();		
		while(namesItr.hasNext()) {
			String name = namesItr.next();
			System.out.println(name);
			namesItr.remove();
		}
		
//		2. second way
//		for each loop uses iterator internally above and below are same
//		type fore and move cursor it shows it uses iterator
//		for (String string : names) {
//			System.out.println(string);
//			names.remove(string); 
//			you can't remove element from collection using enhanced for loop. 
//			you will get java.util.ConcurrentModificationException if you try. in that case yu need use above while loop
//		}
		
//		3. normal for loop. but issue here is if we use set istead of list
//		it won't work becasue set won't have index
//		for (int i = 0; i < names.size(); i++) {
//			System.out.println(names.get(i));
////			names.remove(i);
//		}
		
		System.out.println(names.size());
	}
}

//	more info
//	https://www.baeldung.com/java-concurrentmodificationexception