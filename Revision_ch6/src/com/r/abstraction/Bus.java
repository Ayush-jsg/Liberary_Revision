package com.r.abstraction;

interface Vehicle2 {
	static void cleanvehicle() {
		System.out.println("i am cleaning vehicle");
	}
}

public class Bus implements Vehicle2 {

	public static void main(String[] args) {
		Vehicle2.cleanvehicle();
	}

}
