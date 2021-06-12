package com.learning.samples;

public class Arrayforeach {

	public static void main(String[] args) {
		final int[] numbers = { 20, 4, 5, 7 };
		for (final int x : numbers) {
			System.out.println(x);
		}
		final String[] names = { "anoo", "baloo", "caloo", "daloo" };
		for (final String y : names) {
			System.out.println(y);
		}
	}

}
