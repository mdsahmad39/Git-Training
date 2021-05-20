package filesandio;

import java.util.Arrays;

public class StringMethods {
	public static void main(String[] args) {
		String s = "       This example contains Java Strings methods        ";
		System.out.println(s);
		
		//trim()
		s = s.trim();
		System.out.println(s);
		
		//indexOf()
		System.out.println(s.indexOf('J'));
		
		//substring()
		System.out.println(s.substring(22));
		System.out.println(s.substring(22, 34));
		
		//contains()
		System.out.println(s.contains("Java"));
		System.out.println(s.contains("java"));
		
		//length()
		System.out.println(s.length());
		
		//toCharArray()
		System.out.println(Arrays.toString(s.toCharArray()));
		
		//split()
		System.out.println(Arrays.toString(s.split("\\s")));
		
		//replace()
		System.out.println(s.replace("Java", "Strings"));
		
		//charAt()
		System.out.println(s.charAt(22));
		
		//toLowerCase()
		System.out.println(s.toLowerCase());
		
		//toUpperCase()
		System.out.println(s.toUpperCase());
		
		String s1 = "Java Strings";
		String s2 = "java strings";
		
		//compareTo()
		System.out.println(s1.compareTo(s2));
	}
}