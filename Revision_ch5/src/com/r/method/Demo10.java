package com.r.method;

//instance & static methods example

public class Demo10 {

	void sayHello() {
		System.out.println("Hello My Friends..");

	}

	static void Greet() {
		System.out.println("Good morning");
	}

	public static void main(String[] args) {

		Demo10 d = new Demo10();
		d.sayHello();
		Demo10.Greet();
	}

}
