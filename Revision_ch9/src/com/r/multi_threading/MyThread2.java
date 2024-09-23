package com.r.multi_threading;

public class MyThread2 implements Runnable {
	public void run() {
		Thread t = Thread.currentThread();
		for (int i = 1; i <= 5; i++) {
			System.out.println(t.getName() + "Thread value: " + i);

		}

	}

	public static void main(String[] args) {
		MyThread2 mt = new MyThread2();
		Thread t = new Thread(mt);
		t.start();
		t.run();

	}

}
