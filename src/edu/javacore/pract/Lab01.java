package edu.javacore.pract;

public class Lab01 {

	public static void main(String[] args) {
		Hello h1 = new Hello();
		//int aValue = h1.a;
		h1.show();
		//System.out.println("\"" + "Value" + "\"");
	}
}

class Hello {
	int a;
	short s;
	byte b;
	boolean b1;
	long l;
	double d;
	float f;
	String str;

	void show() {
		System.out.println("Value of a is " + a);
		System.out.println("Value of s is " + s);
		System.out.println("Value of b is " + b);
		System.out.println("Value of b1 is " + b1);
		System.out.println("Value of l is " + l);
		System.out.println("Value of d is " + d);
		System.out.println("Value of f is " + f);
		System.out.println("Value of str is " + str);
	}
    
}
