package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example {
	public static void main(String[] args) {
		List<String> strList = Arrays.asList("Hello ", "", "learning", "", " Java", " asked");

		long count = strList.stream().filter(x -> x.equals("Hello ")).count();
		System.out.println(count);

		List<String> modList = strList.stream().filter(x -> !x.isEmpty()).collect(Collectors.toList());
		System.out.println(modList);

		long count1 = strList.stream().filter(x -> x.startsWith(" ")).count();
		System.out.println(count1);

		String str = strList.stream().map(x -> x.toUpperCase()).collect(Collectors.joining(", "));
		System.out.println(str);

		str = strList.stream().filter(x -> !x.isEmpty()).map(x -> x.toUpperCase()).collect(Collectors.joining(", "));
		System.out.println(str);

		List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 6, 2, 6, 1, 7, 8, 4, 3, 1);
		List<Integer> sqaureNumbers = numbers.stream().map(x -> x * x).distinct().sorted().collect(Collectors.toList());
		System.out.println(sqaureNumbers);

		List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
		IntSummaryStatistics stats = primes.stream().mapToInt((x) -> x).summaryStatistics();
		System.out.println(stats);

		// flatMap() Example
		List<String> list1 = Arrays.asList("Virat", "Dhoni", "Jadeja");
		List<String> list2 = Arrays.asList("Warner", "Watson", "Smith");
		List<String> list3 = Arrays.asList("Alex", "Bell", "Broad");

		List<List<String>> list123 = new ArrayList<List<String>>();
		list123.add(list1);
		list123.add(list2);
		list123.add(list3);

		List<String> faltMapList = list123.stream().flatMap(list -> list.stream()).collect(Collectors.toList());
		faltMapList.forEach(System.out::println);
		faltMapList.forEach(x -> System.out.print(x + " "));

		List<Integer> evens = Arrays.asList(2, 4, 6);
		List<Integer> odds = Arrays.asList(3, 5, 7);
		List<Integer> primes1 = Arrays.asList(2, 3, 5, 7, 11);
		List<Integer> numbers1 = (List<Integer>) Stream.of(evens, odds, primes1).flatMap(list -> list.stream()).collect(Collectors.toList());
		System.out.println("\n\nflattend list: " + numbers1);

	}
}
