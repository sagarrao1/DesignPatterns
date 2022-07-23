package com.pluralsight.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {

	Map<String, Item>  items= new HashMap<String, Item>();	
	
	public Registry() {
		loadItems();
	}

	public Item createItem(String type) {
		Item item =null;
		try {
			item = (Item) items.get(type).clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return item;
	}
	
	private void loadItems() {
		
		Movie movie=  new Movie();
		movie.setTitle("basic mvovie");
		movie.setPrice(24.99);
		movie.setRunTime(2.00);
		items.put("Movie", movie);
		
		Book book = new Book();
		book.setTitle("basic book");
		book.setPrice(3.5);
		book.setNoOfPages(200);
		items.put("Book", book);
		
	}
}
