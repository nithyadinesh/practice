package com.learning.samples;

public class Inttostring {

	public static void main(String[] args) {
		final int x = 5;
		// mymethod(x);
		final int z = x / 10;
		switch (z) {
		case 0:
		case 1:

			System.out.println(mymethod(x));

			break;
		case 2:
			mymethod2("twenty", x);
			break;
		case 3:
			mymethod2("thirty", x);
			break;
		case 4:
			mymethod2("fourty", x);
			break;
		case 5:
			mymethod2("fifty", x);
			break;
		case 6:
			mymethod2("sixty", x);
			break;
		case 7:
			mymethod2("seventy", x);
			break;
		case 8:
			mymethod2("eighty", x);
			break;
		case 9:
			mymethod2("ninety", x);
			break;

		default:
			break;
		}

	}

	public static String mymethod(int x) {
		switch (x) {
		case 1:
			return "one";

		case 2:
			return "Two";

		case 3:
			return "Three";

		case 4:
			return "four";

		case 5:
			return "five";

		case 6:
			return "six";

		case 7:
			return "seven";

		case 8:
			return "eight";

		case 9:
			return "nine";

		case 10:
			return "ten";

		case 11:
			return "eleven";

		case 12:
			return "Twelve";

		case 13:
			return "thirteen";

		case 14:
			return "fourteen";

		case 15:
			return "fifteen";

		case 16:
			return "sixteen";

		case 17:
			return "seventeen";

		case 18:
			return "eighteen";

		case 19:
			return "nineteen";

		case 20:
			return "twenty";

		default:
			return "";
		}
	}

	public static void mymethod2(String str, int x) {
		if (x > 10) {
			final int y = x % 10;

			System.out.println(str + mymethod(y));
		}
	}
}
