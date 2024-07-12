package com.r.method;
//method without parameter & with Return type

public class Demo3 {

	int add() {
		int a = 10;
		int b = 20;
		int c = a + b;

		return c;

	}

	public static void main(String[] args) {
		Demo3 d = new Demo3();
		int sum = d.add();

		System.out.println("sum :: " + sum);
	}

}
