package com.r.method;

//method with return type & with parameter

public class Demo4 {

	int add(int a, int b) {
		int c = a + b;
		return c;

	}

	public static void main(String[] args) {
		Demo4 d = new Demo4();
		int sum = d.add(60, 40);
		System.out.println("sum :: " + sum);
	}

}
