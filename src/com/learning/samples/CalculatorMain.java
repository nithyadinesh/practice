package com.learning.samples;

public class CalculatorMain {
	public static void main(String[] args) {

		final int sum = Calculator.add(10, 25);
		System.out.println("sum of 10 and 25 is " + sum);

		final int sum2 = Calculator.add(10, 10);
		System.out.println("sum of 10 and 25 is " + sum2);

//		final Human vishwa = new Human();
//		vishwa.setFirstName("Vishwa Vardhan");
//		vishwa.setLastName("Dinesh Kumar");
//		System.out.println(vishwa.getName());
//
//		final Human nithya = new Human();
//		nithya.setFirstName("Nithya");
//		nithya.setLastName("Dinesh Kumar");
//		System.out.println(nithya.getName());

		Human.setFirstName("Vishwa");
		Human.setFirstName("Nithya");
		Human.setLastName("Dinesh Kumar");
		System.out.println(Human.getName());

	}
}
