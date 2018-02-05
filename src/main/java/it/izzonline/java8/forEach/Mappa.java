package it.izzonline.java8.forEach;

import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class Mappa {
	public static void main(String[] args) {

		// In Java 8, you can loop a Map with forEach + lambda expression.

		Map<String, Integer> mappa = new HashMap<String, Integer>();
		mappa.put("A", 10);
		mappa.put("B", 20);
		mappa.put("C", 30);
		mappa.put("D", 40);
		mappa.put("E", 50);
		mappa.put("F", 60);

		mappa.forEach((k, v) -> System.out.println("Item : " + k + " Count : " + v));

		mappa.forEach((k, v) -> {
			System.out.println("Item : " + k + " Count : " + v);
			if ("E".equals(k)) {
				System.out.println("Hello E");
			}
		});
	}
}
