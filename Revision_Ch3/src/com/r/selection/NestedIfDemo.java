package com.r.selection;

import java.util.Scanner;

// java program on Nested If 

public class NestedIfDemo {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter any no");

		int i = s.nextInt();

		if (i < 100) {
			System.out.println("given no is below 100");
			if (i % 2 == 0)
				System.out.println("And it is even");
			else
				System.out.println("And it is odd");
		} else
			System.out.println("given no is not below 100");

		System.out.println("We are outside if block!!");
	}

}
