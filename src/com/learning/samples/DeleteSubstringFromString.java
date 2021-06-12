package com.learning.samples;

public class DeleteSubstringFromString {

	public static void main(String[] args) {
		System.out.println(delDel("adeleb"));

	}
	public static String delDel(String str) {
		String d = "dele";
		  if(str.length()>3 && (str.substring(1,d.length()+1).equals(d))){
		   StringBuilder build = new StringBuilder(str);
		   StringBuilder str1 = build.delete(1,d.length()+1);
		   return str1.toString();
		  }
		  return str;
	}
}
