package edu.javacore.Array.Dec.Construction_456;

public class Lab488 {
	public static void main(String[] args) {
		int arr[] = new int[3];
		arr[0]=23; arr[1]=65; arr[2] =98;
		int arr2[]=arr;
		System.out.println("len:" + arr.length);
		System.out.println("len:" + arr2.length);
		arr = new int[5];
		System.out.println("len:" + arr.length);
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
		System.out.println("len: " + arr2.length);
		for (int i = 0; i < arr2.length; i++)
			System.out.println(arr2[i]);

	}
}
