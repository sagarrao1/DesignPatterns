package com.pluralsight.creational.abstractFactory;

public class VisaFactory extends CreditcardFactory {

	@Override
	public CreditCard getCreditCard(CardType cardType) {
		switch (cardType) {
		case GOLD:			
			return new VisaGoldCreditcard();
		case PLATINUM:			
			return new VisaPlatinumCreditcard();
		default:
			throw new IllegalStateException("Invalid cardType: " + cardType);
		}
	}

	
//	we should have write like amexfactory getValidator like adding switch. this is show we can write in different also
	@Override
	public Validator getValidator(CardType cardType) {
		return new VisaGoldValidator();			
			
	}

}
