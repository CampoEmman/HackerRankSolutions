package algorithms.subdomain.warmup;

import java.util.Scanner;

public class PlusMinus {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			int n = in.nextInt();

			double positiveCount = 0.0d;
			double negativeCount = 0.0d;
			double zeroesCount = 0.0d;

			for (int i = 0; i < n; i++) {
				int a = in.nextInt();
				if (a > 0) {
					positiveCount++;
				} else if (a < 0) {
					negativeCount++;
				} else {
					zeroesCount++;
				}
			}
			System.out.printf("%.6f\n%.6f\n%.6f", (positiveCount / n), (negativeCount / n), (zeroesCount / n));
		}
	}
}
