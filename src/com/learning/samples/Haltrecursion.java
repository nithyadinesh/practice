package com.learning.samples;

public class Haltrecursion {

	public static void main(String[] args) {
		final int result = sum(1, 10);
		System.out.println(result);

	}

	private static int sum(int start, int end) {
		if (end > start) {
			return end = end + sum(start, end - 1);
		} else {
			return end;
		}
	}

}
