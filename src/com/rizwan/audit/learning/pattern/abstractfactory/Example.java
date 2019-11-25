
package com.rizwan.audit.learning.pattern.abstractfactory;

public class Example {

	public static void main(String[] args) {

		CreditCardFactory abstractFactory = CreditCardFactory.getCreditCardFactory(700);
		CreditCard creditCard = abstractFactory.getCreditCard(CardType.GOLD);
		System.out.println("Factory " + abstractFactory.getClass());
		System.out.println("CreditCard " + creditCard.getClass());
		abstractFactory = CreditCardFactory.getCreditCardFactory(500);
		creditCard = abstractFactory.getCreditCard(CardType.GOLD);
		System.out.println("Factory " + abstractFactory.getClass());
		System.out.println("CreditCard " + creditCard.getClass());
	}
}
