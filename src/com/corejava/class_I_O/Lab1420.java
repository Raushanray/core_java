package com.corejava.class_I_O;

import java.io.File;

public class Lab1420 {
	public static void main(String[] args)throws Exception {
		File[] far = File.listRoots();
		System.out.println(far.length);
		System.out.println("FileName\tis Directory\tisAbsolute\tgetPath");
		for (int i = 0; i < far.length; i++) {
			System.out.println(far[i].getName() + "\t\t" + far[i].isDirectory() + "\t\t" + far[i].isFile() + "\t\t"
					+ far[i].isAbsolute() + "\t\t" + far[i].getPath());
		}
		File f = new File(far[1], "hi.txt");
		f.createNewFile();
	}
}
