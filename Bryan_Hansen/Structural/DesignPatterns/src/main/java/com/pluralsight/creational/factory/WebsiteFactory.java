package com.pluralsight.creational.factory;

public class WebsiteFactory {
	
	public static Website getWebsite(WebsiteType siteType) {
		
		switch (siteType) {		
		case BLOG:
			 return new Blog();
		case SHOP:
			 return new Shop();			 
		default:
			System.out.println("Invalid Site type");
			return null;
		}
		
		
	}

}
