package com.learning.samples;

public class Methodoverload {

	public static void main(String[] args) {
		final Methodoverload obj = new Methodoverload();
		// add(3, 5);
		// System.out.println();
		System.out.println(obj.add(3, 4));

	}

	protected float add(float d, float e) {
		final float result = d + e;
		return result;

	}

	private static int add(int i, int j, int k) {
		final int result = i + j + k;
		return result;

	}

	private int add(int i, int j) {
		final int result = i + j;
		return result;

	}

}
