
package com.rizwan.audit.learning.pattern.factory;

public class Example {

	public static void main(String[] args) {

		Website shop = WebsiteFactory.getWebsite("shop");
		Website blog = WebsiteFactory.getWebsite("blog");
		System.out.println("Shop: " + shop.getPages());
		System.out.println("Blog: " + blog.getPages());
	}
}
