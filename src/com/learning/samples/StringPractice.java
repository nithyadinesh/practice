package com.learning.samples;

public class StringPractice {
	public static void main(String[] args) {
		final String s = " A";
		final int k = s.indexOf(" ");
		System.out.println("value of k is " + k);
		if (k != -1) {
			System.out.println(s.subSequence(k + 1, k + 3));
		}
	}
}
