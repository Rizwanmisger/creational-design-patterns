
package com.rizwan.audit.learning.builderpattern;

public class Example {

	public static void main(String[] args) {

		LunchOrder.Builder builder = new LunchOrder.Builder();
		LunchOrder order = builder.bread("Wheat").condiments("Lettuce").dressing("Mayo").meat("Turkey").build();
		System.out.println("Bread: " + order.getBread());
		System.out.println("Condiments: " + order.getCondiments());
		System.out.println("Dressing: " + order.getDressing());
		System.out.println("Meat: " + order.getMeat());
	}
}
