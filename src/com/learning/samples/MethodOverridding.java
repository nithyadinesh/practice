package com.learning.samples;

class parent {
	protected void display() {
		System.out.println("iam animal");
	}
}

class child extends parent {
	@Override
	protected void display() {
		System.out.println("iam cat");
		super.display();
	}
}

public class MethodOverridding {

	public static void main(String[] args) {
		final child c1 = new child();
		c1.display();
	}

}
