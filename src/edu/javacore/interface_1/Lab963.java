package edu.javacore.interface_1;

interface Inter4 {
	void m1();

	public abstract void m2();

	int a = 10;
	public final int b = 20;
}

class Hello3 implements Inter4 {
	void m1();

	{
		System.out.println("Hello->m1()");
	}

	public void m2() {
		System.out.println("Hello->m2()");
	}
}

public class Lab963 {
	public static void main(String[] args) {
		System.out.println("Hello Guys!");
	}
}
