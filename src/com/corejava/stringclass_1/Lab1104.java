package com.corejava.stringclass_1;

public class Lab1104 {
	public static void main(String[] args) {
		String exp = "[A-Z]";
		System.out.println("H".matches(exp));
		System.out.println("S".matches(exp));
		System.out.println("HI".matches(exp));
	}
}
