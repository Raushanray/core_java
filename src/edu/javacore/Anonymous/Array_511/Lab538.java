package edu.javacore.Anonymous.Array_511;

public class Lab538 {
	public static void main(String[] args) {
		int arr[][] = { { 10, 23, 21 }, { 12 }, { 23, 43, 12, 32 }, { 98, 34, 32 } };
		for (int ar[] : arr) {
			for (int a : ar) {
				System.out.print("\t" + a);
				

			}
			System.out.println();
		}
	}
}
