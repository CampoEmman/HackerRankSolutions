package algorithms.subdomain.warmup;

import java.util.Scanner;

public class DiagonalDifference {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			int n = in.nextInt();
			int[][] matrix = new int[n][n];
			int diff1 = 0;
			int diff2 = 0;

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					matrix[i][j] = in.nextInt();

					if (i == j) {
						diff1 += matrix[i][j];
					}
					if (i + j == n - 1) {
						diff2 += matrix[i][j];
					}
				}
			}

			System.out.println(Math.abs(diff1 - diff2));
		}
	}

}