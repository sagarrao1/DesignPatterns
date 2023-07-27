package com.pluralsight.creational.factory;

public class Blog extends Website {

	@Override
	protected void createWebsite() {
		pages.add(new AboutPage());
		pages.add(new CommentPage());
		pages.add(new ContactPage());
	}

}
