package strings;

import java.util.Arrays;

public class CheckForAnagrams {
	public static void main(String[] args) {
		String s1 = "anagram";
		String s2 = "aganmra";

		if (isAnagram(s1, s2))
			System.out.println("Both '" + s1 + "' and '" + s2 + "' are Anagrams");
		else
			System.out.println("Both " + s1 + " " + s2 + " are not Anagrams");
	}

	public static boolean isAnagram(String s1, String s2) {

		char[] s1Array = s1.toLowerCase().toCharArray();
		char[] s2Array = s2.toLowerCase().toCharArray();

		Arrays.sort(s1Array);
		Arrays.sort(s2Array);
		if (s1Array.length != s2Array.length) {
			return false;
		}
		for (int i = 0; i < s1Array.length; i++) {
			if (s1Array[i] != s2Array[i]) {
				return false;
			}
		}
		return true;
	}
}
