package com.r.polymorphism;
//method overloading example 

class Animal {
	public void eat() {
		System.out.println("eat all eatables");
	}
}

public class Dog extends Animal {
	public void eat() {
		System.out.println("dog like to eat meat");
	}

	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat();

	}

}
