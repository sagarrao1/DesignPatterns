package com.pluralsight.creational.abstractFactory;

public class AbstractFactoryDemo {

	public static void main(String[] args) {
		CreditcardFactory creditcardFactory = CreditcardFactory.getCreditcardFactory(750);
		CreditCard creditCard = creditcardFactory.getCreditCard(CardType.GOLD);
		System.out.println(creditCard.getClass());
				
		creditcardFactory = CreditcardFactory.getCreditcardFactory(500);
		CreditCard creditCard2 = creditcardFactory.getCreditCard(CardType.PLATINUM);
		System.out.println(creditCard2.getClass());
		
	}

}
