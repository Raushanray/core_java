package edu.javacore.Constructor;

public class Lab599 {
	public static void main(String[] args) {
		Student stu1 = new Student();
		stu1.show();
		Student stu2 = new Student();
		stu2.show();

	}
}

class Student {
	int sid;
	String sname;

	void show() {
		System.out.println(sid + "\t" + sname);
	}
}