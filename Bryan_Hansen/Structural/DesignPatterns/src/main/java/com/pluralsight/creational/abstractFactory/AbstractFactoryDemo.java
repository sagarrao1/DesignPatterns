package com.pluralsight.creational.abstractFactory;

public class AbstractFactoryDemo {

	public static void main(String[] args) {
		CreditcardFactory abstractFactory = CreditcardFactory.getCreditcardFactory(750);
		CreditCard creditCard = abstractFactory.getCreditCard(CardType.GOLD);
		System.out.println(creditCard.getClass());
				
		abstractFactory = CreditcardFactory.getCreditcardFactory(500);
		CreditCard creditCard2 = abstractFactory.getCreditCard(CardType.PLATINUM);
		System.out.println(creditCard2.getClass());
		
	}

}
