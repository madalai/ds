package com.thread;

public class OddEvenThread {
	public static final Object MONITOR = new Object();
	volatile static boolean printOdd = true;

	public static void main(String[] args) {
		Thread odd = new Thread(new Runnable() {
			public void run() {

				for (int i = 1; i < 100; i+=2) {
					while(true){
					if (printOdd) {
						System.out.println(i);
						printOdd = false;
						synchronized(MONITOR){
						MONITOR.notifyAll();
						}
						break;
					} else {
						doWait();
					}
					}
				}
			}

			
		});

		Thread even = new Thread(new Runnable() {
			public void run() {

				for (int i = 2; i <= 100; i+= 2) {
					while(true){
					if(!printOdd){
					System.out.println(i);
					printOdd = true;
					synchronized(MONITOR){
						MONITOR.notifyAll();
						}
					break;
					}else{
						doWait();
					}
					}
				}
			}
		});
		odd.start();
		even.start();

	}
	private static void doWait() {
		synchronized (MONITOR) {
			try {
				MONITOR.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
