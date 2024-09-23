package com.r.Accessmodifiers;
//accessing parents class variable in child class

class Vehicle {
	String vehicletype;
}

public class Car extends Vehicle {
	String modeltype;

	public void sowdetail() {
		vehicletype = "car";
		modeltype = "sport";
		System.out.println(modeltype + " " + vehicletype);
	}

	public static void main(String[] args) {
		Car c = new Car();
		c.sowdetail();

	}

}
