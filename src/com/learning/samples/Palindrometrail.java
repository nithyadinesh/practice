package com.learning.samples;

import java.util.Scanner;

public class Palindrometrail {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		int length = A.length();
		boolean result = true;
		for (int i = 0; i < length - 1; i++, length--) {
			if (A.charAt(i) == A.charAt(length - 1)) {
				result = true;
			}

			else if (A.charAt(i) != A.charAt(length - 1)) {
				result = false;
			}

		}
		System.out.println((result == false) ? "no" : "yes");
	}

}