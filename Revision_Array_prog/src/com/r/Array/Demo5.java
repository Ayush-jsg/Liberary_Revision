package com.r.Array;
//java program to find 2nd smallest number in an array

public class Demo5 {

	public static void main(String[] args) {

		int a[] = { 33, 12, 19, 37, 24, 29, 43, 75 };

		int temp;

		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if (a[i] > a[j]) {
					temp = a[i];
					a  [i] = a[j];
					a[j] = temp;
				}

			}
		}
		System.out.println("Second smallest elements = " + a[1]);
	}

}
