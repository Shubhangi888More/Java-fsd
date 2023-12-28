package com.basics2;

//Using thread class
public class MyThread_extends_Threads_1 extends Thread {
	public void run() {
		System.out.println("Threads are running");
	}

	public static void main(String[] args) {
		MyThread_extends_Threads_1 m1 = new MyThread_extends_Threads_1();
		m1.start();  //method calling

	}

}
