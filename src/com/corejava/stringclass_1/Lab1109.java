package com.corejava.stringclass_1;

public class Lab1109 {
	public static void main(String[] args) {
		String st1 = "AB";
		String st2 = new String("AB");
		System.out.println(st1.hashCode());
		System.out.println(st2.hashCode());
		System.out.println(st1 == st2);
	}
}
