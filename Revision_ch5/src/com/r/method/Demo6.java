package com.r.method;

import java.util.Arrays;

// Method with array as parameter & without return type 

public class Demo6 {

	void print(int[] arr) {
		System.out.println(Arrays.toString(arr));

	}

	public static void main(String[] args) {
		Demo6 d = new Demo6();
		int[] arr = { 10, 20, 30, 40 };
		d.print(arr);
	}
  
}
