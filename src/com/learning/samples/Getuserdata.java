package com.learning.samples;

import java.util.Scanner;

public class Getuserdata extends Methodoverload {

	public static void main(String[] args) {
		final Scanner myobj = new Scanner(System.in);
		System.out.println("please enter the otp");
		final String otp = myobj.nextLine();
		System.out.println("your otp is " + otp);
		final Getuserdata dna = new Getuserdata();
		final float k = dna.add(5, 6);
		System.out.println("result" + k);
	}

}
