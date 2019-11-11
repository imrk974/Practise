package com.multithreading;

class DaemonThread extends Thread {
	
	public void run() {
		Thread.currentThread().setName("Thread-1");
		System.out.println(Thread.currentThread().getName() +" is Daemon Thread: " +Thread.currentThread().isDaemon());
	}
	
}

public class DaemonDemo {

	public static void main(String[] args) {
		System.out.println("Main Thread is Daemon : " +Thread.currentThread().isDaemon());
		// Thread.currentThread().setDaemon(true); //IllegealThreadStateException
		DaemonThread dt = new DaemonThread();
		System.out.println("Thread-1 daemon status is : " +dt.isDaemon());
		dt.setDaemon(true);
		dt.start();
		
		Thread a = new Thread(new Runnable() {
			
			@Override
			public void run() {
				Thread.currentThread().setName("Thread-2");
				System.out.println(Thread.currentThread().isDaemon());
				System.out.println(Thread.currentThread().getName() + " is Daemon Thread : " + Thread.currentThread().isDaemon());
				
			}
		});
		a.setDaemon(true);
		a.start();
	}

}
