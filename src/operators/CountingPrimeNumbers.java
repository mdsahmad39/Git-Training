package operators;

public class CountingPrimeNumbers {
	public static void main(String[] args) {
		final int MAX_NUMBER = 100;

		// while loop
		int limit = 2, count = 0;
		while (limit < MAX_NUMBER) {
			int num = limit / 2;
			boolean flag = true;
			while (num > 1) {
				if (limit % num == 0)
					flag = false;
				--num;
			}
			if (flag)
				++count;
			++limit;
		}
		System.out.println("Using While Loop: " + count);

		// do while loop
		limit = 2;
		count = 0;
		do {
			int num = limit / 2;
			boolean flag = true;
			while (num > 1) {
				if (limit % num == 0)
					flag = false;
				--num;
			}
			if (flag)
				++count;
			++limit;
		} while (limit < MAX_NUMBER);
		System.out.println("Using Do While Loop: " + count);

		// for loop
		count = 0;
		for (int i = 2; i < MAX_NUMBER; ++i) {
			boolean flag = true;
			for (int j = i / 2; j > 1; --j) {
				if (i % j == 0)
					flag = false;
			}
			if (flag)
				++count;
		}
		System.out.println("Using For Loop: " + count);
	}
}
