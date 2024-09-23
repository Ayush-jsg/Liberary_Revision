package com.r.Exception;
//write java program on try-catch blocks

public class Demo {
	public static void main(String[] args) {

		int a, b, c;
		try {
			a = 0;
			b = 10;
			c = b / a;
			System.out.println("this line will not executed");

		} catch (ArithmeticException e) {
			System.out.println("catch block : Divided by zero");

		}
		System.out.println("after exception is handled");
	}
}
