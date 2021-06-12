package com.learning.samples;

public class Differentnum {

	public static void main(String[] args) {
		final String num = "110";
		mymethod(num);

	}

	private static void mymethod(String num) {
		final int j = num.length();
		for (int i = 0; i < j; i++) {
			if ((i + 1) != j && num.charAt(i) != num.charAt(i + 1)) {
				System.out.println(num.charAt(i + 1));
				break;
			}

		}

	}

}
