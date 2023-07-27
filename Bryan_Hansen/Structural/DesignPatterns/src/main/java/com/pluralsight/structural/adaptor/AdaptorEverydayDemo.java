package com.pluralsight.structural.adaptor;

import java.util.Arrays;
import java.util.List;

public class AdaptorEverydayDemo {

	public static void main(String[] args) {
		Integer[] arrayOfInts=  new Integer[] {1,3,5};
		System.out.println(arrayOfInts);
		
		List<Integer> list=  Arrays.asList(arrayOfInts);
		System.out.println(list);
		
	}

}
