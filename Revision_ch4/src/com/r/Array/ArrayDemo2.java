package com.r.Array;

public class ArrayDemo2 {
	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 40, 50 };
		for (int x : arr) {
			System.out.println(x);
		}
		arr[1] = 105;
		System.out.println("elements first index: " + arr[1]);
	}

}
