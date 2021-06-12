package com.learning.samples;

public class Dontrepeat {

	public static void main(String[] args) {
		final String num = "1223";
		// mymethod myobj = new mymethod();
		System.out.println("length" + num.length());
		mymethod(num);

	}

	static void mymethod(String num) {
		final int j = num.length() - 1;
		for (int i = 0; i < j; i++) {
			// System.out.println("i" + i);
			// System.out.println("j" + j);
			// System.out.println("char at i " + num.charAt(i));
			// System.out.println("char at i+1 " + num.charAt(i + 1));
			if (num.charAt(i) != num.charAt(i + 1)) {
				System.out.println(num.charAt(i));
				if (i == j - 1)
					System.out.println(num.charAt(i + 1));

			} else {
				System.out.println(num.charAt(i));
			}
		}
	}
}
