package operators;

import java.util.Scanner;

public class PubSubProg {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		if(input % 3 == 0 && input % 5 == 0) System.out.println("PUBSUB");
		else if(input % 3 == 0) System.out.println("PUB");
		else if(input % 5 == 0) System.out.println("SUB");
		else System.out.println("Not divisible by 3 or 5");
		
		sc.close();
	}
}
