package edu.javacore.switch_statement_326;

public class Lab345 {
	public static void main(String[] args) {
		int a = 23;
		switch (a) {
		default:
			System.out.println("DEFAULT");
			break;
		case 10:
			System.out.println("ten");
			break;
		case 10 + 10:
			System.out.println("twenty");
			break;
		}
	}
}
