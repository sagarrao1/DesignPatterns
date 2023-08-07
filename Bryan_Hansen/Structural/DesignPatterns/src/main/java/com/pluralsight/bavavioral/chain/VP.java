package com.pluralsight.bavavioral.chain;

public class VP extends Handler{

	@Override
	public void handleRequest(Request request) {
//		  request type is purchase and < 500 or  request type is conference
		
		if ((request.getRequestType() == RequestType.PURCHASE && request.getAmount() <= 500) 
				|| request.getRequestType() == RequestType.CONFERENCE) {
			System.out.println("VP can approve any CONFERENCE or Purchase request < 500");
		} 
		else {
			successor.handleRequest(request);
		}
		
	}

}
