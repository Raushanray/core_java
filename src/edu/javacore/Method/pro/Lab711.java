package edu.javacore.Method.pro;

public class Lab711 {
	public static void main(String[] args) {
		Hello23 h = new Hello23();
		System.out.println(h.show());
	}
}

class Hello23 {
	int show(int x) {
		System.out.println("show()");
		return x + 1;
	}
}