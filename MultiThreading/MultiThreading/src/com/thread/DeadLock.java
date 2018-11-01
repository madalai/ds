package com.thread;

public class DeadLock {

	private final Object MONITOR_A = new Object();
	private final Object MONITOR_B = new Object();

	public String getA() {
		synchronized (MONITOR_A) {
			snooze();
			synchronized (MONITOR_B) {
				snooze();
			}
		}
		
		return "a";
	}

	public String getB() {
		synchronized (MONITOR_B) {
			snooze();
			synchronized (MONITOR_A) {
				snooze();
			}
		}
		
		return "b";
	}

	private void snooze() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		DeadLock obj1 = new DeadLock();
		//DeadLock obj2 = new DeadLock();
		new Thread() {
			
			@Override
			public void run() {
				obj1.getA();
				obj1.getB();
				
			}
		}.start();
		
new Thread() {
			
			@Override
			public void run() {
				obj1.getB();
				obj1.getA();
				
			}
		}.start();
	}

}
