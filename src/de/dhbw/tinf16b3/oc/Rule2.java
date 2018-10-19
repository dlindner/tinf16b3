package de.dhbw.tinf16b3.oc;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Rule2 {
	
	public static void main(String[] args) {
		evenOrOdd(42);
	}

	private static void evenOrOdd(int number) {
		int rest = number % 2;
		System.out.println(rest);
		List<Consumer<Integer>> operations = Arrays.asList(
				v -> System.out.println("gerade"),
				v -> System.out.println("ungerade"));
		operations.get(rest).accept(rest);
	}
}
