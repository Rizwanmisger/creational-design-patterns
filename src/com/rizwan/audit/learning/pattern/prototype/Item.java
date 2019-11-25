
package com.rizwan.audit.learning.pattern.prototype;

public abstract class Item implements Cloneable {

	private String title;
	private String uri;
	private double price;

	@Override
	protected Object clone() throws CloneNotSupportedException {

		return super.clone();
	}

	public String getTitle() {

		return title;
	}

	public void setTitle(String title) {

		this.title = title;
	}

	public String getUri() {

		return uri;
	}

	public void setUri(String uri) {

		this.uri = uri;
	}

	public double getPrice() {

		return price;
	}

	public void setPrice(double price) {

		this.price = price;
	}
}
