package com.r.Array;

import java.util.Arrays;

//write java program sort descending arrays

public class SortDemo {
	public static void main(String[] args) {
		int[] a = { 4, 2, 6, 3, 1, 5 };

		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}
}
