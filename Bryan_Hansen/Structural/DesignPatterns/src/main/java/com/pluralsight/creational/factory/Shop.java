package com.pluralsight.creational.factory;

public class Shop extends Website {

	@Override
	protected void createWebsite() {
		pages.add(new ShoppingCart());
		pages.add(new SearchPage());
		pages.add(new ContactPage());
		pages.add(new ItemPage());
	}

}
