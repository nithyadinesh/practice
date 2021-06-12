package com.learning.samples;

public class SumOfMultiples {

	public static void main(String[] args) {
		System.out.println(sum(10));

	}

	public static Integer sum(Integer n) {
		int result = 1;
		for (int i = 1; i <= n; i++) {

			// System.out.println(i);
			result = n * sum(n - 1);

		}
		return result;
	}

}
