package com.corejava.class_Legacy_Array.set_interface;

import java.util.LinkedHashSet;

public class Lab1313 {
	public static void main(String[] args) {
		LinkedHashSet set = new LinkedHashSet();
		set.add(new Student1(99));
		set.add(new Student1(99));
		set.add(new Student1(99));
		set.add(new Student1(99));
		System.out.println(set);
	}
}

class Student1 {
	int sid;

	Student1(int sid) {
		this.sid = sid;
	}

	public String toString() {
		return "" + sid;
	}

	public int hashCode() {
		System.out.println("** hashCode**");
		return sid;
	}

	public boolean equals(Object obj) {
		System.out.println("**equals**");
		if (obj instanceof Student1) {
			Student1 st = (Student1) obj;
			return this.sid == st.sid;
		}
		return false;
	}
}
