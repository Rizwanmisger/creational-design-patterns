
package com.rizwan.audit.learning.pattern.factory;

public class Blog extends Website {

	@Override
	public void createWebsite() {

		this.pages.add(new About());
		this.pages.add(new ContactUs());
		this.pages.add(new Writers());
	}
}
