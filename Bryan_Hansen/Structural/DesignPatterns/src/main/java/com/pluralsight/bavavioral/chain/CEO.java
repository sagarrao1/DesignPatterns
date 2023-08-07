package com.pluralsight.bavavioral.chain;

public class CEO extends Handler{

	@Override
	public void handleRequest(Request request) {
		System.out.println("CEO can approve any request");		
	}

}
