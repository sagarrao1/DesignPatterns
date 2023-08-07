package com.pluralsight.bavavioral.chain;

public class Request {
	private RequestType requestType;
	private double amount;
	
//	constructor
	public Request(RequestType requestType, double amount) {
		this.requestType = requestType;
		this.amount = amount;
	}


//	getters 
	public RequestType getRequestType() {return requestType;}
	public double getAmount() {	return amount;	}
	

	

}
