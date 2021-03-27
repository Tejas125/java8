package java8.functionalInterface.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PredicateExample2 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Tejas");
		list.add("Teja");
		list.add("Shiv");
		list.add("Shivani");
		/*
		 * This is comment
		 */
		List<String> filtered = list.stream().filter(t -> t.length() > 5).collect(Collectors.<String>toList());

		System.out.println(filtered);
	}
}
