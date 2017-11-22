package algorithms.subdomain.warmup;

import java.util.Arrays;
import java.util.Scanner;

public class SimpleArraySum {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			int n = in.nextInt();
			int[] ar = new int[n];
			for (int ar_i = 0; ar_i < n; ar_i++) {
				ar[ar_i] = in.nextInt();
			}
			System.out.println(Arrays.stream(ar).sum());
		}

	}

}
