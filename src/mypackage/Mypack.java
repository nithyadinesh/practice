package mypackage;

import java.util.Scanner;

public class Mypack {

	public static void main(String[] args) {
		System.out.println("please enter some string");
		final Scanner myobj = new Scanner(System.in);
		final String r = myobj.nextLine();
		System.out.println("given value " + r);
	}

}
