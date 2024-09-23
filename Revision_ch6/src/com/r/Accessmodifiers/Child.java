package com.r.Accessmodifiers;

//inheritance example accessing parents class variable in child class 

class Parents {
	public void p1() {
		System.out.println("parents method");
	}

}

public class Child extends Parents {
	public void c1() {
		System.out.println("child method");
	}

	public static void main(String[] args) {

		Child c = new Child();
		c.c1();
		c.p1();
	}

}
