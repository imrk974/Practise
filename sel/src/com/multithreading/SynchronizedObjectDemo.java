package com.multithreading;

class Display2 {

	public void wish(String name) {
		;;;;;;;;;;;;;;;;;;;;;;;
		synchronized (Display2.class) {
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

class MyThread2 extends Thread {

	Display2 d;
	String name;
	public MyThread2(Display2 d, String name) {
		this.d = d;
		this.name = name;
	}
	
	public void run() {
		d.wish(name);
	}
}

public class SynchronizedObjectDemo {
	
	public static void main(String[] args) {
		Display2 d= new Display2();
		Display2 d2 = new Display2();
		MyThread2 t1 = new MyThread2(d, "Dhoni");
		MyThread2 t2 = new MyThread2(d2, "Yuvraj");
		t1.start();
		t2.start();
		
	}
}
