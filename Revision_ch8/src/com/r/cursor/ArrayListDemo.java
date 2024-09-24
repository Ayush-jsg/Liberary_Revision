package com.r.cursor;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("ashok");
		al.add("it");
		al.add("java");
		al.add("training");
		System.out.println(al);

		Iterator<String> i = al.iterator();

		while (i.hasNext()) {
			String n = i.next();
			System.out.println(n);
		}

	}

}
