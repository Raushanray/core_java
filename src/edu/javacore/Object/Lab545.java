package edu.javacore.Object;

public class Lab545 {
	public static void main(String[] args) {
		Hello h = new Hello();
		System.out.println(h.a);
		h.a = 99;
		System.out.println(h.a);
	}
}

class Hello {
	int a;
}