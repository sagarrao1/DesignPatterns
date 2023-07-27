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
			break;
		}
		return null;
	}

}
