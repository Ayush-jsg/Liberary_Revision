package com.r.abstraction;

//program on abstract class & abstract method

abstract class Vehicle {
	public abstract void engine();
}

public class Car extends Vehicle {
	public void engine() {
		System.out.println("car engine");
	}

	public static void main(String[] args) {
		Vehicle v = new Car();
		v.engine();
	}

}
