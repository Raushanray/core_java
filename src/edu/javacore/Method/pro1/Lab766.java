package edu.javacore.Method.pro1;

public class Lab766 {
	public static void main(String[] args) {
		Hello21 h = new Hello21();
		int arr1[] = new int[] { 10 };
		int arr2[] = new int[] { 10, 30, 12 };
		h.show(arr1, arr2);
	}
}

class Hello21 {
	void show(int... arr[]) {
		System.out.println("\nshow(int[]...)");
		for (int[] tmp : arr) {
			for (int a : tmp)
				System.out.println(a + " ");
			System.out.println();
		}
	}
}
