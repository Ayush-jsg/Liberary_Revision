package com.r.multi_threading;

public class MyThread4 extends Thread {

	public void run() {
		if (Thread.currentThread().isDaemon()) {
			System.out.println("daemon thread work");

		} else {
			System.out.println("user thread work");
		}
	}

	public static void main(String[] args) {
		MyThread4 mt1 = new MyThread4();
		MyThread4 mt2 = new MyThread4();
		MyThread4 mt3 = new MyThread4();
		mt1.setDaemon(true);
		mt1.start();
		mt2.start();
		mt3.start();

	}

}
