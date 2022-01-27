package edu.javacore.dispatch;

public class Employee extends Person {
	void walking() {
		System.out.println("Employee-> walking()");
	}

	void sleeping() {
		System.out.println("Employee-> sleeping()");
	}

	static void working() {
		System.out.println("Employee-> working()");
	}
}
