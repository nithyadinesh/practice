package com.learning.samples;

public class Human {

	private static String firstName;
	private static String lastName;

	public static void setFirstName(String abc) {
		firstName = abc;
	}

	public static void setLastName(String def) {
		lastName = def;
	}

	public static String getFirstName() {
		return firstName;
	}

	public static String getLastName() {
		return lastName;
	}

	public static String getName() {
		return firstName + " " + lastName;
	}

}
