package com.pluralsight.creational.abstractFactory;

public class AmexFactory extends CreditcardFactory {

	@Override
	public CreditCard getCreditCard(CardType cardType) {
		
		switch (cardType) {
		case GOLD:			
			return new AmexGoldCreditCard();
			
		case PLATINUM:			
			return new AmexPlatinumCreditCard();
			
		default:
			break;
		}
		return null;
	}

}
