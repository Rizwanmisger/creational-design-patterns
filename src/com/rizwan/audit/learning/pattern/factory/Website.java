
package com.rizwan.audit.learning.pattern.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Website {

	protected List<Page> pages = new ArrayList<>();

	Website() {

		this.createWebsite();
	}

	public abstract void createWebsite();

	public List<Page> getPages() {

		return pages;
	}
}
