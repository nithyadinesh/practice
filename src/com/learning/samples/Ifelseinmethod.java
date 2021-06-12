package com.learning.samples;

public class Ifelseinmethod {

	public static void main(String[] args) {
		checkcode(5);
	}

	private static void checkcode(int i) {
		if (i == 560076) {
			System.out.println("access granted");
		} else if (i != 560076) {
			System.out.println("access denied");
		}
	}
}