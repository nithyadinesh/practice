package com.learning.samples;

public class MyTrial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mymethod();
		mymethod();
		final String s = myMethod2();
		System.out.println(s);
	}

	private static String myMethod2() {
		return "my string";

	}

	static void mymethod() {
		System.out.println("hello mytrial");
	}

}
