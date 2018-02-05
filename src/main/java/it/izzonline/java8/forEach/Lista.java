package it.izzonline.java8.forEach;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	public static void main(String[] args) {

		// In Java 8, you can loop a List with forEach + lambda expression or method
		// reference.

		List<String> lista = new ArrayList<>();
		lista.add("A");
		lista.add("B");
		lista.add("C");
		lista.add("D");
		lista.add("E");

		// lambda
		// Output : A,B,C,D,E
		lista.forEach(item -> System.out.println(item));

		// Output : C
		lista.forEach(item -> {
			if ("C".equals(item)) {
				System.out.println(item);
			}
		});

		// method reference
		// Output : A,B,C,D,E
		lista.forEach(System.out::println);

		// Stream and filter
		// Output : B
		lista.stream().filter(s -> s.contains("B")).forEach(System.out::println);

	}

}
