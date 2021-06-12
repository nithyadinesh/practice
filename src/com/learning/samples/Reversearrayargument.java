package com.learning.samples;

public class Reversearrayargument {

	public static void main(String[] args) {
		printarray(reverse(new int[] { 1, 2, 3, 4, 5 }));
	}

	private static void printarray(int[] arr) {
		for (final int element : arr) {
			System.out.print(element + " ");
		}
	}

	private static int[] reverse(int list[]) {

		final int[] result = new int[list.length];
		final int len = result.length;
		for (int i = 0, j = len - 1; i < len; i++, j--) {
			result[j] = list[i];
		}
		return result;
	}

}
