package com.multithreading;

class Display {

	public void wish(String name) {
		;;;;;;;;;;;;;;;;;;;;;;;
		synchronized (this) {
			for (int i = 0; i < 10; i++) {
				System.out.print("Good Morning : ");
				try {
					Thread.sleep(500);
				} catch (InterruptedException is) {

				}
				System.out.println(name);
			}
		}
		
		;;;;;;;;;;;;;;;;;;;;;;;;
	}
}

class MyThread extends Thread {

	Display d;
	String name;
	public MyThread(Display d, String name) {
		this.d = d;
		this.name = name;
	}
	
	public void run() {
		d.wish(name);
	}
}

public class SynchronizedBlockDemo {

	public static void main(String[] args) {
		Display d = new Display();
		MyThread t1 = new MyThread(d, "Dhoni");
		MyThread t2 = new MyThread(d, "Yuvraj");
		t1.start();
		t2.start();
	}

}
