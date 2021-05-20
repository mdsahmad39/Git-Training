package operators;

public class BitwiseOperations {
	public static void main(String[] args) {
		int a = 5, b=-8;
		System.out.println("Bitwise operation of a&b result is: " + (a&b));
		System.out.println("Bitwise operation of a|b result is: " + (a|b));
		System.out.println("Bitwise operation of a^b result is: " + (a^b));
		System.out.println("Shift operation of b>>1 result is: " + (b>>1));
		System.out.println("Shift operation of b>>>2 result is: " + (b>>>2));
	}
}
