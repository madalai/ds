package com.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
public static void main(String[] args) {
	ExecutorService executor = Executors.newCachedThreadPool();
	
	for(int i = 1 ; i<=200 ;i++){
		executor.submit(new Runnable() {
			
			@Override
			public void run() {
			
					ConnectionManager.getInstance().connect();
				
				
			}
		});
		
	}
	executor.shutdown();
	try {
		executor.awaitTermination(1, TimeUnit.DAYS);
	} catch (InterruptedException e) {
		
	}
}
}
