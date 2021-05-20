package operators;

public class DivisibilitySum {
	public static void main(String[] args) {
		final int MIN_NUMBER = 100, MAX_NUMBER = 200;
		int divibleNum = 7;

		// while loop
		int sum = 0, limit = MIN_NUMBER;
		while (limit < MAX_NUMBER) {
			if (limit % divibleNum == 0) {
				sum += limit;
				limit += divibleNum-1;
			}
			++limit;
		}
		System.out.println("Using While Loop: " + sum);

		// do while loop
		sum = 0;
		limit = MIN_NUMBER;
		do {
			if (limit % divibleNum == 0) {
				sum += limit;
				limit += divibleNum-1;
			}
			++limit;
		} while (limit < MAX_NUMBER);
		System.out.println("Using Do While Loop: " + sum);

		// for loop
		sum = 0;
		for (int i = MIN_NUMBER; i < MAX_NUMBER; i++) {
			if (i % divibleNum == 0) {
				sum += i;
				i += divibleNum-1;
			}
		}
		System.out.println("Using For Loop: " + sum);
	}
}
