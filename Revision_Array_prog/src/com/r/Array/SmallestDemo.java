package com.r.Array;

//java program to print the smallest elements of an array

public class SmallestDemo {

	public static void main(String[] args) {

		int a[] = { 120, 503, 409, 666, 99, 703 };

		int min = a[0];

		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];

			}
		}
		System.out.println(min);
	}

}
