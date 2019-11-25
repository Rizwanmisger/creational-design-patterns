
package com.rizwan.audit.learning.pattern.prototype;

public class Example {

	private static Registry registry = new Registry();

	public static void main(String[] args) {

		Movie movie = (Movie) registry.createItem("movie");
		movie.setTitle("Jocker");
		Book book = (Book) registry.createItem("book");
		book.setTitle("1984");
		System.out.println("Movie title " + movie.getTitle());
		System.out.println("Movie runtime " + movie.getRuntime());
		System.out.println("Movie price " + movie.getPrice());
		System.out.println();
		System.out.println("Book title " + book.getTitle());
		System.out.println("Book number of pages " + book.getNumberOfPages());
		System.out.println("Book price " + book.getPrice());
	}
}
