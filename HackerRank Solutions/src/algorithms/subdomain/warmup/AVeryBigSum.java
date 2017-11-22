package algorithms.subdomain.warmup;

import java.util.Scanner;
import java.util.stream.IntStream;

public class AVeryBigSum {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			int n = in.nextInt();
			System.out.println(IntStream.range(0, n).mapToLong(i -> in.nextLong()).sum());
		}
	}

}
