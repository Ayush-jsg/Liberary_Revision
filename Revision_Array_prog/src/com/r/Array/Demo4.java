package com.r.Array;

public class Demo4 {

	// java program to find 3rd largest number in an array

	public static void main(String[] args) {

		int a[] = { 30, 52, 99, 67, 84, 21, 13, 75 };

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
		System.out.println("Third largest elements = " + a[2]);
	}

}
