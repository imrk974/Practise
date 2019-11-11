package com.multithreading;

import java.util.concurrent.ArrayBlockingQueue;

class Producer implements Runnable {
	private ArrayBlockingQueue<Integer> queue;
	
	public Producer(ArrayBlockingQueue<Integer> queue) {
		this.queue = queue;
	}
	
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
				queue.put(ProducerConsumer.counter++);
				System.out.println("Value added in the Queue by producer : " +ProducerConsumer.counter);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}

class Consumer implements Runnable {
	ArrayBlockingQueue<Integer> queue;
	
	public Consumer(ArrayBlockingQueue<Integer> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(2000);
				queue.take();
				ProducerConsumer.counter--;
				System.out.println("Consumer consumed value from the queue : " +ProducerConsumer.counter);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
}


public class ProducerConsumer {
	
	static Integer counter = 0;
	public static void main(String[] args) {
		ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);
		Producer producer = new Producer(queue);
		Thread producerThread = new Thread(producer);
		producerThread.start();
		
		Consumer consumer = new Consumer(queue);
		Thread consumerThread = new Thread(consumer);
		consumerThread.start();
		

	}

}
