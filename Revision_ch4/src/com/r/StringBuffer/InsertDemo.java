package com.r.StringBuffer;

public class InsertDemo {
	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("test");
		sb.insert(2, 123);
		System.out.println(sb);
	}

}
