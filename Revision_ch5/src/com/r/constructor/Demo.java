package com.r.constructor;

// write java program to constructor overloading

public class Demo {

	int age;
	String name;

	Demo(int a, String n) {
		age = a;
		name = n;

	}

	Demo(String n) {
		name = n;

	}

	public static void main(String[] args) {
		Demo d = new Demo(18, "Monu");
		System.out.println("Age : " + d.age);
		System.out.println("Name : " + d.name);

		Demo d1 = new Demo("Ayush");
		System.out.println("Age : " + d1.age);
		System.out.println("Name : " + d1.name);

	}

}
