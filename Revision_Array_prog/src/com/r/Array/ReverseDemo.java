package com.r.Array;

//java program to print the elements of an array in reverse order 

public class ReverseDemo {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 6 };

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("===================");

		for (int i = a.length - 1; i >= 0; i--) {
			System.out.print(a[i] + " ");

		}
	}

}
