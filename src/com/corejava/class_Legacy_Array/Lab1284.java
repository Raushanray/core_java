package com.corejava.class_Legacy_Array;

import java.util.*;

public class Lab1284 {
	public static void main(String[] args) {
		Collection col = new ArrayList();
		col.add("Sri");
		col.add("Srinivas");
		col.add("SD");
		col.add("Dende");
		System.out.println(col.contains("Srinivas"));
		System.out.println(col.contains("java"));
		System.out.println(col);
		System.out.println(col.remove("JDBC"));
		System.out.println(col.remove("Srinivas"));
		System.out.println(col);
		col.clear();
		System.out.println(col);
		System.out.println(col.size());
	}
}
