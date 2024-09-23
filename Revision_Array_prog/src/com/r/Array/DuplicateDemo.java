package com.r.Array;

//write java program on duplicate array

public class DuplicateDemo {

	public static void main(String[] args) {

		int[] a = { 4, 3, 5, 4, 2, 6, 2, 3, 8, 9 };

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.println(a[i]);

				}
 
			}

		}
	}

}
