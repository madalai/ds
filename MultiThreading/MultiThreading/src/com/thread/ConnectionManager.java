package com.thread;

import java.util.concurrent.Semaphore;

public class ConnectionManager {

	private static ConnectionManager instance = new ConnectionManager();
	private int connections;
	private Semaphore sem = new Semaphore(10);
	
	private ConnectionManager(){
		
	}
	
	public static ConnectionManager getInstance(){
		return instance;
	}
	
	public void connect(){
		
		try{
			sem.acquire();
		doConnect();
		}catch(Exception e){
			
		}
		finally {
			sem.release();
		}
	}
	private void doConnect() throws InterruptedException{
		
		synchronized (this) {
			connections ++;
			System.out.println("Available Connections :" +connections);
		}
		
			Thread.sleep(2000);
		
		synchronized (this) {
			connections--;
			
		}
	}
}
