package com.r.String;

public class SplitDemo {
	public static void main(String[] args) {

		String s1 = "thexyzwebsitexyzisxyzashokitxyzhelp";
		String[] st = s1.split("xyz");
		for (String str : st) {

			System.out.println(st);
		}

	}

}
