package com.r.selection;
// java program of simple if condition

import java.util.Scanner;

public class SimpleIf {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter any no: ");

		int i = s.nextInt();
		if ((i % 5) == 0) {
			System.out.println("we are inside the if block!");
			System.out.println("given no is divisible by 5!!");
		}
		System.out.println("we are outside the if block!");

	}

}
