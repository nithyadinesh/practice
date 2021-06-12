package com.learning.samples;

public class Reverse {
	public static void main(String[] args) {

		// Sample Input : "abcde"
		// Sample output: "ee-dd-cc-bb-aa"
		final String str = "abcde";
		String output = "";
		for (int j = str.length() - 1; j >= 0; j--) {
			if (j == 0)
				output = output + str.charAt(j) + str.charAt(j);
			else
				output = output + str.charAt(j) + str.charAt(j) + "-";
			// System.out.println("j:" + j);
			// System.out.println("output:" + output);

		}
		System.out.println("output is " + output);

	}
}
