package com.r.StringBuffer;

public class StringVsStringBufferDemo {
	public static void main(String[] args) {

		String str = "Ashok";
		str.concat("it");
		System.out.println(str);

		StringBuffer sb = new StringBuffer("ashok");
		sb.append("it");

		System.out.println(sb);
	}

}
