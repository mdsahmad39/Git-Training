package strings;

import java.util.Scanner;
import java.util.stream.IntStream;

public class AlternateCharacters {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please type in a string: ");
		String s = sc.nextLine();
		
		IntStream.range(0, s.length())
				.forEach(index -> {
					if(index % 2 == 0) System.out.print(s.charAt(index) + " ");
				});
		
		sc.close();
	}
}
