package com.r.Array;

//java program to print the elements of an array present on even position 

public class EvenDemo {

	public static void main(String[] args) {

		int a[] = { 10, 20, 30, 40, 50, 60, 70 };

		for (int i = 0; i < a.length; i += 2) {
			System.out.println(a[i]);
		}
	}

}
