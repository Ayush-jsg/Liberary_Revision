package com.r.set;

import java.util.LinkedHashSet;

public class LHSDemo {
	public static void main(String[] args) {

		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		lhs.add(27);
		lhs.add(12);
		lhs.add(null);
		lhs.add(9);
		lhs.add(21);
		System.out.println(lhs);

	}

}
