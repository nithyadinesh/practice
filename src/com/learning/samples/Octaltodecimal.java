package com.learning.samples;

public class Octaltodecimal {

	public static void main(String[] args) {
		System.out.println("decimal value " + octalToDecimal(781));

	}

	private static int octalToDecimal(int octal) {
		int decimal = 0;
		int i = 0;
		while (octal > 0) {

			final int remainder = octal % 10;
			decimal += remainder * Math.pow(8, i);
			octal = octal / 10;
			i++;
		}
		return decimal;

	}

}
