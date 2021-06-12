package com.learning.samples;

import java.util.Scanner;

public class Palindronenew {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		int length = A.length();
		int k = 0;
		// boolean result = true;
		for (int i = 0; i < length - 1; i++, length--) {
			if (A.charAt(i) != A.charAt(length - 1)) {
				k = 1;
			}
		}
		System.out.println((k == 0) ? "yes" : "no");
	}

}
