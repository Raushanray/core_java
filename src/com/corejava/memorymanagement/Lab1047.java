package com.corejava.memorymanagement;

public class Lab1047 {
	public static void main(String[] args) {
		Employee emps[] = new Employee[500];
		for (int i = 0; i < emps.length; i++) {
			// new Employee("JLC-" + (i+1));
			emps[i] = new Employee("JLC-" + (i + 1));
		}
	}
}

class Employee {
	String eid;
	double add[] = new double[123456];

	Employee(String eid) {
		this.eid = eid;
		System.out.println("\n Object Created With id: " + eid);

	}

	protected void finalize() {
		System.out.println("FINALIZE - " + eid);
	}
}