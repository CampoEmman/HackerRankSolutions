package algorithms.subdomain.warmup;

import java.util.Scanner;

public class CompareTheTriplets {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			int[] a = new int[3];
			int[] b = new int[3];
			int[] result = new int[2];

			for (int i = 0; i < a.length; i++) {
				a[i] = in.nextInt();
			}

			for (int i = 0; i < a.length; i++) {
				b[i] = in.nextInt();
			}

			for (int i = 0; i < a.length; i++) {
				if (a[i] > b[i]) {
					result[0] += 1;
				} else if (a[i] < b[i]) {
					result[1] += 1;
				}
			}

			System.out.printf("%s %s", result[0],result[1]);

		}
	}

}
