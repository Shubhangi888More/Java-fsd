
package com.basics2;

public class MyThread_runnable_1 implements Runnable {
	public void run() {
		for (int i = 1; i < 5; i++) {
			System.out.println("Hii I am learning.." + i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {

			}
		}
	}

	public static void main(String[] args) {
		MyThread_runnable_1 t1 = new MyThread_runnable_1();
		Thread t = new Thread(t1);
		t.run();

	}

}
