package com.corejava.class_Class_threads;

public class Lab1371 {
	public static void main(String[] args) {

		MyThread1 th = new MyThread1();
		Thread t1 = new Thread();
		Thread t2 = new Thread();
		t1.start();
		t2.start();
		Thread t = Thread.currentThread();
		for (int i = 100; i <= 110; i++) {
			System.out.println(t.getName() + " -value is:-" + i);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

class MyThread1 implements Runnable {
	public void run() {
		Thread th = Thread.currentThread();
		for (int i = 1; i <= 10; i++) {
			System.out.println(th.getName() + " -value is:-" + i);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
