package com.learning.samples;

import java.util.Scanner;

public class LengthPrint {

	public static void main(String[] args) {

//		Input: abc
//		Output:
//		abc
//		abc
//		abc

		final Scanner sc = new Scanner(System.in); // System.in is a standard input stream
		System.out.print("Enter first number- ");
		final String input = sc.next();

//		final String input = "";
		for (int i = 0; i < input.length(); i++) {
			System.out.println(input);
		}
	}

}
