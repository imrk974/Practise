package org.udemy.exercise;

class Display {
	public synchronized void displaynumber() {
		for(int i =0; i <= 10; i ++) {
			System.out.print(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException ie) {
				
			}
		}
		System.out.println();
	}
	
	public synchronized void displayCharacter() {
		for(int i =65; i <= 75; i ++) {
			System.out.print((char)i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException ie) {
				
			}
		}
	}
}
class mythread1 extends Thread {
	Display d;
	mythread1(Display d) {
		this.d = d;
	}
	
	public void run() {
		d.displaynumber();
	}
}

class mythread3 extends Thread {
	Display d;
	mythread3(Display d) {
		this.d = d;
	}
	public void run() {
		d.displayCharacter();
	}
}

public class SynchronizedDemo {

	public static void main(String[] args) {
		Display d = new Display();
		mythread1 t1 = new mythread1(d);
		mythread3 t2 = new mythread3(d);
		t1.start();
		t2.start();

	}

}
