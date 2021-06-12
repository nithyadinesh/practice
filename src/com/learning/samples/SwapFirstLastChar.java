package com.learning.samples;

public class SwapFirstLastChar {

	public static void main(String[] args) {
		System.out.println(frontBack("code"));
	}

	private static String frontBack(String str) {
		char first = str.charAt(0);
		char last = str.charAt(str.length()-1);
		char temp;
		System.out.println(first);
		System.out.println(last);
		temp = first;
		first = last;
		last = temp;
		System.out.println(first);
		System.out.println(last);
		String result = Character.toString(first)+ str.substring(1,str.length()-1)+Character.toString(last);
return result;
	}

}
