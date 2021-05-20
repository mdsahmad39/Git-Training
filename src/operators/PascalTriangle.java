package operators;

public class PascalTriangle {
	public static void main(String[] args) {
		//for 10 rows
		int rows = 11;
		for (int i = 1; i < rows; i++) {
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
