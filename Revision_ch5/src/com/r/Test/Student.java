package com.r.Test;

//Write java program of Static variables

public class Student {
	String name;
	String email;
	static String institute;

	public static void main(String[] args) {

		Student.institute = "Ashok";
		System.out.println(Student.institute);

		Student ankit = new Student();
		ankit.name = "Ankit";
		System.out.println(ankit.name);

		Student gautam = new Student();
		gautam.name = "Gautam";
		System.out.println(gautam.name);

	}

}
