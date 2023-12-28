package com.basics2;

public class sleep_wait_2 extends Thread{
	public void run() {
		System.out.println("Threads...");
	}
	private static Object obj=new Object();

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		sleep_wait_2 s=new sleep_wait_2();
		s.start();
Thread.sleep(1000);

System.out.println(Thread.currentThread().getName());
synchronized(obj) {
	obj.wait(2000);
	System.out.println(obj);
}
	}

}
