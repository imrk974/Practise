package org.udemy.exercise;

class myThread implements Runnable {

	static Thread ct;
	@Override
	public void run() {
		Thread.currentThread().setName("ChildThread-1");
		
		for (int i = 0; i < 5; i++) {
			try {
				ct.join();
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
			System.out.println(new thread2().num() + "   " +Thread.currentThread().getName() + " child priority: "
					+ Thread.currentThread().getPriority());
//			try {
//				Thread.sleep(100);
//			} catch (InterruptedException ie) {
//				ie.printStackTrace();
//			}
			
		}

	}

}

class thread2 implements Runnable {
	
	static {
		myThread.ct = Thread.currentThread();
	}
	@Override
	public void run() {
		Thread.currentThread().setName("ChildThread-2");
		for (int i = 0; i < 3; i++) {
			System.out.println(Thread.currentThread().getName() + " child priority: "
					+ Thread.currentThread().getPriority());
		}

	}
	
	public int num() {
		return 1;
	}

}

public class MultiThreading {

	public static void main(String[] args) throws InterruptedException {
		myThread.ct = Thread.currentThread();
		myThread myThread = new myThread();
		
		thread2 myThread2 = new thread2();
		
		Thread t = new Thread(myThread);
		Thread t2 = new Thread(myThread2);
		
		t.start();
//		t.join();
		t2.start();
		
		
		
		/*for (int i = 0; i < 3; i++) {
			System.out.println("Main thread: " + Thread.currentThread().getName() + " Priority : "
					+ Thread.currentThread().getPriority());
		}*/
	}

}
