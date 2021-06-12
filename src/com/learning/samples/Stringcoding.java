package com.learning.samples;

import java.util.Scanner;

public class Stringcoding {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		final String A = sc.next();
		final String B = sc.next();
		final int len = A.length() + B.length();
		System.out.println(len);
		final int compare = A.compareTo(B);
		if (compare > 0) {
			System.out.println("yes");
		} else {
			System.out.println("No");
		}
		System.out.println(A.charAt(0));

	}

}
