package edu.javacore.Method.pro;

public class Lab709 {
	public static void main(String[] args) {
		Hello21 h = new Hello21();
		System.out.println(h.isDigit('A'));
		System.out.println(h.isDigit('8'));

	}
}

class Hello21 {
	boolean isDigit(char ch) {
		System.out.println("isDigit(): " + ch);
		boolean b = ch >= 48 && ch <= 57;
		return b;
	}
}
