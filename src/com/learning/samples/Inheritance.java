package com.learning.samples;

class Animal {
	protected static void sleep() {
		System.out.println("i will sleep");
	}
}

class Dog extends Animal {
	public static void eat(String name) {
		System.out.println("my name is " + name);
		System.out.println("i like bones");
	}
}

public class Inheritance {

	public static void main(String[] args) {

		Dog.eat("bull bull");
		Animal.sleep();
	}

}
