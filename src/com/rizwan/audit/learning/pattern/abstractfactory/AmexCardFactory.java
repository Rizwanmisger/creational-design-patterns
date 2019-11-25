
package com.rizwan.audit.learning.pattern.abstractfactory;

public class AmexCardFactory extends CreditCardFactory {

	@Override
	public CreditCard getCreditCard(CardType type) {

		switch (type) {
			case PLATINUM:
				return new AmexPlatinum();
			case GOLD:
				return new AmexGold();
			default:
				return null;
		}
	}
}
