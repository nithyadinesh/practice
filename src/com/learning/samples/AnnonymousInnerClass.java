package com.learning.samples;

interface talent {
	public void dancing();
}

public class AnnonymousInnerClass {

	public static void main(String[] args) {

		final AnnonymousInnerClass an = new AnnonymousInnerClass();
		an.createClass();

	}

	private static void createClass() {
		talent t1 = new talent() {
			public void dancing() {
				System.out.println("iam good in dancing and singing");
			}
		};
		t1.dancing();
	}

}
