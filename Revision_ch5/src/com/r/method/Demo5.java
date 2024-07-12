package com.r.method;

//method with String return type & with String parameter

public class Demo5 {

	String print(String fname, String lname) {
		String name = fname + lname;
		return name;

	}

	public static void main(String[] args) {

		Demo5 d = new Demo5();
		String s = d.print("monu", " yadav");
		System.out.println("Name :: " + s);
	}

}
