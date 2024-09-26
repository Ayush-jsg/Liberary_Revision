package com.r.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		hm.put(11, "yuvraj");
		hm.put(18, "virat");
		hm.put(45, "rohit");
		System.out.println(hm);
		System.out.println(hm.size());

		Set<Integer> ks = hm.keySet();
		System.out.println(ks);

		Collection<String> c = hm.values();
		System.out.println(c);

		Set<?> entry = hm.entrySet();
		System.out.println(entry);

		System.out.println(hm.containsKey(45));

		System.out.println(hm);
	}

}
