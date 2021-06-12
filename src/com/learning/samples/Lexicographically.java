package com.learning.samples;

import java.util.Scanner;

public class Lexicographically {

	public static String getSmallestAndLargest(String s, int k) {
		String smallest = s.substring(0, k);
		String largest = s.substring(0, k);
		for (int i = 1; (i + k) <= s.length(); i++) {
			final int comparesmall = s.substring(i, i + k).compareTo(smallest);
			if (comparesmall < 0) {
				smallest = s.substring(i, i + k);
			}
			final int comparelarge = s.substring(i, i + k).compareTo(largest);
			if (comparelarge > 0) {
				largest = s.substring(i, i + k);
			}
		}
		return smallest + "\n" + largest;
	}

	public static void main(String[] args) {
		final Scanner scan = new Scanner(System.in);
		final String s = scan.next();
		final int k = scan.nextInt();

		scan.close();
		if (k > s.length()) {
			System.out.println("invalid input");
		} else {
			System.out.println(getSmallestAndLargest(s, k));
		}
	}
}
