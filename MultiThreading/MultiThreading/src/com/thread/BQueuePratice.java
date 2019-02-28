package com.thread;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BQueuePratice {
	int a;
	private static BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = producerThread();

		Thread t2 = consumerThread();

		t1.start();
		t2.start();

		t1.join();
		t2.join();
	}
	private static void produce() throws InterruptedException {
		Random random = new Random();
		while (true) {
			queue.put(random.nextInt(100));
		}
	}

	private static void consume() throws InterruptedException {
		Random random = new Random();
		while (true) {
			Thread.sleep(100);
			if (random.nextInt(10) == 0) {
				Integer value = queue.take();
				System.out.println("Taken Value :" + value + ",QueueSize :" + queue.size());
			}
		}
	}
	private static Thread consumerThread() {
		return new Thread(new Runnable() {

			@Override
			public void run() {

				try {
					consume();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
	}

	private static Thread producerThread() {
		return new Thread(new Runnable() {

			@Override
			public void run() {

				try {
					produce();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
	}

	
}
