package com.learning.samples;

public class ClassLoading {

	public static void main(String[] args) {

		// final C c = new C();
//		C.sayHello();
	}

}

class A {
	static {
		System.out.println("THIRD");
	}
}

class B extends A {
	static {
		System.out.println("SECOND");
	}
}

class C extends B {
	static {
		System.out.println("FIRST");
	}

	public static void sayHello() {
		System.out.println("hello");
	}
}
