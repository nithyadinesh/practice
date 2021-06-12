package com.learning.samples;

public class VehicleMain {

	public static void main(String[] args) {

		final Car c = new Car();
		c.sayHello();
		c.honk();
		c.print();
		final Vehicle v = new Car();
//		v.honk();

		final Human h = new Human();

	}

}
