package algorithms.subdomain.warmup;

import java.util.Scanner;

public class TimeConversion {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			String[] time = in.next().split(":");

			if (time[2].substring(2).equalsIgnoreCase("PM")) {
				time[0] = time[0].equals("12") ? time[0] : Integer.toString((Integer.parseInt(time[0]) + 12));
			} else if (time[2].substring(2).equalsIgnoreCase("AM")) {
				time[0] = time[0].equals("12") ? "00" : time[0];
			}

			System.out.printf("%s:%s:%s", time[0], time[1], time[2].substring(0, 2));
		}
	}

}
