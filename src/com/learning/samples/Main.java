package com.learning.samples;

class OuterClass {
	int x = 5;

	public class Innerclass {
		int y = 9;
	}
}

public class Main {
	public static void main(String[] args) {
		final OuterClass out = new OuterClass();
		final OuterClass.Innerclass in = out.new Innerclass();
		System.out.println(out.x + in.y);

	}
}