package com.pluralsight.bavavioral.chain;

public class Director extends Handler {

	@Override
	public void handleRequest(Request request) {
		if (request.getRequestType() == RequestType.CONFERENCE ) {			
			System.out.println("Director can approve this CONFERENCE request");
		} 
		else {
			successor.handleRequest(request);
		}

	}

}
