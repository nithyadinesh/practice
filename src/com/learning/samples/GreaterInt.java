package com.learning.samples;

public class GreaterInt {

	public static void main(String[] args) {
		System.out.println(max1020(3,17));

	}
	public static int max1020(int a, int b) {
		  int temp;
		  if(b>a) {
			  temp = a;
			  a = b;
			  b = temp;
		  }
		  if(a>=10 && a<=20) return a;
		  if(b>=10 && b<=20) return b;
		  return 0;
		}


}
