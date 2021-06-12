package com.learning.samples;

public class FirstProgram {

	public static void main(String[] args) {
		// calculator
		System.out.println("Hello Nithya");
		System.out.println("HI Vishwa");

		System.out.println("sum of 1 and 5 is " + (1 / 5));

		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0)
				System.out.println(" 5 + " + i + " = " + (5 + i));

		}
		for (int i = 1; i <= 10; i++) {
			System.out.println("10 - " + i + "=" + (10 - i));

		}
		for (int i = 0; i <= 10; i++) {
			System.out.println("5 * " + i + "=" + (5 * i));

		}
		for (int i = 1; i <= 10; i++) {
			System.out.println("5 / " + i + "=" + ((float) 5 / i));
		}

		final int input = 12347;
		final int result = sumOfNumber(input);

		System.out.println("Input Number is " + input);
		System.out.println("Result is " + result);

	}

	private static int sumOfNumber(final int input) {
		int i = input;
		int result = 0;
//		System.out.println("input % 10 = " + input % 10);
//		System.out.println("result=" + input % 10);
//		System.out.println("input / 10 = " + input / 10);

		result = result + i % 10;

		i = i / 10;
		result = result + i % 10;

		i = i / 10;
		result = result + i % 10;

		i = i / 10;
		result = result + i % 10;

		i = i / 10;
		result = result + i;

		return result;

	}

}
