package com.multithreading;

class A {
	public synchronized void d1(B b) {
		System.out.println("Thread 1 start execution of d1()");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}
		System.out.println("Trying to access last method of B");
		b.last();
	}

	public synchronized void last() {
		System.out.println("Inside last method of A class");
	}
}

class B {
	public synchronized void d2(A a) {
		System.out.println("Thread 2 start execution of d1()");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}
		System.out.println("Trying to access last method of A");
		a.last();
	}

	public synchronized void last() {
		System.out.println("Inside last method of B class");
	}
}

public class DeadLockDemo extends Thread {

	A a = new A();
	B b= new B();
	public void m1() {
		this.start();
		a.d1(b);
	}
	
	public void run() {
		System.out.println("Main Method");
		b.d2(a);
	}
	
	public static void main(String[] args) {
		
		DeadLockDemo d = new DeadLockDemo();
		d.m1();
	}

}
