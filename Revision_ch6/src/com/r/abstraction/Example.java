package com.r.abstraction;

//functional interface example 

interface Sayble {
	void say(String msg);
}

public class Example implements Sayble {
	public void say(String msg) {
		System.out.println(msg);

	}

	public static void main(String[] args) {
		Example ex = new Example();
		ex.say("hello there");
	}

}
