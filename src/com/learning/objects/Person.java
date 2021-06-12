package com.learning.objects;

class Person {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person() {
		super();
		System.out.println("Default constructor is called");
	}

	public Person(String name) {
		super();
		this.name = name;
	}

	protected void sayHello() {
		System.out.println("Hello");
	}

}
