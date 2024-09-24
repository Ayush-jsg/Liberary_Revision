package com.r.List;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {

		LinkedList ll = new LinkedList();
		ll.add("Ashok");
		ll.add(40);
		ll.add(null);
		ll.add("Ashok");
		System.out.println(ll);
		ll.add(0, "java");
		System.out.println(ll);
		ll.set(0, "oracle");
		System.out.println(ll);
		ll.removeLast();
		System.out.println(ll);
		ll.addFirst("ashok");
		System.out.println(ll);
	}

}
