package com.learning.samples;

public class FinalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final FinalSample finalSample1 = new FinalSample(100);
		final FinalSample finalSample2 = new FinalSample(200);
		System.out.println("Final sample - value of x is " + finalSample1.getX());
		System.out.println("Final sample - value of x is " + finalSample2.getX());

		System.out.println("Final Sample - vlaue of y is " + FinalSample.y);
		System.out.println("Final Sample - vlaue of y is " + finalSample1.y);
		System.out.println("Final Sample - vlaue of y is " + finalSample2.y);
	}

}
