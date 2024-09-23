package com.r.constructor;

//write java program to parameterized constructor

public class User {

	int age;
	String name;

	User(int a, String n) {
		age = a;
		name = n;

	}

	public static void main(String[] args) {
		User u = new User(20, "Monu");
		System.out.println("Age : " + u.age);
		System.out.println("Name : " + u.name);
	}

}
