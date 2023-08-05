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
			throw new IllegalStateException("Invalid cardType: " + cardType);
		}	
		
	}

	@Override
	public Validator getValidator(CardType cardType) {
		switch (cardType) {
		case GOLD:			
			return new AmexGoldValidator();			
		case PLATINUM:			
			return new AmexPlatinumValidator();			
		default:
			throw new IllegalStateException("Invalid cardType: " + cardType);
		}	
	}

}
