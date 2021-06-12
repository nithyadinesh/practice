package com.learning.samples;

public class Vehicle {
	int a = 10, b = 20;

	public final void honk() {
		System.out.println("Honk Honk");
	}
}

class Car extends Vehicle {
	int c = a + b;

	public void print() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

	public void sayHello() {
		System.out.println("Hello");
	}

}
