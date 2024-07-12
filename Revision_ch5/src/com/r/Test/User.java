package com.r.Test;

//Write java program of instance/global variables

public class User {

	int age;

	public static void main(String[] args) {
		User raju = new User();
		raju.age = 20;
		System.out.println(raju.age);

		User rani = new User();
		rani.age = 18;
		System.out.println(rani.age);

	}

}
