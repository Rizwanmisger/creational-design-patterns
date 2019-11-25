
package com.rizwan.audit.learning.pattern.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {

	private Map<String, Item> items = new HashMap<>();

	public Registry() {

		loadRegistry();
	}

	public Item createItem(String type) {

		Item item = null;
		try {
			item = (Item) items.get(type).clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return item;
	}

	private void loadRegistry() {

		Movie movie = new Movie();
		movie.setTitle("Basic Movie");
		movie.setRuntime("2 hrs");
		movie.setPrice(200);
		movie.setUri("example.com");
		items.put("movie", movie);
		Book book = new Book();
		book.setTitle("Basic book");
		book.setNumberOfPages(200);
		book.setPrice(200);
		book.setUri("example.com");
		items.put("book", book);
	}
}
