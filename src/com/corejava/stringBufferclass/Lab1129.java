package com.corejava.stringBufferclass;

public class Lab1129 {
	public static void main(String[] args) {
		String str = "JLC";
		StringBuilder sb = new StringBuilder("JLC");
		System.out.println(str.contentEquals(sb));
	}
}
