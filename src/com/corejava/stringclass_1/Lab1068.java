package com.corejava.stringclass_1;

public class Lab1068 {
	public static void main(String[] args) {
		Student stu = new Student();
		String st1 = String.valueOf(stu);
		System.out.println(st1);
		Employee emp = new Employee();
		String st2 = String.valueOf(emp);
		System.out.println(st2);
	}
}

class Student {
}

class Employee {
	int eid;

	public String toString() {
		return "Eid: " + eid;
	}
}