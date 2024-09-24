package com.r.List;

import java.util.ArrayList;

public class ArraylistDemo {
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add("Ashok");
		al.add(101);
		al.add(202.05);
		System.out.println(al);
		al.remove(1);
		System.out.println(al);
		al.add("hyd");
		al.add("java");
		System.out.println(al);
	}

}
