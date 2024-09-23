package com.r.abstraction;

interface Vehicle1 {

	void cleanvehicle();

	default void startvehicle() {
		System.out.println("vehicle is starting");
	}
}

public class Thar implements Vehicle1 {

	@Override
	public void cleanvehicle() {
		System.out.println("cleaning the vehicle");

	}

	public static void main(String[] args) { 
		Thar t = new Thar();
		t.cleanvehicle();
		t.startvehicle();
	}

}
