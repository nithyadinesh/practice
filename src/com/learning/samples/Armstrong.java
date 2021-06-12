package com.learning.samples;

public class Armstrong {

	public static void main(String[] args) {
		int num = 159;
		final int x = 159;
		int result = 0;
		int s = 1;
		while (num != 0) {
			for (int i = 1; i <= 10; i++) {
				s = num % 10;
				result += Math.pow(s, 3);
				num = num / 10;
				break;
			}
		}
		System.out.println(result);
		if (result == x) {
			System.out.println("the given number is armstrong");

		} else {
			System.out.println("the given number is not armstrong");
		}
	}

}
