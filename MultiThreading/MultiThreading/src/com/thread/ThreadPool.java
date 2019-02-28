package com.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ThreadPool {

	private BlockingQueue<Runnable> queue ;
	private List<PoolThread> threads;
	private boolean isStopped = false;
	
	public ThreadPool(int noOfThreads,int maxNoTax){
		queue = new ArrayBlockingQueue<>(maxNoTax);
		threads = new ArrayList<>();
		
		for(int i = 0 ; i< noOfThreads ; i++){
			threads.add(new PoolThread(queue));
		}
		
		for(PoolThread t : threads){
			t.start();
		}
		
	}
	
	public void execute(Runnable r) throws Exception{
		if(this.isStopped){
			throw new Exception("Thread pool is Stopped");
		}
		try {
			queue.put(r);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void stop(){
		this.isStopped = true;
		for(PoolThread t : threads){
			t.doStop();
		}
	}
}

class PoolThread extends Thread{
	private BlockingQueue<Runnable> taskQ;
	private boolean isStopped;
	
	public PoolThread(BlockingQueue<Runnable> queue){
		taskQ = queue;
		
	}
	
	public void run(){
		try {
			taskQ.take().run();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void doStop(){
		isStopped = true;
		this.interrupt();
	}
	public boolean isStopped(){
		return isStopped;
	}
}
