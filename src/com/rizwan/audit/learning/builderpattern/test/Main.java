
package com.rizwan.audit.learning.builderpattern.test;
/* Save this in a file called Main.java to compile and test it */

import java.io.PrintWriter;
/* Do not add a package declaration */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
/* DO NOT CHANGE ANYTHING ABOVE THIS LINE */
/*
 * You may add any imports here, if you wish, but only from the standard library
 */
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.stream.Collectors;

/* Do not add a namespace declaration */
public class Main {

	public static List<String> processData(ArrayList<String> array) {

		/* 
		 * Modify this method to process `array` as indicated
		 * in the question. At the end, return a List containing the
		 * appropriate values
		 *
		 * Please create appropriate classes, and use appropriate
		 * data structures as necessary.
		 *
		 * Do not print anything in this method.
		 *
		 * Submit this entire program (not just this method)
		 * as your answer
		 */
		Map<String, List<Service>> apps = new HashMap<>();
		array.forEach(item -> {
			List<String> app = Arrays.asList(item.split(","));
			String v = app.get(2).replace("V", "");
			if (apps.containsKey(app.get(0))) {
				Service service = new Service(app.get(1), Integer.valueOf(v));
				apps.get(app.get(0)).add(service);
			} else {
				List<Service> services = new ArrayList<>();
				Service service = new Service(app.get(1), Integer.valueOf(v));
				services.add(service);
				apps.put(app.get(0), services);
			}
		});
		Map<String, Integer> serviceMap = new HashMap<>();
		List<Service> services = apps.values().stream().flatMap(List::stream).collect(Collectors.toList());
		services.forEach(s -> {
			if (serviceMap.containsKey(s.name)) {
				if (s.version > serviceMap.get(s.name)) {
					serviceMap.remove(s.name);
					serviceMap.put(s.name, s.version);
				}
			} else {
				serviceMap.put(s.name, s.version);
			}
		});
		List<String> retVal = new ArrayList<String>();
		for (Entry<String, List<Service>> app : apps.entrySet()) {
			String key = app.getKey();
			List<Service> value = app.getValue();
			boolean match = value.stream().anyMatch(s -> serviceMap.get(s.name) > s.version);
			if (match) {
				retVal.add(key);
			}
		}
		return retVal;
	}

	public static void main(String[] args) {

		ArrayList<String> inputData = new ArrayList<String>();
		String line;
		Scanner in = new Scanner(System.in);
		while (in.hasNextLine())
			inputData.add(in.nextLine());
		List<String> retVal = processData(inputData);
		PrintWriter output = new PrintWriter(System.out);
		for (String str : retVal)
			output.println(str);
		output.close();
	}

	static class Service {

		String name;
		Integer version;

		Service(String name, Integer version) {

			this.name = name;
			this.version = version;
		}
	}
}
