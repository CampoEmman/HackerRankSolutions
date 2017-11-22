package algorithms.subdomain.warmup;

import java.util.Scanner;

public class BirthdayCakeCandles {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			int n = in.nextInt();
			int count = 0;
			int highest = 0;

			for (int i = 0; i < n; i++) {
				int height = in.nextInt();

				if (height > highest) {
					highest = height;
					count = 1;
				} else if (height == highest) {
					count++;
				}
			}

			System.out.println(count);
		}
	}

}
