package com.corejava.stringclass_1;

public class Lab1097 {
	public static void main(String[] args) {
		char cArr[] = { 'J', 'L', 'C', 'I', 'N', 'D', 'I', 'A' };
		byte bArr[] = { 65, 66, 67, 68, 69, 98, 97, 50 };
		String st1 = new String(cArr, 3, 5);
		String st2 = new String(bArr, 3, 5);
		System.out.println("st1: " + st1);
		System.out.println("st2: " + st2);
	}
}
