package com.javacore.package_1;

public class Lab1034 {
	public static void main(String[] args) {
		Student_1 st1 = null;
		System.out.println(st1);
		st1 = new Student_1(99, "Raushan");
		System.out.println(st1);
		String str = new String("java is a computer lang");
		System.out.println(str);
		Integer ref = new Integer(123);
		System.out.println(ref);
	}
}

class Student_1 {
	int sid;
	String name;

	Student_1(int sid, String name) {
		this.sid = sid;
		this.name = name;
	}
}