
package com.rizwan.audit.learning.pattern.abstractfactory;

public class VisaCardFactory extends CreditCardFactory {

	@Override
	public CreditCard getCreditCard(CardType type) {

		switch (type) {
			case PLATINUM:
				return new VisaPlatinum();
			case GOLD:
				return new VisaGold();
			default:
				return null;
		}
	}
}
