package com.learning.samples;

public class Arrayargument {

	public static void main(String[] args) {
		printarray(new int[] { 1, 3, 5, 7, 9 });

	}

	private static void printarray(int[] arr) {
		for (final int element : arr) {
			System.out.print(element + " ");
		}

	}

}
