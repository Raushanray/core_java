package com.corejava.class_Legacy_Array.set_interface;

import java.util.*;

public class Lab1315 {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		// ts.add(...)same as previous lab
		System.out.println(ts);
		System.out.println("--subset()--");
		System.out.println(ts.subSet(4, 11));
		System.out.println(ts.subSet(4, false, 11, true));
		System.out.println(ts.subSet(4, true, 11, true));
		System.out.println("headset");
		System.out.println(ts.headSet(9));
		System.out.println(ts.headSet(9, true));
		System.out.println(ts.headSet(2));
		System.out.println("tailset");
		System.out.println(ts.tailSet(9));
		System.out.println(ts.tailSet(9, false));
	}
}
