package com.r.Array;
//java program to print the largest elements of an array

public class LargestDemo {
	public static void main(String[] args) {

		int a[] = { 102, 403, 509, 34, 668, 999 };

		int max = a[0];

		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];

			}
		}
		System.out.println(max);
	}

}
