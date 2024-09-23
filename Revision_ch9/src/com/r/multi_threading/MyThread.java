package com.r.multi_threading;

public class MyThread extends Thread {

	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("user Thread value: " + i);
		}
	}

	public static void main(String[] args) {
		MyThread mt = new MyThread();
		Thread t = new Thread(mt);
		t.start();
	}

}
