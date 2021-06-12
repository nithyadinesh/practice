package com.learning.samples;

public class Factorial {

	public static void main(String[] args) {
		final int result = fact(-1);
		System.out.println(result);

	}

	private static int fact(int var) {
		if (var > 0) {
			return var = var * fact(var - 1);
		} else if (var == 0) {
			return 1;
		} else {
			System.out.println("please give valid input");
//			throw new RuntimeException("Invalid Input. Enter positive number only.");
			return -1;
		}
	}

}
