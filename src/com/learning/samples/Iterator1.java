package com.learning.samples;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator1 {

	public static void main(String[] args) {
		final ArrayList<String> cars = new ArrayList<String>();
		cars.add("maruthi");
		cars.add("benz");
		cars.add("ford");
		cars.add("audi");
		final Iterator<String> it = cars.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
