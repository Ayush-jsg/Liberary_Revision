package com.r.Array;
//java program to print the elements of an array present on odd position 

public class OddDemo {
	public static void main(String[] args) {

		int a[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };

		for (int i = 1; i < a.length; i += 2) {
			System.out.println(a[i]);
		}
	}

}
	