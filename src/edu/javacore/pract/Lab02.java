package edu.javacore.pract;

class Hello1 {
	char ch;

	void show() {
		System.out.println("Value of ch== '' is " + ch);
		System.out.println("Value of ch==0 is " + ch);
		System.out.println("Value of ch== '\u0000' is " + ch);

	}

}
public class Lab02 {

	public static void main(String[] args) {
		Hello1 h1 = new Hello1();
		h1.show();

	}
}
