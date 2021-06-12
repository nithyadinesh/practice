package com.learning.samples;

public class DeleteACharInString {

	public static void main(String[] args) {
		System.out.println(missingChar("kitten",3));
		
	}
	public static String missingChar(String str,int n) {
		StringBuilder build = new StringBuilder(str);
		build.deleteCharAt(n);
	
		return build.toString();
	}

}
