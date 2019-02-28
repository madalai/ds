package com.thread;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumerProblem {
	Queue<Integer> queue = new LinkedList<>();
	private final int SIZE = 5;
	Object MONITOR = new Object();
	private static int c = 1;

	public void offer(Integer i) throws InterruptedException {
		while (queue.size() == SIZE) {
			Thread.sleep(100);
		}
		synchronized (MONITOR) {
			queue.offer(i);
		}
	}

	public Integer poll() throws InterruptedException {
		while (queue.size() == 0) {
			Thread.sleep(100);
		}
		synchronized (MONITOR) {
			return queue.poll();
		}
	}
	
	public static void main(String[] args) {
		ProducerConsumerProblem obj = new ProducerConsumerProblem();
		for(int i=0;i<100;i++){
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					
					try {
						obj.offer(c);
						c++;
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}).start();
		}
		
		
		System.out.println(obj.queue);
	}
}
