package com.learning.samples;

public class retrunvariable {

	public static void main(String[] args) {
		System.out.println("the sum is " + mymethos(8, 6));
	}

	private static int mymethos(int i, int j) {
		final int x = i + j;
		return x;
	}

}
