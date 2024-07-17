package com.r.Array;

//java program to print the sum of all the items of an array

public class SumDemo {
	public static void main(String[] args) {

		int a[] = { 10, 20, 30, 40, 50, 60, 70 };
		int sum = a[0];

		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		System.out.println(sum);
	}

}
