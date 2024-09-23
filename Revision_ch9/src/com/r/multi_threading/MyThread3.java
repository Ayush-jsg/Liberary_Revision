package com.r.multi_threading;

public class MyThread3 implements Runnable {
	public void run() {
		Thread t = Thread.currentThread();
		for (int i = 1; i <= 5; i++) {
			System.out.println(t.getName() + "Thread value: " + i);

		}

	}

	public static void main(String[] args) {
		MyThread3 mt1 = new MyThread3();
		MyThread3 mt2 = new MyThread3();
		MyThread3 mt3 = new MyThread3();

		Thread t1 = new Thread(mt1);
		Thread t2 = new Thread(mt2);
		Thread t3 = new Thread(mt3);

		t1.start();
		t2.start();
		t3.start();

	}

}
