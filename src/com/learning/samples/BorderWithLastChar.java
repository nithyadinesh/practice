package com.learning.samples;

public class BorderWithLastChar {

	public static void main(String[] args) {
	System.out.println(backAround("cat"));	

	}
	public static String backAround(String str) {
		  char lastChar = str.charAt(str.length()-1);
		  String result="";
		  if(str.length()>=1){
		   result = Character.toString(lastChar)+str+Character.toString(lastChar);
		  }
		  return result;
		}

}
