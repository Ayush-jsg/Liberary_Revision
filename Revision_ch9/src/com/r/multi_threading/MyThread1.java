package com.r.multi_threading;

public class MyThread1 implements Runnable {

	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("user Thread value: " + i);
		}
	}

	public static void main(String[] args) {
		MyThread1 mt = new MyThread1();
		Thread t = new Thread(mt);
		t.start();
	}

}
