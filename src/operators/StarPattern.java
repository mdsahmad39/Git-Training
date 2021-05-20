package operators;

public class StarPattern {
	public static void main(String[] args) {

		int rows = 10;
		for (int i = 1; i < rows; i++) {
			if (i > rows / 2) {
				for (int j = 0; j < i; j++) {
					System.out.print(" ");
				}
				for (int j = 2 * (rows - i) - 1; j > 0; j--) {
					System.out.print("*");
					if (j == 1)
						System.out.println("");
				}

			} else {
				for (int j = 0; j < rows - i; j++) {
					System.out.print(" ");
				}
				for (int j = 1; j < 2 * i; j++) {
					System.out.print("*");
					if (j == 2 * i - 1)
						System.out.println("");
				}
			}

		}
	}
}
