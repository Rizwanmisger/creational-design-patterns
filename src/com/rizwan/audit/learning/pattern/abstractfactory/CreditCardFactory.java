
package com.rizwan.audit.learning.pattern.abstractfactory;

public abstract class CreditCardFactory {

	public static CreditCardFactory getCreditCardFactory(int creditScore) {

		if (creditScore > 600) {
			return new AmexCardFactory();
		} else {
			return new VisaCardFactory();
		}
	}

	public abstract CreditCard getCreditCard(CardType type);
}
