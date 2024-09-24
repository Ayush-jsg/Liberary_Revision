package com.r.cursor;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListDemo2 {
	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<>();
		al.add("ashok");
		al.add("it");
		al.add("java");
		al.add("training");
		System.out.println(al);

		ListIterator<String> li = al.listIterator();

		while (li.hasNext()) {
			String n = li.next();
			System.out.println(n);
		}

	}

}
