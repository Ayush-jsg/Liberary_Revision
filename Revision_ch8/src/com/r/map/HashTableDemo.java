package com.r.map;

import java.util.Hashtable;

public class HashTableDemo {
	public static void main(String[] args) {

		Hashtable<String, Integer> ht = new Hashtable<String, Integer>();

		ht.put("sachin", 200);
		ht.put("rohit", 264);
		ht.put("sehwag", 219);
		ht.put("ganguly", 183);
		ht.put("dhoni", 183);
		System.out.println(ht);
	}

}
