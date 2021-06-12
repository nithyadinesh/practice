package com.learning.samples;

public class Oddadd {

	public static void main(String[] args) {
		final String num = "11123";
		// System.out.println(num.substring(0, 2));
		mymethod(num);
	}

	private static void mymethod(String num) {
		final int j = num.length() - 1;
		for (int i = 0; i <= j; i++) {
			if (i % 2 != 0) {
				int k = 0;
				k = k + new Integer(num.substring(i, i + 1));
				System.out.println("oddadd is " + k);
			}

		}

	}

}
