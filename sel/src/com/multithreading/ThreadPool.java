package com.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class PoolThread extends Thread {
	private String name;
	
	public PoolThread(String name) {
		this.name = name;
	}
	
	public void run() {
		try {
			Thread.sleep(2000);
			System.out.println("Starting Thread name: "+name);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread Ended :" +name);
		System.out.println("**************************");
		
	}
}

public class ThreadPool {

	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(2);
		PoolThread t1 = new PoolThread("Thread-1");
		PoolThread t2 = new PoolThread("Thread-2");
		PoolThread t3 = new PoolThread("Thread-3");
		PoolThread t4 = new PoolThread("Thread-4");
		PoolThread t5 = new PoolThread("Thread-5");
		PoolThread t6 = new PoolThread("Thread-6");
		PoolThread t7 = new PoolThread("Thread-7");
		
		es.execute(t1);
		es.execute(t2);
		es.execute(t3);
		es.execute(t4);
		es.execute(t5);
		es.execute(t6);
		es.execute(t7);
		
		es.shutdown();
		
		/*t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
*/		
	}

}
