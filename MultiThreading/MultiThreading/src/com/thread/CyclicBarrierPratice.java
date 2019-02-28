package com.thread;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

class MyThread1 extends Thread{
	CyclicBarrier cb;
	public MyThread1(CyclicBarrier cb,String name){
		this.cb = cb;
		setName(name);
	}
	public void run(){
		System.out.println("Entered :"+getName());
		try {
			cb.await();
			System.out.println("Completed Awaiting");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
public class CyclicBarrierPratice {
public static void main(String[] args) {
	CyclicBarrier cb = new CyclicBarrier(4, new Runnable() {
		
		@Override
		public void run() {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Inside Runnable");
			
		}
	});
	
	new MyThread1(cb, "First Thread").start();
	snooze();
	new MyThread1(cb, "Second Thread").start();
	snooze();
	new MyThread1(cb, "Third Thread").start();
	snooze();
	new MyThread1(cb, "Fourth Thread").start();
	
}

private static void snooze() {
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
