package com.r.Test;

// 

public class Demo2 {

	double width, height, depth;

	Demo2(double w, double h, double d) {
		this.width = w;
		this.height = h;
		this.depth = d;

	}

	public static void main(String[] args) {
		Demo2 d = new Demo2(10, 20, 30);
		System.out.println("Width = " + d.width);
		System.out.println("Height = " + d.height);
		System.out.println("Depth = " + d.depth);

	}

}
