package edu.javacore.polymorphism;

public class Lab932 {
	public static void main(String[] args) {
		Person pob = null;
		pob = new Student();
		pob.sleeping();
		pob = new Employee();
		pob.sleeping();
	}
}
 