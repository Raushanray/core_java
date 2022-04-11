package com.corejava.class_Class_threads;

public class Lab1384 {
	public static void main(String[] args) throws Exception {
		My_Thread th = new My_Thread();
		Thread t1 = new Thread(th);
		System.out.println(t1.getState());
		t1.start();
		Thread.sleep(500);
		System.out.println(t1.getState());
		Thread.sleep(5000);
		System.out.println(t1.getState());
	}
}

class My_Thread extends Thread {
	public void run() {

		Thread th = Thread.currentThread();
		for (int i = 1; i <= 10; i++) {
			System.out.println(th.getName() + "-value is:" + i + "\t" + th.getState());
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}