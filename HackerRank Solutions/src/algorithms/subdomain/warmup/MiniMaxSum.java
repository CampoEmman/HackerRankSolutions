package algorithms.subdomain.warmup;

import java.util.Arrays;
import java.util.Scanner;

public class MiniMaxSum {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			long[] input = new long[5];
			long sum = 0l;
			for (int i = 0; i < 5; i++) {
				long n = in.nextLong();
				input[i] = n;
				sum += n;
			}

			Arrays.sort(input);
			System.out.printf("%d %d", sum - input[input.length - 1], sum - input[0]);
		}
	}

}
