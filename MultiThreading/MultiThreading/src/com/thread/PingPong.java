package com.thread;

public class PingPong {
	static boolean pingPrinted = false;

	public static void main(String[] args) {
		Object MONITOR = new Object();

		Thread ping = new Thread(new Runnable() {

			@Override
			public void run() {
				while (true) {
					if (!pingPrinted) {
						synchronized(MONITOR){
						System.out.println("PING");
						pingPrinted = true;
						try {
							MONITOR.notifyAll();
							MONITOR.wait();
						    
						
						
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						}

					}
				}

			}
		});

		Thread pong = new Thread(new Runnable() {

			@Override
			public void run() {
				while (true) {
					synchronized (MONITOR) {
					
					if (pingPrinted) {
						System.out.println("PONG");
						pingPrinted = false;
						try {
							MONITOR.notifyAll();
							MONITOR.wait();
						
						
							
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
					}

					}
				}

			}
		});

		ping.start();
		pong.start();
	}
}
