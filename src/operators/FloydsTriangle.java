package operators;

public class FloydsTriangle {
	public static void main(String[] args) {
		int startNum = 0, rows = 5;
		for(int i = 0; i < rows; i++) {
			int j = i;
			while(j >= 0) {
				System.out.print(++startNum + " ");
				j--;
			}
			System.out.print("\n");
		}
	}
}
