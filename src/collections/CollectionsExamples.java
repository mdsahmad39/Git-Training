package collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map.Entry;

public class CollectionsExamples {
	public static void main(String[] args) {

		// 1
		System.out.println("\n\n===================Implementing Custom Linked List============================");
		CustomLinkedList cList = new CustomLinkedList();
		// adding elements
		cList.insert(12);
		cList.insert(23);
		cList.insert(2);
		cList.insert(67);
		cList.insert(11);
		cList.insert(52);
		cList.insert(49);
		cList.insert(66);
		// displaying elements in the list
		cList.display();
		// deleting an element in the list
		cList.delete(11);
		cList.display();

		// 2.a
		System.out.println("\n\n===================String Count using HashMap============================");
		String str = "FTD is good company FTD is great company";
		Map<String, Integer> stringCount = new HashMap<String, Integer>();
		String[] strArray = str.split(" ");

		for (String s : strArray) {
			if (stringCount.containsKey(s)) {
				stringCount.replace(s, stringCount.get(s) + 1);
			} else {
				stringCount.put(s, 1);
			}
		}
		System.out.println(stringCount);

		// 3 and 4 ques
		System.out.println(
				"\n\n===================Retrieving Values and Changing value of particular key using HashMap============================");
		Map<String, Integer> hMap = new HashMap<String, Integer>();
		hMap.put("Hello", 23);
		hMap.put("Hi", 45);
		hMap.put("HashMap", 12);
		hMap.put("Values", 89);
		hMap.put("Welcome", 12);

		// Retrieving all the values in HashMap
		System.out.println(hMap.values());

		// changing value of particular key in HashMap
		System.out.println(hMap.entrySet());
		hMap.replace("HashMap", 999);
		System.out.println(hMap.entrySet());

		// 5
		System.out.println(
				"\n\n===================Implementing Comparable and Comparators for Product Class============================");
		List<Product> prodList = Arrays.asList(new Product(3, 233, "Pen"), new Product(2, 432, "Charger"),
				new Product(1, 212, "Cartoon"), new Product(5, 546, "Keyboard"), new Product(4, 989, "Mouse"));

		prodList.forEach((n) -> System.out.println(n));

		// sorting with overriden compareTo method from Comparable
		Collections.sort(prodList);
		System.out.println("\nSorted with increasing ID");
		prodList.forEach((n) -> System.out.println(n));

		// sorting with Name Comparator
		Collections.sort(prodList, (b1, b2) -> b1.getName().compareTo(b2.getName()));
		System.out.println("\nSorted with name in increasing order");
		prodList.forEach(System.out::println);

		// sorting with Price Comparator
		System.out.print("\nSorted with price in increasing order");
		Collections.sort(prodList, (b1, b2)-> (b1.getPrice() > b2.getPrice()) ? 1:-1);
		System.out.println("");
		prodList.forEach(System.out::println);

		// 6.a
		System.out.println("\n\n===================Removing Input Element In ArrayList============================");
		List<Integer> list1 = Arrays.asList(23,66,1,45,99);
		
		System.out.println(list1);
		Scanner sc = new Scanner(System.in);
		System.out.print("Please input the number which is to be removed: ");
		int element = sc.nextInt();
		
		if (list1.contains(element)) {
			int index = list1.indexOf(element);
			list1.remove(index);
		} else {
			System.out.println("Element not present in the list");
		}
		System.out.println(list1);
		sc.close();

		// 7
		System.out.println(
				"\n\n===================Index Of Last Occurrence Element In ArrayList============================");
		list1.clear();
		list1.add(23);
		list1.add(66);
		list1.add(1);
		list1.add(45);
		list1.add(23);
		list1.add(99);
		System.out.println(list1);
		System.out.println("Index of Last Occurrence of the Element is: " + list1.lastIndexOf(23));

		// 8
		System.out.println(
				"\n\n===================Swapping Two Elements In ArrayList (through index)============================");
		System.out.println(list1);
		int index1 = 1, index2 = 5, temp = list1.get(index1);
		list1.set(index1, list1.get(index2));
		list1.set(index2, temp);
		System.out.println(list1);

		// 9
		System.out
				.println("\n\n===================Printing All Duplicates in Sorted Order============================");
		String str1 = "FTD is good company FTD is great company";
		str1 = str1.toLowerCase();
		Map<String, Integer> tMap = new TreeMap<String, Integer>();
		String[] str1Array = str1.split(" ");
		for (String s : str1Array) {
			if (tMap.containsKey(s)) {
				tMap.replace(s, tMap.get(s) + 1);
			} else {
				tMap.put(s, 1);
			}
		}
		for (Entry<String, Integer> entry : tMap.entrySet()) {
			if (entry.getValue() > 1)
				System.out.println(entry.getKey());
		}

	}
}