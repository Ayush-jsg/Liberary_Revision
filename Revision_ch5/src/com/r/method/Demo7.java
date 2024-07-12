package com.r.method;

//Method with int as parameter & with boolean return type 

public class Demo7 {

	boolean check(int age) {
		if (age >= 18) {
			return true;

		} else {
			return false;
		}

	}

	public static void main(String[] args) {
		Demo7 d = new Demo7();
		boolean status = d.check(17);
		System.out.println("Eligible for vote :: " + status);
	}

}
