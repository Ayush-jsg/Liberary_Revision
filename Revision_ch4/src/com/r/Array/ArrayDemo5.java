package com.r.Array;

public class ArrayDemo5 {

	public static void main(String[] args) {

		int arr[][] = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 } };

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("element at first row and second column: " + arr[0][1]);
	}

}
