package com.pluralsight.bavavioral.chain;

public class ChainOfResponsibilityDemo {

	public static void main(String[] args) {
		
//		Superiors Director -> VP -> CEO
		
		Director sagar  = new Director();
		VP  shishir= new VP();
		CEO Bala = new CEO();
		
//		set successors
		sagar.setSuccessor(shishir);
		shishir.setSuccessor(Bala);
		
		Request request1 = new Request(RequestType.CONFERENCE, 200); 
		sagar.handleRequest(request1);

		Request request2 = new Request(RequestType.PURCHASE, 300);
		sagar.handleRequest(request2);
		
		Request request3 = new Request(RequestType.PURCHASE, 700);
		sagar.handleRequest(request3);
		
		
//	  sagar hadle all request As concrete handle , it's upto me if did not have permission 
//		pass it to my successor
//		as a client I don't know my request is getting approved by sagar or shihsir or bala
//     all i know is my request is getting approved		
		
		
		
	}

}
