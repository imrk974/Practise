package com.multithreading;

public class AmountWithdrwal {

	static public int balance = 0;
	public void AmountDeposited(int amount) {
		System.out.println("Amount deposited");
		balance = balance + amount; 
		synchronized (this) {
			notify();
		}
	}
	
	
	public void amountWithdrawn(int amount) {
		synchronized (this) {
			if (balance <= 0) {
				try {
					System.out.println("waiting for balance");
					wait();
				} catch (InterruptedException ie) {
					
				}
			}
			System.out.println("amount withdrawn");
		}
		
	}
	
	
	public static void main(String[] args) {
		AmountWithdrwal am = new AmountWithdrwal();
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				am.amountWithdrawn(1000);
				
			}
		});
		t1.start();
		
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				am.AmountDeposited(2000);
				
			}
		});
		t2.start();
	}

	
}
