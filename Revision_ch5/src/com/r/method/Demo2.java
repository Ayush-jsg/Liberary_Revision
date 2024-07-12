package com.r.method;
//method with parameter & without Return type

public class Demo2 {

	void add(int a, int b) {
		int c = a + b;
		System.out.println("Addition = " + c);

	}

	public static void main(String[] args) {
		Demo2 d = new Demo2();
		d.add(20, 30);
	}

}
