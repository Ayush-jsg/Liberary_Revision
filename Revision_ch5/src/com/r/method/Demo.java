package com.r.method;

//method without parameter & without Return type

public class Demo {

	void add() {
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println("Addition = " + c);
	}

	public static void main(String[] args) {

		Demo d = new Demo();
		d.add();

	}

}
