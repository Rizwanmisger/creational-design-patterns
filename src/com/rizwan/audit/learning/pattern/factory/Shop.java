
package com.rizwan.audit.learning.pattern.factory;

public class Shop extends Website {

	@Override
	public void createWebsite() {

		this.pages.add(new Home());
		this.pages.add(new About());
	}
}
