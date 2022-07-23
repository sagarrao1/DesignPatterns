package com.pluralsight.creational.abstractFactory;

//AbstractFactory
public abstract class CreditcardFactory {
	
	public static CreditcardFactory getCreditcardFactory(int creditScore) {
		
		if (creditScore > 650)  {
			return new AmexFactory();
		} else {
			return new VisaFactory();
		}
		
	}	
	
	public abstract CreditCard getCreditCard(CardType cardType);
	

}
