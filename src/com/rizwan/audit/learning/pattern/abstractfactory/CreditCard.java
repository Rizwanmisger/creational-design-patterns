
package com.rizwan.audit.learning.pattern.abstractfactory;

public abstract class CreditCard {

	private String cardName;
	private int csc;

	public String getCardName() {

		return cardName;
	}

	public void setCardName(String cardName) {

		this.cardName = cardName;
	}

	public int getCsc() {

		return csc;
	}

	public void setCsc(int csc) {

		this.csc = csc;
	}
}
