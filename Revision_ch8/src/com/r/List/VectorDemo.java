package com.r.List;

import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {

		Vector<String> v = new Vector<String>();
		v.add("sachin");
		v.add(new String("sahwag"));
		v.add("virat");
		v.add("dhoni");
		v.add("raina");
		System.out.println(v);
		System.out.println(v.size());
	}

}
