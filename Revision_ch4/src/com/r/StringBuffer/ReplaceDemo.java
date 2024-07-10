package com.r.StringBuffer;

public class ReplaceDemo {
	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("Hello world");
		sb.replace(6, 11, "java");
		System.out.println(sb);
	}

}
