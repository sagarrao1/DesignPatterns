package com.pluralsight.creational.abstractFactory;

//Abstract product
public abstract class CreditCard {
	
	private long cardNumber;
	private long SSN;
		
//	getters and setters
	public long getCardNumber() {	return cardNumber;	}
	public void setCardNumber(long cardNumber) {this.cardNumber = cardNumber;	}
	public long getSSN() {	return SSN;	}
	public void setSSN(long sSN) {	SSN = sSN;	}
	

}
