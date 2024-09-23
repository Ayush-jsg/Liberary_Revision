package com.r.Accessmodifiers;

//example on super keyword variable & method invocation
class Parent {
	String name;

	void details() {
		System.out.println(name.toUpperCase());
	}
}

public class Child2 extends Parent {
	String name;

	public void details() {
		super.name = "parent";

		name = "Child"; 
		System.out.println(super.name + "and" + name);
		super.details();

	}

	public static void main(String[] args) {
		Child2 cobj = new Child2();
		cobj.details();

	}
}
