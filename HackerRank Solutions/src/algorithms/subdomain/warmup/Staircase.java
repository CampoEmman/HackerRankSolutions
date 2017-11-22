package algorithms.subdomain.warmup;

import java.util.Scanner;

public class Staircase {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			int size = in.nextInt();

			for (int i = 0; i < size; i++) {
				for (int j = 1; j <= size; j++) {
					System.out.print(i < size - j ? " " : "#");
				}
				System.out.println("");
			}
		}
	}

}
