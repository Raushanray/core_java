package com.javacore.wrapper.class_1;

public class Lab1180 {
	public static void main(String[] args) {
		Boolean b1 = true;
		Boolean b2 = true;
		System.out.println(b1 == b2);
		Boolean b = true;
		Boolean b3 = new Boolean(b);
		Boolean b4 = new Boolean(b);
		System.out.println(b3 == b4);
	}
}
