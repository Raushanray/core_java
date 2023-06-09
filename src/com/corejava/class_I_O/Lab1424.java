package com.corejava.class_I_O;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Lab1424 {
	public static void main(String[] args) throws Exception {
		try (FileOutputStream fos = new FileOutputStream("D:\\info.ser");
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			Student st = new Student(99, "sri", 65799999);
			Student.count = 9;
			System.out.println(st);
			oos.writeObject(st);
			System.out.println("Object Serialized");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class Student implements Serializable {
	int sid;
	String name;
	long phone;
	static int count = 3;

	Student(int sid, String name, long phone) {
		this.sid = sid;
		this.name = name;
		this.phone = phone;
	}

	public String toString() {
		return sid + "\t" + name + "\t" + phone + "\t" + count;
	}
}