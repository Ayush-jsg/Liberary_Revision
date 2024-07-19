package com.r.Array;

// java program to find 2nd largest number in an array

public class Demo3 {

	public static void main(String[] args) {

		int a[] = { 3, 5, 9, 6, 8, 2, 1, 7 };

		int temp;

		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}

			}
		}
		System.out.println("Second largest elements = " + a[1]);
	}

}
