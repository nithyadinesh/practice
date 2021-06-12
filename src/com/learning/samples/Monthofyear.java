package com.learning.samples;

import java.time.LocalDate;
import java.util.Scanner;

public class Monthofyear {

	public static void main(String[] args) {
		final Scanner scan = new Scanner(System.in);
		final int d = scan.nextInt();
		final int m = scan.nextInt();
		final int y = scan.nextInt();
		final int day = findmonth(d, m, y);
		System.out.println(day);

	}

	private static int findmonth(int d, int m, int y) {
		final LocalDate date = LocalDate.of(y, m, d);
		return date.getDayOfYear();

	}

}
