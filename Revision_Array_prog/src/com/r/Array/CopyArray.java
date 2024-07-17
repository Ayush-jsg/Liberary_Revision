package com.r.Array;

//write java program on copy array

public class CopyArray {
	public static void main(String[] args) {

		int farray[] = new int[] { 1, 2, 3, 4, 5 };
		int sarray[] = new int[farray.length];

		System.out.println("elements of first array");

		for (int i = 0; i < farray.length; i++) {
			System.out.println(farray[i] + " ");
		}
		System.out.println("elements of second array");
		for (int i = 0; i < farray.length; i++) {
			sarray[i] = farray[i];
		}

		for (int i = 0; i < sarray.length; i++) {
			System.out.println(sarray[i] + " ");

		}

	}

}
