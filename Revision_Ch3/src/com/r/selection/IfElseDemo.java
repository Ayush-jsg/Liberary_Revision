package com.r.selection;
// java program on if_else 

import java.util.Scanner;

public class IfElseDemo {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any no");
		int i = s.nextInt();
		if ((i % 2) == 0) {
			System.out.println("we are inside the true block!");
			System.out.println("given no is even number");
		} else {
			System.out.println("we are inside the flase block!");
			System.out.println("given no is odd number");
		}
		System.out.println("we are outside the if block!!");
	}

}
