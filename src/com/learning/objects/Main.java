package com.learning.objects;

public class Main {

	public static void main(String[] args) {

		final Person a = new Person();
		a.setName("Ana");
		System.out.println("Name is " + a.getName());

		final Person b = new Person();
		b.setName("Elsa");
		System.out.println("Name is " + b.getName());

		a.setName("Shinchan");
		System.out.println("Name is " + a.getName());

		System.out.println("Name is " + b.getName());

		final Person c = new Person("Olaf");
		System.out.println("Name is " + c.getName());
		c.sayHello();

	}

}
