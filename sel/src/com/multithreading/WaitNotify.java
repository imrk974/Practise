package com.multithreading;

class sumOfNumber extends Thread {
	
	int total = 0;
	public void run() {
		synchronized (this) {
			for (int i =0; i < 100; i ++) {
				total = total + i;
			}
			this.notify();
		}
		
		System.out.println(total);
	}
}


public class WaitNotify {

	public static void main(String[] args) {
		sumOfNumber t = new sumOfNumber();
		t.start();
		synchronized (t) {
			try {
				t.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println(t.total);

	}

}
