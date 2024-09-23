package com.r.Exception;

public class WrapperDemo {
	public static void main(String[] args) {

		Integer a, b;
		a = new Integer(10);
		a = 10;
		b = 20;
		int c = a.intValue() + b.intValue();
		int d = a + b;
		System.out.println(d);
	}

}
